import java.util.HashSet;

public class Union_Intersection {

    public static void union(int arr1[],int arr2[]){
        HashSet<Integer> union=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            union.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            union.add(arr2[i]);
        }

        System.out.println(union);
        System.out.println("size:  "+union.size());
    }

    public static void intersection(int arr1[],int arr2[]){
        HashSet inter=new HashSet<>();
        int count=0;

        for(int i=0;i<arr1.length;i++){
            inter.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            if(inter.contains(arr2[i])){
                System.out.print(arr1[i]+" ");
                count++;
                inter.remove(arr1[i]);
            }
        }

        System.out.println("Size of intersection: "+count);
    }
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};

        union(arr1, arr2);

        intersection(arr1, arr2);
    }
}
