public class Product {
    Product product = new Product (4, 10, "Gallons of gas");
        product.printProduct();
        product.totalCost();
    private double productCost;
    private double productQuantity;
    private String productName;

    public Product(double productCost, double productQuantity, String productName) {
        this.productCost = productCost;
        this.productQuantity = productQuantity;
        this.productName = productName;
    }
    public void totalCost () {
        double total = productCost * productQuantity;
        System.out.println("The total cost is:  " + total + "USD");
    }
    public void printProduct () {
        System.out.println("The cost of one unit of " + productName + " is " + productCost);
        System.out.println(productQuantity + "were purchased");

    }
}
