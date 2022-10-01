# INTRODUCCIÓN
El objetivo general es implementar la automatizacion hacia la pagina web https://www.wingo.com/, específicamente a cada uno 
de los modulos que lo componen. A manera de obtener un sistema que pueda ser ejecutado por cada uno de sus interesados. 

#HERRAMIENTAS UTILIZADAS
Se emplea el IDE de IntelliJ. Se usa el driver de google en su ultima version 105.0.5195.52 para ejecucion de la automatizacion. SerenityBDD, Screenplay, lenguaje Gherkin, Cucumber.
 
#ESTRATEGIA DE AUTOMATIZACIÓN.
El proyecto hace uso del patrón Screenplay, con Cucumber y Gradle. Screenplay se orienta en el usuario y específicamente en las tareas, además utiliza los principios 
S.O.L.I.D. Con este patrón de pruebas se pueden escribir en un lenguaje más natural y entendible. El proyecto se estructura de la siguiente manera:
Task: Son las tareas que realiza el actor a nivel de negocio.
User-Interface: Donde se realiza el mapeo de los target con los que el usuario interactúa. 
Question: Donde se realizan los Assert y las verificaciones del proceso. 
Util: Son las utilidades necesarias dentro del proyecto. 
Model: Clases donde se encuentran los objetos complejos de negocio.
Feature: Donde se narran los casos de prueba utilizando el lenguaje Gherkin. 

#DESCRIPCIÓN GENERAL AUTOMATIZACIONES
1. As a user I want to make a flight reservation: programa diseñado para realizar la compra de vuelos dependiendo del destino y las comodidades que desee el cliente, en este se puede seleccionar el numero de pasajeros para los vuelos, estas seran unas de las validaciones que realizara la automatización para asi validar el correcto funcionamiento de cada uno de estos filtros que proporciona el componente.

	
#TENER EN CUENTA ANTES DE EJECUTAR LA AUTOMATIZACIÓN
1. Tener el driver de la ultima version de google chrome dentro del proyecto.



