class ThreadsAdvanced1 {
    // CompletableFuture for async pipelines (modern job skill)
    public static void main(String[] args) throws Exception{
        java.util.concurrent.CompletableFuture.supplyAsync( () -> 10 )
            .thenApply(x -> x * 2)
            .thenAccept(x -> System.out.println("Result: "+x)).get();
    }
}
