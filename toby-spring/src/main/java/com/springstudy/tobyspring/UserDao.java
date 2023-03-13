package com.springstudy.tobyspring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class UserDao {

	private ConnectionMaker connectionMaker;
	private Connection c;

	public UserDao(ConnectionMaker connectionMaker) {
		this.connectionMaker = connectionMaker;
	}

	public void add(User user) throws ClassNotFoundException, SQLException {
		this.c = connectionMaker.makeConnection();

		PreparedStatement ps = c.prepareStatement("insert into users(id, name, password) values (?, ?, ?)");
		ps.setString(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());

		ps.executeUpdate();

		ps.close();
		c.close();
	}

	public User get(String id) throws ClassNotFoundException, SQLException {
		this.c = connectionMaker.makeConnection();

		PreparedStatement ps = c.prepareStatement("select * from users where id = ?");
		ps.setString(1, id);

		ResultSet rs = ps.executeQuery();
		User user = null;

		if (rs.next()) {
			user = new User();
			user.setId(rs.getString("id"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
		}

		rs.close();
		ps.close();
		c.close();

		Optional.ofNullable(user).orElseThrow(IllegalAccessError::new);

		return user;
	}

	public void deleteAll() throws SQLException, ClassNotFoundException {
		this.c = connectionMaker.makeConnection();

		PreparedStatement ps = c.prepareStatement("delete from users");

		ps.executeUpdate();
		ps.close();
		c.close();
	}

	public int getCount() throws SQLException, ClassNotFoundException {
		this.c = connectionMaker.makeConnection();

		PreparedStatement ps = c.prepareStatement("select count(*) from users");

		ps.executeQuery();
		ResultSet rs = ps.executeQuery();
		rs.next();
		int count = rs.getInt(1);

		rs.close();
		ps.close();
		c.close();

		return count;
	}
}
