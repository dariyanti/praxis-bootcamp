package abstrackfactorypattern;

// Dalam pola Abstrak Pabrik, antarmuka bertanggung jawab
// untuk membuat pabrik objek terkait tanpa menentukan kelasnya secara
// eksplisit.
// Setiap pabrik yang dihasilkan dapat memberikan objek sesuai pola Pabrik

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // mendapatkan bentuk bulat dari class pabrik/factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        // dapatkan objek dari bentuk Rounded Rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        // memanggil fungsi draw dari Shape Rectangle
        shape1.draw();
        // dapatkan object dari bentuk Rounded Square
        Shape shape2 = shapeFactory.getShape("SQUARE");
        // memanggil fungsi draw dari Shape Square
        shape2.draw();
        // dapatkan bentuk bulat(rounded)dari pabrik
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        // dapatkan object dari Shape Rectangle
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        // memanggil fungsi draw dari Shape Rectangle
        shape3.draw();
        // dapatkan object dari Shape Square
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        // memanggil fungsi draw dari Shape Square
        shape4.draw();
    }
}