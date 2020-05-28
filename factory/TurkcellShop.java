package factory;

public class TurkcellShop {

    public static void main(String[] args) {
        Telephone iphone11 = TelephoneFactory.getTelephone("iphone11", "2800mah", 2, 5);

        Telephone iphone7 = TelephoneFactory.getTelephone("iphone7", "2300mah", 2, 4);

        System.out.println("Features of the Iphone 11: ");
        System.out.println(iphone11);

        System.out.println("Features of the Iphone 7: ");
        System.out.println(iphone7);
    }
}
