package designPatterns.creationalDesignPatterns.singleton;

public enum EnumSingleton {
	
	//java ensures that enum value is instantiated only once.
	//Although enums are not that much flexible but their singleton property could not get violated by reflection.
	//
	
	INSTANCE;

}
