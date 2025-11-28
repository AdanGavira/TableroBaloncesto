# TableroBaloncesto

TableroBaloncesto es una aplicación sobre un marcador de un partido de baloncesto en tiempo real. Tiene una interfaz para controlar la puntuación de los equipos y para visualizar los resultados. 

## Características
- Marcador en tiempo real
- Botones para la puntuación
- Patalla de resultados
- Interfaz con un diseño
- Navegación entre las dos actividades (MainActivity y ScoreActivity)

## Aplicación 
Tiene dos actividades: 
    - MainActivity: Pantalla principal del marcador 
    - ScoreActivity: Pantalla de resultados
    
## Tecnologías utilizadas
Java - Lenguaje de programación 
XML - Diseño de interfaces 
Data Binding - Acceso a las vistas 
Intents - Navegación entre las actividades 

## Estructura del proyecto

<img width="693" height="1104" alt="image" src="https://github.com/user-attachments/assets/12d0dfe0-af31-4b09-b5f0-2116457770d1" />

## Diseño de interfaces 

MainActivity
Podremos encontrarnos con un diseño simétrico para ambos equipos, unos botones de acción para la puntuación de cada equipo, con bordes, luego tendremos unos marcadores que irán reflejando el resultado de cada puntuación e irá sumando cada vez que encesten y por último unos colores temáticos como son el azul para el equipo local y el naranja para el equipo visitante. 

<img width="1140" height="1059" alt="image" src="https://github.com/user-attachments/assets/eda6b6bf-f427-4bea-bb07-b9b4ea833e10" />

ScoreActivity
En esta ventana podremos ver una presentación del resultado final del partido. También un mensaje del equipo ganador o de si ha habido un empate.

<img width="1131" height="1058" alt="image" src="https://github.com/user-attachments/assets/8142a33f-ceae-45b9-9f02-71216bdae016" />

<img width="1128" height="1052" alt="image" src="https://github.com/user-attachments/assets/920e7bc3-b6f7-422f-9bf1-adec4d68b312" />

<img width="1128" height="1072" alt="image" src="https://github.com/user-attachments/assets/803c1848-618f-4478-8331-5ebff450bea9" />

## Implementaciones

Hemos implementado el dataBinding en el build.gradle

<img width="288" height="105" alt="image" src="https://github.com/user-attachments/assets/3aeb2eca-5324-4a10-879f-b63d21f99815" />

Y también hemos implementado una navegación entre ventanas con un Intent. 

<img width="755" height="246" alt="image" src="https://github.com/user-attachments/assets/d3a46b71-06ef-4663-8dd4-02483bc6979c" />
Esto es en el MainActivity

<img width="1097" height="114" alt="image" src="https://github.com/user-attachments/assets/461d51c9-2396-4dc6-b1b5-4a623ad168f3" />
Esto en el ScoreActivity

    - Diseño responsivo con ConstraintLayout y LinearLayout
    - Gestión de puntuación (+1, +2, -1)
    - Validación de puntuación negativa 
    - Navegación entre ventanas
    - Data Binding configurado
    - Recursos en strings.xml y colors.xml
    - Constantes para claves de Intent
    - Código comentado 

## Mejoras Futuras

    - Agregar un botón de triples (+3)
    - Agregar cronómetro para contabilizar el tiempo de juego
    - Historial de partidos
    - Efectos de sonido
    - Exportar los resultados y guardarlas en una base de datos

 ## Desarrollo 

 - Autor: Adán Gavira Palacios 
 - Curso: 2º DAM, 1º Trimestre PMDM
