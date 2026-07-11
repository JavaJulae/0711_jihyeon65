class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

interface Predator {
    String Predatorname = "육식동물";
    void getFood();
    void attack();
}

class Tiger extends Animal implements Predator {
    // 인터페이스의 메서드를 반드시 구현해야 함
    public void getFood() {
        System.out.println("호랑이가 먹이를 먹습니다.");
    }

    public void attack() {
        System.out.println("호랑이가 공격합니다.");
    }
}

class Lion extends Animal implements Predator {
    public void getFood() {
        System.out.println("사자가 먹이를 먹습니다.");
    }

    public void attack() {
        System.out.println("사자가 공격합니다.");
    }
}

class ZooKeeper {
    void feed(Tiger tiger) {
        System.out.println("feed apple");
    }

    void feed(Lion lion) {
        System.out.println("feed banana");
    }
}

public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
    }
}
