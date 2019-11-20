package example.micronaut;

public class Book {
    private String isbn;
    private String name;
    private Integer stock;

    public Book() {
    }

    public Book(String isbn, String name) {
        /*
         * fungsi this itu untuk menyimpan inputan dari user kedalam variabel yg ada
         * didalam class sebagai referensi dari class itu sendiri, oleh karena itu kita
         * harus menggunakan this agara komputer tidak bingung variabel mana yang
         * dimaksud apakah yg didalam class atau didalam method book.
         */

        this.isbn = isbn;
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

}