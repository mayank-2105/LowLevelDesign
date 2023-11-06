package observerdesignpattern;

public class MobileObserver implements Observer {
    Observable obj;
    MobileObserver(Observable ob1) {
        this.obj=ob1;
    }
    @Override
    public void update() {
        System.out.println("Temp has changed, new temp is "+ obj.getData());
    }
}
