import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(
                1993,6,6),
                new ArrayList<>(), "Chumka", "Boss", 4);
        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());

        Animal eagle = new Eagle("Kesha", LocalDate.of(
                1996,6,6),
                new ArrayList<>(), "Chumka", "Boss");
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
        System.out.println("________________________________________");

        barsik.lifeCycle();

        System.out.println("________________________________________");

        Whales whales = new Whales("Blue", LocalDate.of(1980,4,25),
                new ArrayList<>(), null, null, 5.8);
        whales.fly(); // Кит начал летать?
        whales.toGo(); // Кит начал бегать?

        Cormorant cormorant = new Cormorant(null, LocalDate.of(2021,7,5),
                new ArrayList<>(), null, null, "Big");
        cormorant.fly(); // Умеет летать
        cormorant.toGo(); // умеет ходить
        cormorant.swim(); // умеет плавать

    }

}