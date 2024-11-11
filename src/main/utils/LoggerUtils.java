package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerUtils {
    // Method to log info messages
    public static void logInfo(String message) {
        System.out.println(getTimestamp() + " [INFO]: " + message);
    }

    // Method to log warning messages
    public static void logWarning(String message) {
        System.out.println(getTimestamp() + " [WARNING]: " + message);
    }

    // Method to log error messages
    public static void logError(String message) {
        System.err.println(getTimestamp() + " [ERROR]: " + message);
    }

    // Helper method to get the current timestamp
    private static String getTimestamp() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
