//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.12.17 à 02:18:01 AM CET 
//


package com.so_competition.competitions;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="competition" type="{http://so-competition.com/competitions}competition"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "competition"
})
@XmlRootElement(name = "getCompetitionResponse")
public class GetCompetitionResponse {

    @XmlElement(required = true)
    protected Competition competition;

    /**
     * Obtient la valeur de la propriété competition.
     * 
     * @return
     *     possible object is
     *     {@link Competition }
     *     
     */
    public Competition getCompetition() {
        return competition;
    }

    /**
     * Définit la valeur de la propriété competition.
     * 
     * @param value
     *     allowed object is
     *     {@link Competition }
     *     
     */
    public void setCompetition(Competition value) {
        this.competition = value;
    }

}
