class CollectionsAdvanced2 {
    // Implement LRU cache using LinkedHashMap
    static class LRUCache<K,V> extends java.util.LinkedHashMap<K,V> {
        private final int capacity;
        LRUCache(int capacity){ super(capacity, 0.75f, true); this.capacity = capacity; }
        protected boolean removeEldestEntry(java.util.Map.Entry<K,V> e){ return size() > capacity; }
    }
    public static void main(String[] args){
        LRUCache<Integer,String> c = new LRUCache<>(2);
        c.put(1,"a"); c.put(2,"b"); c.get(1); c.put(3,"c"); System.out.println(c);
    }
}
