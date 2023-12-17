package com.workintech.model.developerCompany;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(1500);
        System.out.println("Junior Developer starts is working");
    }
}
