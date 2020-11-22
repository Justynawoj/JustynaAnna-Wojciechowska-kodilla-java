package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class CompanyFacade {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    public List<Company> findCompaniesThatNameContainsLetters(String name){
        return companyDao.findCompaniesThatNameContainsLetters(name);
    }

    public List<Employee> findEmployeesThatNameContainsLetters(String lastname){
        return employeeDao.findEmployeesThatLastNameContains(lastname);
    }

}
