package cn.evan.designPatterns.behavioralpatterns.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 删除操作。
 *
 */
public class DeleteCommand extends Command {
	
	private Document document;
	private List objectState = new ArrayList();
	
	public DeleteCommand(Document document, List objectState) {
		this.document = document;
		this.objectState = objectState;
	}

	@Override
	public void execute() {
		document.setStrContent(document.getStrContent().substring(0, document.getStrContent().length() - 1));
		objectState.add(document.getStrContent());
	}

}
