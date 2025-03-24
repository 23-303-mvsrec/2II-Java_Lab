class FinalizeEx{
	String resource;
	FinalizeEx(String r){
		resource =r;
	}
	protected void finalize(){
		try{
			System.out.println("Finalizing the object and releasing the resources");
			if(resource != null)
				resource = null;
		}
		catch(Exception  e){
			System.out.println(e);
		}
	}
	public static void main(String args[]){
		FinalizeEx obj = new FinalizeEx("Some resources");
		//obj = null;
		System.out.println("Before GC");
		System.gc();
	}
}
