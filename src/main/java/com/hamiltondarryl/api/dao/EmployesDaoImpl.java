package com.hamiltondarryl.api.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hamiltondarryl.api.model.Employe;

@Repository
public class EmployesDaoImpl implements EmployesDao {

	@Override
	public int save(Employe employe) {
		return 0;
	}

	@Override
	public int update(Employe employe, int id) {
		return 0;
	}

	@Override
	public int delete(int id) {
		return 0;
	}

	@Override
	public List<Employe> getAll() {
		return null;
	}

	@Override
	public Employe getById(int id) {
		return null;
	}
	
	

}
