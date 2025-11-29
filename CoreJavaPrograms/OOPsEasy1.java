class OOPsEasy1 {
    // Simple class with fields, constructor and method
    static class Person {
        String name;
        int age;
        Person(String name, int age) { this.name = name; this.age = age; }
        void sayHi() { System.out.println("Hi, I'm " + name + " and I'm " + age); }
    }
    public static void main(String[] args) {
        Person p = new Person("Alice", 25);
        p.sayHi();
    }
}
