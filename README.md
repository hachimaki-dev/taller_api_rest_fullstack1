# Instrucciones de Evaluación – Entrega por Encargo

## Contexto General

En esta etapa del proyecto trabajarán en equipo (máximo **3** estudiantes) para desarrollar un sistema basado en arquitectura de microservicios utilizando Spring Boot, JPA y una base de datos PostgreSQL en Supabase.

Cada integrante del grupo será responsable de un microservicio completo, y será evaluado en base a ese trabajo.

## Objetivo Principal

Construir una línea base funcional del sistema, donde cada microservicio tenga capacidad de:

- Crear un recurso
- Listar todos los recursos
- Buscar un recurso por ID
- Actualizar un recurso por ID
- Eliminar un recurso por ID

Esto debe estar completamente operativo desde ThunderClient, y debe conectarse a la base de datos Supabase PostgreSQL usando JPA/Hibernate.

## Distribución del trabajo

Cada integrante debe crear un microservicio diferente y funcional. Ejemplos de microservicios posibles (según el caso que estén desarrollando):

- Autenticación de usuarios
- Gestión de productos o vitrina
- Registro y gestión de ventas
- Administración de stock o inventario
- Creación de cuentas o perfiles de usuario
- Procesamiento de pedidos
- Gestión de reviews o comentarios
- Otros que tengan sentido para el sistema

**Importante**: No se puede repetir el mismo tipo de microservicio entre compañeros. Si son 3 personas, debe haber 3 microservicios distintos.

## Requisitos mínimos de cada microservicio

Cada microservicio debe incluir:

1. Un proyecto individual de Spring Boot con su propia configuración de pom.xml
2. Una conexión activa y funcional a Supabase PostgreSQL usando JPA
3. Un modelo de datos definido (una entidad concreta)
4. Un CRUD completo:
   - POST para crear
   - GET para listar todos
   - GET por ID
   - PUT para actualizar por ID
   - DELETE por ID
5. Documentación breve de las rutas (puede ser un archivo README.md o una colección de ThunderClient exportada)

## Buenas prácticas que se evaluarán

- Uso correcto de Maven: configuración del pom.xml, dependencias bien gestionadas.
- Código limpio, modular, mantenible y con separación de responsabilidades (Controller, Service, Repository)
- Git bien utilizado: repositorio creado, commits frecuentes con mensajes claros, ramas si es necesario, y push al repositorio remoto.
- Capacidad de explicar qué hace tu microservicio y cómo se comunica con otros (aunque por ahora la integración completa puede ser mínima)

## Entregables

Para esta entrega se debe presentar:

- El proyecto Spring Boot de cada integrante (repositorio individual o carpeta separada)
- Conexión probada y funcional con Supabase
- CRUD operativo con ThunderClient
- Evidencia de uso de Git
- Documento grupal (o README global) que explique qué hace cada microservicio, quién lo hizo, y cómo se integran entre sí

## Evaluación

Esta entrega representa el 40% de la nota de la evaluación parcial N°2. Será evaluada en base a:

- Diseño técnico del microservicio y su arquitectura interna
- Desarrollo funcional del CRUD
- Aplicación de buenas prácticas con Spring, Maven y Git
- Coherencia con el sistema general del grupo

Además, cada estudiante será evaluado individualmente en la presentación oral posterior, donde deberá justificar y explicar su microservicio.

## Tiempo y formato

- **Tiempo asignado**: 7 horas pedagógicas (en clase)
- **Formato de trabajo**: Grupal (máximo 3 personas), evaluación individual del trabajo realizado
- **Formato de entrega**: Subida a AVA en fecha indicada (proyecto + documentación)

## Recomendaciones finales

- Si nunca usaste Supabase, empieza por configurar la base de datos y probar conexión desde Spring.
- Usa ThunderClient desde el inicio para probar cada endpoint.
- Haz commits frecuentes, guarda tu trabajo y comunícate con tu equipo.


# ¿Cómo se va a evaluar?

Todo esta en AVA, pero aun asi:

# Pauta de Evaluación - Proyecto de Microservicios

## Información General
- **Asignatura**: Desarrollo de APIs REST con Spring Boot
- **Evaluación**: Proyecto de Microservicios
- **Porcentaje de Exigencia**: 60%
- **Ponderación**: 40% de la Evaluación Parcial N°2

## Tabla de Evaluación

### Situación Evaluativa 1: ENCARGO. INFORME CON EVALUACIÓN GRUPAL (40%)

