package designPatterns.creationalDesignPatterns.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
@SuppressWarnings("rawtypes")
public static void main(String[] args) {
	EagerInitializedSingleton eagerInitializedSingleton1 = EagerInitializedSingleton.getInstance();
	EagerInitializedSingleton eagerInitializedSingleton2 = null;
	try{
		// getting access to private constructor with the help of reflection.
		Constructor[] constructors= EagerInitializedSingleton.class.getDeclaredConstructors();
		for(Constructor constructor: constructors){
			constructor.setAccessible(true);
			eagerInitializedSingleton2=(EagerInitializedSingleton) constructor.newInstance();
			break;
		}
		
	}
	catch(Exception exception){
		exception.printStackTrace();
	}
	//notice we have two different hashcodes which proves the voilation of singleton
	System.out.println(eagerInitializedSingleton1.hashCode());
	System.out.println(eagerInitializedSingleton2.hashCode());
}
}
