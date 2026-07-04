import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(15);
        list.add(9);
        list.add(8);
        list.add(12);
        list.add(5);

        System.out.println(list);
        Collections.sort(list); //Ascending
        System.out.println(list);

        //Descending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
