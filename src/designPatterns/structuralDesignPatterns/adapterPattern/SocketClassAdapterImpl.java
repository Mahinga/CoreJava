/**
 * This is test file created by developer Mahinga Singh in public interest.
 */
package designPatterns.structuralDesignPatterns.adapterPattern;

/**
 * @author MAHINGA
 *
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
	

	/* (non-Javadoc)
	 * @see designPatterns.structuralDesignPatterns.adapterPattern.SocketAdapter#get120Volt()
	 */
	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	/* (non-Javadoc)
	 * @see designPatterns.structuralDesignPatterns.adapterPattern.SocketAdapter#get12Volt()
	 */
	@Override
	public Volt get12Volt() {
		return convertVolt(getVolt(),10);
	}

	/* (non-Javadoc)
	 * @see designPatterns.structuralDesignPatterns.adapterPattern.SocketAdapter#get2Volt()
	 */
	@Override
	public Volt get2Volt() {
		return convertVolt(getVolt(),60);
	}
	
	private Volt convertVolt(Volt volt, int divident){
		return new Volt(volt.getVolts()/divident);
	}

}
