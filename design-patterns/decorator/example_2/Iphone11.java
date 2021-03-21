package decorator.example_2;

public class Iphone11 implements Phone{

    @Override
    public String getName() {
        return "iphone 11";
    }

    @Override
    public int cameraNumber() {
        return 2;
    }

    @Override
    public double getPrice() {
        return 999.99;
    }


}
