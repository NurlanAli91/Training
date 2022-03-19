public class MethodsClassA {

    public static void addTwoNumbers(double x, double y){
        System.out.println(x + y);
    }

    public static void multiplyTwoNumbers(double x, double y){
        System.out.println(x * y);
    }

    public static void findNumberOfVowels(String str){
     int countOfVowels = 0;
     for(int i = 0; i < str.length(); i++){

         if(str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' ||
                 str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' || str.charAt(i) == 'U' ||
                 str.charAt(i) == 'i' || str.charAt(i) == 'I' ){
             countOfVowels++;
         }
     }
        System.out.println(countOfVowels);
    }



    public static void printUntil(int x){
        for(int i = 0; i <= x; i++){
            System.out.print(i + ",");
        }
    }

        }





