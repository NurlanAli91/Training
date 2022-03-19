public class MethodsBasic {

    public static void main(String[] args) {

//        System.out.println("Hello");
//        System.out.println("Hello2");
//
//        // calling method
//        printText();
//        printNumber();
//        printName("Nurlan");
//        printName1("Jhon");
//        printName1("Nurlan");
//        printText("Nurlan");
//        printFullName("Nurlan", "Aliyev");
//
//        addTwoNumbers(20, 30);
//        addTwoNumbers(40, 90);
//        addTwoNumbers(80,15);


//        StringBuilder str = new StringBuilder("Hello World");
//        System.out.println(str.reverse());


//        MethodsClassA aClass = new MethodsClassA();
//
//        aClass.addTwoNumbers(30, 50);
//        MethodsClassA.multiplyTwoNumbers(5, 40);
//
//
//        MethodsClassB obj = new MethodsClassB();
//
//        obj.addTwoNumbers(40, 50);
//        obj.multiplyTwoNumbers(40,50);
//        obj.divideTwoNumbers(40,50);
//        obj.subtractTwoNumbers(40, 50);
//
//        MethodsClassB.addTwoNumbers(40,50);
//        MethodsClassB.subtractTwoNumbers(40,50);
//        MethodsClassB.divideTwoNumbers(40,50);
//        MethodsClassB.multiplyTwoNumbers(40,50);

        MethodsClassA.findNumberOfVowels("Hello");
        MethodsClassA.findNumberOfVowels("United States of America");

        MethodsClassA.printUntil(10);
        System.out.println();
        MethodsClassA.printUntil(22);







    }

    // outside the main method

    // creating method

    public static void printText(){
        System.out.println("Hello3");
    }

    public static void printNumber() {
        System.out.println(2022);
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printName1(String name){
        System.out.println("Hello " + name);
    }

    public static void printText(String text){
        System.out.println("My name is " + text);
    }

    public static void printFullName(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }

    public static void addTwoNumbers(int x, int y){
        System.out.println(x + y);
    }




}
