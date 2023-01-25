package com.j4ltechnologies.groovy.intro

import java.time.LocalDate

/**
 * Classe Main, créée le 19/10/2022 à 09:51
 *
 * @author Joachim Zadi
 * @version 1.0 du 19/10/2022
 */
class Main {

    /**
     * Commentaire de documentation
     * @param args
     */
    static void main(String[] args) {

        /*
         * Commentaire multilignes
         */
        // Commentaire de ligne
        println 'Bonjour groovy...!'
        println LocalDate.of(1969,03,20).toString()
    }
}