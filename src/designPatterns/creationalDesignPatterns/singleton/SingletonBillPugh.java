package designPatterns.creationalDesignPatterns.singleton;

public class SingletonBillPugh {
	private SingletonBillPugh(){}
	
	private static class SingletonHelper{
		private static final SingletonBillPugh singletonBillPugh = new SingletonBillPugh();
	}
	
	public static SingletonBillPugh getInstance(){
		return SingletonHelper.singletonBillPugh;
		
	}
	
}
