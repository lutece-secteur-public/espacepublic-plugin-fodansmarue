/*
 * Copyright (c) 2002-2020, City of Paris
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
package fr.paris.lutece.plugins.fodansmarue.business.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.paris.lutece.portal.service.image.ImageResource;

/**
 * The Class TypeEquipement.
 */
public class TypeEquipement implements Serializable
{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1156033976285745809L;

    /** The n id type equipement. */
    // Variables declarations
    private int               _nIdTypeEquipement;

    /** The str libelle type equipement. */
    private String            _strLibelleTypeEquipement;

    /** The str nom public. */
    private String            _strNomPublic;

    /** The str libelle barre recherche. */
    private String            _strLibelleBarreRecherche;

    /** The str libelle ecr mobile. */
    private String            _strLibelleEcrMobile;

    /** The str msg alert no equipement. */
    private String            _strMsgAlertNoEquipement;

    /** The str msg usage. */
    private String            _strMsgUsage;

    /** The image. */
    private ImageResource     _image;

    /** The str image url. */
    private String            _strImageUrl;

    /** The icone. */
    private ImageResource     _icone;

    /** The str icone url. */
    private String            _strIconeUrl;

    /** The children. */
    private List<Integer>     _children        = new ArrayList<>( );

    /** The str description. */
    private String            _strDescription;

    /**
     * Returns the IdTypeEquipement.
     *
     * @return The IdTypeEquipement
     */
    public int getId( )
    {
        return _nIdTypeEquipement;
    }

    /**
     * Sets the IdTypeEquipement.
     *
     * @param nIdTypeEquipement
     *            The IdTypeEquipement
     */
    public void setId( int nIdTypeEquipement )
    {
        _nIdTypeEquipement = nIdTypeEquipement;
    }

    /**
     * Returns the Name.
     *
     * @return The Name
     */
    public String getNomPublic( )
    {
        return _strNomPublic;
    }

    /**
     * Sets the Name.
     *
     * @param strNomPublic
     *            the new nom public
     */
    public void setNomPublic( String strNomPublic )
    {
        _strNomPublic = strNomPublic;
    }

    /**
     * Returns the PlaceholderSearchbar.
     *
     * @return The PlaceholderSearchbar
     */
    public String getLibelleBarreRecherche( )
    {
        return _strLibelleBarreRecherche;
    }

    /**
     * Sets the PlaceholderSearchbar.
     *
     * @param strLibelleBarreRecherche
     *            the new libelle barre recherche
     */
    public void setLibelleBarreRecherche( String strLibelleBarreRecherche )
    {
        _strLibelleBarreRecherche = strLibelleBarreRecherche;
    }

    /**
     * Returns the MsgAlertNoEquipement.
     *
     * @return The MsgAlertNoEquipement
     */
    public String getMsgAlertNoEquipement( )
    {
        return _strMsgAlertNoEquipement;
    }

    /**
     * Sets the MsgAlertNoEquipement.
     *
     * @param strMsgAlertNoEquipement
     *            The MsgAlertNoEquipement
     */
    public void setMsgAlertNoEquipement( String strMsgAlertNoEquipement )
    {
        _strMsgAlertNoEquipement = strMsgAlertNoEquipement;
    }

    /**
     * Returns the MsgAlertPhoto.
     *
     * @return The MsgAlertPhoto
     */
    public String getMsgUsage( )
    {
        return _strMsgUsage;
    }

    /**
     * Sets the MsgAlertPhoto.
     *
     * @param strMsgUsage
     *            the new msg usage
     */
    public void setMsgUsage( String strMsgUsage )
    {
        _strMsgUsage = strMsgUsage;
    }

    /**
     * Gets the image.
     *
     * @return the image
     */
    public ImageResource getImage( )
    {
        return _image;
    }

    /**
     * Sets the image.
     *
     * @param image
     *            the new image
     */
    public void setImage( ImageResource image )
    {
        _image = image;
    }

    /**
     * Gets the image url.
     *
     * @return the image url
     */
    public String getImageUrl( )
    {
        return _strImageUrl;
    }

    /**
     * Sets the image url.
     *
     * @param imageUrl
     *            the new image url
     */
    public void setImageUrl( String imageUrl )
    {
        _strImageUrl = imageUrl;
    }

    /**
     * Sets the image mime type.
     *
     * @param strMimeType
     *            the new image mime type
     */
    public void setImageMimeType( String strMimeType )
    {
        _image.setMimeType( strMimeType );
    }

    /**
     * Gets the icone.
     *
     * @return the icone
     */
    public ImageResource getIcone( )
    {
        return _icone;
    }

    /**
     * Sets the icone.
     *
     * @param icone
     *            the new icone
     */
    public void setIcone( ImageResource icone )
    {
        _icone = icone;
    }

    /**
     * Gets the icone url.
     *
     * @return the icone url
     */
    public String getIconeUrl( )
    {
        return _strIconeUrl;
    }

    /**
     * Sets the icone url.
     *
     * @param iconeUrl
     *            the new icone url
     */
    public void setIconeUrl( String iconeUrl )
    {
        _strIconeUrl = iconeUrl;
    }

    /**
     * Sets the icone mime type.
     *
     * @param strMimeType
     *            the new icone mime type
     */
    public void setIconeMimeType( String strMimeType )
    {
        _icone.setMimeType( strMimeType );
    }

    /**
     * Gets the children.
     *
     * @return the children
     */
    public List<Integer> getChildren( )
    {
        return _children;
    }

    /**
     * Sets the children.
     *
     * @param children
     *            the new children
     */
    public void setChildren( List<Integer> children )
    {
        Collections.copy( _children, children );
    }

    /**
     * Gets the libelle type equipement.
     *
     * @return the libelle type equipement
     */
    public String getLibelleTypeEquipement( )
    {
        return _strLibelleTypeEquipement;
    }

    /**
     * Sets the libelle type equipement.
     *
     * @param libelleTypeEquipement
     *            the new libelle type equipement
     */
    public void setLibelleTypeEquipement( String libelleTypeEquipement )
    {
        _strLibelleTypeEquipement = libelleTypeEquipement;
    }

    /**
     * Gets the libelle ecr mobile.
     *
     * @return the libelle ecr mobile
     */
    public String getLibelleEcrMobile( )
    {
        return _strLibelleEcrMobile;
    }

    /**
     * Sets the libelle ecr mobile.
     *
     * @param libelleEcrMobile
     *            the new libelle ecr mobile
     */
    public void setLibelleEcrMobile( String libelleEcrMobile )
    {
        _strLibelleEcrMobile = libelleEcrMobile;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription( )
    {
        return _strDescription;
    }

    /**
     * Sets the description.
     *
     * @param strDescription
     *            the new description
     */
    public void setDescription( String strDescription )
    {
        _strDescription = strDescription;
    }

    /**
     * Sets the image content.
     *
     * @param imageContent
     *            the new image content
     */
    public void setImageContent( byte[] imageContent )
    {
        _image.setImage( imageContent );
    }

    /**
     * Sets the icone content.
     *
     * @param iconeContent
     *            the new icone content
     */
    public void setIconeContent( byte[] iconeContent )
    {
        _icone.setImage( iconeContent );
    }

}
