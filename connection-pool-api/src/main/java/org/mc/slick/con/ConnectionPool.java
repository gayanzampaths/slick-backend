package org.mc.slick.con;

import java.sql.Connection;

/**
 * author: gayan
 * created: 2023-09-10
 **/
public interface ConnectionPool
{
    /**
     * Get a connection from the pool
     * @return {@link Connection}
     */
    Connection getConnection();
}
