package cn.evan.encryption;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.jasypt.properties.EncryptableProperties;

public class TestEncryption {

	public static void main(String[] args) {
		
		SimpleStringPBEConfig stringConfig = new SimpleStringPBEConfig();
		stringConfig.setPassword("password");
		
		StandardPBEStringEncryptor s_encryptor = new StandardPBEStringEncryptor();
		s_encryptor.setConfig(stringConfig);
//		Properties dbProps = new EncryptableProperties(s_encryptor);
//		
//		File dbPropsFile = new File("d:/db.properties");
//		
//		try {
//			dbProps.load(new FileInputStream(dbPropsFile));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		String dbSecretKey = dbProps.getProperty("db.cloud.encrypt.secret");
		String dbSecretKey = "password";
		System.out.println(dbSecretKey);
		
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		
    	encryptor.setAlgorithm("PBEWithMD5AndDES");
    	encryptor.setPassword(dbSecretKey);
    	
//    	String ency = encryptor.encrypt("rS/gpVn9SvbhVjjFBtC2zo0Ue2pYTvgaf24gyIzzC4r4LXNxm7djo5desZMsBoPtfH0fVsJw9yq5NYpRgAAiXlZdiY9q4zEL5tjB+yE50p2EQSkLJ6KqsojrQ+uOMrwj");
//    	System.out.println("db: " + ency);
    	
    	String res = encryptor.decrypt("rS/gpVn9SvbhVjjFBtC2zo0Ue2pYTvgaf24gyIzzC4r4LXNxm7djo5desZMsBoPtfH0fVsJw9yq5NYpRgAAiXlZdiY9q4zEL5tjB+yE50p2EQSkLJ6KqsojrQ+uOMrwj");
    	String ui = "2hjBSbXyOzUJ495PbSN1M4eM-ppYd9z3sKnJxUMEVovLHwJ9MVtg6bmriB1IVaMx213UFgtYkfs-v7s4s1WIDA";
    	System.out.println("After decrypt: " + res);
    	System.out.println("Equal?: " + res.equals(ui));
    	
	}
}