| Indicador de Logro (IL) | Indicador de Evaluación (IE) | Puntaje Máximo | Puntaje Obtenido |
|-------------------------|------------------------------|----------------|------------------|
| **IL2.1**: Diseña un proyecto utilizando herramientas y frameworks específicos para microservicios (6%) | IE2.1.1. Diseña un proyecto utilizando herramientas y frameworks específicos para microservicios (Spring, Maven), demostrando habilidades en la definición de una línea base de trabajo y la construcción de piezas de backend. | 6 | |
| **IL2.2**: Configura un proyecto de microservicios utilizando herramientas y frameworks seleccionados, ocupando control de versiones Git (6%) | IE2.2.1. Configura un proyecto de microservicios utilizando herramientas y frameworks seleccionados, ocupando control de versiones Git, incluyendo la comprensión de la arquitectura interna de un microservicio y su integración en un entorno de desarrollo fullstack. | 6 | |
| **IL2.3**: Desarrolla componentes de backend dentro de un proyecto de microservicios, aplicando buenas prácticas (14%) | IE2.3.1: Desarrolla componentes de backend dentro de un proyecto de microservicios, aplicando buenas prácticas de diseño y arquitectura, utilizando herramientas como Spring y Maven, trabajando colaborativamente con Git, garantizando la funcionalidad del código generado. | 14 | |
| **IL3.1**: Desarrolla componentes de microservicio utilizando tecnologías del framework de backend (6%) | IE3.1.1: Desarrolla componentes de microservicio utilizando tecnologías del framework de backend (como JPA, ORM, etc.) para realizar operaciones CRUD con datos provenientes de Postman/ThunderClient. | 6 | |
| **IL3.2**: Implementa comunicación RESTful entre componentes de microservicio (8%) | IE3.2.1: Implementa comunicación RESTful entre componentes de microservicio, asegurando una integración coherente entre ellos, y utilizando herramientas como Postman/ThunderClient para validar y consumir servicios del backend. | 8 | |
| **Total Situación Evaluativa 1** | | **40** | |

### Situación Evaluativa 2: PRESENTACIÓN. DESEMPEÑO INDIVIDUAL (60%)

| Indicador de Logro (IL) | Indicador de Evaluación (IE) | Puntaje Máximo | Puntaje Obtenido |
|-------------------------|------------------------------|----------------|------------------|
| **IL2.1**: Diseña un proyecto utilizando herramientas y frameworks específicos para microservicios (9%) | IE2.1.2: Responde las 2 preguntas formuladas por el docente, dando cuenta que domina el diseño del proyecto de microservicios utilizando Spring. | 3 | |
| | IE2.1.3: Explica el uso de Maven para gestionar las dependencias y el ciclo de vida del proyecto. | 3 | |
| | IE2.1.4: Detalla la línea base de trabajo y la construcción de componentes backend. | 3 | |
| **IL2.2**: Configura un proyecto de microservicios utilizando herramientas y frameworks seleccionados (6%) | IE2.2.2: Describe la configuración del proyecto de microservicios utilizando herramientas y frameworks específicos (como Spring y Maven) y el uso del control de versiones con Git. | 3 | |
| | IE2.2.3: Demuestra comprensión de la arquitectura interna de los microservicios y su integración en un entorno de desarrollo fullstack. | 3 | |
| **IL2.3**: Desarrolla componentes de backend dentro de un proyecto de microservicios, aplicando buenas prácticas (24%) | IE2.3.2: Expone sobre la aplicación de buenas prácticas de diseño y arquitectura en el desarrollo de componentes de backend. | 3 | |
| | IE2.3.3: Responde las 2 preguntas formuladas por el docente, dando cuenta que domina el diseño del proyecto de microservicios utilizando Spring. | 9 | |
| | IE2.3.4: Muestra competencia en el uso de herramientas y frameworks como Spring y Maven para construir componentes de backend. | 9 | |
| | IE2.3.5: Demuestra habilidades de trabajo colaborativo utilizando Git. | 3 | |
| **IL3.1**: Desarrolla componentes de microservicio utilizando tecnologías del framework de backend (9%) | IE3.1.2: Describe el desarrollo de componentes de microservicio utilizando tecnologías del framework de backend para realizar operaciones CRUD. | 9 | |
| **IL3.2**: Implementa comunicación RESTful entre componentes de microservicio (12%) | IE3.2.2: Explica la implementación de comunicación RESTful entre diferentes componentes de microservicio. | 9 | |
| | IE3.2.3: Muestra cómo validó la comunicación entre microservicios usando Postman/ThunderClient. | 3 | |
| **Total Situación Evaluativa 2** | | **60** | |

