package Ex10.common;
import Ex10.*;

public class CommonLoggerImpl implements CommonLogger{

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("CommonLogger - " + message);
	}
	
}
