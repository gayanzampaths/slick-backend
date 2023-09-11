package org.mc.slick.data.response;

/**
 * author: gayan
 * created: 2023-09-11
 **/
public class DMResponse<T>
{
    private final DMResponseStatus status;
    private final String message;
    private final T data;

    /**
     * create a new Data Manager Response
     * @param status status of the response {@link DMResponseStatus}
     * @param message message of the response {@link String}
     * @param data data of the response
     */
    public DMResponse( DMResponseStatus status, String message, T data )
    {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    /**
     * get the status of the response
     * @return {@link DMResponseStatus}
     */
    public DMResponseStatus getStatus()
    {
        return status;
    }

    /**
     * get the message of the response
     * @return {@link  String}
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * get the data of the response
     * @return {@link T}
     */
    public T getData()
    {
        return data;
    }
}
