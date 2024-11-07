package ecommerce;

public class Main {
    public static void main(String[] args) {
        StoreImpl st = new StoreImpl();
        OrderImpl ord = new OrderImpl();
        ProductImpl prd = new ProductImpl();

        st.mainland();
        System.out.println("All order are available");
        ord.payment();
        System.out.println("Card Payment only");
        ord.getPrice();
        prd.imported();
        System.out.println("all payment should in dollar");
    }
}
