class OOPsMedium2 {
    // Demonstrate method overriding, polymorphism
    static class Animal {
        void speak(){ System.out.println("...animal...");}
    }
    static class Dog extends Animal {
        @Override
        void speak(){ System.out.println("Woof");}
    }
    static class Cat extends Animal {
        @Override
        void speak(){ System.out.println("Meow"); }
    }
    public static void main(String[] args){
        Animal[] arr = { new Dog(), new Cat(), new Animal() };
        for(Animal a: arr) a.speak();
    }
}
