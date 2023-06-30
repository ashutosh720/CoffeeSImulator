import java.util.HashMap;
import java.util.Map;

public class Latte {
    public static double price = 7.0;
    public static HashMap<Ingredients,Double> ingreadients = new HashMap<>();
    static{
        ingreadients.put(Ingredients.water,350.0);
        ingreadients.put(Ingredients.milk,75.0);
        ingreadients.put(Ingredients.beans,20.0);
    }


    public static void makeCofee(){
        for(Map.Entry<Ingredients,Double>ele:ingreadients.entrySet()){
            if(IngredientsHolder.getIngredients(ele.getKey())<ingreadients.get(ele.getKey())){
                System.out.println("Not enough ingredients  available for making Latte");
                return;
            }
        }
        for(Map.Entry<Ingredients,Double>ele:ingreadients.entrySet()){
            IngredientsHolder.holder.put(ele.getKey(), IngredientsHolder.getIngredients(ele.getKey())-ingreadients.get(ele.getKey()));
            Record.ingreadientUsed.put(ele.getKey(), IngredientsHolder.getIngredients(ele.getKey())+ingreadients.get(ele.getKey()));
        }
        Record.addTotal(price);
        System.out.println("Here is your Latte | price = "+price);
    }
}