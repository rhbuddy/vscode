public class JedliksToyCar {
    private int distanceDriven = 0;
    private int batteryCharge = 100;
    public static JedliksToyCar buy() {
        //throw new UnsupportedOperationException("Please implement the (static) JedliksToyCar.buy()  method");
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        //throw new UnsupportedOperationException("Please implement the JedliksToyCar.distanceDisplay()  method");
        
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
       // throw new UnsupportedOperationException("Please implement the JedliksToyCar.batteryDisplay()  method");
        if(batteryCharge > 0){
        return "Battery at " + batteryCharge + "%";}
        else{return "Battery empty";}
    }

    public void drive() {
       // throw new UnsupportedOperationException("Please implement the JedliksToyCar.drive()  method");
      if(batteryCharge >0){
        distanceDriven += 20;
        batteryCharge --;
      }
    }
}
