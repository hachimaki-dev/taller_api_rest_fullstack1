# Documentación de API REST de Productos

## Descripción general

Esta documentación describe los endpoints disponibles en la API REST de productos desarrollada con Spring Boot. La API permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre productos almacenados en una base de datos. Es el codigo base y de ejemplo para que puedan crear sus microservicios y enfrentar una correcta evaluación.

## Base URL

Todos los endpoints están precedidos por la siguiente URL base:

```
http://localhost:8080/api/v1
```

## Modelo de datos

El modelo de datos de un producto contiene los siguientes campos:

| Campo | Tipo | Descripción | Requerido |
|-------|------|-------------|-----------|
| id | Integer | Identificador único del producto generado automáticamente | No (generado) |
| nombre | String | Nombre del producto | Sí |
| categoria | String | Categoría a la que pertenece el producto | Sí |
| precio | Double | Precio del producto | Sí |
| descripcion | String | Descripción detallada del producto (máx. 1000 caracteres) | No |

## Endpoints disponibles

### 1. Crear un nuevo producto

Permite registrar un nuevo producto en el sistema.

- **URL**: `/product`
- **Método**: `POST`
- **Encabezados**:
  - Content-Type: application/json
- **Cuerpo de la solicitud**:

```json
{
    "nombre": "Nombre del producto",
    "categoria": "Categoría del producto",
    "precio": 99.99,
    "descripcion": "Descripción detallada del producto"
}
```

- **Respuesta exitosa**:
  - **Código**: 201 (Created)
  - **Contenido**:

```json
{
    "id": 1,
    "nombre": "Nombre del producto",
    "categoria": "Categoría del producto",
    "precio": 99.99,
    "descripcion": "Descripción detallada del producto"
}
```

### 2. Obtener todos los productos

Recupera la lista completa de productos almacenados en el sistema.

- **URL**: `/products`
- **Método**: `GET`
- **Respuesta exitosa**:
  - **Código**: 200 (OK)
  - **Contenido**:

```json
[
    {
        "id": 1,
        "nombre": "Producto 1",
        "categoria": "Categoría A",
        "precio": 99.99,
        "descripcion": "Descripción del producto 1"
    },
    {
        "id": 2,
        "nombre": "Producto 2",
        "categoria": "Categoría B",
        "precio": 149.99,
        "descripcion": "Descripción del producto 2"
    }
]
```

### 3. Obtener un producto por ID

Recupera la información de un producto específico según su ID.

- **URL**: `/product/{id}`
- **Método**: `GET`
- **Parámetros de ruta**:
  - `id`: Identificador único del producto
- **Respuesta exitosa**:
  - **Código**: 200 (OK)
  - **Contenido**:

```json
{
    "id": 1,
    "nombre": "Producto 1",
    "categoria": "Categoría A",
    "precio": 99.99,
    "descripcion": "Descripción del producto 1"
}
```

- **Respuesta de error**:
  - **Código**: 404 (Not Found)
  - **Contenido**: Sin contenido

### 4. Filtrar productos por categoría

Recupera una lista de productos que pertenecen a una categoría específica.

- **URL**: `/products/categoria/{categoria}`
- **Método**: `GET`
- **Parámetros de ruta**:
  - `categoria`: Nombre de la categoría por la que filtrar
- **Respuesta exitosa**:
  - **Código**: 200 (OK)
  - **Contenido**:

```json
[
    {
        "id": 1,
        "nombre": "Producto 1",
        "categoria": "Tecnología",
        "precio": 99.99,
        "descripcion": "Descripción del producto 1"
    },
    {
        "id": 3,
        "nombre": "Producto 3",
        "categoria": "Tecnología",
        "precio": 199.99,
        "descripcion": "Descripción del producto 3"
    }
]
```

### 5. Actualizar un producto existente

Permite modificar los datos de un producto existente identificado por su ID.

- **URL**: `/product/{id}`
- **Método**: `PUT`
- **Parámetros de ruta**:
  - `id`: Identificador único del producto a actualizar
- **Encabezados**:
  - Content-Type: application/json
- **Cuerpo de la solicitud**:

```json
{
    "nombre": "Nombre actualizado",
    "categoria": "Categoría actualizada",
    "precio": 129.99,
    "descripcion": "Descripción actualizada del producto"
}
```

- **Respuesta exitosa**:
  - **Código**: 200 (OK)
  - **Contenido**:

```json
{
    "id": 1,
    "nombre": "Nombre actualizado",
    "categoria": "Categoría actualizada",
    "precio": 129.99,
    "descripcion": "Descripción actualizada del producto"
}
```

- **Respuesta de error**:
  - **Código**: 404 (Not Found)
  - **Contenido**: Sin contenido

### 6. Eliminar un producto

Permite eliminar un producto existente del sistema.

- **URL**: `/product/{id}`
- **Método**: `DELETE`
- **Parámetros de ruta**:
  - `id`: Identificador único del producto a eliminar
- **Respuesta exitosa**:
  - **Código**: 204 (No Content)
  - **Contenido**: Sin contenido
- **Respuesta de error**:
  - **Código**: 404 (Not Found)
  - **Contenido**: Sin contenido

## Guía para pruebas con Thunder Client

Para probar los endpoints de esta API utilizando Thunder Client, siga los siguientes pasos:

### Configuración inicial

1. Instale la extensión Thunder Client desde el marketplace de Visual Studio Code.
2. Asegúrese de que su aplicación Spring Boot esté en ejecución localmente.

### Probar endpoint de creación (POST)

1. Cree una nueva solicitud en Thunder Client.
2. Configure el método como `POST`.
3. Ingrese la URL: `http://localhost:8080/api/v1/product`.
4. En la pestaña "Body", seleccione formato "JSON" e ingrese un objeto de producto válido.
5. En la pestaña "Headers", asegúrese de incluir `Content-Type: application/json`.
6. Ejecute la solicitud y verifique que reciba un código de estado 201 y los datos del producto creado.

### Probar endpoints de consulta (GET)

1. Cree una nueva solicitud en Thunder Client.
2. Configure el método como `GET`.
3. Ingrese la URL para el endpoint deseado:
   - Para todos los productos: `http://localhost:8080/api/v1/products`
   - Para un producto específico: `http://localhost:8080/api/v1/product/1` (donde 1 es el ID)
   - Para productos por categoría: `http://localhost:8080/api/v1/products/categoria/Tecnología`
4. Ejecute la solicitud y verifique la respuesta recibida.

### Probar endpoint de actualización (PUT)

1. Cree una nueva solicitud en Thunder Client.
2. Configure el método como `PUT`.
3. Ingrese la URL: `http://localhost:8080/api/v1/product/1` (donde 1 es el ID del producto a actualizar).
4. En la pestaña "Body", seleccione formato "JSON" e ingrese un objeto con los datos actualizados.
5. En la pestaña "Headers", asegúrese de incluir `Content-Type: application/json`.
6. Ejecute la solicitud y verifique que reciba un código de estado 200 y los datos actualizados.

### Probar endpoint de eliminación (DELETE)

1. Cree una nueva solicitud en Thunder Client.
2. Configure el método como `DELETE`.
3. Ingrese la URL: `http://localhost:8080/api/v1/product/1` (donde 1 es el ID del producto a eliminar).
4. Ejecute la solicitud y verifique que reciba un código de estado 204.
5. Para confirmar la eliminación, realice una solicitud GET al mismo recurso y verifique que reciba un código 404.