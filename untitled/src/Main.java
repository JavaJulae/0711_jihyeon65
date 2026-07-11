
/* 메소드 오버라이딩 vs 메소드 오버로드
 메소드 오버로드: 동일한 이름의 메소드를 여러 개 만드는 것(인자의 타입을 통해 구분)
 메소드 오버라이딩:
*/

// 부모 클래스
class Dessert {

    private int price;
    private int ingredientCount;
    private String name;
    private String store;

    Dessert(int price, int ingredientCount, String name, String store) {
        this.price = price;
        this.ingredientCount = ingredientCount;
        this.name = name;
        this.store = store;

    }
    Dessert(){}

    void make() {
        System.out.println("MAKE");
    }
    void sell() {
        System.out.println("SELL by " + this.store);
    }

    void eat() {
        System.out.println("EAT");
    }

}
// 자식 클래스

class Bread extends Dessert {
    private String texture;

    Bread(String texture){
        super(200,4,"빵","몽심");
        this.texture = texture;
    }

    void bake(){
        System.out.println("Bread Bake");
    }


    @Override
    void eat(){
        super.eat();
        System.out.println("식감이 "+ texture);
    }

}

class Cookie extends Dessert {
    Cookie(){
        super(400,2,"촉촉한 초코칩 쿠키","롯데마트");
    }

    private  String flavor;
}

class Jelly extends Dessert {
    Jelly(){
        super(50, 4, "마이구미", "GS25");
    }

    private String shape;
}

class pudding extends Dessert{

}

void main() {
    Dessert dessert = new Dessert(0, 0, "디저트","디저트 가게");

    Bread bread = new Bread("부드럽다");
    Cookie cookie = new Cookie();
    Jelly jelly = new Jelly();

    bread.bake();
    bread.eat();

//    cookie.sell();
//    jelly.eat();
}