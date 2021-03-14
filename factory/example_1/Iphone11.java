package factory.example_1;

public class Iphone11 implements Telephone {


    private String model;
    private String batteryPower;
    private int width;
    private int height;

    public Iphone11(String model, String batteryPower, int width, int height) {
        this.model = model;
        this.batteryPower = batteryPower;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBatteryPower() {
        return batteryPower;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Iphone7{");
        sb.append("model='").append(model).append('\'');
        sb.append(", battery power='").append(batteryPower).append('\'');
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
