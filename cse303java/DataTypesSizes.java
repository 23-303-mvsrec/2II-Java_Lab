public class DataTypesSizes{
	public static void main(String args[]){
		System.out.println("Data Types Size(bytes), min and max values:");
		System.out.println("byte: "+ Byte.BYTES+":"+Byte.MIN_VALUE+":"+Byte.MAX_VALUE);
		System.out.println("short: "+ Short.BYTES+":"+Short.MIN_VALUE+":"+Short.MAX_VALUE);
		System.out.println("int: "+ Integer.BYTES+":"+Integer.MIN_VALUE+":"+Integer.MAX_VALUE);
		System.out.println("long: "+ Long.BYTES+":"+Long.MIN_VALUE+":"+Long.MAX_VALUE);
		System.out.println("float: "+ Float.BYTES+":"+Float.MIN_VALUE+":"+Float.MAX_VALUE);
		System.out.println("double: "+ Double.BYTES+":"+Double.MIN_VALUE+":"+Double.MAX_VALUE);
		System.out.println("char: "+ Character.BYTES+":"+(int)Character.MIN_VALUE+":"+(int)Character.MAX_VALUE);
		System.out.println("boolean FALSE: "+ Boolean.FALSE+"TRUE:"+Boolean.TRUE);
	}
}
