public class CarsAssemble {
    private static final int CARS_PER_HOUR = 221;

    public double productionRatePerHour(int speed) {
        
    if(speed>0 && speed <=4){
    return speed * CARS_PER_HOUR;
    }else if(speed>4 && speed<=8){
     return speed * CARS_PER_HOUR * 0.9;
    } else if (speed == 9) {
    return speed * CARS_PER_HOUR * 0.8;  
    }  else if (speed == 10) {
    return speed * CARS_PER_HOUR * 0.77; 
    }
    return 0;
    }

    public int workingItemsPerMinute(int speed) {
    return (int) (productionRatePerHour(speed) / 60);
    }
}
