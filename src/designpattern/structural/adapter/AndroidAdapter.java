package designpattern.structural.adapter;

public class AndroidAdapter implements AndroidCharger{

    private AppleCharger appleCharger;

    AndroidAdapter(AppleCharger appleCharger){
        this.appleCharger = appleCharger;
    }
    @Override
    public void chargeAndroidPhone() {
        appleCharger.chargeIPhone();
    }
}
