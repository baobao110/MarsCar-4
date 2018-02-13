import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Connector {
	public static void readOrder(Car a) throws Exception{
		BufferedReader bufer=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		while(null!=(str=bufer.readLine())){
			if("byte".equals(str))
			{
				return;
			}
			else
			{
				a.move(str);	
			}
		}	
	}
}
