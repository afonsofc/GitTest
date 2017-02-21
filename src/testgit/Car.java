package testgit;

/**
 *
 * @author afonso
 */
public class Car {
    int year;
    boolean isMoving;
    
    public Car(int year){
        this.year = year;
        this.isMoving = false;
    }
    
    public void move(){
        isMoving = true;
        System.out.println("car is stopped");
    }
    
}
