package fr.touin.thierry.mock.rest.exception;

/**
 * Classe qui représente une exception technique.
 * 
 *
 */
public class TechnicalException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1322014819922214523L;

	/**
	 * Constructeur.
	 * 
	 * @param cause
	 *            Exception
	 */
	public TechnicalException(Exception cause) {
		super(cause);
	}

	/**
	 * Constructeur.
	 * 
	 * @param message
	 *            message decrivant l'erreur
	 */
	public TechnicalException(String message) {
		super(message);
	}

	/**
	 * Constructeur.
	 * 
	 * @param message
	 *            message qui traduit l erreur.
	 *
	 * @param cause
	 *            cause de l'erreur (la stack trace).
	 */

	public TechnicalException(String message, Throwable cause) {
		super(message, cause);
	}

}
