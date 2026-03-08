public class LogLine {

    private String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String level = logLine.substring(1, logLine.indexOf(']'));

        switch (level) {
            case "TRC": return LogLevel.TRACE;
            case "DBG": return LogLevel.DEBUG;
            case "INF": return LogLevel.INFO;
            case "WRN": return LogLevel.WARNING;
            case "ERR": return LogLevel.ERROR;
            case "FTL": return LogLevel.FATAL;
            default: return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {

        String message = logLine.substring(logLine.indexOf(":") + 1).trim();

        int number;

        switch (getLogLevel()) {
            case TRACE: number = 1; break;
            case DEBUG: number = 2; break;
            case INFO: number = 4; break;
            case WARNING: number = 5; break;
            case ERROR: number = 6; break;
            case FATAL: number = 42; break;
            default: number = 0;
        }

        return number + ":" + message;
    }
}