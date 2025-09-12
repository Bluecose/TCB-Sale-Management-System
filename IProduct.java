

public abstract class IProduct {
    protected String name;
    protected int price;


    public IProduct (){System.out.println();}

    public IProduct(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getName();
    public abstract int getPrice();
}
