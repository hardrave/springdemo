package com.michal.demo.web;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.michal.demo.domain.Product;

@RestController
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/{userID}")
	public String displayUser(@PathVariable int userID) {
		return "User found: " + userID;
	}
	@RequestMapping("/{userID}/invoices")
	public String displayUser(@PathVariable int userID, @RequestParam Date date) {
		return "Invoice found for user: " + userID + " on the date: " +date;
	}
	@RequestMapping("/{userID}/items")
	public List<String> displayStringJson() {
		return Arrays.asList("shoes", "laptop", "botton");
	}
	@RequestMapping("/{userID}/products")
	public List<Product> displayProductsJson() {
		return Arrays.asList(new Product(1, "shoes", 39.99),
				new Product(2, "book", 12.49),
				new Product(3, "laptop", 799.99),
				new Product(4, "hoodie", 49.99));
	}
}
