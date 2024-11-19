package FactoryMethod;

// Concrete Product 1 changed rows
class ConcreteProduct1 implements Product {
    @Override
    public void display() {
        System.out.println("Concrete Product 1");
    }
}