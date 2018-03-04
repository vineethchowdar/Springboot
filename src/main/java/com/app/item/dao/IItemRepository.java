package com.app.item.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.item.entity.Item;

public interface IItemRepository extends JpaRepository<Item,Integer> {

}
