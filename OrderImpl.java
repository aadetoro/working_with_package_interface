package ecommerce;

public class OrderImpl extends AbstractItem implements classInterface.Order{
    @Override

    public String quantity() {
        return "2000 goods";
    }

    @Override
    public String payment() {
        return "Card Payment only";
    }

    @Override
    public String cancelOrder() {
        return null;
    }

}
