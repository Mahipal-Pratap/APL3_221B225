package voicesystem;

public class Voice2 {
    private Animal[] animals = new Animal[5];


    private void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }


    private void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }


    public void templateMethod() {
        prepareVoice();       
   hear();              }
}
