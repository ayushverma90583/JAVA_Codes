class StringMetords
{
    public static void main(String[] args)
    {
        //print in the lower case
        String name = "Ayush Verma";
        System.out.println("In the Lower Case String Becomes :- "+name.toLowerCase()); 

        //print in the Upper case
        System.out.println("In the Upper case String Becomes :- "+name.toUpperCase());

        //replace space with the underscore
        System.out.println("Replace Space to Underscore :- "+name.replace(" ","_"));

        //print the length if the String
        String len = "AyushVerma9058";
        System.out.println("Length of the String :- "+len.length());

        //replace name with the Name...
        String n = "My name is <name> , Thanks a lot...";
        System.out.println("After :- "+n.replace("<name>","Roman"));

        //The Index Number of the Character
        String line = "I'm 20 years  Old...";
        System.out.println("The index of tripple space in the line :- "+line.indexOf("   ")+" ( -1 means It doesnot Exist... )");
        System.out.println("The index of Double space in the line :- "+line.indexOf("  "));
        System.out.println("The index of Single space in the line :- "+line.indexOf(" "));

        //Find character by the help of the the Index Number
        System.out.println("Character :- "+name.charAt(6));

        //print string in the letter format...
        String letter = "Hello Ayush ,\n\tThis Notice Is Reguarding to the ______.\n\tThanks !";
        System.out.println(letter);

        //print the trimmed or non trimmed String
        String m = "                map of India";
        System.out.println("Non Trimmed String :- "+m);
        System.out.println("Trimmed String :- "+m.trim());

        //Print the String After the Substring value 
        System.out.println("After the sub string value :- "+name.substring(5));
        //Print the String After and Before the Substring value 
        System.out.println("After and Before the sub string value :- "+name.substring(3,9));

        //Print the TRUE or FALSE value with (Stars with and Ends with) Methord
        System.out.println("Is the String Starts with the word :- "+name.startsWith("Ayu"));
        System.out.println("Is the String Ends with the word :- "+name.endsWith("ra"));

        //Cheq the String is Equalls or Not
        System.out.println(name.equals("AyUsH VeRmA"));//Because we add Upper case character in the Equals case Thats why we get False...
        System.out.println(name.equalsIgnoreCase("AyUsH VeRmA"));//this case ignores the upper and lower case character...
    }
}