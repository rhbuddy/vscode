import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {
         int log = random.nextInt(9999 - 1000 + 1)+1000;
        return "NCC-"+log;
    }


    double randomStardate() {
        double logs = 41000 + (1000 * random.nextDouble());
        return logs;
    }
}
