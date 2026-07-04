public class Substring {

    public static String getsubstring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }

        return substr;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        int si=1;
        int ei=7;
        // System.out.println(getsubstring(str,si,ei));

        System.out.println(str.substring(0,5));
    }
}
