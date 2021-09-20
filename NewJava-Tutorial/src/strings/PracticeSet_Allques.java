package strings;

public class PracticeSet_Allques {

	public static void main(String[] args) {
		//1. WAP to convert string into lowercase
		String name = "STRING CASE";
		System.out.println(name.toLowerCase());
		
		//2. WAP TO replace space into _
		System.out.println(name.replace(" ", "_"));
		
		//3. Problem
		String letter = "Dear <|name|>, Thank's a lot...";
		System.out.println(letter.replace("<|name|>", "Sachin"));
		
		//4. Problem - WAP to detect double or triple space
		String str = "This string contain double  and triple   space";
		System.out.println(str.indexOf("  "));
		System.out.println(str.indexOf("   "));
		
		//5. WAP to format a string using escape sequence character
		System.out.println("Dear Sir,\n\tThis Java Course is Nice..\nThanks!!");
	}

}
