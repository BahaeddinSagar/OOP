public class BirdOverload {

    public void fly() {
        System.out.println("The bird is flying.");
    }
    public void fly(int height) {
        System.out.println("The bird is flying " + height + " feet high.");
    }
    public void fly(String name, int height) {
        System.out.println("The " + name + " is flying " + height + " feet high.");
    }
}

class TestBird {
    public static void main(String[] args) {
        BirdOverload myBird = new BirdOverload();

        myBird.fly();
        myBird.fly(10000);
        myBird.fly("eagle", 10000);
    }
}
