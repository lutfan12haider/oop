package lab09;

public class main3 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Warrior", 100, 30);
        Mage mage = new Mage("Mage", 80, 25);
        Archer archer = new Archer("Archer", 90, 20);

        System.out.println("Battle Starts!\n");

        warrior.specialAbility();
        mage.specialAbility();
        archer.specialAbility();

        System.out.println("\nThe battle begins!\n");

        warrior.attack(mage);
        mage.attack(archer);
        archer.attack(warrior);

        warrior.defend();
        mage.defend();
        archer.defend();

        System.out.println("\nBattle Over!");
        System.out.println(warrior.name + " Health: " + warrior.health);
        System.out.println(mage.name + " Health: " + mage.health);
        System.out.println(archer.name + " Health: " + archer.health);
    }
}
