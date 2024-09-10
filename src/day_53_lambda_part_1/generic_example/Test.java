package day_53_lambda_part_1.generic_example;

public class Test {

    public static void main(String[] args) {

        Repository<Customer> customerRepository=new Repository<>();

        customerRepository.add(new Customer("adam","adam@bilginomist.com"));

        System.out.println(customerRepository.getAll());


        Repository<Product> productRepository=new Repository<>();

        Product product=new Product("item 2 ",3.45);
        productRepository.add(new Product("item1 ",3.45));
        productRepository.add(product);

        System.out.println(productRepository.getAll());

    }
}
