package designpattern.structural.adapter;

public class AndroidPhone {

    private AndroidCharger androidCharger;

    AndroidPhone(AndroidCharger androidCharger){
        this.androidCharger = androidCharger;
    }

    void chargeAndroidPhone(){
        androidCharger.chargeAndroidPhone();;
    }
}
