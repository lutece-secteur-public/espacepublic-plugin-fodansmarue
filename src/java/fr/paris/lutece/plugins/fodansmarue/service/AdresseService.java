/*
 * Copyright (c) 2002-2021, City of Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.fodansmarue.service;

import java.util.ArrayList;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;

import fr.paris.lutece.plugins.fodansmarue.utils.constants.SignalementConstants;
import fr.paris.lutece.portal.service.util.AppPropertiesService;
import fr.paris.lutece.util.httpaccess.HttpAccess;
import fr.paris.lutece.util.httpaccess.HttpAccessException;

/**
 * The Class AdresseService.
 */
public class AdresseService implements IAdresseService
{

    /**
     * Gets the adresse from store adr.
     *
     * @param lat
     *            the lat
     * @param lng
     *            the lng
     * @return the adresse from store adr
     * @throws HttpAccessException
     *             the http access exception
     */
    @Override
    public String getAdresseFromStoreAdr( Double lat, Double lng ) throws HttpAccessException
    {
        HttpAccess http = new HttpAccess( );
        String answer = http.doGet( AppPropertiesService.getProperty( SignalementConstants.PROPERTY_URL_STORE_ADR ) + "StoreAdr/rest/AdressesPostales/R61/xy/("
                + lat + "," + lng + ",5)" );

        Map<String, ArrayList> answerMap = new Gson( ).fromJson( answer, Map.class );

        String result = "";
        if ( answerMap.containsKey( "Features" ) )
        {
            JSONArray jsonArr = new JSONArray( answerMap.get( "Features" ) );
            if ( jsonArr.length( ) > 0 && jsonArr.getJSONObject( 0 ).has( "properties" ) )
            {
                JSONObject jsonObject = jsonArr.getJSONObject( 0 ).getJSONObject( "properties" );
                if ( jsonObject.has( "Adressetypo" ) )
                {
                    result = jsonObject.get( "Adressetypo" ).toString( );
                }
            }
        }
        return result;
    }

}
