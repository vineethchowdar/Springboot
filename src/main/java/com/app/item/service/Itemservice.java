package com.app.item.service;


import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.item.dao.ItemDaoInterface;
import com.app.item.entity.Item;


@Service
public abstract class Itemservice implements IItemservice {

	@Autowired
	private ItemDaoInterface ItemDao;

	public Collection<Item> getitem() {
		return ItemDao.getitem();
	}
	
	public Item createitem(Item newitem) {
		return ItemDao.createitem(newitem);
	
	}
	
	public void deleteitem(Item newitem) {
		ItemDao.deleteitem(newitem);
	}
	
}
