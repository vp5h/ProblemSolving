public class LogLevels {
    
    public static String message(String logLine) {
        if(logLine.contains("[") && logLine.contains("]")){
            String regex = "[:]";

            String[] arr = logLine.split(regex);

            return arr[1].trim();
        };
        return null;
    }

    public static String logLevel(String logLine) {

        if(logLine.contains("[") && logLine.contains("]")){
             int start = logLine.indexOf('[') + 1;
            int end = logLine.indexOf(']');
            String level = logLine.substring(start,end).toLowerCase(); 
            return level;
        };
        return null;
    }

    public static String reformat(String logLine) {
      return message(logLine) + " (" + logLevel(logLine) + ")";

    }
}
