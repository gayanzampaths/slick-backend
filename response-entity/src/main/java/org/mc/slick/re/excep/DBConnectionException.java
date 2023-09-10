package org.mc.slick.re.excep;

/**
 * author: gayan
 * created: 2023-09-11
 **/
public class DBConnectionException extends RuntimeException
{
    /**
     * Create a new {@link DBConnectionException} with the given message
     * @param message {@link String}
     */
    public DBConnectionException(String message )
    {
        super( message );
    }
}
