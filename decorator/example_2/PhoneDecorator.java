package decorator.example_2;

public class PhoneDecorator implements Phone {

    protected Phone baseModel;

    public PhoneDecorator(Iphone11 baseModel) {
        this.baseModel = baseModel;
    }

    @Override
    public String getName() {
        return baseModel.getName();
    }

    @Override
    public int cameraNumber() {
        return baseModel.cameraNumber();
    }

    @Override
    public double getPrice() {
        return baseModel.getPrice();
    }
}
