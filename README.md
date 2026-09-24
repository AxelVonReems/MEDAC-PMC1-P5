# MEDAC - Gestión de personal y fichajes de clubes de fútbol

## Descripción general

Este proyecto fue desarrollado como ejercicio académico dentro del ciclo formativo de Grado Superior en Desarrollo de Aplicaciones Web (FPGS DAW), con el objetivo principal de reforzar la programación orientada a objetos (POO) y el diseño de sistemas mediante herencia, abstracción, interfaces y segregación de responsabilidades.

La aplicación modela una estructura básica de gestión de un club de fútbol, permitiendo representar jugadores, entrenadores, presidentes y equipos, así como el flujo de aprobación de traspasos entre clubes. El sistema busca resolver la necesidad de organizar la información de los empleados del club y gestionar decisiones de negocio relacionadas con movimientos de jugadores de forma estructurada y mantenible.

## Objetivo técnico

El proyecto se centra en aplicar los fundamentos de la Programación Orientada a Objetos, especialmente:

- Herencia profunda entre tipos de empleados del club.
- Abstracción mediante clases abstractas.
- Polimorfismo y reutilización de comportamiento común.
- Interfaces para definir contratos de comportamiento compartido.
- Separación de responsabilidades entre entidades y lógica de negocio.

La implementación se desarrolló sin ayuda de IA con el fin de consolidar los conceptos de diseño y análisis orientado a objetos desde la práctica.

## Arquitectura y diseño

La arquitectura del proyecto está organizada por paquetes, cada uno con una responsabilidad clara dentro del dominio del problema.

### 1. Modelo de empleados

La clase abstracta `Employee` representa la base común para todos los miembros del club que comparten atributos como nombre, fecha de nacimiento y país de origen. Esta clase encapsula la información general y define el comportamiento abstracto `showInfo()`, que debe implementarse en cada subclase.

A partir de esta base se crean los tipos específicos del sistema:

- `Player`: representa al futbolista y gestiona su posición, dorsal, club actual y estado de traspaso.
- `Coach`: representa al entrenador y contiene información específica del cuerpo técnico, como la formación.
- `President`: representa a la dirección del club y gestiona decisiones relacionadas con la aprobación de operaciones.
- `Club`: encapsula la estructura del equipo, su plantilla de jugadores, entrenador y presidente.

Este diseño permite reutilizar atributos y métodos comunes, mientras que cada subclase añade comportamiento propio y específico del rol dentro del club.

### 2. Interfaces y segregación de responsabilidades

La interfaz `TransferManager` define el contrato para la gestión de decisiones sobre traspasos. Mediante esta interfaz, tanto `Coach` como `President` implementan la lógica de aprobación y rechazo de transferencias, respetando una misma firma de métodos:

- `approveTransfer(Player player)`
- `rejectTransfer(Player player)`

Esto garantiza que ambos roles del club puedan participar en el mismo flujo de negocio sin duplicar la estructura base del sistema. La lógica de validación y permisos queda localizada en las clases correspondientes, favoreciendo la claridad y la extensibilidad.

### 3. Flujo de traspasos

El proyecto incorpora un flujo de negocio que refleja la realidad de una negociación entre clubes:

1. El jugador solicita un traspaso a otro club.
2. El entrenador valida la solicitud. Puede aprobarla o rechazarla.
3. Si el entrenador aprueba, el presidente revisa la operación.
4. El presidente puede aprobar o rechazar el traspaso.
5. Si es aprobada por ambas instancias, se ejecuta el traspaso y el jugador cambia de club.

Además, el sistema contempla estados de traspaso como `REQUESTED`, `APPROVED_BY_COACH`, `REJECTED_BY_COACH`, `APPROVED_BY_PRESIDENT` y `REJECTED_BY_PRESIDENT`, lo que permite un control claro del historial de la operación.

### 4. Ejercicios académicos incluidos

El proyecto conserva la lógica de dos ejercicios desarrollados en la asignatura:

#### PMC1-P5. Gestionando fichajes

Se implementaron las clases de `Player`, `Coach`, `President` y `Club`, así como la lógica para gestionar fichajes y traspasos entre equipos. La operación contempla:

- Solicitud de traspaso por parte del jugador.
- Validación por parte del entrenador.
- Validación por parte del presidente.
- Cambio real de club y actualización de listas de jugadores.
- Control de los estados de transferencia.
- Restricción: entrenadores y presidentes solo pueden gestionar traspasos de jugadores de su propio club.

#### PMC1-P6. Organizando fichajes

Se introdujo la clase abstracta `Employee` con el método abstracto `showInfo()`, y se heredó por los distintos tipos de empleado del club. Asimismo, se implementó la interfaz `TransferManager` para unificar la gestión de decisiones de aprobación y rechazo por parte del cuerpo técnico y la dirección del club.

## Estructura del proyecto

El proyecto está organizado en los siguientes paquetes principales:

- `com.main`: punto de entrada de la aplicación.
- `com.employee`: modelo abstracto base para los empleados.
- `com.player`: gestión de jugadores y estados de traspaso.
- `com.coach`: lógica relacionada con entrenadores.
- `com.president`: lógica relacionada con presidentes.
- `com.club`: representación de clubes y gestión de plantillas.
- `com.transferManager`: contrato de gestión de transferencias.
- `com.data`: datos iniciales para la creación de instancias de prueba.

## Tecnologías

- Java

La aplicación está desarrollada en Java, utilizando clases, herencia, interfaces y estructuras de datos básicas para representar el dominio del problema.

## Instalación y ejecución

### Requisitos

- JDK instalado y configurado en el sistema.
- Un entorno de desarrollo compatible con Java, como IntelliJ IDEA, Eclipse o VS Code.

### Clonar el repositorio

```bash
git clone https://github.com/AxelVonReems/MEDAC-PMC1-P5.git
cd MEDAC-PMC1-P5
```

### Compilar el proyecto

Desde la raíz del proyecto, ejecuta:

```bash
javac -d bin $(find src -name "*.java")
```

Este comando compila todos los archivos Java dentro de `src` y genera la salida en la carpeta `bin`, manteniendo la estructura de paquetes del proyecto.

### Ejecutar la aplicación

```bash
java -cp bin com.main.App
```

El comando anterior ejecuta la clase principal `com.main.App`, que inicializa la simulación del sistema de gestión del club.

### Ejecutar desde un IDE

1. Importa el proyecto como proyecto Java o workspace.
2. Asegúrate de que la carpeta `src` esté configurada como source folder.
3. Localiza la clase `com.main.App`.
4. Ejecuta `main` como aplicación Java.

## Resultado esperado

Al ejecutar el programa, se crean distintas instancias de clubes, jugadores, entrenadores y presidentes, se muestran sus datos básicos, se simulan decisiones de traspaso y se comprueba el cambio de plantilla y el estado del flujo de transferencia.

## Conclusión

Este proyecto representa una aplicación didáctica y clara de la programación orientada a objetos, especialmente enfocada en la modelización de un dominio real: la gestión deportiva y el flujo de decisiones relacionado con el traspaso de jugadores. El uso de clases abstractas e interfaces permite un diseño más limpio, extensible y profesional, reforzando los conocimientos adquiridos durante el desarrollo del proyecto.