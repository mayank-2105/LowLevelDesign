package observerdesignpattern;

public class StockObservable implements Observable {
    int temp;
    public void addObserver(Observer ob)
    {
        observerList.add(ob);
    }
    public void removeObserver(Observer ob)
    {
        observerList.remove(ob);
    }
    public void notifyMe() {
        for (Observer ob: observerList) {
            ob.update();
        }
    }
    public int getData() {
        return temp;
    }
    public void setData(int x){
        temp=x;
        notifyMe();
    }
}
