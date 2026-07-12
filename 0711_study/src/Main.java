
interface AnimalAction {
    void walk();
    void cry();
    void eat();
    void sleep();
}

class Animal implements AnimalAction {
    private String name;
    private int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void walk() {
        System.out.println("걷기");
    }

    public void cry() {
        System.out.println("울기");
    }

    public void eat() {
        System.out.println("먹기");
    }

    public void sleep() {
        System.out.println("자기");
    }

}

class Mammal extends Animal {
    private String hairColor;
    Mammal(String name, int age, String hairColor) {
        super(name, age);
        this.hairColor = hairColor;
    }
}

class Fish extends Animal {
    private String scalesColor;
    Fish(String name, int age, String scalesColor){
        super(name, age);
        this.scalesColor = scalesColor;
    }
    void swim(){
        System.out.println("수영");
    }
}

class Bird extends Animal {
    private String feathersColor;
    Bird(String name, int age, String feathersColor) {
        super(name, age);
        this.feathersColor = feathersColor;
    }
    void fly(){
        System.out.println("날다");
    }
}

void main() {
    Mammal dog = new Mammal("강아지",10,"흰색");
    Mammal cat = new Mammal("강아지",10,"검은색");

    Fish salmon = new Fish("연어",1,"빨간색");
    Fish tuna = new Fish("참치",16,"파란색");

    Bird chicken = new Bird("닭", 2,"흰색");
    Bird duck = new Bird("오리", 2,"검은색");

    ArrayList<Animal> animals = new ArrayList<Animal>();
    animals.add(dog);
    animals.add(cat);
    animals.add(salmon);
    animals.add(tuna);
    animals.add(chicken);
    animals.add(duck);

    for(Animal i : animals){
        System.out.println(i.name + " " + i.age);
    }

    chicken.fly();
    tuna.swim();
}