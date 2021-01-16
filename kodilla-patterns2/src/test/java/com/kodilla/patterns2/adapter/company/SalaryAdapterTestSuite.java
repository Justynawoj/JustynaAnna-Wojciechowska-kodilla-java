package com.kodilla.patterns2.adapter.company;

import static org.junit.Assert.*;

import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Test;

public class SalaryAdapterTestSuite {

    @Test
    public void testTotalSalary() {
        //Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();

        //When
        double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(), workers.getSalaries());

        //Then
        System.out.println(totalSalary);
        assertEquals(27750, totalSalary, 1);
    }
}
