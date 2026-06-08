package practical3;

public class book {
    String title;
    String author;
    int price;
    book(){
        this.title=" Unknown ";
        this.author=" Unknown ";
        this.price=0;
    }
    book(String  t ,String a , int p){
        this.title = t;
        this.author=a;
        this.price=p;
    }
    book(String t, String a){
        this.title =t;
        this.author =a;
    }
    void display(){
        System.out.print("Book title : "+title);
        System.out.print("Book author : "+author);
        System.out.println("Book price : "+price);
    }
}
class main1{
    public static void main(String[] args) {
        book b = new book();
        book b1 = new book(" Maths "," RD sharma ");
        book b2 = new book(" Maths ","ncert ",100);
        b.display();
        b1.display();
        b2.display();
    }
}
