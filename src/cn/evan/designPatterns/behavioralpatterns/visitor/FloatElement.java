package cn.evan.designPatterns.behavioralpatterns.visitor;

public class FloatElement implements Visitable {
	
	private Float fe;
	
	public FloatElement(Float fe) {
		this.fe = fe;
	}

	public Float getFe() {
		return fe;
	}

	public void setFe(Float fe) {
		this.fe = fe;
	}

	/**
	 * 
	 * 定义accept的具体内容 这里是很简单的一句调用。
	 * 
	 */
	@Override
	public void accept(Visitor visitor) {

		visitor.visitFloat(this);
	}

}
