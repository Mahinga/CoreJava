package designPatterns.creationalDesignPatterns.singleton;

import java.util.Objects;

public class LazyInitializedSingleton {
	private LazyInitializedSingleton(){}
	private static LazyInitializedSingleton lazyInitializedSingleton;
	public LazyInitializedSingleton getInstance(){
		if(Objects.nonNull(lazyInitializedSingleton)){
			lazyInitializedSingleton = new LazyInitializedSingleton();
		}
		return lazyInitializedSingleton;
	}

}
