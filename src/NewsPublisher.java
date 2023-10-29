import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements Subject {
    private List<Observer> observers;
    private String article;

    public NewsPublisher() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(article);
        }
    }

    public void newArticle(String article) {
        this.article = article;
        notifyObservers();
    }
}
