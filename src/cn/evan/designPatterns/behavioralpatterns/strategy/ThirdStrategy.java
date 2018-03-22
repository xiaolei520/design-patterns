package cn.evan.designPatterns.behavioralpatterns.strategy;

public class ThirdStrategy implements Strategy {

	@Override
	public void execute() {

		System.out.println("Called ThirdStrategy.execute()");
	}

}
