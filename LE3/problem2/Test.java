public class Test implements Testable {
    @Override
    public void display() {
        System.out.println("called display method in the Test class.");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}
