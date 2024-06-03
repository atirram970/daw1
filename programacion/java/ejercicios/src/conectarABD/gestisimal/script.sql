-- Para pasar a trabajar con sql en mysql shell
\sql
-- Para conectar con mysql shell
\connect root@localhost
-- Para crear una nueva base de datos
CREATE DATABASE gestisimal;
-- Para crear un usuario con permisos de lectura y modificación
CREATE USER 'tu_usuario'@'localhost' IDENTIFIED BY 'tu_contraseña';
GRANT ALL PRIVILEGES ON gestisimal.* TO 'tu_usuario'@'localhost';
FLUSH PRIVILEGES;

-- Para usar la base de datos que necesites
USE gestisimal;

--Para crear una tabla, en este caso concreto la del programa gestisimal
CREATE TABLE articulos (
  codigo VARCHAR(6) PRIMARY KEY,
  descr VARCHAR(50),
  pre_compra DECIMAL(5,2),
  pre_venta DECIMAL(5,2),
  stock INT
);

--Para cambiar la definición de los campos, en caso de haber creado la tabla con rangos erróneos
ALTER TABLE articulos MODIFY COLUMN pre_compra DECIMAL(5,2);
ALTER TABLE articulos MODIFY COLUMN pre_venta DECIMAL(5,2);
--Para insertar un producto a la tabla articulos
INSERT INTO articulos (codigo, descr, pre_compra, pre_venta, stock) 
	VALUES ('000001', 'Disco Duro 500GB', 40.0, 50.0, 3);