## TOTAL PUNTAJE | 100 | |

## Escala de Notas (60% de exigencia)

| Porcentaje | Nota |
|------------|------|
| 100% | 7.0 |
| 95% | 6.7 |
| 90% | 6.4 |
| 85% | 6.0 |
| 80% | 5.7 |
| 75% | 5.4 |
| 70% | 5.0 |
| 65% | 4.7 |
| 60% | 4.0 |
| 55% | 3.7 |
| 50% | 3.4 |
| 45% | 3.0 |
| 40% | 2.7 |
| 35% | 2.4 |
| 30% | 2.0 |
| 25% | 1.7 |
| 20% | 1.4 |
| 15% | 1.0 |

## Ejemplo de Evaluación Completada

### Estudiante: Juan Pérez
### Microservicio: Gestión de Usuarios

### Situación Evaluativa 1: ENCARGO (40%)

| Indicador de Evaluación (IE) | Puntaje Máximo | Puntaje Obtenido | Observaciones |
|------------------------------|----------------|------------------|---------------|
| IE2.1.1. Diseño del proyecto | 6 | 5 | Proyecto bien estructurado con Spring Boot pero falta mejorar la definición de la línea base |
| IE2.2.1. Configuración y Git | 6 | 6 | Excelente configuración y uso de Git con commits descriptivos |
| IE2.3.1. Desarrollo componentes backend | 14 | 12 | Buenas prácticas aplicadas, falta mejorar la modularidad del código |
| IE3.1.1. Desarrollo con JPA/ORM | 6 | 5 | Implementa correctamente JPA pero con algunas consultas no optimizadas |
| IE3.2.1. Comunicación RESTful | 8 | 7 | Buena implementación de API REST, falta mejorar documentación de endpoints |
| **Total Situación Evaluativa 1** | **40** | **35** | |

### Situación Evaluativa 2: PRESENTACIÓN (60%)

| Indicador de Evaluación (IE) | Puntaje Máximo | Puntaje Obtenido | Observaciones |
|------------------------------|----------------|------------------|---------------|
| IE2.1.2. Respuestas sobre diseño | 3 | 3 | Respuestas completas y precisas |
| IE2.1.3. Explicación de Maven | 3 | 2 | Comprende Maven pero con algunas imprecisiones |
| IE2.1.4. Detalle de línea base | 3 | 2 | Explicación clara pero incompleta |
| IE2.2.2. Descripción de configuración | 3 | 3 | Excelente descripción técnica |
| IE2.2.3. Comprensión arquitectura | 3 | 2 | Conoce la arquitectura con algunas imprecisiones |
| IE2.3.2. Exposición buenas prácticas | 3 | 3 | Dominio completo de buenas prácticas |
| IE2.3.3. Respuestas sobre diseño | 9 | 7 | Respuestas adecuadas con algunas imprecisiones |
| IE2.3.4. Competencia en herramientas | 9 | 8 | Buen dominio de Spring y Maven |
| IE2.3.5. Habilidades Git | 3 | 3 | Excelente manejo de Git |
| IE3.1.2. Descripción desarrollo | 9 | 7 | Buena explicación con algunos detalles técnicos imprecisos |
| IE3.2.2. Explicación REST | 9 | 8 | Muy buena comprensión de REST |
| IE3.2.3. Validación con Postman | 3 | 3 | Demostración práctica excelente |
| **Total Situación Evaluativa 2** | **60** | **51** | |

### PUNTAJE TOTAL | 100 | 86 |

### Cálculo de la Nota Final:
- Porcentaje obtenido: 86% (86 puntos de 100)
- Según la escala al 60% de exigencia: **Nota final: 6.1**

## Retroalimentación General:

El estudiante demuestra un buen dominio de Spring Boot y las tecnologías asociadas para el desarrollo de microservicios. Su microservicio de Gestión de Usuarios muestra una implementación sólida con operaciones CRUD completas y una correcta integración con la base de datos PostgreSQL en Supabase.

### Fortalezas:
- Excelente manejo de Git con commits descriptivos y frecuentes
- Buena implementación de la API REST con endpoints funcionales
- Demostración práctica completa usando ThunderClient

### Aspectos a mejorar:
- Optimizar algunas consultas JPA para mejor rendimiento
- Mejorar la modularidad del código para facilitar el mantenimiento
- Completar la documentación de los endpoints REST