
package animal.sounds;


public class AnimalSounds {

    
    public static void main(String[] args) {
        Animals[] animals = {new Dog(), new Cat(), new Tiger()};

        
        for (Animals animal : animals) {
            animal.makeSound(); 
        }
    }
    
}
