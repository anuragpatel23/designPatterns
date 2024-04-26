package designpattern.structural.adapter;

public class UnicornAppleChargingCompany implements AppleCharger {

    @Override
    public void chargeIPhone() {
        System.out.println("Charging you iPhone with Apple charger");
    }
}
