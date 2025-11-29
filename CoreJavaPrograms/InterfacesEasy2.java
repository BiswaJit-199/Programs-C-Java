class InterfacesEasy2 {
    abstract static class Vehicle { abstract void drive(); }
    static class Car extends Vehicle { void drive(){ System.out.println("Driving car"); } }
    public static void main(String[] args){ Vehicle v = new Car(); v.drive(); }
}
