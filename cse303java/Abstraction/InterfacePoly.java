//
interface Vehicle{
	void changeGear(int gear);
	void speedUp(int inc);
	void applyBrake(int dec);
}
class Bicycle implements Vehicle{
	int speed;
	int gear;
	public void changeGear(int newGear){
		gear = newGear;
	}
	public void speedUp(int increment){
		speed += increment;
	}
	public void applyBrake(int decrement){
		speed -= decrement;
	}
	void printStates(){
		System.out.println("Speed: "+speed+" Gear: "+gear);
	}
}
class Bike implements Vehicle{
        int speed;
        int gear;
        public void changeGear(int newGear){
                gear = newGear;
        }       
        public void speedUp(int increment){
                speed += increment;
        }       
        public void applyBrake(int decrement){
                speed -= decrement;
        }       
        void printStates(){
                System.out.println("Speed: "+speed+" Gear: "+gear);
        }       
}   
class InterfacePoly{
	public static void main(String... args){
		Bicycle bi1 = new Bicycle();
		bi1.changeGear(2);
		bi1.speedUp(3);
		bi1.applyBrake(1);
		System.out.println("Bicycle Present State: ");
		bi1.printStates();
		Bicycle bk1 = new Bicycle();
                bk1.changeGear(1);
                bk1.speedUp(4);
                bk1.applyBrake(3);
                System.out.println("Bicycle Present State: ");
                bk1.printStates();

	}
}
