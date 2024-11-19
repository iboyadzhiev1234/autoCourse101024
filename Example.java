package FactoryMethod;

public class Example {
    public static void main(String[] args) {
        // Create an instance of ConcreteCreator1
        Creator creator1 = new ConcreteCreator1();
        // Use the factory method to create a product
        Product product1 = creator1.createProduct();
        // Display the product
        product1.display();

        // Create an instance of ConcreteCreator2
        Creator creator2 = new ConcreteCreator2();
        // Use the factory method to create a different product
        Product product2 = creator2.createProduct();
        // Display the product
        product2.display();
    }
    //In this example:
    //The Product interface declares the interface for the objects the factory method creates.
    //ConcreteProduct1 and ConcreteProduct2 are concrete implementations of the Product interface.
    //The Creator interface declares the factory method, which returns an instance of a Product.
    //ConcreteCreator1 and ConcreteCreator2 are concrete implementations of the Creator interface. They override the factory method to create different types of products.
    //The FactoryMethodExample class demonstrates how to use the Factory Method pattern. You can create instances of different concrete creators and use their factory methods to create specific products.

}
