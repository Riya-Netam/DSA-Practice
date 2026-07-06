import java.util.*;

public class HashMapOperations{
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm= new HashMap<>();

        //Insert - O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        System.out.println(hm);

        //Get - O(1)
        int population=hm.get("India");
        System.out.println(population);

        //ContainsKey - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        //Remove - O(1)
        System.out.println(hm.remove("Indo"));
        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //Is Empty
        // hm.clear();
        System.out.println(hm.isEmpty());

        //Iterate
        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for(String k:keys){
            System.out.println("Keys = "+k+",values= "+hm.get(k));
        }

    }
}