/**
 * This is test file created by developer Mahinga Singh in public interest.
 */
package designPatterns.structuralDesignPatterns.adapterPattern;

/**
 * @author MAHINGA
 *In adapter, we could have different configurations.
 *For all different types of outputs we want from socket, we will place socket adapter in between.
 *this adapter is capable of providing 3 different outputs(120V,12V,2V) from same socket.
 */
public interface SocketAdapter {
	
	public Volt get120Volt();
	public Volt get12Volt();
	public Volt get2Volt();

}
