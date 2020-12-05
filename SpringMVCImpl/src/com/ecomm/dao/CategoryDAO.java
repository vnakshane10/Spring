package com.ecomm.dao;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.ecomm.entity.Category;

@Component
public class CategoryDAO {
	
	ArrayList<Category> categoryList=new ArrayList<Category>();
		
		public void addCategory(Category category)
		{
			categoryList.add(category);
			
		}
		
		public void delete(int categoryId)
		{
			categoryList.remove(categoryId);
		}
		
		public ArrayList<Category>retrieveCategory()
		{
			return categoryList;
		}

	}


