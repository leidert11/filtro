create database if not exists filtro;

use filtro;

CREATE TABLE usuarios (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    correoElectronico VARCHAR(255) NOT NULL
);

CREATE TABLE contenidos_audiovisuales (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    generos VARCHAR(255) NOT NULL,
    estado VARCHAR(20) NOT NULL,
    plataforma VARCHAR(50),
    calificacion DECIMAL(4, 2),
    comentario VARCHAR(500),
    usuario_id BIGINT,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

CREATE TABLE generos (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL
);

CREATE TABLE plataformas (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL
);

CREATE TABLE tipos_contenido (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL
);

CREATE TABLE comentarios (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    texto TEXT NOT NULL
);

CREATE TABLE estados_visualizacion (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(20) NOT NULL
);

