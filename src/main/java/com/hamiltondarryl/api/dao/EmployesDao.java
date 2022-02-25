package com.hamiltondarryl.api.dao;

import java.util.List;

import com.hamiltondarryl.api.model.Employe;

public interface EmployesDao {
	
	 int save(Employe employe );
	 
	 int update(Employe employe, int id);
	 
	 int delete(int id);
	 
	 List<Employe> getAll();
	 
	 Employe getById(int id ); 
	

}
