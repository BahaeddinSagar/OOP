class Person {
    private String name;
    private int NID;
    private boolean isAlive;
    static int count = 0;

    public Person () {
        name = "anynomus";
        NID = 0;
        isAlive = false;
        count++;
    }

    public Person(String name, int NID) {
        this.name = name;
        this.NID = NID;
        isAlive=true;
    }
    public Person(String name, int NId, boolean isAlive, int count) {
        this.name = name;
        NID = NId;
        this.isAlive = isAlive;
        this.count = count;
    }

    public Person(String name, boolean isAlive) {
        this.name = name;
        this.isAlive = isAlive;
        this.NID = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNID() {
        return String.valueOf(NID);
    }

    public void setNID(int NID) {
        if (NID < 1000000) {
            return;
        } else {
            this.NID = NID;
        }

    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}

class Student extends Person {
    int studentNumber;
    int termNumber;
    String supervisor;


public Student(String name, int NID, boolean isAlive, int studentNumber, int termNumber, String supervisor) {
        //super(name, NID, isAlive);
        this.studentNumber = studentNumber;
        this.termNumber = termNumber;
        this.supervisor = supervisor;
    }



}


public class Main {

    public static void main(String[] args) {

        Person bahaeddin = new Person("afdasfadf",1231,true , 5);
        System.out.println(Person.count);

        Person Monder = new Person("sdada",2312,true, 6);
        System.out.println(Person.count);
        System.out.println(Monder.getName());
    }

}



