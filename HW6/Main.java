import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Random random = new Random();
        manager.addProduct(new Product("1", "Product 1", 10, 9.99, "Category 1", ProductStatus.ACTIVE));
        manager.addProduct(new Product("2", "Product 2", 5, 14.99, "Category 2", ProductStatus.ACTIVE));
        manager.addProduct(new Product("3", "Product 3", 0, 19.99, "Category 1", ProductStatus.OUT_OF_STOCK));
        manager.addProduct(new Product("4", "Product 4", 3, 24.99, "Category 2", ProductStatus.DISCONTINUED));
       /* manager.addProduct(new Product("5", "Product 5", 10, 7.99, "Category 1", ProductStatus.ACTIVE));
        manager.addProduct(new Product("6", "Product 6", 5, 4.99, "Category 2", ProductStatus.ACTIVE));*/

        System.out.println("******************************************");
        System.out.println(manager.getCategoryPriceSum());

        // ORD-122
        manager.registerOrderNumberSupplier("supplier-1", () -> {
            int orderNumber = random.nextInt(1000);
            return "ORD-" + orderNumber;
        });
        // Supplier<String> tempSupplier = ()-> "Asım";
        //ORD-202306041426
        manager.registerOrderNumberSupplier("supplier-2", () -> {
            LocalDateTime now = LocalDateTime.now();
            String orderNumber = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").format(now);
            return "ORD-" + orderNumber;
        });
        manager.registerOrderNumberSupplier("supplier-3", () -> UUID.randomUUID().toString());

        System.out.println("UPDATE STOCK ");
        manager.updateStock("1", 20, (product, quantity) -> {
            int newStock = product.getStock() + quantity;
            product.setStock(newStock);
        });

        System.out.println("\n\n\n\n");

        System.out.println("GENERATE ORDER NUMBER ");
        String supplier1OrderId = manager.generateOrderNumber("supplier-1");
        String supplier2OrderId = manager.generateOrderNumber("supplier-2");
        String supplier3OrderId = manager.generateOrderNumber("supplier-3");
        String unknownSupplierOrderId = manager.generateOrderNumber("Supplier-3");
        System.out.println("supplier-1, generated order ID : " + supplier1OrderId);
        System.out.println("supplier-2, generated order ID : " + supplier2OrderId);
        System.out.println("supplier-3, generated order ID : " + supplier3OrderId);
        System.out.println("unknownSupplierOrderId : " + unknownSupplierOrderId);

        Map<String, Integer> orderItems = new HashMap<>();
        orderItems.put("1", 3);
        orderItems.put("2", 2);
        manager.processOrder(supplier1OrderId, orderItems, (product, quantity) -> {
            int newStock = product.getStock() - quantity;
            product.setStock(newStock);
        });

        double totalValue = manager.calculateTotalValue(product -> product.getPrice() * product.getStock());
        System.out.println("Total value of products: " + totalValue);

        var singleTotalPrice = manager.calculateTotalValue(Product::getPrice);
        System.out.println("single Total price" + singleTotalPrice);

        System.out.println("\n\nFILTER PRODUCTS");
        List<Product> filteredProducts =
                manager.filterProducts(
                        product -> ProductStatus.ACTIVE.equals(product.getProductStatus()) || ProductStatus.OUT_OF_STOCK.equals(
                                product.getProductStatus()));
        System.out.println("Active products :");
        filteredProducts.forEach(System.out::println);

        /////////////////////////////////////////////////////////////

        System.out.println("******************************************");
        manager.getActiveProductsSortedByPrice().stream().toList().forEach(System.out::println);
        System.out.println("******************************************");
        System.out.println("Average Price of Category 1: " + manager.calculateAveragePriceInCategory("Category 1"));
        System.out.println("Average Price of Category 2: " + manager.calculateAveragePriceInCategory("Category 2"));
        System.out.println("Average Price of Category 3: " + manager.calculateAveragePriceInCategory("Category 3"));

        System.out.println("******************************************");
        System.out.println(manager.getCategoryPriceSum());

        Map<String, Double> categoryPriceSum = manager.getCategoryPriceSum();

        categoryPriceSum.forEach((category, totalPrice) -> System.out.println(category + ": " + totalPrice));
    }
}