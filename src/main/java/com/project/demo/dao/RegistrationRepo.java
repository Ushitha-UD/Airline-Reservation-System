package com.project.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.entity.Registration;
public interface RegistrationRepo extends JpaRepository<Registration, Integer> 
{

}



