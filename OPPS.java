
 class Student {
    String Name;
    int age;

    public void getInfo (){
        System.out.println(" My name is " + this.Name);
        System.out.println("My age is " + this.age);
    }

    Student( String Name, int age ){
        System.out.println("This is constructor and it is called automatically!!!");
        this.Name = Name;
        this.age = age;
    }
}

public class OPPS {
    public static void main(){
        Student s1 = new Student("Monu Kumar", 32);
    
        s1.getInfo(); 

        Student s2 = new Student("Yogesh Priyadarshi", 30);
        
        s2.getInfo();
    }
    
}
