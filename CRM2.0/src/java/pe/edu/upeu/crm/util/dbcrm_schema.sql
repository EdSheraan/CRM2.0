CREATE TABLE CAMPO (
  idCAMPO INTEGER NOT NULL AUTO_INCREMENT,
  idUNION INTEGER NOT NULL,
  CMP_NOMBRE VARCHAR(64) NOT NULL,
  CMP_FECHA_CREACION DATE NOT NULL,
  CMP_ESTADO CHAR(1) NOT NULL DEFAULT 1,
  PRIMARY KEY(idCAMPO),
  INDEX CAMPO_FKIndex1(idUNION)
);

CREATE TABLE DETPRIVILEGIO (
  idROL INTEGER NOT NULL,
  idPRIVILEGIO INTEGER NOT NULL,
  PRIMARY KEY(idROL, idPRIVILEGIO),
  INDEX ROL_has_PRIVILEGIO_FKIndex1(idROL),
  INDEX ROL_has_PRIVILEGIO_FKIndex2(idPRIVILEGIO)
);

CREATE TABLE DETROL (
  idDETROL INTEGER NOT NULL AUTO_INCREMENT,
  idUSUARIO INTEGER NOT NULL,
  idROL INTEGER NOT NULL,
  DRL_ESTADO CHAR(1) NOT NULL DEFAULT 1,
  PRIMARY KEY(idDETROL),
  INDEX DETROL_FKIndex2(idROL),
  INDEX DETROL_FKIndex2(idUSUARIO)
);

CREATE TABLE DISTRITO (
  idDISTRITO INTEGER NOT NULL AUTO_INCREMENT,
  idCAMPO INTEGER NOT NULL,
  DIS_NOMBRE VARCHAR(64) NOT NULL,
  DIS_FECHA_CREACION DATE NOT NULL,
  DIS_ESTADO CHAR(1) NOT NULL DEFAULT 1,
  PRIMARY KEY(idDISTRITO),
  INDEX DISTRITO_FKIndex1(idCAMPO)
);

CREATE TABLE DOCUMENTO (
  idDOCUMENTO INTEGER NOT NULL AUTO_INCREMENT,
  DOC_DESCRIPCION VARCHAR(64) NOT NULL,
  DOC_NOMBRE_CORTO VARCHAR(16) NOT NULL,
  PRIMARY KEY(idDOCUMENTO)
);

CREATE TABLE ESCUELA (
  idESCUELA INTEGER NOT NULL AUTO_INCREMENT,
  idIGLESIA INTEGER NOT NULL,
  ESC_NOMBRE VARCHAR(64) NOT NULL,
  ESC_FECHA_CREACION DATE NOT NULL,
  ESC_ESTADO CHAR(1) NOT NULL DEFAULT 1,
  ESC_LUGAR_REUNION VARCHAR(255) NULL,
  PRIMARY KEY(idESCUELA),
  INDEX ESCUELA_FKIndex1(idIGLESIA)
);

CREATE TABLE EVENTO (
  idEVENTO INTEGER NOT NULL AUTO_INCREMENT,
  idTIPOEVENTO INTEGER NOT NULL,
  idPERIODO INTEGER NOT NULL,
  EVT_NOMBRE VARCHAR(64) NOT NULL,
  EVT_DESCRIPCION VARCHAR(255) NULL,
  EVT_LUGAR VARCHAR(255) NULL,
  EVT_FECHA DATETIME NOT NULL,
  EVT_FECHA_LIMITE DATETIME NULL,
  EVT_DISTRITO INTEGER NOT NULL,
  EVT_IGLESIA INTEGER NOT NULL,
  EVT_ESTADO CHAR(1) NULL DEFAULT 1,
  PRIMARY KEY(idEVENTO),
  INDEX EVENTO_FKIndex1(idPERIODO),
  INDEX EVENTO_FKIndex2(idTIPOEVENTO)
);

CREATE TABLE EVENTOGRUPO (
  idGRUPO INTEGER NOT NULL,
  idEVENTO INTEGER NOT NULL,
  EVG_PRESENTES INTEGER NULL,
  EVG_FALTAS INTEGER NULL,
  EVG_VISITAS INTEGER NULL,
  EVG_DESCRIPCION VARCHAR(255) NULL,
  EVG_LUGAR VARCHAR(255) NULL,
  EVG_FECHA_REGISTRO DATETIME NULL,
  PRIMARY KEY(idGRUPO, idEVENTO),
  INDEX GRUPO_has_EVENTO_FKIndex1(idGRUPO),
  INDEX GRUPO_has_EVENTO_FKIndex2(idEVENTO)
);

