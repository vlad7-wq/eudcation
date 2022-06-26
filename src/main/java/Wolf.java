public class Wolf extends Animal implements WildAnimal{
    public Wolf(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println(super.getName() + "Hawoo");
    }

    @Override
    public void hunting() {
        System.out.println(super.getName() + "goes hunting");
    }
}
