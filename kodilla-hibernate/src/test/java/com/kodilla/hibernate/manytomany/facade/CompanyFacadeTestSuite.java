package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTestSuite {
    @Autowired
    CompanyFacade companyFacade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testFindEmployeesThatNameContainsLetters(){

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        johnSmith.getId();

        //When
        List<Employee> SmithFirstLetters = companyFacade.findEmployeesThatNameContainsLetters("Smi");
        List<Employee> SmithMiddleLetters = companyFacade.findEmployeesThatNameContainsLetters("mit");
        List<Employee> SmithLastLetters = companyFacade.findEmployeesThatNameContainsLetters("ith");
        List<Employee> retrievedNowakEmployees = companyFacade.findEmployeesThatNameContainsLetters("Now");

        //Then
        Assert.assertNotEquals(0,SmithFirstLetters.size());
        Assert.assertNotEquals(0,SmithMiddleLetters.size());
        Assert.assertNotEquals(0,SmithLastLetters.size());
        Assert.assertEquals(0,retrievedNowakEmployees.size());

        //CleanUp
        try {
            employeeDao.deleteById(johnSmith.getId());
            employeeDao.deleteById(stephanieClarckson.getId());
            employeeDao.deleteById(lindaKovalsky.getId());

        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testFindCompaniesThatNameContainsLetters(){

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();


        String wareLetters = "ware";
        String someLetters = "aaa";

        //When
        List<Company> wareCompanies = companyFacade.findCompaniesThatNameContainsLetters(wareLetters);
        List<Company> randomCompanyName = companyFacade.findCompaniesThatNameContainsLetters(someLetters);

        //Then
        Assert.assertNotEquals(0,wareCompanies.size());
        Assert.assertEquals(0,randomCompanyName.size());

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
