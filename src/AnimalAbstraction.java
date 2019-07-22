public abstract class AnimalAbstraction {
    // abstract methods
    abstract void move();
    abstract void eat();
    // concrete method
    void label() {
        System.out.println("Animal's data:");
    }
}

class Bird extends AnimalAbstraction {

    void move() {
        System.out.println("Moves by flying.");
    }
    void eat() {
        System.out.println("Eats birdfood.");
    }
}

class Fish extends AnimalAbstraction {
    void move() {
        System.out.println("Moves by swimming.");
    }
    void eat() {
        System.out.println("Eats seafood.");
    }

}

class TestBirdAbstraction {
    public static void main(String[] args) {
        //AnimalAbstraction myBird = new Bird();
        Bird myBird = new Bird();

        myBird.label();
        myBird.move();
        myBird.eat();
    }
}

class TestFishAbstraction {
    public static void main(String[] args) {
        AnimalAbstraction myFish = new Fish();

        myFish.label();
        myFish.move();
        myFish.eat();
    }
}