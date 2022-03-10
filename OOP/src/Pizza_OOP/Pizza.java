package Pizza_OOP;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    String name;
    int size; // 1, 2, 3
    List<String> ingredients;
    String blatType;
    int totalPrice;

    public Pizza() {
        name = "Margherita";
        size = 1;
        ingredients = new ArrayList<>();
        ingredients.add("Tomato");
        ingredients.add("Basil");
        ingredients.add("Cheese");
        blatType = "Thin"; //Thick
    }

    //overloaded constructors
    public Pizza(String nameOfPizza) {
        name = nameOfPizza;
    }

    //overloaded constructors
    public Pizza(String nameOfPizza, int sizeOfPizza) {
        name = nameOfPizza;
        size = sizeOfPizza;
    }

    //overloaded constructors
    public Pizza(String nameOfPizza, int sizeOfPizza, String blatTypeOfPizza) {
        name = nameOfPizza;
        size = sizeOfPizza;
        blatType = blatTypeOfPizza;
    }

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
        if (size == 1) {
            totalPrice = totalPrice + 10;
        }

        return 0;
    }
}
