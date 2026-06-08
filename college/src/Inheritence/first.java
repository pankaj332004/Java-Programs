package Inheritence;

interface first {
    void show();
}
interface second{
    void show();
}
class test3 implements first,second{
    public void show(){
        System.out.println("Calling interface");
    }
}
class Interface_EG{
    public static void main(String[] args) {
        test3 t=new test3();
        t.show();
    }
}
