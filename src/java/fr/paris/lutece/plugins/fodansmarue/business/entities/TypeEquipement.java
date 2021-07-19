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
import java.util.ArrayList;
import java.util.List;

/**
 * The Class TypeEquipement.
 */
public class TypeEquipement implements Serializable
{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6711260040916887707L;

    /** The n id. */
    private Long _nId;

    /** The str name. */
    private String _strName;

    /** The str libelle ecran mobile. */
    private String _strLibelleEcranMobile;

    /** The list equipements. */
    private List<Equipement> _listEquipements = new ArrayList<>( );

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
     * Gets the list equipements.
     *
     * @return the list equipements
     */
    public List<Equipement> getListEquipements( )
    {
        return _listEquipements;
    }

    /**
     * Sets the list equipements.
     *
     * @param listEquipements
     *            the new list equipements
     */
    public void setListEquipements( List<Equipement> listEquipements )
    {
        _listEquipements = listEquipements;
    }

    /**
     * Gets the libelle ecran mobile.
     *
     * @return the libelle ecran mobile
     */
    public String getLibelleEcranMobile( )
    {
        return _strLibelleEcranMobile;
    }

    /**
     * Sets the libelle ecran mobile.
     *
     * @param strLibelleEcranMobile
     *            the new libelle ecran mobile
     */
    public void setLibelleEcranMobile( String strLibelleEcranMobile )
    {
        _strLibelleEcranMobile = strLibelleEcranMobile;
    }

}
