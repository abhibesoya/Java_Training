package Exercise_6;

public class StudentName {
    public static void main(String[] args)
    {
        Student n1 = new Student("Mike");
        Student n2 = new Student("Micheal");
        Student n3 = new Student("");
        Student n4 = new Student("Jack");
        Student n5 = new Student("");

    }
}

class Student
{
    String name;

    Student(String n1)
    {
        this.name = n1;
        System.out.println("Name is:"+ this.name);
    }

    Student()
    {
        this.name="unknown";
        System.out.println("Name is:"+ this.name);
    }
}
