package Lesson3_abstractClassesAndInterfaces.abstractClassDemo;

public class Macbook extends Product{
    @Override
    public double calculateDiscount() {
        return 0;
    }

    @Override
    public void termsAndCondtions(){
        System.out.println("Macbook terms conditions");
    }
}
