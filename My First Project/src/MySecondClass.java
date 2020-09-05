public class MySecondClass {

	public static void main(String[] args) {
		Test test = new Test();
		
		test.message();
		test.message2(5);
		test.message3("num1 > num2", "num2 > num1");
		test.switchStatement();
		test.whileLoop(0);
		test.doWhileLoop(0);
		test.forLoop();
	}
	
	public MySecondClass() {
		System.out.println("Hello!");
	}

}
