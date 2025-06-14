package lab09;

abstract class Character {
    int health;
    int attackPower;
    String name;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public abstract void specialAbility();

    public void attack(Character target) {
        target.health -= this.attackPower;
        System.out.println(this.name + " attacks " + target.name + " for " + this.attackPower + " damage.");
    }

    public void defend() {
        System.out.println(this.name + " defends!");
    }
}

class Warrior extends Character {

    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void specialAbility() {
        this.attackPower *= 2;
        System.out.println(this.name + " uses their special ability: Double Attack Power! New attack power: " + this.attackPower);
    }
}

class Mage extends Character {

    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void specialAbility() {
        this.attackPower += 20;
        System.out.println(this.name + " uses their special ability: Power Boost! New attack power: " + this.attackPower);
    }
}

class Archer extends Character {

    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void specialAbility() {
        this.attackPower += 15;
        System.out.println(this.name + " uses their special ability: Precision Shot! New attack power: " + this.attackPower);
    }
}

