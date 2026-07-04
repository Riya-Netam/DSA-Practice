public class Constructor{
    public static void main(String[] args) {
        Student s1=new Student("Riya");
        Student s2=new Student(07);
        Student s3=new Student();
    }
}

class Student{
    String name;
    int roll;
    

    Student(){
        System.out.println("Constructor is called");
    }

    Student(String name){
        this.name=name;
        System.out.println(name);
    }

    Student(int roll){
        this.roll=roll;
        System.out.println(roll);
    }
}