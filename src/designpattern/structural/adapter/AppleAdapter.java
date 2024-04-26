package designpattern.structural.adapter;

public class AppleAdapter implements AppleCharger{

    private AndroidCharger androidCharger;

    AppleAdapter(AndroidCharger androidCharger){
        this.androidCharger = androidCharger;
    }
    @Override
    public void chargeIPhone() {
        androidCharger.chargeAndroidPhone();
    }
}
