class ExceptionsAdvanced1 {
    // Suppressed exceptions (try-with-resources where close throws)
    static class BadClose implements AutoCloseable { public void close() { throw new RuntimeException("closeErr"); } }
    public static void main(String[] args){
        try (BadClose b = new BadClose()) { throw new RuntimeException("mainErr"); }
        catch(RuntimeException e){ System.out.println("Caught: " + e.getMessage()); for(Throwable s: e.getSuppressed()) System.out.println("Supp: " + s.getMessage()); }
    }
}
