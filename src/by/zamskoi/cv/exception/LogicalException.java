package by.zamskoi.cv.exception;

public class LogicalException extends Exception {
	private static final long serialVersionUID = 1L;

	public LogicalException(String er) {
		super(er);
	}

	public LogicalException(String er, Exception e) {
		super(er, e);
	}

	public Exception getHiddenException() {
		return (Exception) super.getCause();
	}
}
