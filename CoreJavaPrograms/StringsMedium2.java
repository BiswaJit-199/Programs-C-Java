class StringsMedium2 {
    public static void main(String[] args){
        String s = "abc";
        String t = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(t)?"pal":"not");
    }
}
