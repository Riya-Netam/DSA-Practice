public class FindPermutations {
    public static void findPer(String str,String ans){
        //base Case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String Newstr=str.substring(0, i)+str.substring(i+1);
            findPer(Newstr, ans+curr);

        }

    }
    public static void main(String[] args) {
        String str="abc";
        findPer(str, "");
    }
}
