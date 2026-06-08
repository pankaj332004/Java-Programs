package basics;

public class simpleinterest {
    public static void main(String[] args) {
        double p = 20000;
        double r = 10;
        double t = 5;
        double SI = (p*r*t)/100;
        System.out.println("Simple interest with principle amount : "+p+" rate : "+r+" time : " +t+" is "+SI);
    }
}
