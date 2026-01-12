import java.util.*;
import java.util.stream.Collectors;

public class DealerShip {
    Set<Car> cars = new HashSet<>();
    Map<Client, Set<Car>> clients = new TreeMap<>();

    // 1. filter & toList: Get cars of a specific constructor
    public List<Car> getCarsByConstructor(CarConstructor constructor) {
        return null;
    }

    // 2. mapToDouble & sum: Calculate total value of all cars in stock
    public double getTotalStockValue() {
        return 0;
    }

    // 3. max: Find the car with the highest power
    public Optional<Car> getMostPowerfulCar() {
        return Optional.empty();
    }
    // 4. max: Find the car with the highest power for a given client
    public Optional<Car> getMostPowerfulCar(int clientCode) {
        return Optional.empty();
    }


    // 5. groupingBy: Group cars by their constructor
    public Map<CarConstructor, List<Car>> groupCarsByConstructor() {
        return null;
    }

    // 6. reduce: Find the total score of all clients
    public double getTotalClientsScore() {
        return 0;
    }

    // 7. map & collect (joining): Get names of all clients as a single comma-separated string
    public String getClientNamesFormatted() {
        return null;
    }
}
