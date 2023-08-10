package ExceptionHandling_Custom;

public class UnsupportedOperationException extends Exception {

	String message;
	UnsupportedOperationException(String str) {
	      message = str;
	}
   
	public String toString() {
      return ("Unsupported Operation Exception Occurred : " + message);
   }
	
	@Override
	public String getMessage() {
		return message;
	}
}

