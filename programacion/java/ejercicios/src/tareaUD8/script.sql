-- Para pasar a trabajar con sql en mysql shell
\sql

-- Para conectar con mysql shell
\connect root@localhost

-- Para crear una nueva base de datos
CREATE DATABASE concesionarioBD;

-- Para crear un usuario con permisos de lectura y modificación
CREATE USER 'atirram970'@'localhost' IDENTIFIED BY '2104';
GRANT ALL PRIVILEGES ON concesionarioBD.* TO 'atirram970'@'localhost';
FLUSH PRIVILEGES;

-- Para usar la base de datos concesionarioBD
USE concesionarioBD;

-- Para crear la tabla vehiculos
CREATE TABLE vehiculos (
    matricula VARCHAR(7) PRIMARY KEY,
    marca VARCHAR(50),
    numKM INT,
    fechaMatriculacion DATE,
    descripcion VARCHAR(255),
    precio DOUBLE,
    nombrePropietario VARCHAR(75),
    dniPropietario VARCHAR(9)
);