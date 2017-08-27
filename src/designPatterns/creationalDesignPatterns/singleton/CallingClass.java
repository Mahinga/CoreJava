package designPatterns.creationalDesignPatterns.singleton;

public class CallingClass {
	public static void main(String[] args) {
		SingletonBillPugh singletonBillPugh1= SingletonBillPugh.getInstance();
		SingletonBillPugh singletonBillPugh2= SingletonBillPugh.getInstance();
		//Notice hash code of both object is same, which shows there is a single object of
		// SingletonBillPugh class in the java heap memory. 
		System.out.println(singletonBillPugh1.hashCode());
		System.out.println(singletonBillPugh2.hashCode());
	}

}
