package factorypattern;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Di dalam metode Circle :: draw ().");
    }
}