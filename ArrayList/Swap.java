import java.util.ArrayList;

public class Swap {

    public static void swapIndex(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

    }
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(15);
        list.add(9);
        list.add(8);
        list.add(12);
        list.add(5);

        System.out.println(list);

        //Swap
        swapIndex(list,2,3);

        System.out.println(list);
    }
}
