abstract class Animal {
    private int legs;
    private int tails;
    private String sound;

    public Animal(int legs, int tails, String sound) {
        this.legs = legs;
        this.tails = tails;
        this.sound = sound;
    }

    public int getLegs() {
        return legs;
    }

    public int getTails() {
        return tails;
    }

    public String getSound() {
        return sound;
    }

    public abstract String getFeetName();

    public abstract String getPregnancyPeriod();

    public abstract String getLactationPeriod();
}

class Sheep extends Animal {
    public Sheep() {
        super(4, 1, "baa");
    }

    public String getFeetName() {
        return "hooves";
    }

    public String getPregnancyPeriod() {
        return "5 months";
    }

    public String getLactationPeriod() {
        return "3 months";
    }
}

class Pig extends Animal {
    public Pig() {
        super(4, 1, "oink");
    }

    public String getFeetName() {
        return "hooves";
    }

    public String getPregnancyPeriod() {
        return "3 months, 3 weeks, and 3 days";
    }

    public String getLactationPeriod() {
        return "3-5 weeks";
    }
}

class Goat extends Animal {
    public Goat() {
        super(4, 1, "baa");
    }

    public String getFeetName() {
        return "hooves";
    }

    public String getPregnancyPeriod() {
        return "5 months";
    }

    public String getLactationPeriod() {
        return "3 months";
    }
}

class Cow extends Animal {
    public Cow() {
        super(4, 1, "moo");
    }

    public String getFeetName() {
        return "hooves";
    }

    public String getPregnancyPeriod() {
        return "9 months";
    }

    public String getLactationPeriod() {
        return "6-10 months";
    }
}

class Rabbit extends Animal {
    public Rabbit() {
        super(4, 1, "squeak");
    }

    public String getFeetName() {
        return "paws";
    }

    public String getPregnancyPeriod() {
        return "1 month";
    }

    public String getLactationPeriod() {
        return "4-5 weeks";
    }
}

class Dog extends Animal {
    public Dog() {
        super(4, 1, "woof");
    }

    public String getFeetName() {
        return "paws";
    }

    public String getPregnancyPeriod() {
        return "2 months";
    }

    public String getLactationPeriod() {
        return "6-8 weeks";
    }
}

class Cat extends Animal {
    public Cat() {
        super(4, 1, "meow");
    }

    public String getFeetName() {
        return "paws";
    }

    public String getPregnancyPeriod() {
        return "2 months";
    }

    public String getLactationPeriod() {
        return "4-6 weeks";
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Sheep(), new Pig(), new Goat(), new Cow(), new Rabbit(), new Dog(), new Cat()};

        for (Animal animal : animals) {
            System.out.println("Number of legs: " + animal.getLegs());
            System.out.println("Number of tails: " + animal.getTails());
            System.out.println("Sound: " + animal.getSound());
            System.out.println("Feet name: " + animal.getFeetName());
            System.out.println("Pregnancy period: " + animal.getPregnancyPeriod());
            System.out.println("Lactation period: " + animal.getLactationPeriod());
            System.out.println();
        }
    }
}
