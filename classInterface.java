package ecommerce;

public interface classInterface {


        public interface Cart {
            void addItem();
            void removeItem();
            void getPrice();

        }

        public interface Customer
        {
            String getName();
            String getEmail();
            String getNUmber();
        }

        public interface Order
        {
            String quantity();
            String payment();
            String cancelOrder();


        }

        public interface Product
        {
            String imported();
            String local();
            String outOfStock();
        }

        public interface Store
        {
            String mainland();
            String island();
            String outsideLagos();
        }

    }


