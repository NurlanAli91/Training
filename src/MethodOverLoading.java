public class MethodOverLoading {

    public static void main(String[] args) {

       MethodOverLoading obj = new MethodOverLoading();

        obj.addNumbers(20,50);
        addNumbers(10,10,10,10);
        addNumbers(34,34,34);
        addNumbers();
        addNumbers(30);

//       StringBuilder str = new StringBuilder("Nurlan Aliyev");
//        System.out.println(str.reverse());
    }


    /// -----------

    void addNumbers(int x, int y){
        System.out.println(x + y);
    }

    static void addNumbers(int x, int y, int z){
        System.out.println(x + y + z);
    }

    static void addNumbers(int x, int y, int z, int a){
        System.out.println(x + y + z + a);
    }

    static void addNumbers(){
        System.out.println("No params");
    }

    static void addNumbers(int x){
        System.out.println(x);
    }




    static void selectDropDown(String name){

    }

    static void selectDropDown(int index){

    }

    static void selectDropDown(char option){

    }


}
