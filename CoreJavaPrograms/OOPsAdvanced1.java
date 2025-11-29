class OOPsAdvanced1 {
    // Builder pattern for constructing complex objects (common in modern Java)
    static class User {
        private final String name; private final String email; private final int age;
        private User(Builder b){ name=b.name; email=b.email; age=b.age; }
        public static class Builder{
            private String name; private String email; private int age;
            public Builder name(String n){ this.name=n; return this; }
            public Builder email(String e){ this.email=e; return this; }
            public Builder age(int a){ this.age=a; return this; }
            public User build(){ return new User(this); }
        }
        public String toString(){ return name+" <"+email+"> ("+age+")"; }
    }
    public static void main(String[] args){
        User u = new User.Builder().name("Bob").email("bob@example.com").age(30).build();
        System.out.println(u);
    }
}
