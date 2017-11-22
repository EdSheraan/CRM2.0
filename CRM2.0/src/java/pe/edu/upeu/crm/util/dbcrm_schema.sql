-- phpMyAdmin SQL Dump
-- version 4.6.6
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 12-11-2017 a las 01:11:51
-- Versión del servidor: 5.6.36-log
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dbcrm`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `campo`
--

CREATE TABLE `campo` (
  `idCAMPO` int(11) NOT NULL,
  `idUNION` int(11) NOT NULL,
  `CMP_NOMBRE` varchar(64) NOT NULL,
  `CMP_FECHA_CREACION` date NOT NULL,
  `CMP_ESTADO` char(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detprivilegio`
--

CREATE TABLE `detprivilegio` (
  `idROL` int(11) NOT NULL,
  `idPRIVILEGIO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detrol`
--

CREATE TABLE `detrol` (
  `idDETROL` int(11) NOT NULL,
  `idUSUARIO` int(11) NOT NULL,
  `idROL` int(11) NOT NULL,
  `DRL_ESTADO` char(1) NOT NULL DEFAULT '1',
  `DRL_FECHA_ADD` datetime NOT NULL,
  `DRL_FECHA_UPD` datetime DEFAULT NULL,
  `DRL_FECHA_DEL` datetime DEFAULT NULL,
  `DRL_USU_ADD` int(11) NOT NULL,
  `DRL_USU_UPD` int(11) DEFAULT NULL,
  `DRL_USU_DEL` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `distrito`
--

CREATE TABLE `distrito` (
  `idDISTRITO` int(11) NOT NULL,
  `idCAMPO` int(11) NOT NULL,
  `DIS_NOMBRE` varchar(64) NOT NULL,
  `DIS_FECHA_CREACION` date NOT NULL,
  `DIS_ESTADO` char(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `documento`
--

CREATE TABLE `documento` (
  `idDOCUMENTO` int(11) NOT NULL,
  `DOC_DESCRIPCION` varchar(64) NOT NULL,
  `DOC_NOMBRE_CORTO` varchar(16) NOT NULL,
  `DOC_ESTADO` char(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `escuela`
--

CREATE TABLE `escuela` (
  `idESCUELA` int(11) NOT NULL,
  `idIGLESIA` int(11) NOT NULL,
  `ESC_NOMBRE` varchar(64) NOT NULL,
  `ESC_FECHA_CREACION` date NOT NULL,
  `ESC_ESTADO` char(1) NOT NULL DEFAULT '1',
  `ESC_LUGAR_REUNION` varchar(255) DEFAULT NULL,
  `ESC_USU_ADD` int(11) NOT NULL,
  `ESC_USU_UPD` int(11) DEFAULT NULL,
  `ESC_USU_DEL` int(11) DEFAULT NULL,
  `ESC_FECHA_ADD` datetime NOT NULL,
  `ESC_FECHA_UPD` datetime DEFAULT NULL,
  `ESC_FECHA_DEL` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evento`
--

CREATE TABLE `evento` (
  `idEVENTO` int(11) NOT NULL,
  `idTIPOEVENTO` int(11) NOT NULL,
  `idPERIODO` int(11) NOT NULL,
  `EVT_NOMBRE` varchar(64) NOT NULL,
  `EVT_DESCRIPCION` varchar(255) DEFAULT NULL,
  `EVT_LUGAR` varchar(255) DEFAULT NULL,
  `EVT_FECHA` datetime NOT NULL,
  `EVT_FECHA_LIMITE` datetime DEFAULT NULL,
  `EVT_DISTRITO` int(11) NOT NULL,
  `EVT_IGLESIA` int(11) NOT NULL,
  `EVT_ESTADO` char(1) DEFAULT '1',
  `EVT_USU_ADD` int(11) NOT NULL,
  `EVT_USU_UPD` int(11) DEFAULT NULL,
  `EVT_USU_ELI` int(11) DEFAULT NULL,
  `EVT_FECHA_ADD` datetime NOT NULL,
  `EVT_FECHA_UPD` datetime DEFAULT NULL,
  `EVT_FECHA_ELI` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `eventogrupo`
--

CREATE TABLE `eventogrupo` (
  `idGRUPO` int(11) NOT NULL,
  `idEVENTO` int(11) NOT NULL,
  `EVG_PRESENTES` int(11) DEFAULT NULL,
  `EVG_FALTAS` int(11) DEFAULT NULL,
  `EVG_VISITAS` int(11) DEFAULT NULL,
  `EVG_DESCRIPCION` varchar(255) DEFAULT NULL,
  `EVG_LUGAR` varchar(255) DEFAULT NULL,
  `EVG_FECHA_REGISTRO` datetime DEFAULT NULL,
  `EVG_ESTADO` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `eventoministerio`
--

CREATE TABLE `eventoministerio` (
  `idMINISTERIO` int(11) NOT NULL,
  `idEVENTO` int(11) NOT NULL,
  `EVM_PRESENTES` int(11) DEFAULT NULL,
  `EVM_FALTAS` int(11) DEFAULT NULL,
  `EVM_VISITAS` int(11) DEFAULT NULL,
  `EVM_DESCRIPCION` varchar(255) DEFAULT NULL,
  `EVM_LUGAR` varchar(255) DEFAULT NULL,
  `EVM_FECHA_REGISTRO` datetime DEFAULT NULL,
  `EVM_ESTADO` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `eventopersona`
--

CREATE TABLE `eventopersona` (
  `idPERSONA` int(11) NOT NULL,
  `idEVENTO` int(11) NOT NULL,
  `EVP_ASISTECIA` char(1) DEFAULT NULL,
  `EVP_ESTADO` CHAR(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupo`
--

CREATE TABLE `grupo` (
  `idGRUPO` int(11) NOT NULL,
  `idESCUELA` int(11) NOT NULL,
  `GPO_NOMBRE` varchar(64) NOT NULL,
  `GPO_LUGAR_REUNION` varchar(255) DEFAULT NULL,
  `GPO_FECHA_CREACION` date DEFAULT NULL,
  `GPO_ESTADO` char(1) NOT NULL DEFAULT '1',
  `GPO_USU_ADD` int(11) NOT NULL,
  `GPO_USU_UPD` int(11) DEFAULT NULL,
  `GPO_USU_DEL` int(11) DEFAULT NULL,
  `GPO_FECHA_ADD` datetime NOT NULL,
  `GPO_FECHA_UPD` datetime DEFAULT NULL,
  `GPO_FECHA_DEL` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `iglesia`
--

CREATE TABLE `iglesia` (
  `idIGLESIA` int(11) NOT NULL,
  `idDISTRITO` int(11) NOT NULL,
  `IGL_NOMBRE` varchar(64) NOT NULL,
  `IGL_FECHA_CREACION` date NOT NULL,
  `IGL_ESTADO` char(1) NOT NULL DEFAULT '1',
  `IGL_DIRECCION` varchar(255) DEFAULT NULL,
  `IGL_USU_ADD` int(11) NOT NULL,
  `IGL_USU_UPD` int(11) DEFAULT NULL,
  `IGL_UPD_DEL` int(11) DEFAULT NULL,
  `IGL_FECHA_ADD` datetime NOT NULL,
  `IGL_FECHA_UPD` datetime DEFAULT NULL,
  `IGL_FECHA_DEL` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `miembrogp`
--

CREATE TABLE `miembrogp` (
  `idMIEMBROGP` int(11) NOT NULL,
  `idPERSONA` int(11) NOT NULL,
  `idGRUPO` int(11) NOT NULL,
  `MGP_FECHA_REGISTRO` datetime NOT NULL,
  `MGP_ESTADO` char(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `miembromin`
--

CREATE TABLE `miembromin` (
  `idMIEMBROMIN` int(11) NOT NULL,
  `idMINISTERIO` int(11) NOT NULL,
  `idPERSONA` int(11) NOT NULL,
  `MMI_FECHA_REGISTRO` datetime DEFAULT NULL,
  `MMI_ESTADO` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ministerio`
--

CREATE TABLE `ministerio` (
  `idMINISTERIO` int(11) NOT NULL,
  `idIGLESIA` int(11) NOT NULL,
  `MIN_NOMBRE` varchar(64) NOT NULL,
  `MIN_DESCRIPCION` varchar(255) DEFAULT NULL,
  `MIN_LUGAR_REUNION` varchar(255) DEFAULT NULL,
  `MIN_NOMBRE_CORTO` varchar(16) NOT NULL,
  `MIN_DIA_TRABAJO` char(1) NOT NULL,
  `MIN_ESTADO` char(1) NOT NULL DEFAULT '1',
  `MIN_FECHA_CREACION` date NOT NULL,
  `MIN_USU_ADD` int(11) NOT NULL,
  `MIN_USU_UPD` int(11) DEFAULT NULL,
  `MIN_USU_DEL` int(11) DEFAULT NULL,
  `MIN_FECHA_ADD` datetime NOT NULL,
  `MIN_FECHA_UPD` datetime DEFAULT NULL,
  `MIN_FECHA_DEL` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `periodo`
--

CREATE TABLE `periodo` (
  `idPERIODO` int(11) NOT NULL,
  `PRD_NOMBRE` varchar(64) NOT NULL,
  `PRD_FECHA_INICIO` date NOT NULL,
  `PRD_FECHA_LIMITE` date NOT NULL,
  `PRD_DISTRITO` int(11) NOT NULL,
  `PRD_IGLESIA` int(11) NOT NULL,
  `PRD_ESTADO` char(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `idPERSONA` int(11) NOT NULL,
  `idDOCUMENTO` int(11) NOT NULL,
  `PER_NOMBRES` varchar(64) NOT NULL,
  `PER_APELLIDOS` varchar(64) NOT NULL,
  `PER_DOCUMENTO` varchar(15) NOT NULL,
  `PER_FEC_NACIMIENTO` date DEFAULT NULL,
  `PER_CORREO` varchar(128) DEFAULT NULL,
  `PER_DIRECCION` varchar(255) DEFAULT NULL,
  `PER_TELEFONO` varchar(20) DEFAULT NULL,
  `PER_BAUTIZADO` char(1) NOT NULL DEFAULT '0',
  `PER_SEXO` char(1) NOT NULL,
  `PER_FECHA_BAUTISMO` date DEFAULT NULL,
  `PER_FOTO` varchar(255) DEFAULT NULL,
  `PER_ESTADO` char(1) NOT NULL DEFAULT '1',
  `PER_USU_ADD` int(11) NOT NULL,
  `PER_USU_UPD` int(11) DEFAULT NULL,
  `PER_USU_DEL` int(11) DEFAULT NULL,
  `PER_FECHA_ADD` datetime NOT NULL,
  `PER_FECHA_UPD` datetime DEFAULT NULL,
  `PER_FECHA_DEL` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `privilegio`
--

CREATE TABLE `privilegio` (
  `idPRIVILEGIO` int(11) NOT NULL,
  `PRV_NOMBRE` varchar(64) NOT NULL,
  `PRV_ORDEN` int(11) NOT NULL,
  `PRV_ID_PADRE` int(11) NOT NULL,
  `PRV_ICONO` varchar(64) NOT NULL,
  `PRV_LINK` varchar(64) NOT NULL,
  `PRV_ESTADO` char(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `idROL` int(11) NOT NULL,
  `ROL_NOMBRE` varchar(64) NOT NULL,
  `ROL_CODIGO` char(4) NOT NULL,
  `ROL_ESTADO` char(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipoevento`
--

CREATE TABLE `tipoevento` (
  `idTIPOEVENTO` int(11) NOT NULL,
  `TIP_NOMBRE` varchar(64) NOT NULL,
  `TIP_CODIGO` char(4) NOT NULL,
  `TIP_ESTADO` char(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `unionp`
--

CREATE TABLE `unionp` (
  `idUNION` int(11) NOT NULL,
  `UNI_NOMBRE` varchar(64) NOT NULL,
  `UNI_FECHA_CREACION` date NOT NULL,
  `UNI_ESTADO` char(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idUSUARIO` int(11) NOT NULL,
  `idPERSONA` int(11) NOT NULL,
  `USU_USUARIO` varchar(64) NOT NULL,
  `USU_UNION` int(11) DEFAULT NULL,
  `USU_CAMPO` int(11) DEFAULT NULL,
  `USU_DISTRITO` int(11) DEFAULT NULL,
  `USU_IGLESIA` int(11) DEFAULT NULL,
  `USU_ESCUELA` int(11) DEFAULT NULL,
  `USU_MINISTERIO` int(11) DEFAULT NULL,
  `USU_GRUPO` int(11) DEFAULT NULL,
  `USU_CLAVE` varchar(64) NOT NULL,
  `USU_ESTADO` char(1) NOT NULL DEFAULT '1',
  `USU_ESTADO_CLAVE` char(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `campo`
--
ALTER TABLE `campo`
  ADD PRIMARY KEY (`idCAMPO`),
  ADD KEY `CAMPO_FKIndex1` (`idUNION`);

--
-- Indices de la tabla `detprivilegio`
--
ALTER TABLE `detprivilegio`
  ADD PRIMARY KEY (`idROL`,`idPRIVILEGIO`),
  ADD KEY `ROL_has_PRIVILEGIO_FKIndex1` (`idROL`),
  ADD KEY `ROL_has_PRIVILEGIO_FKIndex2` (`idPRIVILEGIO`);

--
-- Indices de la tabla `detrol`
--
ALTER TABLE `detrol`
  ADD PRIMARY KEY (`idDETROL`),
  ADD KEY `DETROL_FKIndex1` (`idROL`),
  ADD KEY `DETROL_FKIndex2` (`idUSUARIO`);

--
-- Indices de la tabla `distrito`
--
ALTER TABLE `distrito`
  ADD PRIMARY KEY (`idDISTRITO`),
  ADD KEY `DISTRITO_FKIndex1` (`idCAMPO`);

--
-- Indices de la tabla `documento`
--
ALTER TABLE `documento`
  ADD PRIMARY KEY (`idDOCUMENTO`);

--
-- Indices de la tabla `escuela`
--
ALTER TABLE `escuela`
  ADD PRIMARY KEY (`idESCUELA`),
  ADD KEY `ESCUELA_FKIndex1` (`idIGLESIA`);

--
-- Indices de la tabla `evento`
--
ALTER TABLE `evento`
  ADD PRIMARY KEY (`idEVENTO`),
  ADD KEY `EVENTO_FKIndex1` (`idPERIODO`),
  ADD KEY `EVENTO_FKIndex2` (`idTIPOEVENTO`);

--
-- Indices de la tabla `eventogrupo`
--
ALTER TABLE `eventogrupo`
  ADD PRIMARY KEY (`idGRUPO`,`idEVENTO`),
  ADD KEY `GRUPO_has_EVENTO_FKIndex1` (`idGRUPO`),
  ADD KEY `GRUPO_has_EVENTO_FKIndex2` (`idEVENTO`);

--
-- Indices de la tabla `eventoministerio`
--
ALTER TABLE `eventoministerio`
  ADD PRIMARY KEY (`idMINISTERIO`,`idEVENTO`),
  ADD KEY `MINISTERIO_has_EVENTO_FKIndex1` (`idMINISTERIO`),
  ADD KEY `MINISTERIO_has_EVENTO_FKIndex2` (`idEVENTO`);

--
-- Indices de la tabla `eventopersona`
--
ALTER TABLE `eventopersona`
  ADD PRIMARY KEY (`idPERSONA`,`idEVENTO`),
  ADD KEY `PERSONA_has_EVENTO_FKIndex1` (`idPERSONA`),
  ADD KEY `PERSONA_has_EVENTO_FKIndex2` (`idEVENTO`);

--
-- Indices de la tabla `grupo`
--
ALTER TABLE `grupo`
  ADD PRIMARY KEY (`idGRUPO`),
  ADD KEY `GRUPO_FKIndex1` (`idESCUELA`);

--
-- Indices de la tabla `iglesia`
--
ALTER TABLE `iglesia`
  ADD PRIMARY KEY (`idIGLESIA`),
  ADD KEY `IGLESIA_FKIndex1` (`idDISTRITO`);

--
-- Indices de la tabla `miembrogp`
--
ALTER TABLE `miembrogp`
  ADD PRIMARY KEY (`idMIEMBROGP`),
  ADD KEY `MIEMBROGP_FKIndex1` (`idGRUPO`),
  ADD KEY `MIEMBROGP_FKIndex2` (`idPERSONA`);

--
-- Indices de la tabla `miembromin`
--
ALTER TABLE `miembromin`
  ADD PRIMARY KEY (`idMIEMBROMIN`),
  ADD KEY `MIEMBROMIN_FKIndex1` (`idPERSONA`),
  ADD KEY `MIEMBROMIN_FKIndex2` (`idMINISTERIO`);

--
-- Indices de la tabla `ministerio`
--
ALTER TABLE `ministerio`
  ADD PRIMARY KEY (`idMINISTERIO`),
  ADD KEY `MINISTERIO_FKIndex1` (`idIGLESIA`);

--
-- Indices de la tabla `periodo`
--
ALTER TABLE `periodo`
  ADD PRIMARY KEY (`idPERIODO`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`idPERSONA`),
  ADD KEY `PERSONA_FKIndex1` (`idDOCUMENTO`);

--
-- Indices de la tabla `privilegio`
--
ALTER TABLE `privilegio`
  ADD PRIMARY KEY (`idPRIVILEGIO`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`idROL`);

--
-- Indices de la tabla `tipoevento`
--
ALTER TABLE `tipoevento`
  ADD PRIMARY KEY (`idTIPOEVENTO`);

--
-- Indices de la tabla `unionp`
--
ALTER TABLE `unionp`
  ADD PRIMARY KEY (`idUNION`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUSUARIO`),
  ADD KEY `USUARIO_FKIndex1` (`idPERSONA`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `campo`
--
ALTER TABLE `campo`
  MODIFY `idCAMPO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `detrol`
--
ALTER TABLE `detrol`
  MODIFY `idDETROL` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `distrito`
--
ALTER TABLE `distrito`
  MODIFY `idDISTRITO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `documento`
--
ALTER TABLE `documento`
  MODIFY `idDOCUMENTO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `escuela`
--
ALTER TABLE `escuela`
  MODIFY `idESCUELA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `evento`
--
ALTER TABLE `evento`
  MODIFY `idEVENTO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `grupo`
--
ALTER TABLE `grupo`
  MODIFY `idGRUPO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `iglesia`
--
ALTER TABLE `iglesia`
  MODIFY `idIGLESIA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `miembrogp`
--
ALTER TABLE `miembrogp`
  MODIFY `idMIEMBROGP` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `miembromin`
--
ALTER TABLE `miembromin`
  MODIFY `idMIEMBROMIN` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `ministerio`
--
ALTER TABLE `ministerio`
  MODIFY `idMINISTERIO` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `periodo`
--
ALTER TABLE `periodo`
  MODIFY `idPERIODO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `idPERSONA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `privilegio`
--
ALTER TABLE `privilegio`
  MODIFY `idPRIVILEGIO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `idROL` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `tipoevento`
--
ALTER TABLE `tipoevento`
  MODIFY `idTIPOEVENTO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `unionp`
--
ALTER TABLE `unionp`
  MODIFY `idUNION` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUSUARIO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `campo`
--
ALTER TABLE `campo`
  ADD CONSTRAINT `campo_ibfk_1` FOREIGN KEY (`idUNION`) REFERENCES `unionp` (`idUNION`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `detprivilegio`
--
ALTER TABLE `detprivilegio`
  ADD CONSTRAINT `detprivilegio_ibfk_1` FOREIGN KEY (`idROL`) REFERENCES `rol` (`idROL`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `detprivilegio_ibfk_2` FOREIGN KEY (`idPRIVILEGIO`) REFERENCES `privilegio` (`idPRIVILEGIO`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `detrol`
--
ALTER TABLE `detrol`
  ADD CONSTRAINT `detrol_ibfk_1` FOREIGN KEY (`idROL`) REFERENCES `rol` (`idROL`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `detrol_ibfk_2` FOREIGN KEY (`idUSUARIO`) REFERENCES `usuario` (`idUSUARIO`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `distrito`
--
ALTER TABLE `distrito`
  ADD CONSTRAINT `distrito_ibfk_1` FOREIGN KEY (`idCAMPO`) REFERENCES `campo` (`idCAMPO`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `escuela`
--
ALTER TABLE `escuela`
  ADD CONSTRAINT `escuela_ibfk_1` FOREIGN KEY (`idIGLESIA`) REFERENCES `iglesia` (`idIGLESIA`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `evento`
--
ALTER TABLE `evento`
  ADD CONSTRAINT `evento_ibfk_1` FOREIGN KEY (`idPERIODO`) REFERENCES `periodo` (`idPERIODO`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `evento_ibfk_2` FOREIGN KEY (`idTIPOEVENTO`) REFERENCES `tipoevento` (`idTIPOEVENTO`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `grupo`
--
ALTER TABLE `grupo`
  ADD CONSTRAINT `grupo_ibfk_1` FOREIGN KEY (`idESCUELA`) REFERENCES `escuela` (`idESCUELA`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `iglesia`
--
ALTER TABLE `iglesia`
  ADD CONSTRAINT `iglesia_ibfk_1` FOREIGN KEY (`idDISTRITO`) REFERENCES `distrito` (`idDISTRITO`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `miembrogp`
--
ALTER TABLE `miembrogp`
  ADD CONSTRAINT `miembrogp_ibfk_1` FOREIGN KEY (`idGRUPO`) REFERENCES `grupo` (`idGRUPO`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `miembrogp_ibfk_2` FOREIGN KEY (`idPERSONA`) REFERENCES `persona` (`idPERSONA`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `miembromin`
--
ALTER TABLE `miembromin`
  ADD CONSTRAINT `miembromin_ibfk_1` FOREIGN KEY (`idPERSONA`) REFERENCES `persona` (`idPERSONA`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `miembromin_ibfk_2` FOREIGN KEY (`idMINISTERIO`) REFERENCES `ministerio` (`idMINISTERIO`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `ministerio`
--
ALTER TABLE `ministerio`
  ADD CONSTRAINT `ministerio_ibfk_1` FOREIGN KEY (`idIGLESIA`) REFERENCES `iglesia` (`idIGLESIA`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `persona_ibfk_1` FOREIGN KEY (`idDOCUMENTO`) REFERENCES `documento` (`idDOCUMENTO`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`idPERSONA`) REFERENCES `persona` (`idPERSONA`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
