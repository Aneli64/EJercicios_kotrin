package ejercicios_practica_internet.ejs_Herencia.ej4

/*
Se desea implementar una aplicación de gestión de una aerolínea.
La aerolínea tiene tres tipos de vuelos: vuelos internacionales, vuelos nacionales
 y vuelos regionales. Cada tipo de vuelo tiene una serie de atributos y
 métodos específicos, pero también comparten algunos atributos y métodos comunes.

Cada vuelo tiene un número de vuelo, una fecha de salida, una hora de salida, una fecha de llegada,
una hora de llegada, un aeropuerto de origen y un aeropuerto de destino. Los vuelos internacionales
tienen una lista de países que atraviesan, los vuelos nacionales tienen una lista de estados
que atraviesan y los vuelos regionales tienen una lista de ciudades que atraviesan.

Cada vuelo también tiene una lista de asientos disponibles y un método para reservar un asiento.
Además, cada vuelo tiene una lista de tripulantes, que puede incluir un piloto, copiloto, asistentes
de vuelo y personal de mantenimiento.

El objetivo del ejercicio es implementar las clases VueloInternacional, VueloNacional y VueloRegional,
 que heredan de la clase abstracta Vuelo. También se debe implementar la interfaz Reservable,
 que define el método para reservar un asiento.

Las clases VueloInternacional, VueloNacional y VueloRegional deben implementar los métodos
y atributos específicos de cada tipo de vuelo, así como los métodos y atributos heredados de
la clase abstracta Vuelo y de la interfaz Reservable.

Además, se debe implementar la clase Tripulante, que tiene un nombre, un apellido, una fecha
de nacimiento y una función en el vuelo. Las clases VueloInternacional, VueloNacional y VueloRegional
deben tener métodos para agregar y eliminar tripulantes.

Por último, se debe implementar la clase Aeropuerto, que tiene un nombre, una dirección
y una lista de vuelos programados.

La clase Aeropuerto debe tener métodos para agregar y
eliminar vuelos, y para buscar vuelos por número de vuelo, aeropuerto de origen, aeropuerto
de destino, fecha y hora de salida, y fecha y hora de llegada.
 */