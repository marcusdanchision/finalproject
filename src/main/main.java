package main;

import javax.script.ScriptException;

import texts.chrome;
import texts.convert;
import texts.login;
import texts.read;
import texts.reset;
import texts.send;

public class main 
{
	public static void main(String[] calc) throws ScriptException 
	{
		login loginObject = new login();
		chrome chromeObject = new chrome();
		read readObject = new read();
		convert convertObject = new convert();
		send sendObject = new send();
		reset resetObject = new reset();

		chromeObject.chrome();
		loginObject.login();
		
		while(true)
		{
			readObject.read();
			convertObject.convert();
			sendObject.send();
			resetObject.reset();
		}//end loop -- infinite loop
	}
}
