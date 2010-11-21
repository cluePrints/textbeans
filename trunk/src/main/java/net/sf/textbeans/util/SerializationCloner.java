package net.sf.textbeans.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationCloner implements Cloner {
	/* (non-Javadoc)
	 * @see net.sf.textbeans.util.ICloner#clone(T)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public <T> T clone(T obj)
	{
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(obj);
			byte[] arr = baos.toByteArray();
			baos = null;
			oos = null;
			
			ByteArrayInputStream bais = new ByteArrayInputStream(arr);
			ObjectInputStream ois = new ObjectInputStream(bais);
			return (T) ois.readObject();
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
