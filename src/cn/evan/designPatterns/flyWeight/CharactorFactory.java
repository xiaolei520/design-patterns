package cn.evan.designPatterns.flyWeight;

import java.util.Hashtable;

public class CharactorFactory {

	private Hashtable<String, Charactor> charactors = new Hashtable<String, Charactor>();
	
	public CharactorFactory() {
		charactors.put("A", new CharactorA());
		charactors.put("B", new CharactorB());
		charactors.put("C", new CharactorC());
	}
	
	public Charactor getCharactor(String key){
		
		Charactor charactor = charactors.get(key);
		
		if(charactor == null){
			if("A".equals(key)){
				charactor = new CharactorA();
			}else if("B".equals(key)){
				charactor = new CharactorB();
			}else if("C".equals(key)){
				charactor = new CharactorC();
			}
			
			charactors.put(key, charactor);
		}
		
		return charactor;
	}
}
