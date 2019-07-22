class AnimalOverride {
    public void eat() {
        System.out.println("This animal eats insects.");
    }
}
class BirdOverride extends AnimalOverride {
    public void eat() {
        super.eat();
        System.out.println("This bird eats seeds.");
    }
}
class TestBirdBirdOverride {
    public static void main(String[] args) {
        AnimalOverride myAnimal = new AnimalOverride();
        myAnimal.eat();

        BirdOverride myBird = new BirdOverride();
        myBird.eat();
    }
}