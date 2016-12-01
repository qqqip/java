public class LibraryException extends Exception {
	public LibraryException() {}
	private String errorCode;

	public LibraryException(String message) {
		super(message);
	}

	public LibraryException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode; 
	}
}