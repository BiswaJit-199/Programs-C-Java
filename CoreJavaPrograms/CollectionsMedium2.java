class CollectionsMedium2 {
    // Use Streams (modern Java skill)
    public static void main(String[] args){
        java.util.List<String> names = java.util.Arrays.asList("Alice","Bob","Anna","Mike");
        names.stream().filter(s->s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
    }
}
