package com.roncoo.education;
import com.roncoo.education.bean.RoncooUser;
import com.roncoo.education.mapper.OrderMapper;
import com.roncoo.education.mapper.RoncooUserMapper;
import com.roncoo.education.mapper.UserMapper;
import com.roncoo.education.pojo.*;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo282ApplicationTests {

	@Test
	public void contextLoads() {
	}

//	@Autowired
//	private RoncooUserMapper mapper;

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	@Test
	public void print(){

		System.out.println(sqlSessionTemplate);
		System.out.println(sqlSessionTemplate);
	}

//	@Test
//	public void insert() {
//		RoncooUser roncooUser = new RoncooUser();
//		roncooUser.setName("测试");
//		roncooUser.setCreateTime(new Date());
//		int result = mapper.insert(roncooUser);
//		System.out.println(result);
//	}
//
//	@Test
//	public void select() {
//		RoncooUser result = mapper.selectByPrimaryKey(2); System.out.println(result);
//	}

	@Test
	public void testSQLSessionTemplate(){

		sqlSessionTemplate.select("com.roncoo.education.mapper.RoncooUserMapper.selectByPrimaryKey", new Integer(2), new ResultHandler() {
			@Override
			public void handleResult(ResultContext resultContext) {
				System.out.println(resultContext);
			}
		});

//		sqlSessionTemplate.sele
	}

	@Test
	public void test1(){
		User user = sqlSessionTemplate.selectOne("test.findUserById", 1);
		System.out.println(user);
	}

	@Test
	public void test2(){

		List<User> list = sqlSessionTemplate.selectList("test.findUserByUserName", "曾");
		System.out.println(list);

	}

	@Test
	public void test3(){
		User user = new User();
		user.setUsername("曾志伟");
		user.setBirthday(new Date());
		user.setAddress("sadfafsfsdf");
		user.setSex("男");
		int i = sqlSessionTemplate.insert("test.insertUser",user);
		System.out.println(i);
	}

	@Test
	public void test4(){
		User user = new User();
		user.setUsername("何炅292929");
		user.setBirthday(new Date());
		user.setAddress("sadfafsfsdf");
		user.setId(36);
		user.setSex("女");

		int i = sqlSessionTemplate.update("test.updateUserById", user);
	}

	@Test
	public void test5(){

		int ret = sqlSessionTemplate.delete("test.deleteUserById", 36);
		System.out.println(ret);

	}

	/*
	* ------------------------
	* */
	@Test
	public void test6(){
		UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
	    User user = userMapper.findUserById(10);
		System.out.println(user);
	}

	@Test
	public void test7(){

		Stu s = sqlSessionTemplate.selectOne("test.selectByPrimaryKey", 1);
		System.out.println(s);
	}

	@Test
	public void test8(){

		UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
		QueryVo queryVo = new QueryVo();

		User user = new User();
		user.setUsername("曾");
		queryVo.setUser(user);
		List<User> userList = userMapper.findUserByQuery(queryVo);
		System.out.println(userList);
	}

	@Test
	public void test9(){

		UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);

		Integer count = userMapper.countUser();

		System.out.println(count);

	}

	@Test
	public void test10(){

		OrderMapper orderMapper = sqlSessionTemplate.getMapper(OrderMapper.class);
		List<Orders> list = orderMapper.selectOrdersList();
		System.out.println(list);
	}

	@Test
	public void test11(){
		UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);

		User user = new User();
		user.setSex("1");
//		user.setUsername("张小明");
		List<User> userList = userMapper.selectUserBySexAndUserName(user);
		System.out.println(userList);
	}

	@Test
	public void test12(){
//		UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
//
//		List<Integer> ids = new ArrayList<>();
//		ids.add(16);
//		ids.add(22);
//		ids.add(24);
//
//		QueryVo queryVo = new QueryVo();
//		queryVo.setIdsList(ids);
//
//		List<User> userList = userMapper.selectuserByIds(queryVo);
//		System.out.println(userList);

	}

	@Test
	public void test13(){
		UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);

		List<Integer> ids = new ArrayList<>();
		ids.add(16);
		ids.add(22);
		ids.add(24);

//		Integer[] ids = new Integer[3];
//		ids[0] = 16;
//		ids[1] = 22;
//		ids[2] = 24;


		List<User> userList = userMapper.selectuserByIds(ids);
		System.out.println(userList);
	}

	@Test
	public void test14(){
		OrderMapper orderMapper = sqlSessionTemplate.getMapper(OrderMapper.class);
		List<Orders> ordersList = orderMapper.selectOrders();
		System.out.println(ordersList);
	}

	@Test
	public void test15(){

		List<Teacher> list = sqlSessionTemplate.selectList("test.getTeachers");
		System.out.println(list);
	}

	@Test
	public void test16(){

		Student student = sqlSessionTemplate.selectOne("test.getStudents", 1);
		System.out.println(student);
	}

	//一对一关联
	@Test
	public void test17(){
		OrderMapper orderMapper = sqlSessionTemplate.getMapper(OrderMapper.class);
		List<Orders> list = orderMapper.selectOrders();
		System.out.println(list);
	}

	//一对多
	@Test
	public void test18(){
		OrderMapper orderMapper = sqlSessionTemplate.getMapper(OrderMapper.class);
		List<User> userList = orderMapper.selectUserList();
		System.out.println(userList);
	}

	@Test
	public void test19(){

//		for each 标签
//		https://blog.csdn.net/hjh908778/article/details/79034395/
	}

	@Test
	public void test20(){

		UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
		QueryVo queryVo = new QueryVo();

		User user = new User();
		user.setUsername("曾");
		queryVo.setUser(user);

		List<Integer> ids = new ArrayList<>();
		ids.add(16);
		ids.add(22);
		ids.add(24);

		queryVo.setIdsList(ids);
//		List<User> userList = userMapper.fin(queryVo);
//		System.out.println(userList);
		List<User> list = userMapper.selectuserByIds2(queryVo);
		System.out.println(list);
	}

}
