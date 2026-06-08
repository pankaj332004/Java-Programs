public class area {
    int length;
    int breadth;
    area(){
        System.out.println("Welcome to area class ");
    }
    area(int x , int y){
        this.length = x;
        this.breadth = y;
    }
    void calculate(){
        System.out.println("area = "+length*breadth);
    }
}
