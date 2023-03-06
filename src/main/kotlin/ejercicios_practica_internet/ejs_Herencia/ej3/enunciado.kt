package ejercicios_practica_internet.ejs_Herencia.ej3

/*
Crea una interfaz llamada "IMonstruo" con un método llamado "atacar" que reciba
como parámetro otro objeto de tipo "IMonstruo"
y devuelva un valor entero que indique el daño infligido por el ataque.

Luego, crea una clase abstracta llamada "Monstruo" que implemente la interfaz
"IMonstruo" y tenga una propiedad "poderDeAtaque" de tipo entero.

A continuación, crea las siguientes clases que hereden de "Monstruo" y definan
 su propio comportamiento para el método "atacar": "Zombie" (que siempre inflige
 un daño igual a su poder de ataque), "Vampiro" (que inflige un
 daño igual a su poder de ataque si el otro monstruo no es también un
 vampiro, y la mitad de su poder de ataque si lo es) y "Licántropo"
 (que inflige un daño igual a su poder de ataque si ataca en forma de lobo,
 y la mitad de su poder de ataque si ataca en forma humana).

Finalmente, crea una clase "ArenaDeMonstruos" que tenga como propiedad un
arreglo de objetos de tipo "IMonstruo" y tenga un método "pelear" que simule
una serie de combates entre los monstruos de la arena, utilizando el método
"atacar" de cada monstruo. El método "pelear" deberá imprimir por pantalla
los resultados de cada combate.
 */