public class RPGPProfile{
	public static void main(String[] args){
		String name;
		String job;
		String weapon;
		double str;
		double intel;
		double agi;
	
	
	TextIO.putln("Welcome to Midgar, your portal to the new world.");
	TextIO.putln("We will create your character.");
	TextIO.putln("Please give us a few answers.");
	
	/*Gather responses from the user. */
	
	TextIO.put("What is your name?           ");
	name = TextIO.getln();
	TextIO.put("What is your class?          ");
	job = TextIO.getln();
	TextIO.put("What is your weapon?         ");
	weapon = TextIO.getln();
	TextIO.put("How much strength do you have?          ");
	str = TextIO.getlnDouble();
	TextIO.put("How much intel do you have?             ");
	intel = TextIO.getlnDouble();
	TextIO.put("How much agi do you have?               ");
	
	//Input user's info to a file named RPGProfile.txt
	
	TextIO.writeFile("RPGProfile.txt");
	TextIO.putln("Name:         " + name);
	TextIO.putln("Class:        " + job);
	TextIO.putln("Weapon:           " + weapon);
	TextIO.putf( "Strength:   %,1.2f\n", str);
	TextIO.putf( "Intel:       %1.2f\n", intel);
	TextIO.putf("Agi:         %1.2f\n", agi);
	
	TextIO.writeStandardOutput();
	TextIO.putln("Thank you. Your profile has been created.");
	}
}
