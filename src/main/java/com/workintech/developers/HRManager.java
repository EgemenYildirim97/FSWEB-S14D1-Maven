package com.workintech.developers;

public class HRManager extends Employee {
    private int juniorCount;
    private int midCount;
    private int seniorCount;
    public HRManager(long id,String name,int salary){
        super(id,name,salary);
        this.juniorCount = 0;
        this.midCount = 0;
        this.seniorCount = 0;
    }

    @Override
    public void work(){
        System.out.println("HRManager starts to working");
    }
}
