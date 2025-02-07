/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
    public static void main(String[] args) {
        Rd rubberDuck = new Rd();
        Wd woodenDuck = new Wd();
        Rhd redHeadDuck = new Rhd();
        Ld lakeDuck = new Ld();

        rubberDuck.swim();
        rubberDuck.squeak();

        woodenDuck.swim();

        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();

        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}
