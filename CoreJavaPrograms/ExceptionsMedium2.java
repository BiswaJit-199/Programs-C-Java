class ExceptionsMedium2 {
    // Try-with-resources for automatic close
    public static void main(String[] args) {
        try (java.io.BufferedReader r = new java.io.BufferedReader(new java.io.StringReader("line1\nline2"))) {
            String s; while((s=r.readLine())!=null) System.out.println(s);
        } catch (java.io.IOException e) { e.printStackTrace(); }
    }
}
