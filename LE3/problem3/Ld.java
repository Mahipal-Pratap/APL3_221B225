public class Ld extends Duck implements FlyBehaviour, QuackBehaviour {
    @Override
    public void fly() {
        System.out.println("Lake Duck have capacity to flies.");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck have quacks in his voice.");
    }
}
