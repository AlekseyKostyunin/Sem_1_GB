import java.time.LocalDate;
import java.util.List;

/**
*  Класс китов
*/
public class Whales extends Animal {

    private double weight; // вес
    public Whales(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, double weight) {
        super(name, birthDate, vaccinations, illness, owner);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
