package com.app.item.service;

import java.util.Collection;
import com.app.item.entity.Item;


public interface IItemservice {
	public Collection<Item> getitem() ;
	public Item getit(int itemId);
	public Item createitem(Item newitem);
	public void deleteitem(Item newitem);
	
}
