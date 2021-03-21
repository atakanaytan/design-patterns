package decorator.example_2;

public class Iphone11Pro extends PhoneDecorator {

    public Iphone11Pro(Iphone11 baseModel) {
        super(baseModel);
    }

    @Override
    public String getName() {
        return super.getName() + "Pro";
    }

    @Override
    public int cameraNumber() {
        return super.cameraNumber() + 1;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1000;
    }
}
