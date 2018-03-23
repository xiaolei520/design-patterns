package com.goda.designpatterns.behavioralpatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 取消操作。
 *
 */
public class UndoCommand extends Command {
	
	private Document document;
	private List objectState = new ArrayList();
	
	public UndoCommand(Document document, List objectState) {
		this.document = document;
		this.objectState = objectState;
	}

	@Override
	public void execute() {
		document.setStrContent((String)objectState.get(objectState.size() - 2));
		objectState.add(document.getStrContent());
	}

}
