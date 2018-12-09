package DesignPattern;

import java.util.ArrayList;

public class ObserverPatternEx {

	public static void main(String[] args) {

	}

}

interface Observer {
	public void update(String title, String news);
}

interface Publisher {
	public void add (Observer observer);
	public void delete(Observer observer);
	public void notifyObserver();
}

class NewsMachine implements Publisher {

	private ArrayList<Observer> observers;
	private String title;
	private String news;
	
	public NewsMachine() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void delete(Observer observer) {
//		int index = observers.indexOf(observer);
//		observers.remove(index);
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for(Observer observer : observers) {
			observer.update(title, news);
		}
	}
	
	public void setNewsInfo(String title, String news) {
		this.title = title;
		this.news = news;
		notifyObserver();
	}

	public String getTitle() {
		return title;
	}

	public String getNews() {
		return news;
	}
	
}

class AnnualSubscriber implements Observer {
	
	private String newsString;
	private Publisher publisher;
	
	public AnnualSubscriber(Publisher publisher) {
		this.publisher = publisher;
		publisher.add(this);
	}
	
	private void display() {
		System.out.println("\n\n ������ ���� \n =================== \n\n" + newsString);
	}

	@Override
	public void update(String title, String news) {
		this.newsString = title + " \n ------------- \n" + news;
		display();
	}
	
}

class EventSubscriber implements Observer {

	private String newsString;
	private Publisher publisher;
	
	private void display() {
		System.out.println("\n\n == �̺�Ʈ ���� ==");
		System.out.println("\n\n" + newsString);
	}

	@Override
	public void update(String title, String news) {
		this.newsString = title + " \n ------------- \n" + news;
		display();
	}
	
	// publisher �� �̿��Ͽ� Ż��
	public void withdraw() {
		publisher.delete(this);
	}
	
}
