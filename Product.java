public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    static int counter=1;
    private Date manufacturingDate;

    public Product(String name,double price,int quantity,Date manufacturingDate)
    {
        this.id=counter++;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.manufacturingDate=manufacturingDate;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public double getPrice()
    {
        return this.price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String toString()
    {
        String productDetails=String.format("%04d\t%-20s%,.2f\t%d\t%s",id,name,price,quantity,manufacturingDate);
        return productDetails;
    }
    public Product isLatest(Product p1,Product p2)
    {
        Date latest;
        latest=manufacturingDate.isRecent(p1.getManufacturingDate(),p2.getManufacturingDate());
        if(latest==p1.getManufacturingDate())
        {
            return p1;
        }
        else
        {
            return p2;
        }
    }
}
