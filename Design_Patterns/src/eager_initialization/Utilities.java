package eager_initialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Utilities {
	public static void back(Bag bag) {
		FileOutputStream fos = new FileOutputStream("data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
	}
}

public class Bag{
	public void Bag() {
		
	}
}
