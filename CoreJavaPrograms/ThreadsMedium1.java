class ThreadsMedium1 {
    // Executors and Runnable/Callable
    public static void main(String[] args) throws Exception{
        java.util.concurrent.ExecutorService ex = java.util.concurrent.Executors.newFixedThreadPool(2);
        java.util.concurrent.Future<Integer> f = ex.submit(() -> { Thread.sleep(200); return 42; });
        System.out.println("Result: "+f.get()); ex.shutdown();
    }
}
