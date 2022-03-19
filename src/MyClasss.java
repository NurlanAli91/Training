public class MyClasss {

    // instance variables or class members
    String name = "Bob";
    int age = 23;
    char gender = 'M';

    // class variables

    static String lastName = "Smith";
    static int birthYear = 1987;


    public static void main(String[] args) {
        // local variables
        int number = 10;

        MyClasss cs = new MyClasss();

        System.out.println(cs.name);

        System.out.println(lastName + birthYear);

    }

    void print(){
        String name = "Jhon";
        System.out.println(name);
    }
}
