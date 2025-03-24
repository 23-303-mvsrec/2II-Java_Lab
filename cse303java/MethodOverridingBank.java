class Bank{
	int ir =10;
	int getRateOfInterest(){
		return ir;
	}
}
class SBI extends Bank{
        int getRateOfInterest(){
		ir = 8;
                return ir;
        }
}
class ICICI extends Bank{
        int getRateOfInterest(){
		ir =7;
                return ir;
        }
}
class AXIS extends Bank{
        int getRateOfInterest(){
		ir = 9;
                return ir;
        }
}
class UNION extends Bank{
        int getRateOfInterest(){
		ir = 9;
                return ir;
        }
}
class MethodOverridingBank{
	public static void main(String... args){
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		UNION u = new UNION();

		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
		System.out.println("UNION Rate of Interest: "+u.getRateOfInterest());
	}
}
