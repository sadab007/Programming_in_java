package OOPs;

class person{
    String name;
    int age;

    person(int age,String name){
        this.age = age;
        this.name= name;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        
    }
    
}

public class Student_ extends person {
    // int rollNumber =1;
    // void display(){
    //     super.display();
    //     System.out.println(rollNumber);
    // }
    public static void main(String[] args) {
        Student_ s1 = new Student_();
        
        s1.display();
    }
}
