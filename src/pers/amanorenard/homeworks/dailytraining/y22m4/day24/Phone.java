package pers.amanorenard.homeworks.dailytraining.y22m4.day24;

import java.util.Objects;

class Phone {
    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Phone() {}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public boolean setPrice(int price) {
        if(price<0) {
            return false;
        } else {
            this.price = price;
            return true;
        }
    }

    public String show() {
        String[] s = this.getClass().toString().split("\\.");

        return
                s[s.length-1]
                        +"@"
                        +String.format("%x",System.identityHashCode(this))
                        + String.format("\n\tContentHashCode: %x",this.hashCode())
                        +"\n\tname: " + name + "\n\tprice: " + price;
    }


    public String fullShow() {
        String[] s = this.getClass().toString().split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length;i++) {
            if (i==s.length-1) {
                sb.append(s[i]).append("@");
            } else {
                sb.append(s[i]).append(".\n");
            }
        }
        return
                sb.toString()
                        +String.format("%x",System.identityHashCode(this))
                        + String.format("\n\tContentHashCode: %x",this.hashCode())
                        +"\n\tname: "+ name + "\n\tprice: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return price == phone.price && Objects.equals(name, phone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
