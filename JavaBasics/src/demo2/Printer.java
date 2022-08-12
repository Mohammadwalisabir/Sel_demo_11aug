package demo2;

public class Printer {
	
	public String getDayinfo() {
		String day =  "Wednesday";
		return day;
		
		
	}
	
	public static void main(String[] args) {
		Printer printer = new Printer();
		String output =  printer.getDayinfo();
		
		System.out.println(output);
		
				
	}

}

