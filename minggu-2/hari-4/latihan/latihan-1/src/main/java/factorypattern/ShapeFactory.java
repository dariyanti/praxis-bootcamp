package factorypattern;

public class ShapeFactory {
    // gunakan getShape untuk mendapatkan object dengan bentuk (shape)
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        // equalsIgnoreCase itu merupakan sebuah library string untuk membandingkan dua
        // buah variabel lain yang juga bertipe data string(Another String), jika kedua
        // variabel tsb bernilai sama
        // maka akan mengembalikan true/false
        // jadi variabel shapeType di bandingkan dengan string yg tedapat pada class
        // circle
        if (shapeType.equalsIgnoreCase("Circle")) {
            // jika kedua variabel ini bernilai sama maka akan mengembalikan nilai berupa
            // circle baru
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}