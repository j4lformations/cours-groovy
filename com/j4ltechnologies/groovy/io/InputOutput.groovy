package com.j4ltechnologies.groovy.io

// Entree Sortie
print 'Saisir votre prénom : '
def prenom = System.console().readLine()
println "Votre prenom est $prenom"

print 'Saisir votre $âge : '
def age = System.console().readLine().toInteger()
println "Votre age est $age ans"

print 'Saisir votre année de naissance : '
def annee = System.console().readLine() as Integer
println "Vous �tes n�e en $annee"
