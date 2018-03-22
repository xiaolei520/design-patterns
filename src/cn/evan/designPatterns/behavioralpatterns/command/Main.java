package cn.evan.designPatterns.behavioralpatterns.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Document document = new Document();
		List objectState = new ArrayList();
		Command command = null;
		
		System.out.println("Please Input next operation: 1.write 2.delete 3.undo");
		
		Scanner scanner = new Scanner(System.in);
		int operation = scanner.nextInt();
		
		while(operation != 0){
			switch(operation){
				case 1:
					command = new WriteCommand(document, objectState);
					command.execute();
					System.out.println("Write Operation: " + document.getStrContent());
					break;
				case 2:
					command = new DeleteCommand(document, objectState);
					command.execute();
					System.out.println("delete Operation: " + document.getStrContent());
					break;
				case 3:
					command = new UndoCommand(document, objectState);
					command.execute();
					System.out.println("Undo Operation: " + document.getStrContent());
					break;
				default:
					System.out.println("Wrong Operation!");
			}
			System.out.println("Please Input next operation: 1.write 2.delete 3.undo");
			operation = scanner.nextInt();
		}
	}
}
