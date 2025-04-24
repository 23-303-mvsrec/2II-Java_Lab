class ExtendingThread extends Thread{
        String name;
        ExtendingThread(String name){
		super(name);
                this.name = name;
               // t.setName(name);
                this.start();
        }
        public void run(){
                System.out.println(this.getName()+ "Thread running");
        }
}
class ThreadExample2{
        public static void main(String... args){
                new ExtendingThread("Sairam");
        }
}

