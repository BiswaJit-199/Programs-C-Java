class InterfacesEasy1 {
    interface Shape { double area(); }
    static class Square implements Shape { double s; Square(double s){this.s=s;} public double area(){return s*s;} }
    public static void main(String[] args){ Shape sq = new Square(3); System.out.println(sq.area()); }
}
