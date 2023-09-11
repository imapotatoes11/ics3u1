import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.lang.System.exit;

public class Log {
    public static String time() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
    public void info(String message) {
        System.out.println(bcolors.OKGREEN + "INFO [" + time() + "] " + message + bcolors.ENDC);
    }
    public void warning(String message) {
        System.out.println(bcolors.WARNING + "WARN [" + time() + "] " + message + bcolors.ENDC);
    }
    public void error(String message) {
        System.out.println(bcolors.FAIL + "ERROR [" + time() + "] " + message + bcolors.ENDC);
    }
    public void panic(String message) {
        System.out.println(bcolors.FAIL + "PANIC [" + time() + "] " + message + bcolors.ENDC);
        exit(-1);
    }
    public void panic(String message, int exit) {
        System.out.println(bcolors.FAIL + bcolors.BOLD + "PANIC [" + time() + "] " + message + bcolors.ENDC);
        exit(exit);
    }
    public void debug(String message) {
        System.out.println(bcolors.OKCYAN + "DEBUG [" + time() + "] " + message + bcolors.ENDC);
    }
}

class bcolors {
    public static final String HEADER = "\033[95m";
    public static final String OKBLUE = "\033[94m";
    public static final String OKCYAN = "\033[96m";
    public static final String OKGREEN = "\033[92m";
    public static final String WARNING = "\033[93m";
    public static final String FAIL = "\033[91m";
    public static final String ENDC = "\033[0m";
    public static final String BOLD = "\033[1m";
    public static final String UNDERLINE = "\033[4m";
}