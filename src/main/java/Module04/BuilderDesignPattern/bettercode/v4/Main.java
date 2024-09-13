package Module04.BuilderDesignPattern.bettercode.v4;

public class Main {
    public static void main(String sdf[]){
        Product p = Product.getBuilder()
                .setName("Iphone")
                .setPrice(1000)
                .setBrand("Apple")
                .setDesc("New apple iphone")
                .setCategory("Mobile")
                .build();
    }
}
