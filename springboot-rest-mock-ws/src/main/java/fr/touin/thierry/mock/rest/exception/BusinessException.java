package fr.touin.thierry.mock.rest.exception;

/**
 * Classe qui représente une exception fonctionnelle.
 * 
 * 
 */
public abstract class BusinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1322014819922214523L;

	/**
	 * Constructeur .
	 * 
	 * @param message
	 *            message qui traduit l'erreur.
	 */
	public BusinessException(String message) {
		super(message);
	}

}
