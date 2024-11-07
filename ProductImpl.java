package ecommerce;

public class ProductImpl implements classInterface.Product{
    @Override
    public String imported() {
        return "payment in Dollars";
    }

    @Override
    public String local() {
        return "payment in Naira";
    }

    @Override
    public String outOfStock() {
        return null;
    }
}
