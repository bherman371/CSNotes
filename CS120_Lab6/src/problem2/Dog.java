package problem2;
//*************************************************
// Dog.java
//
// Represents three dogs. Sets their names and
// ages. Converts one dog's age to person years.
//*************************************************
public class Dog {

	private String name;
	private int age;
	
	public Dog(String n, int a) {
		name = n;
		age = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int personYearsAge() {
		int personYearsAge = age * 7;
		
		return personYearsAge;
	}
	
	public String toString() {
		return name + " is " + age + " years old.";
	}
}
