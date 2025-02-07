public class Rhd extends Duck implements FlyBehaviour, QuackBehaviour {
    @Override
    public void fly() {
        System.out.println("RedHead Duck are  flies.");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck are  quacks in his voice.");
    }
}
