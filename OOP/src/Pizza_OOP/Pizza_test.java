package Pizza_OOP;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Pizza_test{

    public static void main(String[] args) {


        String[] typeofPizza = {"Margherita", "Napolitana", "Capriciosa"};
        String[] sizeofPizza = {"Small", "Medium", "Big"};
        String[] Dough = {"Thin", "Thick"};
        String[] ingredients = {"Tomato", "Olive", "Cheese", "Pepper", "Onion", "Basil and Oregano"};
        String addIngredients;
        int priceSize = 0;
        int priceDough = 0;
        int priceTomato = 0;
        int priceOlive = 0;
        int priceCheese = 0;
        int pricePepper = 0;
        int priceOnion = 0;
        int priceBandO = 0;

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
        if (pizzaSize.equals("Small")){
            pizzaSizeInt = 10;
            priceSize = Integer.parseInt("10");
        }
        else if (pizzaSize.equals("Medium")){
            pizzaSizeInt = 20;
            priceSize = Integer.parseInt("20");
        }
        else if(pizzaSize.equals("Big")){
            pizzaSizeInt = 20;
            priceSize = Integer.parseInt("30");
        }

        if (typeDough.equals("Thin")) {
            priceDough = Integer.parseInt("30");
        }
        else if(typeDough.equals("Thick")) {
            priceDough = Integer.parseInt("35");
        }
        {
        if (selectedIngredients.contains("Tomato"))
            priceTomato = Integer.parseInt("12");
        if  (selectedIngredients.contains("Olive")){
            priceOlive = (int) Double.parseDouble("15.5");}
        if  (selectedIngredients.contains("Cheese")){
            priceCheese = (int) Double.parseDouble("20.5");}
        if  (selectedIngredients.contains("Pepper")){
            pricePepper = (int) Double.parseDouble("17.5");}
        if  (selectedIngredients.contains("Onion")){
            priceOnion = Integer.parseInt("11");}
        if  (selectedIngredients.contains("Basil and Oregano")){
            priceBandO = Integer.parseInt("5");}
        }
        double  Ingrprice = priceTomato + priceOlive + priceCheese + pricePepper + priceOnion + priceBandO;

        double totalPrice =  priceSize + priceDough + Ingrprice;

        System.out.println("Pizza type - " + pizzaType);
        System.out.println("Pizza size - " + pizzaSize +" = "+ priceSize +" lei ");
        System.out.println("Dough type - " + typeDough + " = "+ priceDough + " lei ");
        System.out.println("Added ingredients - " + selectedIngredients + " = " + Ingrprice + " lei");
        System.out.println("Total price " + totalPrice +" lei");


    }

}
