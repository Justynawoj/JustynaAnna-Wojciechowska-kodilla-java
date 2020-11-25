package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String [] [] workers = {
            {"670320", "John", "Smith"},
            {"689524", "Ivone", "Novak"},
            {"750032","Jessie", "Pinkman"},
            {"750252", "Walter", "White"},
            {"758963", "Clara", "Lanson"}};
    private double [] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};
    public String getWorker(int n){
        if(n>salaries.length){
            return "";
        }
        return workers [n][0] + " , " + workers [n][2] + " , " + salaries [n];
    }
    public String[][] getWorkers(){
        return workers;
    }
    public double[] getSalaries(){
        return salaries;
    }
}
