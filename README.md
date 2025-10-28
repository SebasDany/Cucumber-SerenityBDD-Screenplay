# CHALENGE NTTDATA Ejercicio E2E
Para iniciar el proyecto se utilizo un plantilla propia de serenityBDD.

Pagina : https://serenity-bdd.github.io/docs/tutorials/cucumber-screenplay

Desarrollo

Clonar el proyecto

Vaya al directorio correspondiente y ejecutar el siguiente comando:

* git clone https://github.com/SebasDany/Cucumber-SerenityBDD-Screenplay.git

Una vez clonado abrir el proyecto con IntelliJ IDEA.

Es un proyecto **maven**
Una vez cargado el proyecto ejecutar las siguiente instrucciones para ejecutar las pruebas:

* nvm clean install

O accerder a la carpeta **src\test\java\runners** y abrir el archivo RunnerTest y presionar 'Run Test'

Para ejecutar cada uno de los feature, accerder a la ruta test/resource/feature y 
abrir el login.feature y ejecutar los casos que se deseen.

Nota. El proyecto es ejecutandose actualmente en java 21

# Conclusion

* Una vez finalizada la ejecucion, para acceder al reporte ir a 'target/site/serenity/index.html' y dar click derecho 'abrir con' y seleccionar 'navegador' y elegir uno de preferencia.
* Se realizo una prueba a la pagina https://www.saucedemo.com/ en 5 pasos, las pruebas pasaron de forma exitosa.
* Esta prueba es mas utilizada para las pruebas de humo y pruebas de regresión, para verificar si hubo alteraciones en el flujo 
con algun cambio que se implemento.
