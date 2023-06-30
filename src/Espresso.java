import java.util.HashMap;
import java.util.Map;

public class Espresso {
    public static double price = 4.0;
    public static HashMap<Ingredients,Double> ingreadients = new HashMap<>();
    static{
        ingreadients.put(Ingredients.water,250.0);
        ingreadients.put(Ingredients.milk,0.0);
        ingreadients.put(Ingredients.beans,16.0);
    }


    public static void makeCofee(){
        for(Map.Entry<Ingredients,Double>ele:ingreadients.entrySet()){
            if(IngredientsHolder.getIngredients(ele.getKey())<ingreadients.get(ele.getKey())){
                System.out.println("Not enough ingredients  available for making Espresso");
                return;
            }
        }
        for(Map.Entry<Ingredients,Double>ele:ingreadients.entrySet()){
            IngredientsHolder.holder.put(ele.getKey(), IngredientsHolder.getIngredients(ele.getKey())-ingreadients.get(ele.getKey()));
            Record.ingreadientUsed.put(ele.getKey(), IngredientsHolder.getIngredients(ele.getKey())+ingreadients.get(ele.getKey()));
        }
        Record.addTotal(price);
        System.out.println("Here is your Espresso | price = "+price);
    }

}
