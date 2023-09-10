package org.mc.slick.con.config;

/**
 * author: gayan
 * created: 2023-09-10
 **/
public enum Config
{
    SQL_CONNECTION( "SQL_CONNECTION", "" ),
    SQL_CONNECTION_USERNAME( "SQL_CONNECTION_USERNAME", "" ),
    SQL_CONNECTION_PASSWORD( "SQL_CONNECTION_PASSWORD", "" );

    private final String key;
    private String defaultValue;
    private int defaultIntValue;

    Config( String key, String defaultValue )
    {
        this.key = key;
        this.defaultValue = defaultValue;
    }

    Config( String key, int defaultIntValue )
    {
        this.key = key;
        this.defaultIntValue = defaultIntValue;
    }

    public String getKey()
    {
        return key;
    }

    public String getDefaultValue()
    {
        return defaultValue;
    }

    public int getDefaultIntValue()
    {
        return defaultIntValue;
    }
}
