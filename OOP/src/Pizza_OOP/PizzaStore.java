package Pizza_OOP;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PizzaStore {

    public static void main(String[] args) {


        String[] typeofPizza = {"Margherita", "Napolitana", "Capriciosa"};
        String[] sizeofPizza = {"Small", "Medium", "Big"};
        String[] Dough = {"Thin", "Thick"};
        String[] ingredients = {"Tomato", "Olive", "Cheese", "Pepper", "Onion", "Basil and Oregano"};
        String addIngredients;
        double priceSize = 0;
        double priceDough = 0;
        double priceTomato = 0;
        double priceOlive = 0;
        double priceCheese = 0;
        double pricePepper = 0;
        double priceOnion = 0;
        double priceBandO = 0;

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

        if (pizzaSize.equals("Small")) {
            priceSize = 10;
        } else if (pizzaSize.equals("Medium")) {
            priceSize = 20;
        } else if (pizzaSize.equals("Big")) {
            priceSize = 30;
        }

        if (typeDough.equals("Thin")) {
            priceDough = 35;
        } else if (typeDough.equals("Thick")) {
            priceDough = 35;
        }
        if (selectedIngredients.contains("Tomato")) {
            priceTomato = 12;
        }
        if (selectedIngredients.contains("Olive")) {
            priceOlive = 15.5;
        }
        if (selectedIngredients.contains("Cheese")) {
            priceCheese = 20.5;
        }
        if (selectedIngredients.contains("Pepper")) {
            pricePepper = 17.5;
        }
        if (selectedIngredients.contains("Onion")) {
            priceOnion = 11;
        }
        if (selectedIngredients.contains("Basil and Oregano")) {
            priceBandO = 5;
        }
        double Ingrprice = priceTomato + priceOlive + priceCheese + pricePepper + priceOnion + priceBandO;
        double totalPrice = priceSize + priceDough + Ingrprice;

        System.out.println("Pizza type - " + pizzaType);
        System.out.println("Pizza size - " + pizzaSize + " = " + priceSize + " lei ");
        System.out.println("Dough type - " + typeDough + " = " + priceDough + " lei ");
        System.out.println("Added ingredients - " + selectedIngredients + " = " + Ingrprice + " lei");
        System.out.println("Total price " + totalPrice + " lei");


    }
}
