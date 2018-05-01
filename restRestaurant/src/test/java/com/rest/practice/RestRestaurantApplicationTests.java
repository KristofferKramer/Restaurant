package com.rest.practice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rest.practice.models.Drink;
import com.rest.practice.service.MenuService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestRestaurantApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired 
	private MenuService menuService;
	
	@Test
	public void save() {
		Drink drink = new Drink();
		menuService.save(drink);
	}

}
