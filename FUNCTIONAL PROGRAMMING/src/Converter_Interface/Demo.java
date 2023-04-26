package Converter_Interface;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Converter converter = str -> Integer.valueOf(str);
		
		int num = converter.convert("123");
		
		System.out.println(num);

	}

}
