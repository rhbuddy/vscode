public class LogLevels {
    
    public static String message(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");
        int index = logLine.indexOf("]:");
    return logLine.substring(index + 2).trim();
    }

    public static String logLevel(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
        int openbracket = logLine.indexOf("[");
        int closebracket = logLine.indexOf("]");
        return logLine.substring(openbracket + 1, closebracket).toLowerCase();
    }

    public static String reformat(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
        return message(logLine)+" (" + logLevel(logLine) + ")";
    }
}
