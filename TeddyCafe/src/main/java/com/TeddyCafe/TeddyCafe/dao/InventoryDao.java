package com.TeddyCafe.TeddyCafe.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.TeddyCafe.TeddyCafe.Inventory;

@Repository
public class InventoryDao {

	@Autowired
	private JdbcTemplate jdbc;
	
	public List<Inventory> findAll() {
		String sql = "SELECT * FROM Items";
		return jdbc.query(sql, new BeanPropertyRowMapper<>(Inventory.class));
	}
	
	}


