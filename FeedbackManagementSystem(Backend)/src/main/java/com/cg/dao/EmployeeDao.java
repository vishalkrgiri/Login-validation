package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.beans.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
