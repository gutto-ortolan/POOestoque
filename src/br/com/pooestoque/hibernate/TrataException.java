package br.com.pooestoque.hibernate;

/**
 *
 * @author Augusto Ortolan
 */
public class TrataException {

    public static String trataException(Exception e) {
        e.printStackTrace();
        return e.getMessage();
    }
    
}
