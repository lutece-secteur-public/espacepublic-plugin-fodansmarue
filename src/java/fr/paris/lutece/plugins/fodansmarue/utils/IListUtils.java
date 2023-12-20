package fr.paris.lutece.plugins.fodansmarue.utils;

import java.util.List;

import fr.paris.lutece.util.ReferenceList;

/**
 * IListUtils
 */
public interface IListUtils
{
    /**
     * Return.
     *
     * @param propertyKey
     *            the property key
     * @return the property list
     */
    List<String> getPropertyList( String propertyKey );

    /**
     * Conversion d'une liste de type {@link List} vers une {@link ReferenceList}.
     *
     * @param list
     *            la liste à convertir
     * @param key
     *            la valeur de la propriété du bean servant de clé dans la {@link ReferenceList}
     * @param value
     *            la valeur de la propriété du bean servant de valeur dans la {@link ReferenceList}
     * @param firstItem
     *            valeur de la première ligne dans la {@link ReferenceList} (exemple, en vue d'afficher la ReferenceList dans une liste déroulante : " --
     *            Sélectionnez une valeur --").
     * @return La {@link ReferenceList} peuplée avec les données de la Liste
     */
    ReferenceList toReferenceList( List<?> list, String key, String value, String firstItem );

    /**
     * Conversion d'une liste de type {@link List} vers une.
     *
     * @param list
     *            la liste à convertir
     * @param key
     *            la valeur de la propriété du bean servant de clé dans la
     * @param value
     *            la valeur de la propriété du bean servant de valeur dans la
     * @param firstItem
     *            valeur de la première ligne dans la {@link ReferenceList} (exemple, en vue d'afficher la ReferenceList dans une liste déroulante : " --
     *            Sélectionnez une valeur --").
     * @param sort
     *            if true reference list twill be sorted
     * @return La {@link ReferenceList} peuplée avec les données de la Liste {@link ReferenceList} {@link ReferenceList} {@link ReferenceList}
     */
    ReferenceList toReferenceList( List<?> list, String key, String value, String firstItem, boolean sort );

    /**
     * Remove every elements from a reference list that are NOT contained in a given list.
     *
     * @param refList
     *            The list ro filter
     * @param listId
     *            The list of ids to retain in the reference list
     * @param bKeepFirstItem
     *            True to keep the first item, false to keep it only ifs code match any item of the id list.
     * @return a new list with only the items of the referenceList which ids are in the parameter list. Note that a new list is created, but items are NOT
     *         duplicated !
     */
    ReferenceList retainReferenceList( ReferenceList refList, List<Integer> listId, boolean bKeepFirstItem );

    /**
     * Converts an array of string, to a list of int.
     *
     * @param array
     *            the array
     * @return the list of int from str array
     */
    List<Integer> getListOfIntFromStrArray( String [ ] array );

    /**
     * Return.
     *
     * @param propertyKey
     *            the property key
     * @return the property list
     */
    List<Integer> getPropertyListInt( String propertyKey );
}
