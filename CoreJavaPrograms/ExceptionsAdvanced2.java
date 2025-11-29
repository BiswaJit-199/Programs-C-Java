class ExceptionsAdvanced2 {
    // Convert checked to unchecked intentionally and preserve cause
    static void wrap() { try{ throw new java.io.IOException("io"); } catch(java.io.IOException e){ throw new RuntimeException(e); } }
    public static void main(String[] args){ try{ wrap(); } catch(RuntimeException e){ System.out.println(e.getCause()); } }
}
