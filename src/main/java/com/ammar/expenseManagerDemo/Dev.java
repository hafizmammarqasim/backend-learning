package com.ammar.expenseManagerDemo;

public class Dev {

    private Laptop laptop;
    private Computer computer;
    private int age;

    public Dev(int age, Laptop laptop, Computer computer){
        this.age = age;
        this.laptop = laptop;
        System.out.println("Dev (arg constructor) is running");
    }

    public Dev(){
        System.out.println("Dev (No arg constructor) Initialized");
    }

    public void compile(){
        System.out.println("Seekhny ki koshish");
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        System.out.println("Laptop setter");
        this.laptop = laptop;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        System.out.println("Computer setter");
        this.computer = computer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age setter");
        this.age = age;
    }


}