CREATE TABLE EVENTOMINISTERIO (
  idMINISTERIO INTEGER NOT NULL,
  idEVENTO INTEGER NOT NULL,
  EVM_PRESENTES INTEGER NULL,
  EVM_FALTAS INTEGER NULL,
  EVM_VISITAS INTEGER NULL,
  EVM_DESCRIPCION VARCHAR(255) NULL,
  EVM_LUGAR VARCHAR(255) NULL,
  EVM_FECHA_REGISTRO DATETIME NULL,
  PRIMARY KEY(idMINISTERIO, idEVENTO),
  INDEX MINISTERIO_has_EVENTO_FKIndex1(idMINISTERIO),
  INDEX MINISTERIO_has_EVENTO_FKIndex2(idEVENTO)
);

CREATE TABLE GRUPO (
  idGRUPO INTEGER NOT NULL AUTO_INCREMENT,
  idESCUELA INTEGER NOT NULL,
  GPO_NOMBRE VARCHAR(64) NOT NULL,
  GPO_LUGAR_REUNION VARCHAR(255) NULL,
  GPO_FECHA_CREACION DATE NULL,
  GPO_ESTADO CHAR(1) NOT NULL DEFAULT 1,
  PRIMARY KEY(idGRUPO),
  INDEX GRUPO_FKIndex1(idESCUELA)
);

CREATE TABLE IGLESIA (
  idIGLESIA INTEGER NOT NULL AUTO_INCREMENT,
  idDISTRITO INTEGER NOT NULL,
  IGL_NOMBRE VARCHAR(64) NOT NULL,
  IGL_FECHA_CREACION DATE NOT NULL,
  IGL_ESTADO CHAR(1) NOT NULL DEFAULT 1,
  IGL_DIRECCION VARCHAR(255) NULL,
  PRIMARY KEY(idIGLESIA),
  INDEX IGLESIA_FKIndex1(idDISTRITO)
);

CREATE TABLE MIEMBROGP (
  idMIEMBROGP INTEGER NOT NULL AUTO_INCREMENT,
  idPERSONA INTEGER NOT NULL,
  idGRUPO INTEGER NOT NULL,
  MGP_FECHA_REGISTRO DATETIME NOT NULL,
  MGP_ESTADO CHAR(1) NOT NULL DEFAULT 1,
  PRIMARY KEY(idMIEMBROGP),
  INDEX MIEMBROGP_FKIndex1(idGRUPO),
  INDEX MIEMBROGP_FKIndex2(idPERSONA)
);

CREATE TABLE MIEMBROMIN (
  idMIEMBROMIN INTEGER NOT NULL AUTO_INCREMENT,
  idMINISTERIO INTEGER NOT NULL,
  idPERSONA INTEGER NOT NULL,
  MMI_FECHA_REGISTRO DATETIME NULL,
  MMI_ESTADO CHAR(1) NULL,
  PRIMARY KEY(idMIEMBROMIN),
  INDEX MIEMBROMIN_FKIndex1(idPERSONA),
  INDEX MIEMBROMIN_FKIndex2(idMINISTERIO)
);

CREATE TABLE MINISTERIO (
  idMINISTERIO INTEGER NOT NULL AUTO_INCREMENT,
  idIGLESIA INTEGER NOT NULL,
  MIN_NOMBRE VARCHAR(64) NOT NULL,
  MIN_DESCRIPCION VARCHAR(255) NULL,
  MIN_LUGAR_REUNION VARCHAR(255) NULL,
  MIN_NOMBRE_CORTO VARCHAR(16) NOT NULL,
  MIN_DIA_TRABAJO CHAR(1) NOT NULL,
  MIN_ESTADO CHAR(1) NOT NULL DEFAULT 1,
  MIN_FECHA_CREACION DATE NOT NULL,
  PRIMARY KEY(idMINISTERIO),
  INDEX MINISTERIO_FKIndex1(idIGLESIA)
);

CREATE TABLE PERIODO (
  idPERIODO INTEGER NOT NULL AUTO_INCREMENT,
  PRD_NOMBRE VARCHAR(64) NOT NULL,
  PRD_FECHA_INICIO DATE NOT NULL,
  PRD_FECHA_LIMITE DATE NOT NULL,
  PRD_DISTRITO INTEGER NOT NULL,
  PRD_IGLESIA INTEGER NOT NULL,
  PRD_ESTADO CHAR(1) NOT NULL DEFAULT 1,
  PRIMARY KEY(idPERIODO)
);

