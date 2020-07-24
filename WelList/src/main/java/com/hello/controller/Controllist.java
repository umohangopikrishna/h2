package com.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hello.model.Modelist;
import com.hello.repo.Repolist;
@CrossOrigin(origins = "*")
@RestController
public class Controllist {
	
	@Autowired
	Repolist repoobj;
	
	@RequestMapping("/add")
	public List<Modelist> addele( String id)
	{   //System.out.println(repoobj.findAll().get(0).getClass().getName()); to know the data type 
		// data type is repoobj.findAll() is a  list of  data of type com.hello.model.Modelist 
		System.out.println(id+"helloo");
		
		return repoobj.findAll();
	}
	

		}
