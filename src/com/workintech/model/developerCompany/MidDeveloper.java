package com.workintech.model.developerCompany;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work() {
        setSalary(2500);
        System.out.println("Middle Developer starts is working");
    }
}
