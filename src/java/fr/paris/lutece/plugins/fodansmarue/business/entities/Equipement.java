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
package fr.paris.lutece.plugins.fodansmarue.business.entities;

import java.io.Serializable;

/**
 * The Class Equipement.
 */
public class Equipement implements Serializable
{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1879010402928930728L;

    /** The n id. */
    private Long _nId;

    /** The n parent id. */
    private Long _nParentId;

    /** The str name. */
    private String _strName;

    /** The str adresse. */
    private String _strAdresse;

    /** The latitude. */
    private Double _latitude;

    /** The longitude. */
    private Double _longitude;

    /** The str name format. */
    private String _strNameFormat;

    /** The str adresse format. */
    private String _strAdresseFormat;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public Long getId( )
    {
        return _nId;
    }

    /**
     * Sets the id.
     *
     * @param nId
     *            the new id
     */
    public void setId( Long nId )
    {
        _nId = nId;
    }

    /**
     * Gets the parent id.
     *
     * @return the parent id
     */
    public Long getParentId( )
    {
        return _nParentId;
    }

    /**
     * Sets the parent id.
     *
     * @param nParentId
     *            the new parent id
     */
    public void setParentId( Long nParentId )
    {
        _nParentId = nParentId;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName( )
    {
        return _strName;
    }

    /**
     * Sets the name.
     *
     * @param strName
     *            the new name
     */
    public void setName( String strName )
    {
        _strName = strName;
    }

    /**
     * Gets the adresse.
     *
     * @return the adresse
     */
    public String getAdresse( )
    {
        return _strAdresse;
    }

    /**
     * Sets the adresse.
     *
     * @param strAdresse
     *            the new adresse
     */
    public void setAdresse( String strAdresse )
    {
        _strAdresse = strAdresse;
    }

    /**
     * Gets the longitude.
     *
     * @return the longitude
     */
    public Double getLongitude( )
    {
        return _longitude;
    }

    /**
     * Sets the longitude.
     *
     * @param longitude
     *            the new longitude
     */
    public void setLongitude( Double longitude )
    {
        _longitude = longitude;
    }

    /**
     * Gets the latitude.
     *
     * @return the latitude
     */
    public Double getLatitude( )
    {
        return _latitude;
    }

    /**
     * Sets the latitude.
     *
     * @param latitude
     *            the new latitude
     */
    public void setLatitude( Double latitude )
    {
        _latitude = latitude;
    }

    /**
     * Gets the name format.
     *
     * @return the _strNameFormat
     */
    public String getNameFormat( )
    {
        return _strNameFormat;
    }

    /**
     * Sets the name format.
     *
     * @param strNameFormat
     *            the new name format
     */
    public void setNameFormat( String strNameFormat )
    {
        _strNameFormat = strNameFormat;
    }

    /**
     * Gets the adresse format.
     *
     * @return the _strAdresseFormat
     */
    public String getAdresseFormat( )
    {
        return _strAdresseFormat;
    }

    /**
     * Sets the adresse format.
     *
     * @param strAdresseFormat
     *            the new adresse format
     */
    public void setAdresseFormat( String strAdresseFormat )
    {
        _strAdresseFormat = strAdresseFormat;
    }

}
