import java.time.LocalDate;

public class TrainingMethods {
    public static void main(String[] args) {


        addNumbers(10,10);
        addNumbers(12,12,12);

        TrainingMethods obj = new TrainingMethods();


        obj.addDigits(10,10);

        printFullName("Nurlan Aliyev");

        StringBuilder text = new StringBuilder("Nurlan");
        System.out.println(text.reverse());

        findVowel("Nurlan");
        findVowel("United States of America");

        obj.numberOfVowels("Family");

        System.out.println("");

        printUntil(7);

        obj.addNameAgeEmail("Nurlan", 30, '@');

        int age2 = obj.calculateAge(1991);

        boolean result = obj.pageTitle("Welcome to home page");
        System.out.println(result);

        boolean result1 = obj.pageTitle("Welcome to your page");
        System.out.println(result1);

        String name = obj.printName("Nurlan");
        System.out.println(name);

        int number = obj.printNumber1(30);
        System.out.println(number);

        char sign = obj.printSingleSign('$');
        System.out.println(sign);

        char sign1 = obj.printSingleSign('!');
        System.out.println(sign1);


    }

    static void addNumbers(int x, int y){
        System.out.println(x + y);
    }

    static void addNumbers(int x, int y, int z){
        System.out.println(x + y + z);
    }

    void addDigits(int z, int f){
        System.out.println(z + f);
    }

    static void printFullName(String name){
        System.out.println("My name is " + name);
    }

    static void findVowel(String str){
        int countOfVowel = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' || str.charAt(i) == 'U' ||
                    str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i' || str.charAt(i) == 'I' ||
                    str.charAt(i) == 'a' || str.charAt(i) == 'A'){
                countOfVowel++;
            }
        }
        System.out.println(countOfVowel);
    }

    void numberOfVowels( String str) {
        int vowelsNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'e' || str.charAt(i) == 'E' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' || str.charAt(i) == 'U' ||
                    str.charAt(i) == 'a' || str.charAt(i) == 'A'){
                vowelsNumber++;
            }
        }
        System.out.println(vowelsNumber);
    }

    static void printUntil(int x){
        for(int i = 0; i <= x; i++){
            System.out.println(i + ",");
        }
    }

    void addNameAgeEmail(String name, int age, char email){
        System.out.println(name + "," + age + "," + email);
    }

    LocalDate date = LocalDate.now();

    int calculateAge(int birthYear) {
        return date.getYear() - birthYear;
    }

    boolean pageTitle(String title){
        if(title.equals("Welcome to your page")){
            return true;
        }else{
            return false;
        }
    }

    String printName( String name){
        return name;
    }

    int printNumber1(int number){
        return number;
    }

    char printSingleSign(char sign){
        return sign;
    }



}
