
package com.TeddyCafe.TeddyCafe.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.TeddyCafe.TeddyCafe.Patrons;





@Repository
@Transactional
public class PatronsDao {

	//@Autowired
	//private JdbcTemplate jdbc;
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Patrons> findAll(){
		return em.createQuery("FROM Patrons", Patrons.class).getResultList();
	}
	public Patrons findById(Long id) {
		return em.find(Patrons.class, id);
	}
	
	public void create(Patrons patron) {
		em.merge(patron);
	}
	public void update(Patrons patron) {
		em.merge(patron);
	}
	public void delete(Long id) {
		em.remove(em.getReference(Patrons.class, id));
	}
	
//	public List<Patrons> findAll() {
//		String sql = "SELECT * FROM User";
//		return jdbc.query(sql, new BeanPropertyRowMapper<>(Patrons.class));
//	}
//	
//	public void create(Patrons patrons) {
//		String sql = "INSERT INTO User (firstname, lastname, password, favnumber, emaillist) VALUES (?,?,?,?,?)";
//		
//		jdbc.update(sql, patrons.getFirstName(), patrons.getLastName(), patrons.getPassword(), patrons.getFavNumber(), patrons.getEmailList());
//	
//	}
//	
}

//public void create(Room room) {
//	String sql = "INSERT INTO Room (name, capacity, available) VALUES (?, ?, ?)";
//	jdbcTemplate.update(sql, room.getName(), room.getCapacity(), room.getAvailable());
