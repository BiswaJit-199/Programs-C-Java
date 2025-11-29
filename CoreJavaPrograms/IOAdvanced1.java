class IOAdvanced1 {
    // Serialization and transient fields
    static class Data implements java.io.Serializable{ String name; transient String secret; }
    public static void main(String[] args) throws Exception{
        Data d = new Data(); d.name="x"; d.secret="s"; try(java.io.ObjectOutputStream o = new java.io.ObjectOutputStream(new java.io.FileOutputStream("d.obj"))){ o.writeObject(d); }
        try(java.io.ObjectInputStream in = new java.io.ObjectInputStream(new java.io.FileInputStream("d.obj"))){ Data r=(Data)in.readObject(); System.out.println(r.name+" "+r.secret); }
    }
}
