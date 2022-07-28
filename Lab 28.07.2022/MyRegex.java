package String;

import java.util.regex.Pattern;

class MyRegex {
	String n = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])"; //String declare with Quantifier
	String pattern = n + "." +  n + "." +  n + "." + n;
	void show(String s) {
		boolean b = Pattern.matches(pattern, s);
		System.out.println(b);	//print boolean value
	}
}
