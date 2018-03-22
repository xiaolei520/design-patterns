package cn.evan.timer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyTask extends TimerTask{
	
	private boolean cleared = false;
	private static JFrame jFrame = new JFrame("Frame with panel");

	@Override
	public void run() {
		if(!cleared){
			displayDialog();
		}
	}
	
	/**
	 * Display dialog.
	 */
	public void displayDialog(){
		Container contentPane = jFrame.getContentPane();
		contentPane.setBackground(Color.gray);
		JPanel panel = new JPanel();
		JButton holdOnBtn = new JButton("稍等会儿再提醒");
		JButton button = new JButton("确定");
		panel.add(button);
		panel.add(holdOnBtn);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JPanel textPanel = new JPanel();
		JTextField text = new JTextField();
		text.setText("请注意时间！");
		text.setFont(new Font("黑体", 20, 20));
		textPanel.add(text);
		contentPane.add(textPanel, BorderLayout.NORTH);
		
		jFrame.setSize(600, 400);
		jFrame.setLocation(300, 200);
		jFrame.setVisible(true);
		
		registerEvent(holdOnBtn, button);
	}

	/**
	 * Register button event.
	 * 
	 * @param holdOnBtn
	 * @param button
	 */
	private void registerEvent(JButton holdOnBtn, JButton button) {
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cleared = true;
				jFrame.setVisible(false);
			}
		});
		
		holdOnBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jFrame.setVisible(false);
			}
		});
	}

	public boolean isCleared() {
		return cleared;
	}

	public void setCleared(boolean cleared) {
		this.cleared = cleared;
	}

}
