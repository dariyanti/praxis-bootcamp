package factorypattern;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Di dalam metode Square :: draw ().");
    }
}