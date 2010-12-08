package net.sf.textbeans.parser.glr;

public class DeadBranchException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DeadBranchException() {
		super();
	}

	public DeadBranchException(String message, Throwable cause) {
		super(message, cause);
	}

	public DeadBranchException(String message) {
		super(message);
	}

	public DeadBranchException(Throwable cause) {
		super(cause);
	}

}
