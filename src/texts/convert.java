package texts;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class convert extends read
{
	public static String answer = "";
	public void convert() throws ScriptException
	{
		String e = equation.substring(4);
		
		if(e.equals("HELP"))
		{
			answer = "| addition = + | subtraction = - | multiplication = * | division = / |";
		}
		else
		{
			try
			{
				ScriptEngineManager mgr = new ScriptEngineManager();
				ScriptEngine engine = mgr.getEngineByName("JavaScript");
				String a = e+" = "+engine.eval(e);
				answer = a;
			}
			catch(Exception equationnotvalid)
			{
				answer = "the equation you have entered is not formatted correctly, please text HELP for assistance";
			}
		}//end else
	}
}
