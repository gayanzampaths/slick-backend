package org.mc.slick.data;

import org.mc.slick.data.response.DMResponse;

/**
 * author: gayan
 * created: 2023-09-11
 **/
public interface DataManager
{
    DMResponse<Void> create( String query );
}
