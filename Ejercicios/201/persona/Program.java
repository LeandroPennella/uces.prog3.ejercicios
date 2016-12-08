package persona;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date curDate = new Date();

		SimpleDateFormat format = new SimpleDateFormat("yyyy");

		String DateToStr = format.format(curDate);
		
		int aActual=Integer.parseInt(format.format(curDate));
		
		System.out.println(aActual-1976);
	}

}
