package Abstract;

abstract class X {
    void run(){
        System.out.println("Welcome ");
    }
    abstract  void calculate(int x , int y);
}
class Y extends  X{
    void display(){
        System.out.println("In child");
    }

    @Override
    void calculate(int x, int y) {
        System.out.println("Sum = "+(x+y));
    }
}
class abstract_example{
    public static void main(String[] args) {
        Y obj = new Y();
        obj.run();
        obj.calculate(7,8);
        obj.display();
    }
}