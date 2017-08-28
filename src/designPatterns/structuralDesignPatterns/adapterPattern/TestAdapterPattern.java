/**
 * This is test file created by developer Mahinga Singh in public interest.
 */
package designPatterns.structuralDesignPatterns.adapterPattern;

/**
 * @author MAHINGA
 *
 */
public class TestAdapterPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SocketClassAdapterImpl socketClassAdapterImpl= new SocketClassAdapterImpl();
		System.out.println("Here is voltage 120 output from adapter :: "+socketClassAdapterImpl.get120Volt().getVolts());
		System.out.println("Here is voltage 12 output from adapter :: "+socketClassAdapterImpl.get12Volt().getVolts());
		System.out.println("Here is voltage 2 output from adapter :: "+socketClassAdapterImpl.get2Volt().getVolts());
	}

}
