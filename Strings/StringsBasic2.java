public class StringsBasic2 {

    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName="Riya";
        String lastName="Netam";
        String fullName=firstName+" "+lastName;

        // System.out.println(fullName);

        // System.out.println(fullName.charAt(0));

        String str="Microsoft";
        printLetters(str);
    }
}
