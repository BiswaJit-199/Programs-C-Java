class InterfacesAdvanced1 {
    // Multiple inheritance diamond problem resolved by default methods -- explicit override
    interface A{ default void m(){ System.out.println("A"); } }
    interface B{ default void m(){ System.out.println("B"); } }
    static class C implements A,B{ public void m(){ A.super.m(); B.super.m(); System.out.println("C"); } }
    public static void main(String[] args){ new C().m(); }
}
