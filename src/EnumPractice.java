public class EnumPractice{
	public static void main(String[] args){
	enum Archetype { FIGHTER, MAGE, PRIEST, ROGUE}
	
	Archetype Chad;
	Archetype Polyp;
	Archetype Dizu;
	Archetype Uzid;
	
	Chad = Archetype.FIGHTER;
	Polyp = Archetype.MAGE;
	Dizu = Archetype.PRIEST;
	Uzid = Archetype.ROGUE;
	
	System.Out.print("My main character is Chad, and my class is ");
	System.Out.print(Chad + "!");
	}
}
