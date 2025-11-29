class InterfacesMedium1 {
    // Default methods in interface (since Java 8)
    interface Logger { void log(String s); default void info(String s){ log("INFO: "+s); } }
    static class ConsoleLogger implements Logger { public void log(String s){ System.out.println(s); } }
    public static void main(String[] args){ Logger l = new ConsoleLogger(); l.info("started"); }
}
