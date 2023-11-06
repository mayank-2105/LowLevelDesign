package observerdesignpattern;
import java.util.ArrayList;
import java.util.List;

public interface Observable {
    List< Observer >observerList = new ArrayList<>();
    void addObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyMe();
    void setData(int x);
    int getData();
} 

