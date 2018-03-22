package cn.evan.designPatterns.decorator;

public class Main {

	public static void main(String[] args) {
		
		// 普通手机
		CellPhone cellPhone = new NokiaPhone();
		System.out.println(cellPhone.callNumber());
		System.out.println(cellPhone.sendMessage());
		
		// 蓝牙手机
		CellPhone phoneWithBuleTooth = new DecoratorBlueTooth(cellPhone);
		System.out.println(phoneWithBuleTooth.callNumber());
		System.out.println(phoneWithBuleTooth.sendMessage());
		
		// GPS手机
		CellPhone phoneWithGPS = new DecoratorGPS(cellPhone);
		System.out.println(phoneWithGPS.callNumber());
		System.out.println(phoneWithGPS.sendMessage());
		
		// 集成蓝牙、GPS
		CellPhone buleToothAndGPS = new DecoratorGPS(phoneWithBuleTooth);
		System.out.println(buleToothAndGPS.callNumber());
		System.out.println(buleToothAndGPS.sendMessage());
	}
}
