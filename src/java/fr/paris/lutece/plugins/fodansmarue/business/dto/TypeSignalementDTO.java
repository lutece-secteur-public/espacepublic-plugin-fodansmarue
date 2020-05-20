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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fr.paris.lutece.plugins.unittree.business.unit.Unit;

/**
 * Almost the same as TypeSignalement but with a list of children.
 */
public class TypeSignalementDTO
{

    /** The _actif. */
    private boolean                  _actif;

    /** The id. */
    private Integer                  _id;

    /** The id type signalement parent. */
    private Integer                  _idTypeSignalementParent;

    /** The _is selected. */
    private boolean                  _isSelected;

    /** The libelle. */
    private String                   _libelle;

    /** The imageUrl. */
    private String                   _imageUrl;

    /** The list child. */
    private List<TypeSignalementDTO> _listChild = new ArrayList<>( );

    /** The _minus. */
    private boolean                  _minus;

    /** The type signalement parent. */
    private TypeSignalement          _typeSignalementParent;

    /** The unit. */
    private Unit                     _unit;

    /** The is agent. */
    private Boolean                  _isAgent;

    /** The b hors DMR. */
    private boolean                  _bHorsDMR;

    /** The str message hors DMR. */
    private String                   _strMessageHorsDMR;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public Integer getId( )
    {
        return _id;
    }

    /**
     * Gets the id type signalement parent.
     *
     * @return the id type signalement parent
     */
    public Integer getIdTypeSignalementParent( )
    {
        return _idTypeSignalementParent;
    }

    /**
     * Gets the libelle.
     *
     * @return the libelle
     */
    public String getLibelle( )
    {
        return _libelle;
    }

    /**
     * Gets the imageUrl.
     *
     * @return the imageUrl
     */
    public String getImageUrl( )
    {
        return _imageUrl;
    }

    /**
     * Gets the list child.
     *
     * @return the list child
     */
    public List<TypeSignalementDTO> getListChild( )
    {
        return _listChild;
    }

    /**
     * Gets the type signalement parent.
     *
     * @return the type signalement parent
     */
    public TypeSignalement getTypeSignalementParent( )
    {
        return _typeSignalementParent;
    }

    /**
     * Gets the unit.
     *
     * @return the unit
     */
    public Unit getUnit( )
    {
        return _unit;
    }

    /**
     * Checks if is actif.
     *
     * @return true, if is actif
     */
    public boolean isActif( )
    {
        return _actif;
    }

    /**
     * Checks if is minus.
     *
     * @return true, if is minus
     */
    public boolean isMinus( )
    {
        return _minus;
    }

    /**
     * Checks if is selected.
     *
     * @return true, if is selected
     */
    protected boolean isSelected( )
    {
        return _isSelected;
    }

    /**
     * Sets the actif.
     *
     * @param actif
     *            the new actif
     */
    public void setActif( boolean actif )
    {
        _actif = actif;
    }

    /**
     * Sets the id.
     *
     * @param id
     *            the new id
     */
    public void setId( Integer id )
    {
        _id = id;
    }

    /**
     * Sets the id type signalement parent.
     *
     * @param idTypeSignalementParent
     *            the new id type signalement parent
     */
    public void setIdTypeSignalementParent( Integer idTypeSignalementParent )
    {
        _idTypeSignalementParent = idTypeSignalementParent;
    }

    /**
     * Sets the libelle.
     *
     * @param libelle
     *            the new libelle
     */
    public void setLibelle( String libelle )
    {
        _libelle = libelle;
    }

    /**
     * Sets the Image url.
     *
     * @param imageUrl
     *            the new image url
     */
    public void setImageUrl( String imageUrl )
    {
        _imageUrl = imageUrl;
    }

    /**
     * Sets the list child.
     *
     * @param listChild
     *            the new list child
     */
    public void setListChild( List<TypeSignalementDTO> listChild )
    {
        _listChild = listChild.stream( ).filter( typeSignalementDTO -> ( ( typeSignalementDTO.isAgent( ) != null ) && !typeSignalementDTO.isAgent( ) ) || ( typeSignalementDTO.isAgent( ) == null ) )
                .collect( Collectors.toList( ) );
    }

    /**
     * Sets the minus.
     *
     * @param minus
     *            the new minus
     */
    public void setMinus( boolean minus )
    {
        _minus = minus;
    }

    /**
     * Sets the selected.
     *
     * @param isSelected
     *            the new selected
     */
    protected void setSelected( boolean isSelected )
    {
        _isSelected = isSelected;
    }

    /**
     * Sets the type signalement parent.
     *
     * @param typeSignalementParent
     *            the new type signalement parent
     */
    public void setTypeSignalementParent( TypeSignalement typeSignalementParent )
    {
        _typeSignalementParent = typeSignalementParent;
    }

    /**
     * Sets the unit.
     *
     * @param unit
     *            the new unit
     */
    public void setUnit( Unit unit )
    {
        _unit = unit;
    }

    /**
     * Checks if is agent.
     *
     * @return the _isAgent
     */
    public Boolean isAgent( )
    {
        return _isAgent;
    }

    /**
     * Sets the checks if is agent.
     *
     * @param _isAgent
     *            the _isAgent to set
     */
    public void setIsAgent( Boolean isAgent )
    {
        _isAgent = isAgent;
    }

    /**
     * Checks if isHorsDMR.
     *
     * @return true if horsDMR
     */
    public boolean isHorsDMR( )
    {
        return _bHorsDMR;
    }

    /**
     * Sets horsDMR (types without report).
     *
     * @param horsDMR
     *            the new hors DMR
     */
    public void setHorsDMR( boolean horsDMR )
    {
        _bHorsDMR = horsDMR;
    }

    /**
     * Gets the message to display for type without report.
     *
     * @return MessageHorsDMR
     */
    public String getMessageHorsDMR( )
    {
        return _strMessageHorsDMR;
    }

    /**
     * Sets the message to display fort type without report.
     *
     * @param messageHorsDMR
     *            the new message hors DMR
     */
    public void setMessageHorsDMR( String messageHorsDMR )
    {
        _strMessageHorsDMR = messageHorsDMR;
    }

}
