package p3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computable add = (x, y) -> x + y;
		Computable sub = (x, y) -> x - y;
		Computable mul = (x, y) -> x * y;
		Computable div = (x, y) -> {
			if (y == 0.0) {
				System.out.println("Undefined");
				return Double.MAX_VALUE;
			} else {
				return x / y;
			}
		};

		
		Computable div2 = Demo::doDouble; //
		
		
		
		System.out.println(add.compute(10, 30));
		
		
		
		
		
	}

	public static double doDouble(double n1, double n2) {
		if (n2 == 0.0) {
			System.out.println("Undefined");
			return Double.MAX_VALUE;
		} else {
			return n1 / n2;
		}
	}

}
