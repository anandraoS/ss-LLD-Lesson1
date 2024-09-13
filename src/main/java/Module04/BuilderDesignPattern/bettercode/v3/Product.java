package Module04.BuilderDesignPattern.bettercode.v3;


import java.util.List;

public class Product {
    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;
    private int discount;
    private String createdAt;
    private String updatedAt;
    private List<String> images;

    public Product() {
    }

    public Product(Builder b){

        if(b.getPrice()<0) return;

        this.price = b.getPrice();
    }


}
