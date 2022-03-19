package pckg01.com;

class TestCase01 {
    public static void main(String[] args) {


        TestCase02 tc = new TestCase02();

        System.out.println(tc.name);
       // This is private
       // System.out.println(tc.SSN);

        TestCase03 tc3 = new TestCase03();
        tc3.printYear();

    }

    void printHello(){
        System.out.println("Hello");
    }

}
