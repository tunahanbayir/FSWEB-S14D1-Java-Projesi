package com.workintech.model.developerCompany;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work() {
        setSalary(3500);
        System.out.println("Senior Developer starts is working");
    }
}
