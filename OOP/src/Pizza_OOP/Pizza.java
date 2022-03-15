package Pizza_OOP;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    String name;
    int size; // 1, 2, 3
    List<String> ingredients;
    String blatType;
    int totalPrice;
    double priceSize;

    //overloaded constructors
    public Pizza(String name, int size, List<String> ingredients, String blatType) {
        this.name = name;
        this.size = size;
        this.ingredients = ingredients;
        this.blatType = blatType;
    }

    //special method to get information about object
    public String toString() {
        String details = "Pizza name: " + name + "; size: " + size + "; blat type: " + blatType + "\n"
                + "ingredients " + ingredients;
        return details;
    }

    public double calculatePrice() {
        double priceTomato = 0;
        double priceOlive = 0;
        double priceCheese = 0;
        double pricePepper = 0;
        double priceOnion = 0;
        double priceBandO = 0;
        double priceSize = 0;
        double priceDough = 0;

        if (size == 1) {
            priceSize = 10;
        } else if (size == 2) {
            priceSize = 20;
        } else if (size == 3) {
            priceSize = 30;
        }
        if (blatType.equals("Thin")) {
            priceDough = 35;
        } else if (blatType.equals("Thick")) {
            priceDough = 35;
        }
        if (ingredients.contains("Tomato")) {
            priceTomato = 12;
        }
        if (ingredients.contains("Olive")) {
            priceOlive = 15.5;
        }
        if (ingredients.contains("Cheese")) {
            priceCheese = 20.5;
        }
        if (ingredients.contains("Pepper")) {
            pricePepper = 17.5;
        }
        if (ingredients.contains("Onion")) {
            priceOnion = 11;
        }
        if (ingredients.contains("Basil and Oregano")) {
            priceBandO = 5;
        }
        double priceIngredients = priceTomato + priceOlive + priceCheese + pricePepper + priceOnion + priceBandO;
        double finalPrice = priceSize + priceDough + priceIngredients;

        return finalPrice;

    }
}
