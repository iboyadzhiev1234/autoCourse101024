package FactoryMethod;

// Concrete Creator 1
class ConcreteCreator2 implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
