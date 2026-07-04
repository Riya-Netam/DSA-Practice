public class OopsBasic{
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("green");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc=new BankAccount();
        myAcc.username="riyanetam";
        myAcc.setPassword("1234");
    }
}

class BankAccount{
    public String username:
    private String password;

    public void setPassword(String pwd){
        password=pwd;
    }
}

class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem,int maths){
        percentage=(phy+chem+maths)/3.0f;
    }
}