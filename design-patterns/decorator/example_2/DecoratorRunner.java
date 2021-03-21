package decorator.example_2;

public class DecoratorRunner {

    public static void main(String[] args) {
        Phone iphone11 = new Iphone11();
        Phone iphone11Pro = new Iphone11Pro(new Iphone11());
        Phone iphone11ProMax = new Iphone11Max(new Iphone11());

        System.out.println("Name iphone 11: " + iphone11.getName());
        System.out.println("Camera number iphone 11: " + iphone11.cameraNumber());
        System.out.println("Price iphone 11: " + iphone11.getPrice());

        System.out.println("Name iphone 11 Pro: " + iphone11Pro.getName());
        System.out.println("Camera number iphone 11 Pro: " + iphone11Pro.cameraNumber());
        System.out.println("Price iphone 11 Pro: " + iphone11Pro.getPrice());

        System.out.println("Name iphone 11 Pro Max: " + iphone11ProMax.getName());
        System.out.println("Camera number iphone 11 Pro Max: " + iphone11ProMax.cameraNumber());
        System.out.println("Price iphone 11 Pro Max: " + iphone11ProMax.getPrice());
    }

}
