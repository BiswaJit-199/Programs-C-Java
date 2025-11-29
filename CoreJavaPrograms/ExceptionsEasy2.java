class ExceptionsEasy2 {
    static void mayFail(boolean fail) throws Exception { if (fail) throw new Exception("fail"); }
    public static void main(String[] args){
        try{ mayFail(true); } catch(Exception e){ System.out.println("Caught: " + e.getMessage()); } finally{ System.out.println("Cleanup"); }
    }
}
