package tester;

public class TestExceptions {
	
	//(throws) -- we the programmers are not handling the exceptions (by try-catch)
	//			  but, we tell the compiler that caller of the main method(JVM) has to handle it. 
	//WHY WE USE (THROWS) keyword? -- Exception Handling delegation(authorization)
	//main thread is not handling the exception (itself), but the caller of main(i.e. main thread), which in this case is (Thread.sleep(5000))
	//JVM handles(main thread)
	//(throws) -- doesn't actually handles the exception 
	//since it is not necessary an exception will occur... 
	//IF AN ERROR ACTUALLY OCCUR? -- the code ABORT(not continue)
	public static void main(String[] args) throws InterruptedException {
		
		//for single-Threaded environment (like this), we will use throw keyword (throw InterruptedException)
		System.out.println("before");
		Thread.sleep(5000);
		System.out.println("error occured....");
		System.out.println("after");
		
		System.out.println("---------------------->");
		
		//actual Exception Handling by placing the exception in the try-catch block
		//IF AN ERROR ACTUALLY OCCUR? -- the code CONTINUE(not abort), and get executed as we're handling the excp
		//we will use try-catch block for InterruptedException only in multi-Threaded environment (unlike this)
		System.out.println("pehle");
		try {
			//you will get InterruptedException only in a multi-Threaded system
		Thread.sleep(5000);		//InterruptedException -- checked exe --
		//javaCompiler forces handling of the checked exc 
		}catch(InterruptedException e) {
			System.out.println("error occured....");
		}
		System.out.println("baadme");
		
	}

}