CREATE TABLE PERSONA (
  idPERSONA INTEGER NOT NULL AUTO_INCREMENT,
  idDOCUMENTO INTEGER NOT NULL,
  PER_NOMBRES VARCHAR(64) NOT NULL,
  PER_APELLIDOS VARCHAR(64) NOT NULL,
  PER_DOCUMENTO VARCHAR(15) NOT NULL,
  PER_FEC_NACIMIENTO DATE NULL,
  PER_CORREO VARCHAR(128) NULL,
  PER_DIRECCION VARCHAR(255) NULL,
  PER_TELEFONO VARCHAR(20) NULL,
  PER_BAUTIZADO CHAR(1) NOT NULL DEFAULT 0,
  PER_SEXO CHAR(1) NOT NULL,
  PER_FECHA_BAUTISMO DATE NULL,
  PER_FOTO VARCHAR(255) NULL,
  PRIMARY KEY(idPERSONA),
  INDEX PERSONA_FKIndex1(idDOCUMENTO)
);

CREATE TABLE PERSONAEVENTO (
  idPERSONA INTEGER NOT NULL,
  idEVENTO INTEGER NOT NULL,
  ASISTECIA CHAR(1) NULL,
  PRIMARY KEY(idPERSONA, idEVENTO),
  INDEX PERSONA_has_EVENTO_FKIndex1(idPERSONA),
  INDEX PERSONA_has_EVENTO_FKIndex2(idEVENTO)
);

CREATE TABLE PRIVILEGIO (
  idPRIVILEGIO INTEGER NOT NULL AUTO_INCREMENT,
  PRV_NOMBRE VARCHAR(64) NOT NULL,
  PRV_ORDEN INTEGER NOT NULL,
  PRV_ID_PADRE INTEGER NOT NULL,
  PRV_ICONO VARCHAR(64) NOT NULL,
  PRV_LINK VARCHAR(64) NOT NULL,
  PRV_ESTADO CHAR(1) NOT NULL DEFAULT 1,
  PRV_COLOR VARCHAR(45) NULL,
  PRV_DESCRIPCION VARCHAR(255) NULL,
  PRIMARY KEY(idPRIVILEGIO)
);

CREATE TABLE ROL (
  idROL INTEGER NOT NULL AUTO_INCREMENT,
  ROL_NOMBRE VARCHAR(64) NOT NULL,
  ROL_CODIGO CHAR(4) NOT NULL,
  ROL_ESTADO CHAR(1) NOT NULL DEFAULT 1,
  ROL_DESCRIPCION VARCHAR(255) NULL,
  PRIMARY KEY(idROL)
);

CREATE TABLE TIPOEVENTO (
  idTIPOEVENTO INTEGER NOT NULL AUTO_INCREMENT,
  TIP_NOMBRE VARCHAR(64) NOT NULL,
  TIP_CODIGO CHAR(4) NOT NULL,
  TIP_ESTADO CHAR(1) NOT NULL DEFAULT 1,
  PRIMARY KEY(idTIPOEVENTO)
);

CREATE TABLE UNIONP (
  idUNION INTEGER NOT NULL AUTO_INCREMENT,
  UNI_NOMBRE VARCHAR(64) NOT NULL,
  UNI_FECHA_CREACION DATE NOT NULL,
  UNI_ESTADO CHAR(1) NOT NULL DEFAULT 1,
  PRIMARY KEY(idUNION)
);

CREATE TABLE USUARIO (
  idUSUARIO INTEGER NOT NULL AUTO_INCREMENT,
  idPERSONA INTEGER NOT NULL,
  USU_USUARIO VARCHAR(64) NOT NULL,
  USU_CLAVE VARCHAR(64) NOT NULL,
  USU_ESTADO CHAR(1) NOT NULL DEFAULT 1,
  USU_ESTADO_CLAVE CHAR(1) NOT NULL DEFAULT 0,
  USU_UNION INTEGER NULL,
  USU_CAMPO INTEGER NULL,
  USU_DISTRITO INTEGER NULL,
  USU_IGLESIA INTEGER NULL,
  USU_ESCUELA INTEGER NULL,
  USU_GRUPO INTEGER NULL,
  PRIMARY KEY(idUSUARIO),
  INDEX USUARIO_FKIndex1(idPERSONA)
);

