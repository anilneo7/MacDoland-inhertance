// Abstract class mcDonald
abstract class mcdonald{
    public void menu(){
        System.out.println("mcDonald's Burgers");
        System.out.println("mcDonald's Fries");
        System.out.println("mcDonald's Cold Drinks");
    }
    abstract public void specialOffers();
    abstract public void billing();
    abstract public void meals();
}
class MyOutlet extends mcdonald{
    public void billing(){
        int price=4;
        System.out.println("Burgers=$"+price*2);
        System.out.println("Fries=$"+price*3);
    }
    public void specialOffers(){
        System.out.println("New year offer : 2 meal @ $4.99");
    }
    public void meals(){
        System.out.println("My outlet special meal");
    }
    public void festivalOffers(){
        System.out.println("Festival Offers starting from @12.99");
    }
}
public class Main {
    public static void main(String[] args) {
        mcdonald branch = new MyOutlet();
        branch.billing();
        branch.menu();
        branch.specialOffers();
    }
}