package com.springstudy.tobyspring;

import java.sql.SQLException;

public class UserDaoTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		UserDao dao = new DaoFactory().userDao();

		User user = new User();
		user.setId("hocaron");
		user.setName("호선우");
		user.setPassword("hocaron");

		dao.add(user);

		System.out.println(user.getId() + " 등록 성공");

		User user2 = dao.get(user.getId());
		System.out.println(user2.getId() + " 조회 성공");
	}
}
