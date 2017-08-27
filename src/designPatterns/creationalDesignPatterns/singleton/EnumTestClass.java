package designPatterns.creationalDesignPatterns.singleton;

public class EnumTestClass {
	public static void main(String[] args) {
		EnumSingleton enumSingleton1= EnumSingleton.INSTANCE;
		EnumSingleton enumSingleton2= EnumSingleton.INSTANCE;
		//Notice hash code of both object is same, which shows there is a single object of
		// SingletonBillPugh class in the java heap memory. 
		System.out.println(enumSingleton1.hashCode());
		System.out.println(enumSingleton2.hashCode());
	}

}
