package Abstract;

abstract class InterestCalculation {
    int p = 50000;
    int t =3;
    abstract  void ROI(int x);
    void display(){
        System.out.println("Principle amount = "+p+" time = "+t);
    }
}
class SBI extends InterestCalculation{
    int r;
    void ROI(int x){
        r = x;
    }
    void calculate(){
        System.out.println("SI = "+(p*r*t)/100);
    }
}
class ICICI extends InterestCalculation{
    int r;
    void ROI(int x){
        r = x;
    }
    void calculate(){
        System.out.println("SI = "+(p*r*t)/100);
    }
}
class example{
    public static void main(String[] args) {
        SBI s = new SBI();
        s.ROI(7);
        s.display();
        s.calculate();
        ICICI i =new ICICI();
        i.ROI(8);
        i.display();
        i.calculate();
    }
}
