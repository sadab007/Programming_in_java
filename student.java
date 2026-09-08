package OOPs;

class Student_{
    String name ;
    int rollNumber;
    String course;
    Student_(String name,int rollNumber,String course){
       this.name=name ;
       this.rollNumber = rollNumber;
       this.course =course;
    //    name=name ;
    //    rollNumber = rollNumber;
    //    course =course;
    }
    void dispal(){
        System.out.println("Name :"+name);
        System.out.println("Roll no. "+rollNumber);
        System.out.println("Course " +course);
    }

}

public class student {
    public static void main(String[] args) {
        Student_ s = new Student_("Rony",12,"cse");
        s.dispal();
    }
}
