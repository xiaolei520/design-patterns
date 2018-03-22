package cn.evan.designPatterns.behavioralpatterns.command;

public class Document {

	private String strContent;
	
	public Document(){
		strContent = "";
	}

	public String getStrContent() {
		return strContent;
	}

	public void setStrContent(String strContent) {
		this.strContent = strContent;
	}
	
}
