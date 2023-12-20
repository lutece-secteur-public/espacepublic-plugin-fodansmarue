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
package fr.paris.lutece.plugins.fodansmarue.utils.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import fr.paris.lutece.plugins.fodansmarue.business.entities.Equipement;
import fr.paris.lutece.plugins.fodansmarue.dto.DossierSignalementDTO;
import fr.paris.lutece.plugins.fodansmarue.utils.IDmrUtils;
import fr.paris.lutece.portal.service.util.AppPropertiesService;

/**
 * The Class DmrUtils.
 */
public class DmrUtils implements IDmrUtils
{

    /**
     * Instantiates a new dmr utils.
     */
    private DmrUtils( )
    {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void triBulles( List<DossierSignalementDTO> tab )
    {
        boolean tabInOrder = false;
        int size = tab.size( );
        while ( !tabInOrder )
        {
            tabInOrder = true;
            for ( int i = 0; i < ( size - 1 ); i++ )
            {
                if ( tab.get( i ).getDistance( ) > tab.get( i + 1 ).getDistance( ) )
                {
                    DossierSignalementDTO tmp = tab.get( i + 1 );
                    tab.set( i + 1, tab.get( i ) );
                    tab.set( i, tmp );

                    tabInOrder = false;
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> getProperties( String prefix )
    {
        List<String> propertiesKeys = AppPropertiesService.getKeys( prefix );
        List<String> properties = new ArrayList<>( );
        for ( String propertyKey : propertiesKeys )
        {
            String property = AppPropertiesService.getProperty( propertyKey );
            if ( StringUtils.isNotBlank( property ) )
            {
                properties.add( property );
            }
        }
        return properties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void formatStringManual( List<Equipement> listEquipement )
    {

        for ( Equipement equipement : listEquipement )
        {
            char [ ] charsDataName = new char [ equipement.getName( ).length( )];
            char [ ] charsDataAdresse = new char [ equipement.getAdresse( ).length( )];
            equipement.getName( ).getChars( 0, charsDataName.length, charsDataName, 0 );
            equipement.getAdresse( ).getChars( 0, charsDataAdresse.length, charsDataAdresse, 0 );

            format( charsDataName );
            format( charsDataAdresse );

            equipement.setNameFormat( new String( charsDataName ) );
            equipement.setAdresseFormat( new String( charsDataAdresse ) );
        }

    }

    // Formattage du nom/adresse de l'équipement
    private void format( char [ ] charsData )
    {
        char c;

        for ( int i = 0; i < charsData.length; i++ )
        {
            if ( ( ( c = charsData [i] ) >= 'A' ) && ( c <= 'Z' ) )
            {
                charsData [i] = (char) ( ( c - 'A' ) + 'a' );
            }
            else
            {
                switch( c )
                {
                    case '\u00e0':
                    case '\u00e1':
                    case '\u00e2':
                    case '\u00e3':
                    case '\u00e4':
                    case '\u00c0':
                    case '\u00c1':
                    case '\u00c2':
                    case '\u00c3':
                    case '\u00c4':
                        charsData [i] = 'a';
                        break;
                    case '\u00e7':
                    case '\u00c7':
                        charsData [i] = 'c';
                        break;
                    case '\u00e8':
                    case '\u00e9':
                    case '\u00ea':
                    case '\u00eb':
                    case '\u00c8':
                    case '\u00c9':
                    case '\u00ca':
                    case '\u00cb':
                        charsData [i] = 'e';
                        break;
                    case '\u00ee':
                    case '\u00ef':
                    case '\u00ce':
                    case '\u00cf':
                        charsData [i] = 'i';
                        break;
                    case '\u00f2':
                    case '\u00f4':
                    case '\u00f6':
                    case '\u00d2':
                    case '\u00d4':
                    case '\u00d6':
                        charsData [i] = 'o';
                        break;
                    case '\u00f9':
                    case '\u00fb':
                    case '\u00fc':
                    case '\u00d9':
                    case '\u00db':
                    case '\u00dc':
                        charsData [i] = 'u';
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
