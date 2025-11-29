class InterfacesMedium2 {
    // Functional interface + lambda + method reference
    interface Transformer { String apply(String s); }
    public static void main(String[] args){
        Transformer t = String::toUpperCase; // method reference
        System.out.println(t.apply("hello"));
        Transformer t2 = s -> new StringBuilder(s).reverse().toString();
        System.out.println(t2.apply("abc"));
    }
}
