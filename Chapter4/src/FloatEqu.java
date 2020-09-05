
public class FloatEqu {
	public static void main(String[] args) {
		final double TOLERANCE = 0.00001;
		double x = (1.0/10) * (1.0/10);
		double y = (1.0/100);
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		if (Math.abs(x - y) <= TOLERANCE) {
			System.out.println("EQUAL");
		} else {
			System.out.println("NOT EQUAL");
		}
	}
}
