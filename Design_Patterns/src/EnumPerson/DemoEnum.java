package EnumPerson;

import java.io.IOException;

public class DemoEnum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		PersonBag b1 = PersonBag.INSTANCE;
//		b1.insert(new Person("JJ", 3));
//		b1.insert(new Person("kk", 10));
//		Util.backup();
		
		PersonBag b0 = Util.restore();
		System.out.println(b0.getNElems());
		
		System.out.println();
		
	}

}
