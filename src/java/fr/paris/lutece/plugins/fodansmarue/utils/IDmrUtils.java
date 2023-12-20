package fr.paris.lutece.plugins.fodansmarue.utils;

import fr.paris.lutece.plugins.fodansmarue.business.entities.Equipement;
import fr.paris.lutece.plugins.fodansmarue.dto.DossierSignalementDTO;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public interface IDmrUtils
{
    /**
     * Tri bulles.
     *
     * @param tab
     *            the tab
     */
    void triBulles( List<DossierSignalementDTO> tab );

    /**
     * Returns all the properties matching the prefix.
     *
     * @param prefix
     *            the prefix
     * @return the properties
     */
    List<String> getProperties( String prefix );

    /**
     * Formattage adresse et nom des équipements sans accent et minuscule.
     *
     * @param listEquipement
     *            the list equipement
     */
    void formatStringManual( List<Equipement> listEquipement );
}
