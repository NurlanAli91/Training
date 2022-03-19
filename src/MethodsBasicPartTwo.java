import java.time.LocalDate;

public class MethodsBasicPartTwo {

    public static void addTwoNumbers(int x, int y) {
        System.out.println(x + y);
    }

    void addThreeNumbers(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    int returnAge(int age) {
        // before return
        return age;
        // we can not have any code after return
    }

    void clickButton(String locator) {
        System.out.println(locator + " button is clicked");
    }

    void addNameAgeEmail(int age, String name, char email) {
        System.out.println(age + " " + name + " " + email);
    }

    int multiplyTwoNumbers(int x, int y) {
        int result = x * y;
        return result;
    }

    boolean pageTitle(String title) {
        if (title.equals("Welcome to your page")) {
            return true;
        } else {
            return false;
        }
    }

    String printName(String name) {
        return name;
    }

    LocalDate date = LocalDate.now();

    int calculateAge(int birthYear){
        return date.getYear() - birthYear;
    }





    public static void main(String[] args) {

        addTwoNumbers(40,30);
        addTwoNumbers(10,20);

        MethodsBasicPartTwo obj = new MethodsBasicPartTwo();
        obj.addThreeNumbers(10,45,23);

        int age = obj.returnAge(45);
        System.out.println(age);

        obj.clickButton("Login");

        obj.addNameAgeEmail(30, "Nurlan", '@');

        //int result =  obj.multiplyTwoNumbers(2, 4);
       // System.out.println(result);

        boolean result = obj.pageTitle("Hello & Welcome");
        System.out.println(result);

        boolean res = obj.pageTitle("Welcome to your page");
        System.out.println(res);

        String name = obj.printName("Nurlan");
        System.out.println(name);

        int age2 = obj.calculateAge(1991);

        if(age2 >= 21){
            System.out.println("Your are allowed to buy tobacco");
        }else{
            System.out.println("Your are not allowed to buy tobacco");
        }


    }





}
