class ExceptionsMedium1 {
    // Custom checked exception
    static class AppException extends Exception { AppException(String m){ super(m); } }
    static void doWork(int x) throws AppException { if (x<0) throw new AppException("negative"); }
    public static void main(String[] args){ try{ doWork(-1); } catch(AppException e){ System.out.println(e.getMessage()); } }
}
