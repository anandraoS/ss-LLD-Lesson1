package Module04.BuilderDesignPattern.bettercode.v3;

public class Main {
    public static void main(String sdf[]){
        Builder b = new Builder();
        b.setPrice(23);

        Product p = new Product(b);
    }
}
