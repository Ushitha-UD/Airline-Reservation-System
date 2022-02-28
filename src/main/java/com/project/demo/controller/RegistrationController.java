package com.project.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.demo.dao.RegistrationRepo;
import com.project.demo.entity.Registration;
@Controller	
public class RegistrationController {	
		@Autowired
		RegistrationRepo rr;
		
		@RequestMapping("/")
		public String show()
		{
			return "index.jsp";
		}
		
		@RequestMapping("/addcustomer")
		@ResponseBody
		public String addcustomer(Registration r)
		{
			rr.save(r);
			return "customer added...";
		}
		
		@RequestMapping("/viewcustomer")
		@ResponseBody
		public String viewvideo(int customer_id)
		{
			Registration r = rr.findById(customer_id).orElse(new Registration());
			return r.toString();
		}
		@RequestMapping("/viewallcustomer")
		@ResponseBody
		public String viewallcustomer()
		{
			List<Registration> el =(List<Registration>) rr.findAll();
			return el.toString();
		}
		
		@RequestMapping("/updatecustomer")
		@ResponseBody
		public String updatecustomer(Registration r)
		{
			rr.save(r);
			return "customer updated...";
		}
		
		@RequestMapping("/deletecustomer")
		@ResponseBody
		public String deletecustomer(int customer_id)
		{
			rr.deleteById(customer_id);
			return "customer deleted...";
		}


}
