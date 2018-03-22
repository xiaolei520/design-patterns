package cn.evan.designPatterns.builder;

public class Main {

	public static void main(String[] args) {
		
		PersonDirector pd = new PersonDirector();
		Person person = pd.constructPerson(new WomanBuilder());
		System.out.println(person.getpHead());
		System.out.println(person.getpBody());
		System.out.println(person.getpFoot());
	}
}
