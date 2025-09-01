class StringMethods
{
	public static void main(String[] args)
	{
		//Print the String 
		String name = "AyushVerma";
		System.out.println("Name :- "+name);
		
		//Print the length of the String
		int l = name.length();
		System.out.println("Length of the Name :- "+l);
	
		//Print String in the Lower Case
		String a = name.toLowerCase();
		System.out.println("Lower Cases :- "+a);
		
		//Print String in the Upper case
		String b = name.toUpperCase();
		System.out.println("Upper Case :- "+b);
		
		String city = "     Delhi     ";
		//Print the String in the Trimmed Way
		System.out.println("Trimmed City :- "+city.trim());
		//Print the String in the Non Trimmed Way
		System.out.println("Non Trimmed City :- "+city);
		
		//Print the String After the Substring value 
		String c = name.substring(5);
		System.out.println("Substring after the 5th Character :- "+c);
		
		//Print the String After and Before the Substring value 
		String d = name.substring(2,8);
		System.out.println("Substring after the 2nd Character and before the 9th Character :-"+d);
		
		//Replace the character and print the String
		String e = "Armstrong";
		System.out.println("After Changing A to V , The String Becomes :- "+e.replace('A','V'));
		
		//Replace the word and print the String
		String f = "AyushVerma";
		System.out.println("After Changing Ayush to Verma , The String Becomes :- "+f.replace("Ayush","Verma"));
	
		//Print the TRUE or FALSE value 
		System.out.println("Is the String starts From The word \"Ayu\" :- "+name.startsWith("Ayu"));
		
		//Print the TRUE or FALSE value 
		System.out.println("Is the String Ends From The word \"ma\" :- "+name.endsWith("ma"));
		
		//Print the character by the help of INDEX number
		System.out.println("Which character is on the 5th position :- "+name.charAt(5));
		
		//print the INDEX value of the Character
		System.out.println("Index value of the \"e\" is :- "+name.indexOf("e"));
		
		//Cheq the String is Equal or Not With Uppercase and The Lower case
		System.out.println("Is String equals to This String :- "+name.equals("VermaAyush"));
		
		//Cheq the String is Equal or Not Without Uppercase and The Lower case
		System.out.println("Is String equals to This String :- "+name.equalsIgnoreCase("AyUsHvErMa"));
	}
}