package exam;

public class Test5 {
    public static void main(String[] args) {
        Product product1 = new Product("智能手机", 100, 1999, "华为手机增智慧");
        Product product2 = new Product("蓝牙耳机", 1000, 199, "蓝牙耳机增智慧");
        product1.calculateTotalSalesVolume();
        product1.show();
        System.out.println("----------");
        product2.calculateTotalSalesVolume();
        product2.show();
    }
}
