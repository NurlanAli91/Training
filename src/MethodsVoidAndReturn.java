public class MethodsVoidAndReturn {

    public static void main(String[] args) {

        printText("this is void type method");

        System.out.println(printText2("this is return type method"));

        addAgeAndName(30, "Nurlan");

    }

    // void == no return type
    public static void printText(String text){
        System.out.println(text);
    }

    // method with return type
    public static String printText2(String text){
        return text;
    }

    public static void addAgeAndName(int age, String name){
        System.out.println("Age is " + age + " name is " + name);
    }





}
