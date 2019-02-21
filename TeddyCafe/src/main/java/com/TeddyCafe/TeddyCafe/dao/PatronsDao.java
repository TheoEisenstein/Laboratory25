package com.TeddyCafe.TeddyCafe.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.TeddyCafe.TeddyCafe.Patrons;



@Repository
public class PatronsDao {

	@Autowired
	private JdbcTemplate jdbc;
	
	public List<Patrons> findAll() {
		String sql = "SELECT * FROM User";
		return jdbc.query(sql, new BeanPropertyRowMapper<>(Patrons.class));
	}
	
	public void create(Patrons patron) {
		String sql = "INSERT INTO User (firstName, lastName, favNumber) VALUES (?,?,?)";
		
		jdbc.update(sql, patron.getFirstName(), patron.getLastName(), patron.getFavNumber());
	
	}
	
}

