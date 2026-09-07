# Juego de Combate por Turnos en Java

Proyecto desarrollado en Java donde el jugador controla un grupo de personajes que deben enfrentarse a uno o varios monstruos en un sistema de combate por turnos. El objetivo es derrotar al enemigo antes de que todos los personajes pierdan su vida.

## Descripción General

El juego comienza con una introducción que presenta la situación inicial y el monstruo (o monstruos) a enfrentar.  
A continuación se inicia el combate, que se ejecuta dentro de un bucle que continúa hasta que:

- El monstruo llega a 0 de vida.
- Todos los personajes mueren.

Según el resultado, el juego muestra un mensaje final distinto indicando victoria o derrota.

## Sistema de Estadísticas

Tanto los personajes como los monstruos cuentan con las siguientes estadísticas:

- Vida
- Fuerza
- Ataque
- Defensa
- Inteligencia
- Destreza
- Velocidad

Estas estadísticas influyen en el daño, el orden de turno y la efectividad de las acciones durante el combate.

## Tipos de Armas

Cada arma utiliza una estadística distinta para calcular el daño:

- Espadas / Hachas: basadas en Fuerza
- Arcos / Ballestas: basadas en Destreza
- Grimorios: basados en Inteligencia

## Flujo del Combate

1. Presentación de la introducción y del enemigo.
2. Inicio del bucle de combate.
3. Los personajes y el monstruo actúan según su Velocidad.
4. Se calcula el daño según el arma y la estadística correspondiente.
5. Se actualiza la vida de cada participante.
6. El bucle termina cuando uno de los bandos queda sin vida.
7. Se muestra el mensaje final correspondiente.
8. Se actualiza la vida de los jugadores si siguen vivos.

## Final del Juego

- Victoria: el monstruo es derrotado.
- Derrota: todos los personajes mueren.

Cada final muestra un mensaje distinto para cerrar la partida.

## Flujo de desarrollo

- [] Crear las entidades que van a interactuar.
- [] Definir personajes distintos: Guerrero, mago, arquero, por ejemplo
- [x] Crear las interfaces básicas de cada entidad.
- [] Diseñar mediante enums las armas con sus características y valores (Mirar lo de los planetas [aquí](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html))
- [] Hacer un método que ordene a los personajes por velocidad para gestionar los turnos.
- [] Hacer una clase principal donde poner el método main para entrar al programa.

## Anotaciones de lo que quiero decirte

el planteamiento es estupendo y muy bien desarrolado.Pero yo añadiria una cosa la defensa a los monstruos y el ataque.

E añadido una clase  IEntidades para q todos tengan estas caracteristicas y mi idea es q luego hereden las clases esto con un extends y cada clase tenga algo especifico mediante un @Override y asi vamos depurandolo todo un poco.
Esta todo comentado por si te parece bien .Como lo ves?.
En IEnemigo  e añadido todas las caracteristicas por si nos hacen falta mas tarde.

Dandole vueltas a la cosa creo que deberiamos ir pensando en meter los metodos de atacar y defender.que te parece que para calcular el daño sea el ataque del enemigo mas su caractristica principal(fuerza ,destreza...) menos la  defensa del jugador? y que si el jugador defiende en lugar de atacar el daño sea el ataque del enemigo mas su caracteristica principal(fuerza ,destreza...) menos defensa del jugador y menos durabilidad del arma o escudo? asi cuando el arma o escudo llegue a cero que se rompa.
