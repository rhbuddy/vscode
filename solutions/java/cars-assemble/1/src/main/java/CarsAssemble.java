public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRatePerHour() method");
       
        if(speed >= 1 && speed <= 4){ 
                return 221 * speed;
        } else if (speed >= 5 && speed <= 8){
            return 221*speed*0.9;
        } else if (speed == 9){
            return 221*speed*0.8;
        } else if (speed == 10){
            return 221*speed*0.77;
        } else if (speed == 0){
            return 0;
        } else {
            return 0;
        }
    }

    public int workingItemsPerMinute(int speed) {
       // throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
    return (int)(productionRatePerHour(speed)/60);
    }
}
