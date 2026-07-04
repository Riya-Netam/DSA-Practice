import java.util.*;

public class Class1{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // int element=list.get(2);
        // System.out.println(element);

        // //Delete
        // list.remove(2);
        // System.out.println(list);

        //Set
        // list.set(2,10);
        // System.out.println(list);

        // //Contains
        // System.out.println(list.contains(10));
        // System.out.println(list.contains(12));

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //Reverse O(n)
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}