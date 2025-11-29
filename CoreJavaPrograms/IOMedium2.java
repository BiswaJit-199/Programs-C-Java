class IOMedium2 {
    // NIO channels and buffer
    public static void main(String[] args) throws Exception{
        java.nio.channels.ReadableByteChannel r = java.nio.channels.Channels.newChannel(new java.io.FileInputStream("in.bin"));
        java.nio.ByteBuffer buf = java.nio.ByteBuffer.allocate(1024);
        while(r.read(buf) > 0){ buf.flip(); while(buf.hasRemaining()){ System.out.print((char)buf.get()); } buf.clear(); }
    }
}
