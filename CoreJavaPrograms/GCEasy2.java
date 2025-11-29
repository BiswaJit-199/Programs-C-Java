class GCEasy2 {
    static class Big{ byte[] data = new byte[1024*1024]; }
    public static void main(String[] args){ for(int i=0;i<50;i++){ Big b = new Big(); if(i%10==0) System.out.println("Created " + i); } System.gc(); }
}
