import java.util.*;

public class REmoveDuplicates {

    public static void goodString(String str, int i,StringBuilder sb,boolean map[]){
        if(i==str.length()){
            System.out.println(sb);
            return;
        }

        char currChar=str.charAt(i);
        if(map[currChar-'a']==true){
            goodString(str, i+1, sb, map);
        }
        else{
            map[currChar-'a']=true;
            goodString(str, i, sb.append(currChar), map);
        }

    }
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        str=sc.nextLine();
        
        goodString(str, 0,new StringBuilder(""),new boolean[26]);
    }
}
