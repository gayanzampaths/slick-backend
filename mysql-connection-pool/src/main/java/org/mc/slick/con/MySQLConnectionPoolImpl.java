package org.mc.slick.con;

import org.mc.slick.con.config.Config;
import org.mc.slick.config.ConfigKeeper;
import org.mc.slick.config.ConfigKeeperFactory;
import org.mc.slick.re.excep.DBConnectionException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * author: gayan
 * created: 2023-09-10
 **/
public class MySQLConnectionPoolImpl implements ConnectionPool
{
    private static ConfigKeeper configKeeper = ConfigKeeperFactory.getInstance();
    private static ConnectionPool connectionPool;

    private ConnectionPool getInstance()
    {
        if (connectionPool == null)
        {
            connectionPool = new MySQLConnectionPoolImpl();
        }
        return connectionPool;
    }

    private Connection createConnection()
    {
        try
        {
            final String connectionUrl = configKeeper.getValue( Config.SQL_CONNECTION.getKey(), Config.SQL_CONNECTION.getDefaultValue() );
            final String username = configKeeper.getValue( Config.SQL_CONNECTION_USERNAME.getKey(), Config.SQL_CONNECTION_USERNAME.getDefaultValue() );
            final String password = configKeeper.getValue( Config.SQL_CONNECTION_PASSWORD.getKey(), Config.SQL_CONNECTION_PASSWORD.getDefaultValue() );
            return DriverManager.getConnection( connectionUrl, username, password );
        }
        catch ( SQLException e)
        {
            // TODO: add logging framework
            throw new DBConnectionException( "Database connection creation was failed. Please check logs for more information." );
        }
    }

    @Override
    public Connection getConnection()
    {
        return null;
    }
}
