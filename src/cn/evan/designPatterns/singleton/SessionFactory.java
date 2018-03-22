package cn.evan.designPatterns.singleton;

public class SessionFactory {
	
	private static SessionFactory sessionFactory;

	private SessionFactory(){}
	
	public static SessionFactory newInstanse(){
		
		if(sessionFactory == null){
			sessionFactory = new SessionFactory();
		}
		return sessionFactory;
	}
}
