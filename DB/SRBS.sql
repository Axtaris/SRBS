-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.1.10-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.3.0.5056
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para sisprova
CREATE DATABASE IF NOT EXISTS `sisprova` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `sisprova`;

-- Volcando estructura para tabla sisprova.centro
CREATE TABLE IF NOT EXISTS `centro` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `abreviatura` varchar(10) DEFAULT NULL,
  `descripcion` varchar(250) DEFAULT NULL,
  `idcomplejo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idcomplejo` (`idcomplejo`),
  CONSTRAINT `centro_ibfk_1` FOREIGN KEY (`idcomplejo`) REFERENCES `complejo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla sisprova.centro: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `centro` DISABLE KEYS */;
INSERT INTO `centro` (`id`, `nombre`, `abreviatura`, `descripcion`, `idcomplejo`) VALUES
	(1, 'CENTRO DE ELECTRICIDAD Y AUTOMATIZACION INDUSTRIAL', 'CEAI', 'CEAI', 1),
	(2, 'CENTRO DE GESTION TECNOLOGICA DE SERVICIOS', 'CGTS', 'CGTS', 1),
	(3, 'CENTRO NACIONAL DE ASISTENCIA TECNICA A LA INDUSTRIA', 'ASTIN', 'ASTIN', 1),
	(4, 'CENTRO DE DISE?O TECOLOGICO INDUSTRIAL', 'CDGI', 'CDGI', 1);
/*!40000 ALTER TABLE `centro` ENABLE KEYS */;

-- Volcando estructura para tabla sisprova.color
CREATE TABLE IF NOT EXISTS `color` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla sisprova.color: ~10 rows (aproximadamente)
/*!40000 ALTER TABLE `color` DISABLE KEYS */;
INSERT INTO `color` (`id`, `nombre`) VALUES
	(1, 'AZUL'),
	(2, 'ROJO'),
	(3, 'NEGRO'),
	(4, 'GRIS'),
	(5, 'NARANJA'),
	(6, 'VERDE'),
	(7, 'BLANCO'),
	(8, 'ROSADO'),
	(9, 'PLATEADO'),
	(10, 'CAF');
/*!40000 ALTER TABLE `color` ENABLE KEYS */;

-- Volcando estructura para tabla sisprova.complejo
CREATE TABLE IF NOT EXISTS `complejo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `resolucion` varchar(150) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `director` varchar(250) DEFAULT NULL,
  `direccion` varchar(200) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `logo` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla sisprova.complejo: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `complejo` DISABLE KEYS */;
INSERT INTO `complejo` (`id`, `resolucion`, `nombre`, `director`, `direccion`, `telefono`, `logo`) VALUES
	(1, 'R000496', 'SALOMIA', 'CESAR ALBERTO TRUJILLO SOLARTE', 'CALLE 52 # 2BI9 - 15', '4315800 - 4315819', '/im?genes/logo.png');
/*!40000 ALTER TABLE `complejo` ENABLE KEYS */;

-- Volcando estructura para tabla sisprova.equipo
CREATE TABLE IF NOT EXISTS `equipo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `serial` varchar(50) NOT NULL,
  `descripcion` varchar(250) DEFAULT NULL,
  `idusuario` int(11) DEFAULT NULL,
  `idtipo_equipo` int(11) DEFAULT NULL,
  `idestado` int(11) DEFAULT NULL,
  `idmarca` int(11) DEFAULT NULL,
  `idcolor` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idtipo_equipo` (`idtipo_equipo`),
  KEY `idusuario` (`idusuario`),
  KEY `idestado` (`idestado`),
  KEY `idmarca` (`idmarca`),
  KEY `idcolor` (`idcolor`),
  CONSTRAINT `equipo_ibfk_1` FOREIGN KEY (`idtipo_equipo`) REFERENCES `tipo_equipo` (`id`),
  CONSTRAINT `equipo_ibfk_2` FOREIGN KEY (`idusuario`) REFERENCES `usuario` (`id`),
  CONSTRAINT `equipo_ibfk_3` FOREIGN KEY (`idestado`) REFERENCES `estado` (`id`),
  CONSTRAINT `equipo_ibfk_4` FOREIGN KEY (`idmarca`) REFERENCES `marca` (`id`),
  CONSTRAINT `equipo_ibfk_5` FOREIGN KEY (`idcolor`) REFERENCES `color` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla sisprova.equipo: ~8 rows (aproximadamente)
