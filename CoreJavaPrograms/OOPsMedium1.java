class OOPsMedium1 {
    // Encapsulation + immutability style (getters, no setters)
    static final class ImmutablePoint {
        private final int x,y;
        ImmutablePoint(int x,int y){ this.x=x; this.y=y; }
        public int getX(){return x;}
        public int setX(x){this.x = x;}
        public int getY(){return y;}
    }
    public static void main(String[] args){
        ImmutablePoint p = new ImmutablePoint(3,4);
        p.setX(6);
        System.out.println("("+p.getX()+","+p.getY()+")");
    }
}
