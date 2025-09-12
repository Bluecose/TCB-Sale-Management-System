public class Product extends IProduct {

    public Product (){System.out.println();}

    public Product(String name, int price) {
        super(name, price);
    }

    
    public String getName() {
        return name;
    }

 
    public int getPrice() {
        return price;
    }
}
