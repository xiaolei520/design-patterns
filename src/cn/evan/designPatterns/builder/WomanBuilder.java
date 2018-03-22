package cn.evan.designPatterns.builder;

public class WomanBuilder implements PersonBuilder {

	private Person person;
	
	public WomanBuilder(){
		person = new Woman();
	}
	
	@Override
	public void buildHead() {
		
		person.setpHead("Woman's head builded successfully!");
	}

	@Override
	public void buildBody() {
		
		person.setpBody("Woman's body builded successfully!");
	}

	@Override
	public void buildFoot() {
		
		person.setpFoot("Woman's foot builded successfully!");
	}

	@Override
	public Person buildPerson() {
		
		return person;
	}

}
