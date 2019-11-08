package vending;

public enum Item {
    COKE("Coke", 25), PEPSI("Pepsi", 35), SODA("Soda", 45);

    private String name;
    private int price;

    private Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {// fungsi dapatkan nama
        return name;// kembalikan nama dgn tipe data string seperti yg dideklarasikan diatas
    }

    public long getPrice() {
        return price;// kembalikan harga dengan tipe data integer
    }
}