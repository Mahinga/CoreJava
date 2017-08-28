/**
 * This is test file created by developer Mahinga Singh in public interest.
 */
package designPatterns.structuralDesignPatterns.adapterPattern;

/**
 * @author MAHINGA
 *
 */
public class Socket {
	
	/**
	 * @return
	 * Socket as per indian standard give 120 voltage.
	 * So here is simple public method which will always give constant 120 volts.
	 */
	public Volt getVolt(){
		return new Volt(120);
	}

}
