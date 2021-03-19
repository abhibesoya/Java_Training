package Exercise_6;

public class Employee {
    String name;
    int yearOfJoining;
    String addr;

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.name = "Robert";
        e1.yearOfJoining = 1994;
        e1.addr = "64C- Walls Streat";

        System.out.println("Name    Year of joining     Address");
        System.out.println(e1.name +"\t"+ e1.yearOfJoining + "\t\t" + e1.addr);

        e2.name="Sam";
        e2.yearOfJoining = 2000;
        e2.addr ="68D- Walls Streat";

        System.out.println(e2.name +"\t\t"+ e2.yearOfJoining + "\t\t" + e2.addr);

        e3.name = "John";
        e3.yearOfJoining = 1999;
        e3.addr = "26B- Walls Streat";

        System.out.println(e3.name +"\t"+ e3.yearOfJoining + "\t\t" + e3.addr);

    }

}

