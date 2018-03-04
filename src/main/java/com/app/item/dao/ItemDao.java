package com.app.item.dao;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.item.entity.Item;

@Repository
public abstract class ItemDao implements ItemDaoInterface {

	@Autowired
	IItemRepository itemrepo;
	

	public Collection<Item> getitem() {
		return itemrepo.findAll();
	}
	
	public Item createBrand(Item newitem) {
		return itemrepo.save(newitem);
	}
	
	public void deleteBrand(Item newitem) {
		itemrepo.delete(newitem);
	}

	
}
