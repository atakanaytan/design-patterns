package decorator.example_2;

public class Iphone11Max extends Iphone11Pro{

    public Iphone11Max(Iphone11 baseModel) {
        super(baseModel);
    }

    @Override
    public String getName() {
        return super.getName() + "Max";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2000;
    }
}
