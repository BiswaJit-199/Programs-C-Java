class ExceptionsEasy1 {
    public static void main(String[] args){
        try{ int x = Integer.parseInt("abc"); } catch(NumberFormatException ex){ System.out.println("Bad number: " + ex.getMessage()); }
    }
}
