package designpattern.structural.adapter;

public class AndroidChargingCompany implements AndroidCharger{
    @Override
    public void chargeAndroidPhone() {
        System.out.println("Charging your phone via Android charger");
    }
}
