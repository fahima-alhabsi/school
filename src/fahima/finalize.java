package fahima;

public class finalize {
	protected void finalize() throws Throwable {
	    try {
	      System.out.println("Inside finalize method of study Class.");
	    } 
	    catch (Throwable e) {
	      throw e;
	    } 
	    finally {
	      System.out.println("Calling finalize method of the Object class");

	      // Calling finalize() of Object class
	      super.finalize();
	    }
	  }

}
