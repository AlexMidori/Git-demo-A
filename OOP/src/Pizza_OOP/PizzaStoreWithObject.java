package Pizza_OOP;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PizzaStoreWithObject  {

    public static void main(String[] args) {


        String[] typeofPizza = {"Margherita", "Napolitana", "Capriciosa"};
        String[] sizeofPizza = {"Small", "Medium", "Big"};
        String[] Dough = {"Thin", "Thick"};
        String[] ingredients = {"Tomato", "Olive", "Cheese", "Pepper", "Onion", "Basil and Oregano"};
        String addIngredients;


        ImageIcon icon = new ImageIcon("OOP/src/Pizza_OOP/image/pizza.png");
        String pizzaType = (String) JOptionPane.showInputDialog(null, "What kind of pizza do you want?",
                "Pizza Store", JOptionPane.QUESTION_MESSAGE, icon, typeofPizza, null);

        String pizzaSize = (String) JOptionPane.showInputDialog(null, "Choose the size of Pizza!",
                "Pizza Store", JOptionPane.QUESTION_MESSAGE, icon, sizeofPizza, null);

        String typeDough = (String) JOptionPane.showInputDialog(null, "Choose the type of Dough!",
                "Pizza Store", JOptionPane.QUESTION_MESSAGE, icon, Dough, null);
        List<String> selectedIngredients = new ArrayList<>();
        do {
            addIngredients = (String) JOptionPane.showInputDialog(null, "Choose the ingredients!",
                    "Pizza Store", JOptionPane.QUESTION_MESSAGE, icon, ingredients, null);
            selectedIngredients.add(addIngredients);

        } while (addIngredients != null);
        selectedIngredients.remove(null);

        int pizzaSizeInt = 0;
        if (pizzaSize.equals("Small")) {
            pizzaSizeInt = 1;
        } else if (pizzaSize.equals("Medium")) {
            pizzaSizeInt = 2;
        } else if (pizzaSize.equals("Big")) {
            pizzaSizeInt = 3;
        }
        Pizza p1 = new Pizza(pizzaType, pizzaSizeInt, selectedIngredients, typeDough);
        double finalPrice = p1.calculatePrice();


        System.out.println("Pizza type - " + pizzaType);
        System.out.println("Pizza size - " + pizzaSize);
        System.out.println("Dough type - " + typeDough);
        System.out.println("Added ingredients - " + selectedIngredients);
        System.out.println("Total price " + finalPrice + " lei");

        System.out.println();


    }
}
