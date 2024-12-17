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
 * <p>Classe Java pour match complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="match"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="competition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="round" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="team1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="team2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="team1goals" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="team2goals" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "match", propOrder = {
    "id",
    "competition",
    "year",
    "round",
    "team1",
    "team2",
    "team1Goals",
    "team2Goals"
})
public class Match {

    protected long id;
    @XmlElement(required = true)
    protected String competition;
    protected int year;
    @XmlElement(required = true)
    protected String round;
    @XmlElement(required = true)
    protected String team1;
    @XmlElement(required = true)
    protected String team2;
    @XmlElement(name = "team1goals")
    protected int team1Goals;
    @XmlElement(name = "team2goals")
    protected int team2Goals;

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
     * Obtient la valeur de la propriété competition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetition() {
        return competition;
    }

    /**
     * Définit la valeur de la propriété competition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetition(String value) {
        this.competition = value;
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
     * Obtient la valeur de la propriété round.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRound() {
        return round;
    }

    /**
     * Définit la valeur de la propriété round.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRound(String value) {
        this.round = value;
    }

    /**
     * Obtient la valeur de la propriété team1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeam1() {
        return team1;
    }

    /**
     * Définit la valeur de la propriété team1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeam1(String value) {
        this.team1 = value;
    }

    /**
     * Obtient la valeur de la propriété team2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeam2() {
        return team2;
    }

    /**
     * Définit la valeur de la propriété team2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeam2(String value) {
        this.team2 = value;
    }

    /**
     * Obtient la valeur de la propriété team1Goals.
     * 
     */
    public int getTeam1Goals() {
        return team1Goals;
    }

    /**
     * Définit la valeur de la propriété team1Goals.
     * 
     */
    public void setTeam1Goals(int value) {
        this.team1Goals = value;
    }

    /**
     * Obtient la valeur de la propriété team2Goals.
     * 
     */
    public int getTeam2Goals() {
        return team2Goals;
    }

    /**
     * Définit la valeur de la propriété team2Goals.
     * 
     */
    public void setTeam2Goals(int value) {
        this.team2Goals = value;
    }

}
