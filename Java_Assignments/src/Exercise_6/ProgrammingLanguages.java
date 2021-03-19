package Exercise_6;

public class ProgrammingLanguages {
    public static void main(String[] args) {

        Programming p1 = new Programming();
        Programming p2 = new Programming("Java");
        Programming p3 = new Programming();
        Programming p4 = new Programming("C#");
        Programming p5 = new Programming(".NET");
        Programming p6 = new Programming("Python");
    }
}

class Programming
{
    String s;

    Programming(){
        System.out.println("I love programming languages");
    }

    Programming(String s)
    {
        this.s=s;
        System.out.println("I love " + this.s);

    }
}