package EnumPerson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Util {
	
	public static PersonBag restore() throws IOException {
		
		FileInputStream fis = new FileInputStream("personBag.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			PersonBag tempBag = (PersonBag)(ois.readObject());
			return tempBag;
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

		
	}
	
	public static void backup() {
		try {
			FileOutputStream fos = new FileOutputStream("personBag.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			PersonBag b0 = PersonBag.INSTANCE;
			oos.writeObject(b0);
			oos.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}
}
