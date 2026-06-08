package OOPSdecode;
//class Sample{
//    public void methodOne(String s){
//        System.out.println("String version");
//    }
//    public void methodOne(Object o){
//        System.out.println("Object version");
//    }
//    public void methodOne(StringBuffer sb){
//        System.out.println("StringBuffer version");
//    }
//}
//public class testPolymorphism {
//    public static void main(String[] args) {
//        Sample s = new Sample();
//        s.methodOne("Pankaj");
//        s.methodOne(new Object());
//
//    }
//}

//class Animal{}
//class Monkey extends Animal{
//
//}
//class AnimalApp{
//    public void m1(Monkey m){
//        System.out.println("Monkey version...");
//    }
//    public void m1(Animal a){
//        System.out.println("Animal version...");
//    }
//}
//public class testPolymorphism {
//    public static void main(String[] args) {
//        AnimalApp a = new AnimalApp();
//        Monkey m = new Monkey();
//        a.m1(m);
//
//        Animal an = new Animal();
//        a.m1(an);
//
//        Animal anm = new Monkey();
//        a.m1(anm);
//
//    }
//}

class Demo{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void add(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
    public void add(int a,int b,int c,int d,int e){
        System.out.println(a+b+c+d+e);
    }
    public void add(int a,int b,int c,int d,int e,int f){
        System.out.println(a+b+c+d+e+f);
    }
}
class AdvancedDemo{
    public void add(int... args){
        int sum=0;

        for(int num : args){
            sum += num;
        }
        System.out.println(sum);
    }
}
// Var... args int java
// this mechanism available in java from jdk1.5v
// in case of var... args all the arguments should be of the same datatype
// you can call var... args all the arguments from 0 to n
public class testPolymorphism{
    public static void main(String[] args) {
        Demo d= new Demo();
        d.add(10,20);
        d.add(1,3,5,7,9);
        System.out.println();
        AdvancedDemo ad = new AdvancedDemo();
        ad.add(10,20);
        ad.add(1,3,5,7,9);
        ad.add();
        ad.add(1,2,3,4,5,6,7,8,9,10);
    }
}
