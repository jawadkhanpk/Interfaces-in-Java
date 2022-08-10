package com.company;

// in java interfaces are group of methods with empty bodies
// we use keyword implement in interfaces as we use extend keyword in inheritance

// we can make reference of interface but we can not make make objects of interface
// default access modifier of objects of interfaces is 'public'

interface Bicycle{

    void applyBrake(int decrement);
    void speedUp(int increment);

                }
interface MotorCycle{

    void gearUp(int increment);
    void gearDown(int decrement);

                }


    class AppleCycle implements Bicycle, MotorCycle{                            // we can also create more than one interfaces in a class like here we did

    int speed = 4;
    public void applyBrake(int decrement){
        speed = speed - decrement;
        System.out.println(speed);
    }
    public void speedUp(int increment){
        speed = speed + increment;
        System.out.println(speed);
    }
//_________________________________________________________________________________________________________________________________________________________________________
        int gear = 0;
        public void gearUp(int increment){
            gear = gear + increment;
            System.out.println(gear);
        }
        public void gearDown(int decrement){
            gear = gear - decrement;
            System.out.println(gear);
        }
    }
public class Main {

    public static void main(String[] args) {
	// write your code here

        AppleCycle obj = new AppleCycle();
        obj.applyBrake(3);

        MotorCycle mobj = new AppleCycle();
         mobj.gearUp(1);

        }
}