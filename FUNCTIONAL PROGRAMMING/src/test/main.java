package test;

//public static void main(String[] args) {
//        DoubleSupplier random = Math::random;
//        System.out.println(random.getAsDouble());
//        StringOperation capitalize = str -> {
//            if (str == null || str.isEmpty()) {
//                return str;
//            } else {
//                return Character.toUpperCase(str.charAt(0)) + str.substring(1);
//            }
//        };
//        System.out.println(capitalize.operate("hello world"));
//        IntPredicate isEven = n -> n % 2 == 0;
//        System.out.println("Is 4 even? " + isEven.test(4));
//        System.out.println("Is 7 even? " + isEven.test(7));

//		
//	}
//}
//@FunctionalInterface
//interface StringOperation {
//    String operate(String str);
//}
	import java.util.Arrays;
import java.util.List;

	public class main {
	    public static void main(String[] args) {
	        List<Long> numbers = Arrays.asList(10L, 20L, 30L, 40L, 50L);
	        Long max = numbers.stream().reduce(Long.MIN_VALUE, Long::max);
	        System.out.println("The maximum value is: " + max);
	    }
	}

