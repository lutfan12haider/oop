package lab09;

abstract class Animals {
    public abstract void cats();
    public abstract void dogs();
}

class Cats extends Animals {
    public void cats() {
        System.out.println("Cat's meow");
    }

    public void dogs() {

    }
}

class Dogs extends Animals {
    public void cats() {

    }

    public void dogs() {
        System.out.println("Dogs bark");
    }
}


