package Lesson3_abstractClassesAndInterfaces.abstractClassDemo;

public class Main {
   // since prodcut class is abstract we cannot instantiate object
    // Product p = new Product();


    public static void main(String asdf[]){
        Product p = new Macbook();
        p.termsAndCondtions();
        Product p2 = new LenovoLaptop();
        p2.termsAndCondtions();
    }

}
