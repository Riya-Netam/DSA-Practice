import java.util.ArrayList;

public class PairSumTwoPointer {

    public static void pairSum(ArrayList<Integer>list,int target){  //O(n)
        int lp=0;
        int rp=list.size()-1;

        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                System.out.println(list.get(lp)+","+list.get(rp));
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            rp--;
        }
    }
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        pairSum(list, 5);
    }
}
