class IOMedium1 {
    // Buffered stream copy
    public static void main(String[] args) throws Exception{
        try (java.io.InputStream in = new java.io.FileInputStream("in.bin"); java.io.OutputStream out = new java.io.FileOutputStream("out.bin")){
            byte[] buf = new byte[4096]; int n; while((n=in.read(buf))!=-1) out.write(buf,0,n);
        } catch(java.io.FileNotFoundException e){ System.out.println("Put an in.bin file to test"); }
    }
}
