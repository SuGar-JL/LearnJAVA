package demo02;

/**
 * @ClassName: Demo02Instanceof
 * @description: instanceof关键字的使用
 * @author: sujiling
 * @date: 2020/7/2 15:05
 */
public class Demo02Instanceof {
    public static void main(String[] args) {
//        Animal animal = new Cat();
        Animal animal = new Dog();
        giveMeAnAnimal(animal);

    }
    public static void giveMeAnAnimal(Animal animal){
        if(animal instanceof Cat){
            animal.eat();
            ((Cat) animal).catchMouse();
        }
        if(animal instanceof Dog){
            animal.eat();
            ((Dog) animal).watchHouse();
        }
    }
}
