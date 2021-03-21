package factory.example_1;

public class TelephoneFactory {

    public static Telephone getTelephone(String model, String battery, int width, int height){

        Telephone telephone;
        if ("iphone7".equalsIgnoreCase(model)) {
            telephone = new Iphone7(model, battery, width, height);
        } else if ("iphone11".equalsIgnoreCase(model)) {
            telephone = new Iphone11(model, battery, width, height);
        } else {
            throw new RuntimeException("Given model couldn't found");
        }

        return telephone;
    }
}
