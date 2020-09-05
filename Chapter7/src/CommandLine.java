//********************************************************************
// CommandLine.java Java Foundations
//
// Demonstrates the use of command line arguments.
//********************************************************************
public class CommandLine {
	//-----------------------------------------------------------------
	// Prints all of the command line arguments provided by the
	// user.
	//-----------------------------------------------------------------
	public static void main(String[] args) {
		
		for (String arg : args) {
			System.out.println(arg);
		}
		
		int numFromUser = Integer.parseInt(args[0]);
		System.out.println("The user entered number " + numFromUser);
		
		String wordFromUser1 = args[1];
		String wordFromUser2 = args[2];
		System.out.println("The user entered the message " + wordFromUser1 + " " + wordFromUser2);
	}
	
}