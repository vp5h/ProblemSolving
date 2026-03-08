import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        cars.sort((a, b) -> b.getNumberOfVictories() - a.getNumberOfVictories());
        return cars;
    }
}