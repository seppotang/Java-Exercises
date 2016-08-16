public class MonsterAttack{
	public static void main(String[] args){
		int monsterHP;
		int damage;
		Random rand = new Random();
		
		monsterHP = 100;
		int damage = rand.nextInt(10) + 1;
		
		while (monsterHP > 0){
			monsterHP = monsterHP - damage
			System.out.println("You have struck the enemy! ");
			System.out.println(monsterHP + " HP remaining.");
		}
		
		System.out.println("The monster is dead!");
	}
}
