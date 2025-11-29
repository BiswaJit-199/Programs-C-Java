class ThreadsMedium2 {
    // Producer-consumer using blocking queue
    public static void main(String[] args) throws InterruptedException{
        java.util.concurrent.BlockingQueue<Integer> q = new java.util.concurrent.ArrayBlockingQueue<>(5);
        Thread prod = new Thread(() -> { try { for (int i=0;i<10;i++){ q.put(i); System.out.println("put " + i); } q.put(-1); } catch(Exception e){} });
        Thread cons = new Thread(() -> { try { int v; while((v=q.take())!=-1) System.out.println("take " + v); } catch(Exception e){} });
        prod.start(); cons.start(); prod.join(); cons.join();
    }
}
