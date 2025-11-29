class GCEasy1 { public static void main(String[] args){ Object o = new Object(); o = null; System.gc(); System.out.println("Requested GC"); } }
