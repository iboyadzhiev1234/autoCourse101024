package FactoryMethod;

// Concrete Creator 1
class ConcreteCreator1 implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
