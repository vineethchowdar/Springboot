package com.app.item.controller;

import java.util.Collection;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.app.item.entity.Item;
import com.app.item.service.IItemservice;

@RestController(value="/item")
public class ItemController {

	@Autowired
	private IItemservice Itemservice;
	
	@RequestMapping(method=RequestMethod.GET,produces= {"application/json","application/xml"})
	public @ResponseBody Collection<Item> getAllitem(){
		return Itemservice.getitem();
	}
	
	
	@RequestMapping(value="/itemm",method=RequestMethod.POST,consumes="application/json")
	public  Item createBrand(@Valid @RequestBody Item newitem) {
		return Itemservice.createitem(newitem);
	} 	
	 

	@DeleteMapping ("/item/{Itemid}")
	public ResponseEntity<Item> createUser(@PathVariable(value = "itemId") int itemId) {
			Item newitem = Itemservice.getit(itemId);
			if(newitem == null)
		{
			return ResponseEntity.notFound().build();
		}
			Itemservice.deleteitem(newitem);
		 return ResponseEntity.ok().build();
	}

}