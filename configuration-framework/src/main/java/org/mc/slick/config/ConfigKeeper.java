package org.mc.slick.config;

/**
 * author: gayan
 * created: 2023-09-11
 **/
public interface ConfigKeeper
{
    /**
     * Get the string value of the given configuration key
     * @param key {@link String}
     * @param defaultValue {@link String}
     * @return {@link String}
     */

    String getValue( String key, String defaultValue );

    /**
     * Get the integer value of the given configuration key
     * @param key {@link String}
     * @param defaultValue {@link Integer}
     * @return {@link Integer}
     */

    int getValue( String key, int defaultValue );
}
