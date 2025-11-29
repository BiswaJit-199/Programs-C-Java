class CollectionsAdvanced1 {
    // Concurrent collections: ConcurrentHashMap and computeIfAbsent pattern
    public static void main(String[] args){
        java.util.concurrent.ConcurrentHashMap<String, java.util.List<String>> m = new java.util.concurrent.ConcurrentHashMap<>();
        m.computeIfAbsent("k", k -> new java.util.concurrent.CopyOnWriteArrayList<>()).add("v");
        System.out.println(m);
    }
}
