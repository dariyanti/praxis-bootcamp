package factorypattern;

//jadi design pattern itu kayak suatu metode yang dirancang untuk mendapatkan solusi 
//agar dpat menyelesaikan permasalahan dalam pengembangan perangkat lunak. 
//desaign pattern juga mempercepat proses pengembangan perangkat lunak. 
// dan didalam desain pattern ada yg namanya dependency injection yang berguna 
// untuk memasukan sebuah class ke ke dalam class lain
//berbagai macam ada creational pattern,struktur dan behavior
//============================================================================
//ini merupakan Factory Pattern adalah salah satu bentuk 
//dari design pattern kategori creational pattern.
//Factory pattern adalah pattern yang digunakan untuk memisahkan 
//proses pembuatan sebuah objek dari produk lain tujuannya 
//ketika kita mengubah kode pada object class maka tidak harus mengubah pada objek class lain/client.
// dan berfungsi membuat objek lain
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        // mendapatkan object dari circle dan memanggil fungsi draw
        // jadi data dari Circle akan disimpan didalam variabel shape1
        Shape shape1 = shapeFactory.getShape("Circle");
        // memanggil fungsi draw dari class circle
        shape1.draw();
        // mendapatkan object dari class Rectangle dan memanggil fungsi draw dst
        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();
    }
}