public class ProductTest {
    public static void main(String[] args) {
        Product p1=new Product("LCD", 50000, 2,new Date(12,04,2023));
        Product p2 = new Product("Refrigator",100000,1,new Date(12,07,2023));
        System.out.println(p1);
        System.out.println(p2);
//        p1.setManufacturingDate(new Date(9,10,2023));
        System.out.println("Latest Product\n"+p1.isLatest(p2,p1));
//        System.out.println("The Latest Product Is\n"+Product.isLatest(p1,p2));
    }
}
