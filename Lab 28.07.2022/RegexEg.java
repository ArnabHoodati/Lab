package String;

public class RegexEg {
		public static void main(String[] args) {	//main method
			MyRegex r = new MyRegex();	//Creating Object
			//check method
			r.show("000.12.12.034");
			r.show("121.234.12.12");
			r.show("23.45.12.56");
			r.show("00.12.123.123123.123");
			r.show("122.23");
			r.show("Hello.IP");
		}
	}
