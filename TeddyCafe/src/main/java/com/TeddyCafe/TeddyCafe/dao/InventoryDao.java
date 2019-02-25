package com.TeddyCafe.TeddyCafe.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.TeddyCafe.TeddyCafe.Inventory;

@Repository
@Transactional
public class InventoryDao {

	@PersistenceContext
	private EntityManager em;
	
	
	public void create(Inventory inventory) {
		em.persist(inventory); 
	}

	
	public List<Inventory> findAll(){
		//From class file , mine is Inventory
		return em.createQuery("FROM Inventory", Inventory.class).getResultList();
	
	}

//	
	public Inventory findById(Long id) {
		return em.find(Inventory.class,  id);
	}

	
	
	public void update(Inventory inventory) {
		em.merge(inventory);
	}
	public void delete(Long id) {
		Inventory inventory = em.getReference(Inventory.class, id);
		em.remove(inventory);
	}
}
//	
//	public Set<String> listAllInventory(){
//		List<String> inventoryList = em.createQuery("SELECT * FROM Items", String.class).getResultList();
//		return new TreeSet<>(inventoryList);
//	}
//	
//}

