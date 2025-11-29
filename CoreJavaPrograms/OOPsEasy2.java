class OOPsEasy2 {
    // Demonstrate constructor overloading and this()
    static class Box {
        double w,h,d;
        Box() { this(1,1,1); }
        Box(double s) { this(s,s,s); }
        Box(double w,double h,double d){ this.w=w; this.h=h; this.d=d; }
        double vol() { return w*h*d; }
    }
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(2);
        Box b3 = new Box(2,3,4);
        System.out.println(b1.vol()+" "+b2.vol()+" "+b3.vol());
    }
}
