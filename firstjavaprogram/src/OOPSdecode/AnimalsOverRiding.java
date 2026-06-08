package OOPSdecode;

class  Animal{
    public void eat(){
        System.out.println("Animal is eating...");
    }
    public  void sleep(){
        System.out.println("Animal is sleeping...");
    }
}
class Monkey extends Animal{
    public void eat(){
        System.out.println("Monkey steal nad eats...");
    }
    public  void sleep(){
        System.out.println("Monkey is sleeping...");
    }
}
class Deer extends Animal{
    public void eat(){
        System.out.println("Deer hunts and eats...");
    }
    public  void sleep(){
        System.out.println("Deer is sleeping...");
    }
}
class Lion extends Animal{
    public void eat(){
        System.out.println("Lion hunts and eats...");
    }
    public  void sleep(){
        System.out.println("Lion is sleeping...");
    }
}

class  Forest{
    public void allowAnimal(Animal animal){
        animal.eat();
        animal.sleep();

        System.out.println();
    }
}
public class AnimalsOverRiding {
    public static void main(String[] args) {
        Forest f = new Forest();
        f.allowAnimal(new Monkey());
        f.allowAnimal(new Deer());
        f.allowAnimal(new Lion());
    }
}


// Rules of overriding
// same method name
//parent class object can inherite  the child class property
// we can't change return type
// if we want to change then there should be relationship b/t return type of the method
// 2. while overiding we can't reduce the scope of access modifier
// Private < default < protected < public

// 4. final is an access modifier applicable at
// a. variable => If  applied at variable level then the value can't be changed
// b. method => If applied at method level , then we can't override the method in the child class.
// c. class => If applied at the class level , then the class won't participate in the inheritance.


// 5. abstract is an access modifier applicable at
// a. method => If we are not giving the body for a method then mark the method as the "abstract"
// b. class => If we don't want the object to be created for a class, then mark the class as the "abstract"
// c. variable => this access modifier can't be applied on the variable
// In case of overriding, compulsorily the child class should give implementation for all the abstract methods present in the parent
// class , if the implementation is   not given then that class should be marked as the "abstract"