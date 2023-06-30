import java.util.HashMap;

public class IngredientsHolder {
    public static HashMap<Ingredients, Double>holder = new HashMap<>();
    static{
        holder.put(Ingredients.water,1000.00);
        holder.put(Ingredients.milk,1000.00);
        holder.put(Ingredients.beans,1000.00);
    }

    public static void addIngredients(Ingredients type, double quantity ){
        holder.put(type, holder.get(type)+quantity);
    }

    public static double getIngredients(Ingredients type){
        return holder.get(type);
    }
}