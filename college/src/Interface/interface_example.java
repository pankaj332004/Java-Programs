package Interface;
interface  calculator {
    void addition(int x, int y);
    void subtraction(int x , int y);
}
abstract  class test1 implements  calculator{
    public void addition(int x , int y){
        System.out.println("Sum = "+(x+y));
    }
//    public void subtraction(int x , int y){
//        System.out.println("Difference = "+(x-y));
//    }
}
class test2 extends  test1{
    public void subtraction(int x, int y) {
        System.out.println("Subtraction is "+(x-y));
    }
}
class interface_example{
    public static void main(String[] args) {
        test2 ob = new test2();
        ob.addition(12,16);
        ob.subtraction(15,10);
    }
}

