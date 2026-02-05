package encapsulation;

class Human {
    private String name = "Pavan";
    private int age = 20;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encap1 {
    static void main(String[] args) {
        Human h1 = new Human();
        System.out.println("Name: " + h1.getName() + "\nAge: " + h1.getAge());
        h1.setAge(22);
        System.out.println("Name: " + h1.getName() + "\nAge: " + h1.getAge());
    }


}
