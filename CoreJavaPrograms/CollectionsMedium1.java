class CollectionsMedium1 {
    public static void main(String[] args){
        java.util.Map<String, Integer> freq = new java.util.HashMap<>();
        String[] words = {"a","b","a","c"};
        for(String w: words) freq.put(w, freq.getOrDefault(w,0)+1);
        System.out.println(freq);
    }
}
