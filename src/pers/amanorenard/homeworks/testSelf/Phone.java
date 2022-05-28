package pers.amanorenard.homeworks.testSelf;

class Phone {
    public Phone(String brand,int price){
        this.brand = brand;
        this.price = price;
    }
    public Phone(){};

    private String brand;
    private int price;

    public String getBrand() {
        return brand;
    };
    public int getPrice() {
        return price;
    };

    public void setBrand(String brand,String brand2) {
        this.brand = brand;
    };
    public void setPrice(int price) {
        this.price = price;
    };

    public String info() {
        return brand + "," + price;
    };
    @Override
    public String toString() {
        return ("型号："+brand + "\n价格：" + price +"元");
    }
}
