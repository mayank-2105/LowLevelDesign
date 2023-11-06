package observerdesignpattern;

public class Main {
    public static void main(String args[]) {
        Observable stTemp = new StockObservable();
        Observer mobileObserver = new MobileObserver(stTemp);
        stTemp.addObserver(mobileObserver);
        stTemp.setData(40);
        
        stTemp.setData(45);
        
    }
}
