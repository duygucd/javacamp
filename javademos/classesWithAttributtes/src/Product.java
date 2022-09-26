    public class Product {
    public Product(int id, String name,String description, double price,int stockAmound,String renk){

        System.out.println("Yapıcı blok çalıştı.");
        this.id= id;
        this.renk= renk;
        this.name= name;
        this.price= price;
        this.description= description;
        this.stockAmound = stockAmound;

    }
    public Product(){

    }
    //attributes | field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmound;
    private String renk;
    private String kod;
//getter
    public int getId() {

        return id;
    }
    //setter
    public void setId(int id){

        id=id;
    }

    public String get_name() {

        return name;
    }

    public void set_name(String name) {

        this.name = name;
    }

    public String get_description() {
        return description;
    }

    public void set_description(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmound() {
        return stockAmound;
    }

    public void setStockAmound(int stockAmound) {
        this.stockAmound = stockAmound;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
