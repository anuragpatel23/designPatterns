package designpattern.structural.adapter;

public class Main {
    public static void main(String... args){
        //charge iphone
        AppleCharger appleCharger = new UnicornAppleChargingCompany();
        Iphone iphone15 = new Iphone(appleCharger);
        iphone15.chargeIphone();

        //charge android
        AndroidCharger androidCharger = new AndroidChargingCompany();
        AndroidPhone androidPhone = new AndroidPhone(androidCharger);
        androidPhone.chargeAndroidPhone();

        //charge iPhone with Android charger
        AppleAdapter appleAdapter = new AppleAdapter(androidCharger);
        Iphone iphone16 = new Iphone(appleAdapter);
        iphone16.chargeIphone();

        //charge android with apple charger
        AndroidAdapter androidAdapter = new AndroidAdapter(appleCharger);
        AndroidPhone pixel = new AndroidPhone(androidAdapter);
        pixel.chargeAndroidPhone();
        
    }
}
