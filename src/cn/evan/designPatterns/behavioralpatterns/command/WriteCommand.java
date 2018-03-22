package cn.evan.designPatterns.behavioralpatterns.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 写操作。
 *
 */
public class WriteCommand extends Command {
	
	private Document document = null;
	private List objectState = null;
	
	public WriteCommand(Document document, List objectState) {
		this.document = document;
		this.objectState = objectState;
	}

	@Override
	public void execute() {
		Scanner scanner = new Scanner(System.in);
		document.setStrContent(document.getStrContent() + scanner.next());
		objectState.add(document.getStrContent());
	}

}
