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

import fr.paris.lutece.portal.service.image.ImageResource;
import fr.paris.lutece.portal.web.constants.Parameters;
import fr.paris.lutece.util.url.UrlItem;

/**
 * The Class PhotoDMR.
 */
public class PhotoDMR implements Serializable
{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8933736650673904955L;

    /** The Constant VUE_D_ENSEMBLE. */
    public static final Integer VUE_D_ENSEMBLE = 1;

    /** The Constant VUE_DETAILLE. */
    public static final Integer VUE_DETAILLE = 0;

    /** The l id. */
    private Long _lId;

    /** The image. */
    private ImageResource _image = null;

    /** The image thumbnail. */
    private ImageResource _imageThumbnail = new ImageResource( );

    /** The signalement. */
    private Signalement _signalement;

    /** The date. */
    private String _date;

    /** The n vue. */
    private Integer _nVue;

    /** The Constant IMAGE_RESOURCE_TYPE_ID. */
    private static final String IMAGE_RESOURCE_TYPE_ID = "photo_signalement";

    /**
     * Gets the id.
     *
     * @return the id
     */
    public Long getId( )
    {
        return _lId;
    }

    /**
     * Sets the id.
     *
     * @param id
     *            the new id
     */
    public void setId( Long id )
    {
        _lId = id;
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
        UrlItem url = new UrlItem( Parameters.IMAGE_SERVLET );
        url.addParameter( Parameters.RESOURCE_TYPE, IMAGE_RESOURCE_TYPE_ID );
        url.addParameter( Parameters.RESOURCE_ID, _lId != null ? Long.toString( _lId ) : "" );
        return url.getUrlWithEntity( );
    }

    /**
     * Gets the signalement.
     *
     * @return the signalement
     */
    public Signalement getSignalement( )
    {
        return _signalement;
    }

    /**
     * Sets the signalement.
     *
     * @param signalement
     *            the new signalement
     */
    public void setSignalement( Signalement signalement )
    {
        _signalement = signalement;
    }

    /**
     * Sets the mime type.
     *
     * @param strMimeType
     *            the new mime type
     */
    public void setMimeType( String strMimeType )
    {
        _image.setMimeType( strMimeType );
    }

    /**
     * Sets the image content.
     *
     * @param imageContent
     *            the new image content
     */
    public void setImageContent( byte [ ] imageContent )
    {
        _image.setImage( imageContent );
    }

    /**
     * Sets the image thumbnail.
     *
     * @param imageContent
     *            the new image thumbnail
     */
    public void setImageThumbnail( byte [ ] imageContent )
    {
        _imageThumbnail.setImage( imageContent );

    }

    /**
     * Gets the image thumbnail.
     *
     * @return the _imageThumbnail
     */
    public ImageResource getImageThumbnail( )
    {
        return _imageThumbnail;
    }

    /**
     * Gets the date.
     *
     * @return the date
     */
    public String getDate( )
    {
        return _date;
    }

    /**
     * Sets the date.
     *
     * @param date
     *            the new date
     */
    public void setDate( String date )
    {
        _date = date;
    }

    /**
     * Gets the vue.
     *
     * @return the vue
     */
    public Integer getVue( )
    {
        return _nVue;
    }

    /**
     * Sets the vue.
     *
     * @param vue
     *            the new vue
     */
    public void setVue( Integer vue )
    {
        _nVue = vue;
    }

}
