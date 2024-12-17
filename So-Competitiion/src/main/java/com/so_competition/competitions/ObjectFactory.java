//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.12.17 à 02:18:01 AM CET 
//


package com.so_competition.competitions;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.so_competition.competitions package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.so_competition.competitions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompetitionRequest }
     * 
     */
    public GetCompetitionRequest createGetCompetitionRequest() {
        return new GetCompetitionRequest();
    }

    /**
     * Create an instance of {@link GetCompetitionResponse }
     * 
     */
    public GetCompetitionResponse createGetCompetitionResponse() {
        return new GetCompetitionResponse();
    }

    /**
     * Create an instance of {@link Competition }
     * 
     */
    public Competition createCompetition() {
        return new Competition();
    }

    /**
     * Create an instance of {@link GetMatchRequest }
     * 
     */
    public GetMatchRequest createGetMatchRequest() {
        return new GetMatchRequest();
    }

    /**
     * Create an instance of {@link GetMatchResponse }
     * 
     */
    public GetMatchResponse createGetMatchResponse() {
        return new GetMatchResponse();
    }

    /**
     * Create an instance of {@link Match }
     * 
     */
    public Match createMatch() {
        return new Match();
    }

}
