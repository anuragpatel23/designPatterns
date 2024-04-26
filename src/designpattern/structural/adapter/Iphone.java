package designpattern.structural.adapter;

public class Iphone {
    private AppleCharger appleCharger;

    Iphone(AppleCharger appleCharger){
        this.appleCharger = appleCharger;
    }
    public void chargeIphone(){
        appleCharger.chargeIPhone();
    }
}
