package com.app.item.dao;
import java.util.Collection;

import com.app.item.entity.Item;

public interface ItemDaoInterface {

	public Collection<Item> getitem() ;
	public Item createitem(Item newitem);
	public void deleteitem(Item newitem);
}