/*!40000 ALTER TABLE `equipo` DISABLE KEYS */;
INSERT INTO `equipo` (`id`, `nombre`, `serial`, `descripcion`, `idusuario`, `idtipo_equipo`, `idestado`, `idmarca`, `idcolor`) VALUES
	(1, 'HP', '343454df', 'PC CON CARGADOR Y MOUSE', 2, 1, 1, 1, 8),
	(2, 'DELL', '32334cdg', 'PC CON CARGADOR Y MOUSE', 3, 1, 1, 2, 7),
	(3, 'LENOVO', '234fr4e4', 'PC CON CARGADOR', 4, 1, 1, 3, 6),
	(4, 'HP', '1223wd43r', 'PC CON CARGADOR', 5, 1, 1, 4, 5),
	(5, 'LENOVO', '334eew5432', 'PC CON CARGADOR Y MOUSE', 7, 1, 1, 5, 4),
	(6, 'HP', '2ewDS234FE5', 'PC CON CARGADOR Y MOUSE', 10, 1, 1, 6, 3),
	(7, 'ACER', '123wsaqa232w', 'PC CON CARGADOR', 11, 1, 1, 7, 2),
	(8, 'LENOVO', '123wd24f4', 'PC CON CARGADOR Y MOUSE', 13, 1, 1, 8, 1);
/*!40000 ALTER TABLE `equipo` ENABLE KEYS */;

-- Volcando estructura para tabla sisprova.estado
CREATE TABLE IF NOT EXISTS `estado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla sisprova.estado: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
INSERT INTO `estado` (`id`, `nombre`) VALUES
	(1, 'ACTIVO'),
	(2, 'INACTIVO');
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;

-- Volcando estructura para tabla sisprova.ingreso_salida
CREATE TABLE IF NOT EXISTS `ingreso_salida` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_hora_ingreso` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fecha_hora_salida` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `idusuario` int(11) DEFAULT NULL,
  `idequipo` int(11) DEFAULT NULL,
  `idvehiculo` int(11) DEFAULT NULL,
  `idoperadoringreso` int(11) DEFAULT NULL,
  `idoperadorsalida` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idusuario` (`idusuario`),
  KEY `idequipo` (`idequipo`),
  KEY `idvehiculo` (`idvehiculo`),
  CONSTRAINT `ingreso_salida_ibfk_1` FOREIGN KEY (`idusuario`) REFERENCES `usuario` (`id`),
  CONSTRAINT `ingreso_salida_ibfk_2` FOREIGN KEY (`idequipo`) REFERENCES `equipo` (`id`),
  CONSTRAINT `ingreso_salida_ibfk_3` FOREIGN KEY (`idvehiculo`) REFERENCES `vehiculo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla sisprova.ingreso_salida: ~17 rows (aproximadamente)
/*!40000 ALTER TABLE `ingreso_salida` DISABLE KEYS */;
INSERT INTO `ingreso_salida` (`id`, `fecha_hora_ingreso`, `fecha_hora_salida`, `idusuario`, `idequipo`, `idvehiculo`, `idoperadoringreso`, `idoperadorsalida`) VALUES
	(1, '2012-05-16 06:55:00', '2012-05-16 06:00:00', 1, NULL, NULL, 16, 17),
	(2, '2012-05-16 06:55:00', '2012-05-16 06:00:00', 2, NULL, NULL, 16, 17),
	(3, '2012-05-16 06:55:00', '2012-05-16 06:00:00', 3, 4, 1, 16, 17),
	(4, '2012-05-16 06:55:00', '2012-05-16 06:00:00', 4, 1, 2, 16, 17),
	(5, '2012-05-16 06:55:00', '2012-05-16 06:00:00', 5, NULL, NULL, 16, 17),
	(6, '2012-05-16 06:55:00', '2012-05-16 06:00:00', 6, NULL, NULL, 16, 17),
	(7, '2012-05-16 06:55:00', '2012-05-16 06:00:00', 7, NULL, NULL, 16, 17),
	(8, '2012-05-16 06:55:00', '2012-05-16 06:00:00', 8, NULL, NULL, 16, 17),
	(9, '2012-05-16 06:55:00', '2012-05-16 06:00:00', 9, NULL, NULL, 16, 17),
	(10, '2012-05-16 06:55:00', '2012-05-16 06:00:00', 10, NULL, NULL, 16, 17),
	(11, '2012-05-16 06:55:00', '2012-05-16 06:00:00', 11, 2, NULL, 16, 17),
	(12, '2012-05-16 06:55:00', '2012-05-16 06:00:00', 12, NULL, NULL, 16, 17),
	(13, '2012-05-16 06:55:00', '2012-05-16 06:00:00', 13, 3, 3, 16, 17),
	(14, '2012-05-16 06:55:00', '2012-05-16 06:00:00', 14, NULL, NULL, 16, 17),
	(15, '2012-05-16 06:55:00', '2012-05-16 06:00:00', 15, NULL, NULL, 16, 17),
	(16, '2012-05-16 06:55:00', '2012-05-16 06:00:00', 16, NULL, NULL, 16, 17),
	(17, '2012-05-16 06:55:00', '2012-05-16 06:00:00', 17, NULL, NULL, 16, 17);
/*!40000 ALTER TABLE `ingreso_salida` ENABLE KEYS */;

-- Volcando estructura para tabla sisprova.marca
CREATE TABLE IF NOT EXISTS `marca` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla sisprova.marca: ~10 rows (aproximadamente)
/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
INSERT INTO `marca` (`id`, `nombre`) VALUES
	(1, 'LENOVO'),
	(2, 'DELL'),
	(3, 'SUZUKI'),
	(4, 'HONDA'),
	(5, 'APPLE'),
	(6, 'APACHE'),
	(7, 'ASUS'),
	(8, 'SAMSUNG'),
	(9, 'YAMAHA'),
	(10, 'TOYOTA');
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;

-- Volcando estructura para tabla sisprova.privilegios
CREATE TABLE IF NOT EXISTS `privilegios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(150) DEFAULT NULL,
  `descripcion` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla sisprova.privilegios: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `privilegios` DISABLE KEYS */;
