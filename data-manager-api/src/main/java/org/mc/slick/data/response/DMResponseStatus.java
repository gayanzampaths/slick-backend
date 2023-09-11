package org.mc.slick.data.response;

/**
 * author: gayan
 * created: 2023-09-11
 **/
public enum DMResponseStatus
{
    SUCCESS( 1 ),
    FAILED( -1 ),
    WARNING( 0 );

    private final int status;

    DMResponseStatus( int status )
    {
        this.status = status;
    }

    public int getStatus()
    {
        return status;
    }
}
