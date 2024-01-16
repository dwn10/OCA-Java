package schreibtischtest.Dez;

public class AufgabeTag8 {

	static int integer = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MIN_VALUE);
		int a = Integer.MIN_VALUE;
		int b = -a;
		System.out.println(a + " " + b);

		int i = 1234567890;
		float f = i;
		System.out.println(f);
		System.out.println((int) f);
		System.out.println(i - (int) f);

		String x = "Hallo#";
		x.charAt(0);
		float f2 = 123.4f;

		boolean b2 = false;
		Boolean b3 = new Boolean("true");

		float f4 = 123.45f;
		Float f5 = new Float(123.45);

		String s = "Hallo";

		integer = doStuff(integer);
		System.out.println(integer);

	}

	public static int doStuff(int a) {
		a = 20;
		return a;
	}

}
