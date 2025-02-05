# MEDAC-PMC1-P5

## PMC1-P5. Gestionando fichajes

En este ejercicio implementamos las clases de jugador (Player), entrenador (Coach), presidente (President) y  equipo (Club).

Los jugadores pueden hacer traspasos a otros clubes. Para eso hay que seguir los siguientes pasos:
* solicitar el traspaso - cambiar estado de jugador de "WITHOUT_REQUEST" a "REQUESTED";
* verificar el traspaso con entrenador - cambiar estado de jugador de "REQUESTED" a "APPROVED_BY_COACH" o "REJECTED_BY_COACH";
* si el traspaso ha sido aprobado por el entrenador lo puede verificar el presidente - cambiar estado de jugador de "APPROVED_BY_COACH" a "APPROVED_BY_PRESIDENT" o "REJECTED_BY_PRESIDENT";
* si el traspaso ha sido aprobado por el presidente, se puede realizar el traspaso - eliminar al jugador de la lista de jugadores de su equipo corriente y añadirlo a la lista del equipo nuevo.

Los entrenadores y presidentes pueden manejar traspasos solo de los jugadores que pertenecen a su club.

Los equipos pueden resetear todos los estados de traspaso de sus jugadores.
