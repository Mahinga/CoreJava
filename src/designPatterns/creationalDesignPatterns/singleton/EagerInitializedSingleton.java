package designPatterns.creationalDesignPatterns.singleton;

public class EagerInitializedSingleton {
	
	private  EagerInitializedSingleton(){}
	
	private static final EagerInitializedSingleton eagerInitializedSingleton = new EagerInitializedSingleton();
	
	public static EagerInitializedSingleton getInstance(){
		return eagerInitializedSingleton;
	}

}
