import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());

        int amount=1059;
        int countOfCoins=0; 

        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            while(coins[i]<=amount){
                countOfCoins++;
                ans.add(coins[i]);
                amount=amount-coins[i];
                
            }
            
        }
        
        System.out.println("Count : "+countOfCoins);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
            
        }
    }
}
