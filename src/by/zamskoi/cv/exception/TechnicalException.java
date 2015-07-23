package by.zamskoi.cv.exception;

public class TechnicalException extends Exception {
	private static final long serialVersionUID = 1L;

	public TechnicalException(String er) {
		super(er);
	}

	public TechnicalException(String er, Exception e) {
		super(er, e);
	}

	public Exception getHiddenException() {
		return (Exception) super.getCause();
	}
}
