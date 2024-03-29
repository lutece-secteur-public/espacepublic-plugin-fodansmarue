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
package fr.paris.lutece.plugins.fodansmarue.commons;

import java.util.Locale;
import java.util.Map;

import fr.paris.lutece.portal.service.i18n.I18nService;

/**
 * Exception métier.
 */
public class BusinessException extends FunctionnalException
{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -615983331551016543L;

    /** The code. */
    private String _code;

    /** The arguments. */
    private String [ ] _arguments;

    /**
     * Constructeur de l'exception.
     *
     * @param bean
     *            the bean
     * @param code
     *            Le code de l'exception
     */
    public BusinessException( Object bean, String code )
    {
        super( bean );
        _code = code;
    }

    /**
     * Constructeur de l'exception.
     *
     * @param bean
     *            the bean
     * @param additionalParameters
     *            les paramètres additionels de l'exception
     * @param code
     *            Le code de l'exception
     */
    public BusinessException( Object bean, Map<String, Object> additionalParameters, String code )
    {
        super( bean, additionalParameters );
        _code = code;
    }

    /**
     * Constructeur de l'exception.
     *
     * @param bean
     *            the bean
     * @param additionalParameters
     *            les paramètres additionels de l'exception
     * @param code
     *            Le code de l'exception
     * @param arguments
     *            Les arguments de l'exception
     */
    public BusinessException( Object bean, Map<String, Object> additionalParameters, String code, String... arguments )
    {
        super( bean, additionalParameters );
        _code = code;
    }

    /**
     * Constructeur de l'exception.
     *
     * @param bean
     *            the bean
     * @param code
     *            Le code de l'exception
     * @param arguments
     *            Les arguments de l'exception
     */
    public BusinessException( Object bean, String code, String... arguments )
    {
        super( bean );
        _code = code;
        _arguments = arguments.clone( );
    }

    /**
     * Récupère le code de l'exception.
     *
     * @return le code de l'exception
     */
    public String getCode( )
    {
        return _code;
    }

    /**
     * Initialise le code de l'exception.
     *
     * @param code
     *            le code de l'exception
     */
    public void setCode( String code )
    {
        _code = code;
    }

    /**
     * Récupère les argumentes de l'exception.
     *
     * @return les arguments de l'exception
     */
    public String [ ] getArguments( )
    {
        return _arguments.clone( );
    }

    /**
     * Initialise les arguments de l'exception.
     *
     * @param arguments
     *            les arguments de l'exception
     */
    public void setArguments( String [ ] arguments )
    {
        _arguments = arguments.clone( );
    }

    /**
     * Constructeur de message d'erreur à partir d'une {@link BusinessException}.
     *
     * @return Le tableau de {@link String} contenant les clés i18n des messages d'erreurs
     */
    @Override
    public String getMessage( )
    {
        String errorMessage = "";
        if ( ( getArguments( ) != null ) && ( getArguments( ).length > 0 ) )
        {
            errorMessage = I18nService.getLocalizedString( getCode( ), getArguments( ), Locale.getDefault( ) );

        }
        else
        {
            errorMessage = I18nService.getLocalizedString( getCode( ), Locale.getDefault( ) );
        }

        return errorMessage;
    }
}
