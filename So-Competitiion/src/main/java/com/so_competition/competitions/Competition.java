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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour competition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="competition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="winner" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="runnerup" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "competition", propOrder = {
    "id",
    "name",
    "country",
    "year",
    "winner",
    "runnerup"
})
public class Competition {

    protected long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String country;
    protected int year;
    @XmlElement(required = true)
    protected String winner;
    @XmlElement(required = true)
    protected String runnerup;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Définit la valeur de la propriété country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtient la valeur de la propriété year.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Définit la valeur de la propriété year.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Obtient la valeur de la propriété winner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinner() {
        return winner;
    }

    /**
     * Définit la valeur de la propriété winner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinner(String value) {
        this.winner = value;
    }

    /**
     * Obtient la valeur de la propriété runnerup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunnerup() {
        return runnerup;
    }

    /**
     * Définit la valeur de la propriété runnerup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunnerup(String value) {
        this.runnerup = value;
    }

}
