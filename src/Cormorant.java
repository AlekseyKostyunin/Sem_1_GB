import java.time.LocalDate;
import java.util.List;

/**
 * Класс бакланов (умеют летать, плавать, бегать (ходить))
 * */
public class Cormorant extends Animal{

    private String type; // вид этих птиц
    public Cormorant(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, String type) {
        super(name, birthDate, vaccinations, illness, owner);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
