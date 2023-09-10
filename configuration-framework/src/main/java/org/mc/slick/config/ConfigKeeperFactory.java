package org.mc.slick.config;

/**
 * author: gayan
 * created: 2023-09-11
 **/
public class ConfigKeeperFactory
{
    private static ConfigKeeper configKeeper;

    /**
     * get an instance of {@link ConfigKeeper}
     * @return {@link ConfigKeeper}
     */
    public static ConfigKeeper getInstance()
    {
        if ( configKeeper == null )
        {
            configKeeper = new ConfigKeeperImpl();
        }

        return configKeeper;
    }
}
