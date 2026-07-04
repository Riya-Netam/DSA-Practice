import java.util.Scanner;

public class LinearSearch {

    public static int search(int number[],int key){
        for(int i=1;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number []={2,4,6,8,1,3};
        System.out.print("Enter the key you want : ");
        Scanner sc=new Scanner(System.in);
        int key =sc.nextInt();

        int index=search(number, key);
        if(index==-1){
            System.out.println("NOT EXIST");
        }
        else{
            System.out.println("key is at index : "+index);
        }

        
    }
}
