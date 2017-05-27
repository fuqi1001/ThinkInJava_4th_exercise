package Chapter2;

/**
 * Created by qifu on 17/5/26.
 */
/* Create a class called Dog containing two Strings: name and says.
* In main(), create two dog objects with names "spot" (who says "Ruff!") and
* "scruffy" (who says "Wurf!").  Then display their names and what they say.
*/

class Dog {
    String name;
    String speak;

    void setName(String n){
        name = n;
    }
    void setSpeak(String s) {
        speak = s;
    }
    void showName() {
        System.out.println("Dog's name: "+ name);
    }
    void showSpeak() {
        System.out.println("Dog's voice: "+ speak);
    }
}
public class _05_DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.setName("spot");
        dog1.setSpeak("Ruf");

        dog2.setName("scruffy");
        dog2.setSpeak("Wurf");

        dog1.showName();
        dog1.showSpeak();

        dog2.showName();
        dog2.showSpeak();

        //exercise 6
        Dog dog3 = dog1;
        System.out.println("Test ==: " + (dog3 == dog1));
        System.out.println("Test equals: " + dog3.equals(dog1));
    }
}
