class IOAdvanced2 {
    // Memory-mapped file (useful for large files)
    public static void main(String[] args) throws Exception{
        java.nio.channels.FileChannel ch = java.nio.channels.FileChannel.open(java.nio.file.Paths.get("in.bin"));
        java.nio.MappedByteBuffer mb = ch.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0, Math.min(ch.size(), 1024));
        for(int i=0;i<mb.limit();i++) System.out.print((char)mb.get());
    }
}
