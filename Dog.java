public class Dog {
    private String name;
    private int age;
    private String color;
    private int height;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setHeight (String height) {
        this.color = height;
    }

    public Dog(String n, int a, String c, int h) {
        name = n;
        age = a;
        color = c;
        height = h;
    }
    public Dog(String n, int a) {

    }
    public void Dog() {
        System.out.println("Creating object of the class Dog.");
    }
}
