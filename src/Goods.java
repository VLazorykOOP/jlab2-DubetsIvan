public class Goods{
    private String name;
    private String dateOfReceipt;
    private double price;
    private int quantity;
    private String invoiceNumber;

    public Goods(String name, String dateOfReceipt, double price, int quantity, String invoiceNumber){
        this.name = name;
        this.dateOfReceipt = dateOfReceipt;
        this.price = price;
        this.quantity = quantity;
        this.invoiceNumber = invoiceNumber;
    }

    public void changePrice(double newPrice){
        if (newPrice > 0){
            this.price = newPrice;
        }
        else if (newPrice == 0){
            this.price = newPrice;
            System.out.println("Сьогодні задурно");
        }
        else{
            System.out.println("Ціна не може бути від'ємною");
        }
    }

    public void changeQuantity(int newQuantity){
        if (newQuantity >= 0){
            this.quantity = newQuantity;
        }
        else{
            System.out.println("Кількість не може бути від'ємною");
        }
    }

    public double calculateTotalValue(){
        return this.price * this.quantity;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDateOfReceipt(String dateOfReceipt){
        this.dateOfReceipt = dateOfReceipt;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public String genInvoiceNumber(){
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber){
        this.invoiceNumber = invoiceNumber;
    }

    public void displayGoodsInfo(){
        System.out.println("Назва товару: " + name);
        System.out.println("Дата оформлення: " + dateOfReceipt);
        System.out.println("Ціна: " + price);
        System.out.println("Кількість: " + quantity);
        System.out.println("Номер накладної: " + invoiceNumber);
        System.out.println("Загальна вартість: " + calculateTotalValue());
    }

    public static void main(String[] args){
        Goods goods = new Goods("Ноутбук", "19.09.2020", 1500, 10, "LAP12341234");
        goods.displayGoodsInfo();

        goods.changePrice(1715);
        goods.changeQuantity(10);

        goods.displayGoodsInfo();
    }
}