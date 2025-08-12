package exam;

public class Product {
    private String productName;
    private int saleAmount;
    private double salesUnitPrice;
    private String salesDescription;

    public Product() {
    }

    public Product(String productName, int saleAmount, double salesUnitPrice, String salesDescription) {
        this.productName = productName;
        this.saleAmount = saleAmount;
        this.salesUnitPrice = salesUnitPrice;
        this.salesDescription = salesDescription;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(int saleAmount) {
        this.saleAmount = saleAmount;
    }

    public double getSalesUnitPrice() {
        return salesUnitPrice;
    }

    public void setSalesUnitPrice(double salesUnitPrice) {
        this.salesUnitPrice = salesUnitPrice;
    }

    public String getSalesDescription() {
        return salesDescription;
    }

    public void setSalesDescription(String salesDescription) {
        this.salesDescription = salesDescription;
    }

    public void calculateTotalSalesVolume() {
        System.out.println(getProductName()+"总销售量:" + saleAmount * salesUnitPrice);
    }
    public void show(){
        System.out.println("商品名称:"+getProductName()+"商品数量:"+getSaleAmount()+"商品单价:"+getSalesUnitPrice()+"商品详细信息:"+getSalesDescription());
    }
}
