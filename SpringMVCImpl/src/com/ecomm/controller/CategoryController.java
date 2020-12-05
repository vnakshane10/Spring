package com.ecomm.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecomm.dao.CategoryDAO;
import com.ecomm.entity.Category;

@Controller
public class CategoryController 
{
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/showCategory")
	public String showCategory(Model m)
	{
		ArrayList<Category> categoryList=categoryDAO.retrieveCategory();
		m.addAttribute("categoryList", categoryList);
		return"Category";
	}
	
	@RequestMapping("/InsertCategory")
	
	public String insertCategory(@RequestParam("categoryId")int categoryId,@RequestParam("categoryName")String categoryName,@RequestParam("categoryDesc")String categoryDesc, Model m)
	{
		Category category= new Category();
		category.setCategoryId(categoryId);
		category.setCategoryName(categoryName);
		category.setCategoryDesc(categoryDesc);
		categoryDAO.addCategory(category);
		ArrayList<Category> categoryList=categoryDAO.retrieveCategory();
		m.addAttribute("categoryList", categoryList);
		return "Category";
	}
     @RequestMapping("/deleteCategory/")
     public String deleteCategory(@PathVariable("categoryId")int categoryId)
     {
    	 categoryDAO.delete(categoryId);
    	 return "Category";
     }
}
