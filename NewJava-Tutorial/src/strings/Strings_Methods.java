package strings;

public class Strings_Methods {

	public static void main(String[] args) {
		String name = "Sachin";
		System.out.println(name.length());
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		String nonTrimString = "      ABC      ";
		System.out.println(nonTrimString);
		System.out.println(nonTrimString.trim());
		
		System.out.println(name.substring(2,6));
		
		System.out.println(name.replace('a', 'A'));
		
		System.out.println(name.replace("achin","hiv"));
		
		System.out.println(name.startsWith("pa"));
		
		System.out.println(name.endsWith("in"));
		
		System.out.println(name.charAt(5));
		
		System.out.println(name.indexOf('i'));
		
		String modifiedName = "Sachinhin";
		System.out.println(modifiedName.indexOf("hint", 5));
		
		System.out.println(modifiedName.lastIndexOf('h'));
		
		System.out.println(name.equals("SachiN"));
		
		System.out.println(name.equalsIgnoreCase("SAchIN"));
		
		System.out.println("I'm Escape Sequence \"Double Quotes\"  \\ \n \t ");
		
	}

}
