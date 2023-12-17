package com.workintech.model.developerCompany;

public class HRManager extends Employee{
    JuniorDeveloper[] juniorDevs = new JuniorDeveloper[3];
    MidDeveloper[] midDevs = new MidDeveloper[3];
    SeniorDeveloper[] seniorDevs = new SeniorDeveloper[3];

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(4000);
        System.out.println("HRManager starts is working");
    }
    public void addEmployee(JuniorDeveloper juniorDev){
        for(int i = 0; i < juniorDevs.length; i++){
            if(juniorDevs[i] == null){
                juniorDevs[i] = juniorDev;
            } else if(i == juniorDevs.length-1){
                System.out.println("Junior Developer kadrosu dolu.");
            }
        }

    }
    public void addEmployee(MidDeveloper midDev){
        for(int i = 0; i < midDevs.length; i++){
            if(midDevs[i] == null){
                midDevs[i] = midDev;
            } else if(i == midDevs.length-1){
                System.out.println("Mid Developer kadrosu dolu.");
            }
        }

    }
    public void addEmployee(SeniorDeveloper seniorDev){
        for(int i = 0; i < seniorDevs.length; i++){
            if(seniorDevs[i] == null){
                seniorDevs[i] = seniorDev;
            } else if(i == seniorDevs.length-1){
                System.out.println("Senior Developer kadrosu dolu.");
            }
        }

    }
}
