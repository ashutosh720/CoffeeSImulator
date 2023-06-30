import java.util.HashMap;
import java.util.Map;

public class Record {
    public static double total=0.0;
    public static HashMap<Ingredients, Double> ingreadientUsed = new HashMap<>();
    static{
        ingreadientUsed.put(Ingredients.water,0.00);
        ingreadientUsed.put(Ingredients.milk,0.00);
        ingreadientUsed.put(Ingredients.beans,0.00);
    }

    public static void ingreadientsUsed(Ingredients type, double quantity ){
        ingreadientUsed.put(type, ingreadientUsed.get(type)+quantity);
    }
    public static void addTotal(double price){
        total+=price;
    }

    public static void printRecord(){
        for(Map.Entry<Ingredients,Double>ele:ingreadientUsed.entrySet()){
            System.out.println("Ingreadient spent -> "+ele.getKey()+" -> "+ele.getValue());
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Total ammount of cofees sold -> "+total);
    }
}
