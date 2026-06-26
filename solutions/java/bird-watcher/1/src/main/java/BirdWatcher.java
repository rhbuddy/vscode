
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
       // throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
        return new int[]{0,2,5,3,7,8,4};
    }

    public int getToday() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
        birdsPerDay[birdsPerDay.length -1]+=1;
    }

    public boolean hasDayWithoutBirds() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
        for (int count : birdsPerDay){
            if (count == 0) {
            return true;
            } 
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
        int sum = 0;
        for(int i=0 ; i< birdsPerDay.length && i< numberOfDays ; i++){
             sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
        int busyDays = 0;
        for(int count : birdsPerDay){
            if(count >= 5){
            busyDays++;
            }
        }
        return busyDays;
    }
}
