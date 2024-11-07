package ecommerce;

import java.util.List;

    public class CartImpl implements classInterface.Cart {

        @Override
        public void addItem() {
            System.out.println("Here you can add more items.");
        }

        @Override
        public void removeItem() {
            System.out.println("Remove any item");
        }

        @Override
        public void getPrice() {

        }
    }