INSERT INTO `privilegios` (`id`, `nombre`, `descripcion`) VALUES
	(1, 'AGREGAR', 'AGREGA DATOS'),
	(2, 'LISTAR', 'MUESTRA DATOS'),
	(3, 'ACTUALIZAR', 'ACTUALIZA DATOS'),
	(4, 'ELIMINAR', 'ELIMINA DATOS');
/*!40000 ALTER TABLE `privilegios` ENABLE KEYS */;

-- Volcando estructura para tabla sisprova.tipousuario_privilegios
CREATE TABLE IF NOT EXISTS `tipousuario_privilegios` (
  `idtipo_usuario` int(11) NOT NULL DEFAULT '0',
  `idprivilegios` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idtipo_usuario`,`idprivilegios`),
  KEY `idprivilegios` (`idprivilegios`),
  CONSTRAINT `tipousuario_privilegios_ibfk_1` FOREIGN KEY (`idtipo_usuario`) REFERENCES `tipo_usuario` (`id`),
  CONSTRAINT `tipousuario_privilegios_ibfk_2` FOREIGN KEY (`idprivilegios`) REFERENCES `privilegios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla sisprova.tipousuario_privilegios: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `tipousuario_privilegios` DISABLE KEYS */;
INSERT INTO `tipousuario_privilegios` (`idtipo_usuario`, `idprivilegios`) VALUES
	(1, 1),
	(1, 2),
	(1, 3),
	(1, 4),
	(2, 1),
	(2, 2),
	(3, 2);
/*!40000 ALTER TABLE `tipousuario_privilegios` ENABLE KEYS */;

-- Volcando estructura para tabla sisprova.tipo_documento
CREATE TABLE IF NOT EXISTS `tipo_documento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(250) DEFAULT NULL,
  `abreviatura` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla sisprova.tipo_documento: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `tipo_documento` DISABLE KEYS */;
INSERT INTO `tipo_documento` (`id`, `descripcion`, `abreviatura`) VALUES
	(1, 'CEDULA DE CIUDADANIA', 'CC'),
	(2, 'TARJETA IDENTIDAD', 'TI'),
	(3, 'CEDULA EXTRANJERIA', 'CE');
/*!40000 ALTER TABLE `tipo_documento` ENABLE KEYS */;

-- Volcando estructura para tabla sisprova.tipo_equipo
CREATE TABLE IF NOT EXISTS `tipo_equipo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `descripcion` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla sisprova.tipo_equipo: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `tipo_equipo` DISABLE KEYS */;
INSERT INTO `tipo_equipo` (`id`, `nombre`, `descripcion`) VALUES
	(1, 'ELECTRONICO', 'CAMPO PARA COMPUTADORES, CARGADORES, BAFLES'),
	(2, 'HERRAMIENTA LIVIANA', 'CAMPO PARA DESTORNILLADORES, MARTILLOS'),
	(3, 'HERRAMIENTA PESADA', 'CAMPO PARA APLANADORAS, ESCABADORAS'),
	(4, 'INSTRUMENTO MUSICAL', 'CAMPO PARA CUALQUIER TIPO DE INSTRUMENTOS MUSICALES'),
	(5, 'ALTURA', 'EQUIPOS DE ALTURA: ARNES, CASCO, CUERDAS ');
/*!40000 ALTER TABLE `tipo_equipo` ENABLE KEYS */;

-- Volcando estructura para tabla sisprova.tipo_usuario
CREATE TABLE IF NOT EXISTS `tipo_usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(150) DEFAULT NULL,
  `descripcion` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla sisprova.tipo_usuario: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `tipo_usuario` DISABLE KEYS */;
INSERT INTO `tipo_usuario` (`id`, `nombre`, `descripcion`) VALUES
	(1, 'FUNCIONARIO', 'USUARIO LABORANDO BAJO UN CONTRATO DE EMPLEADO'),
	(2, 'INSTRUCTOR', 'USUARIO LABORANDO BAJO UN CONTRATO DE INSTRUCTOR'),
	(3, 'APRENDIZ', 'USUARIO VINCULADO A UN PROGRAMA DE FORMACION SENA'),
	(4, 'VISITANTE', 'USUARIO QUE VISITA ESPORADICAMENTE EL COMPLEJO'),
	(5, 'VIGILANTE', 'VIGILAR   LAS   INSTALACIONES   F?SICAS,   BIENES,   PERSONAL   Y   P?BLICO  EN   GENERAL   DE   LA ORGANIZACI?N, CUMPLIENDO CON LAS NORMAS DE SEGURIDAD ESTABLECIDAS');
/*!40000 ALTER TABLE `tipo_usuario` ENABLE KEYS */;

-- Volcando estructura para tabla sisprova.tipo_vehiculo
CREATE TABLE IF NOT EXISTS `tipo_vehiculo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `descripcion` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla sisprova.tipo_vehiculo: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `tipo_vehiculo` DISABLE KEYS */;
INSERT INTO `tipo_vehiculo` (`id`, `nombre`, `descripcion`) VALUES
	(1, 'AUTOMOVIL', 'CAMPO PARA CUALQUIER TIPO DE AUTOMOVIL'),
	(2, 'MOTOCICLETA', 'CAMPO PARA CUALQUIER TIPO DE MOTOCICLETA'),
	(3, 'BICICLETA', 'CAMPO PARA CUALQUIER TIPO DE BICICLETA');
/*!40000 ALTER TABLE `tipo_vehiculo` ENABLE KEYS */;

-- Volcando estructura para tabla sisprova.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(150) DEFAULT NULL,
  `apellido` varchar(150) DEFAULT NULL,
  `idtipo_documento` int(11) DEFAULT NULL,
  `numero_identidad` varchar(30) DEFAULT NULL,
  `foto` varchar(250) DEFAULT NULL,
  `huella` int(11) DEFAULT NULL,
  `NombreUsuario` varchar(50) DEFAULT NULL,
  `contrasena` varchar(50) DEFAULT NULL,
  `idcentro` int(11) DEFAULT NULL,
  `idtipo_usuario` int(11) DEFAULT NULL,
  `idestado` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `usuario` (`NombreUsuario`),
  KEY `idcentro` (`idcentro`),
  KEY `idtipo_usuario` (`idtipo_usuario`),
  KEY `idtipo_documento` (`idtipo_documento`),
  KEY `idestado` (`idestado`),
  CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`idcentro`) REFERENCES `centro` (`id`),
  CONSTRAINT `usuario_ibfk_2` FOREIGN KEY (`idtipo_usuario`) REFERENCES `tipo_usuario` (`id`),
  CONSTRAINT `usuario_ibfk_3` FOREIGN KEY (`idtipo_documento`) REFERENCES `tipo_documento` (`id`),
  CONSTRAINT `usuario_ibfk_4` FOREIGN KEY (`idestado`) REFERENCES `estado` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla sisprova.usuario: ~17 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`id`, `nombre`, `apellido`, `idtipo_documento`, `numero_identidad`, `foto`, `huella`, `NombreUsuario`, `contrasena`, `idcentro`, `idtipo_usuario`, `idestado`) VALUES
	(1, 'DIEGO PUTO', 'GIRON COLLAZOS', 2, '1144654781', '/img/1.jpg', 111111, '1144654781', '1144654781', 2, 2, 2),
	(2, 'DIANA LIZETH', 'CARDONA CHITO', 1, '1144654790', '/img/2.jpg', 222222, '1144654790', '1144654790', 1, 3, 1),
	(3, 'DIEGO FERNANDO', 'CARDOZO', 1, '1144654791', '/img/3.jpg', 333333, '1144654791', '1144654791', 1, 3, 1),
	(4, 'DIEGO M', 'OTERO', 1, '1144654803', '/img/4.jpg', 444444, '1144654803', '1144654803', 1, 3, 1),
	(5, 'ERICK FERNELLY NIEVA', '', 1, '1144654792', '/img/5.jpg', 555555, '1144654792', '1144654792', 1, 3, 1),
	(6, 'CATALINA', 'CAMACHO', 1, '1144654789', '/img/6.jpg', 666666, '1144654789', '1144654789', 1, 3, 1),
	(7, 'DAVID STIVEN FAJARDO', '', 1, '1144654793', '/img/7.jpg', 777777, '1144654793', '1144654793', 1, 3, 1),
	(8, 'MAJHURY', 'AVIRAMA', 1, '1144654794', '/img/8.jpg', 888888, '1144654794', '1144654794', 1, 3, 1),
	(9, 'NELSON', 'PENAGOS', 1, '1144654795', '/img/9.jpg', 999999, '1144654795', '1144654795', 1, 3, 1),
	(10, 'SEBASTIAN', 'CARMONA', 1, '1144654796', '/img/10.jpg', 1111110, '1144654796', '1144654796', 1, 3, 1),
	(11, 'JHON JAIRO', 'LONDO?O', 1, '1144654797', '/img/11.jpg', 1222221, '1144654797', '1144654797', 1, 3, 1),
	(12, 'MARCO', 'OROZCO', 1, '1144654798', '/img/12.jpg', 1333332, '1144654798', '1144654798', 1, 3, 1),
	(13, 'DIANA DEL PILAR', 'SOLARTE', 1, '1144654799', '/img/13.jpg', 1444443, '1144654799', '1144654799', 1, 2, 1),
	(14, 'JORGE', 'OTERO', 1, '1144654800', '/img/14.jpg', 1555554, '1144654800', '1144654800', 2, 5, 2),
	(15, 'CLAUDIA', 'MARTINEZ', 1, '1144654801', '/img/15.jpg', 1666665, '1144654801', '1144654801', 3, 1, 1),
	(16, 'LUZ HELENA', 'DIAZ', 1, '1144654802', '/img/16.jpg', 1777776, '1144654802', '1144654802', NULL, 5, 1),
	(17, 'CARLOS', 'DURAN', 1, '1144654804', '/img/17.jpg', 1888887, '1144654804', '1144654804', NULL, 5, 1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

-- Volcando estructura para tabla sisprova.vehiculo
CREATE TABLE IF NOT EXISTS `vehiculo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `matricula` varchar(8) DEFAULT NULL,
  `idtipo_vehiculo` int(11) DEFAULT NULL,
  `idestado` int(11) DEFAULT NULL,
  `idusuario` int(11) DEFAULT NULL,
  `idmarca` int(11) DEFAULT NULL,
  `idcolor` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idtipo_vehiculo` (`idtipo_vehiculo`),
  KEY `idestado` (`idestado`),
  KEY `idusuario` (`idusuario`),
  KEY `idmarca` (`idmarca`),
  KEY `idcolor` (`idcolor`),
  CONSTRAINT `vehiculo_ibfk_1` FOREIGN KEY (`idtipo_vehiculo`) REFERENCES `tipo_vehiculo` (`id`),
  CONSTRAINT `vehiculo_ibfk_2` FOREIGN KEY (`idestado`) REFERENCES `estado` (`id`),
  CONSTRAINT `vehiculo_ibfk_3` FOREIGN KEY (`idusuario`) REFERENCES `usuario` (`id`),
  CONSTRAINT `vehiculo_ibfk_4` FOREIGN KEY (`idmarca`) REFERENCES `marca` (`id`),
  CONSTRAINT `vehiculo_ibfk_5` FOREIGN KEY (`idcolor`) REFERENCES `color` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla sisprova.vehiculo: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `vehiculo` DISABLE KEYS */;
INSERT INTO `vehiculo` (`id`, `matricula`, `idtipo_vehiculo`, `idestado`, `idusuario`, `idmarca`, `idcolor`) VALUES
	(1, 'KZN-47D', 2, 1, 1, 1, 4),
	(2, 'LBN-35C', 2, 1, 11, 2, 3),
	(3, 'CBX-34T', 2, 1, 13, 3, 2),
	(4, 'JEL-29', 2, 1, 10, 4, 1),
	(5, 'VSX-456', 1, 1, 1, 1, 1);
/*!40000 ALTER TABLE `vehiculo` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
