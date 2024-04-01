### clonacion del proyecto

comando para clonar el repositorio 

```
git clone https://github.com/leidert11/filtro.git
```

## se debe ingresar a mysql para insertar el comando de creacion de la base de datos:

```sql
create database filtro;
```

## despues de insertar el comando se debe poner a correr el proyecto y automaticamente se crearan las tablas 

### POST http://localhost:8080/register

en este metodo se crea el usuario para asi con el metodo login logearse

**se inserta lo datos en formato json**

```
{
    "username": "leider",
    "password": "1234"
}
```
### POST http://localhost:8080/login

estos parametros se insertan en la seccion de query en insognia para que cree un token para el usuario


**parametros para utilizar el metodo se insertan en el query**
```
    "username": "leider",
    "password": "1234"
```
### GET http://localhost:8080/register

consulta para ver todos los usuarios que hay pero solo sirve si se le inserta en token en el apartado de header en la consulta

### DELETE http://localhost:8080/register/2

metodo para eliminar un usuario pero solo servira insertando el token en el apartado de header en insognia

### PUT http://127.0.0.1:8080/register/4

metodo para actualizar un usuario admin pero solo se puede hacer cuando esta el token en el header

```
{
  "id": 1,
  "username": "juan",
  "password": "4321"
}
```


### GET http://localhost:8080/contenido/crearContenido

metodo para crear un contenido audio visual primero se debe de insertar el token en el apartado de headers

```

Authorization : valor el token generado
```

**se inserta lo datos en formato json**

```

{
  "nombre": "string",
  "tipo": "string",
  "generos": [
    "accion"
  ],
  "estado": "PENDIENTE",
  "plataforma": "accion",
  "calificacion": 10,
  "comentario": "buena peli",
  "usuario_": 1
}
```

### GET http://localhost:8080/contenido/1

query para buscar un contenido audio visual ya creado

