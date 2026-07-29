class LogLine {

    private final String logLine;

    LogLine(String logLine) {
        this.logLine = logLine;
    }

    LogLevel getLogLevel() {
        String level = logLine.substring(1, logLine.indexOf(']'));

        return switch (level) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    String getOutputForShortLog() {
        int code = switch (getLogLevel()) {
            case UNKNOWN -> 0;
            case TRACE -> 1;
            case DEBUG -> 2;
            case INFO -> 4;
            case WARNING -> 5;
            case ERROR -> 6;
            case FATAL -> 42;
        };

        String message = logLine.substring(logLine.indexOf(":") + 2);

        return code + ":" + message;
    }
}