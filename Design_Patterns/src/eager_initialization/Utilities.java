package eager_initialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Utilities {
	public static void back(Bag bag) throws IOException {
		FileOutputStream fos = new FileOutputStream("data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
	}
}


 class Bag{
	public void Bag() {
	}
	}
