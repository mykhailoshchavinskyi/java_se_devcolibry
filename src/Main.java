import devcat.Cat;
import devpeople.People;

public class Main {
    public static void main(String[] args) {
        Cat aCat = new Cat(2,"Murzik","Polosatik");
        People aPeople = new People(33,"Mikle", "Shchavinskyi", aCat);

        System.out.println(aPeople);
        aCat.say();
        aPeople.getPeopleCat().say();

    }
}
