create database demo_api;

use demo_api;

CREATE TABLE PERSONA (
    IDPER int  NOT NULL IDENTITY(1, 1),
    NOMBRE varchar(30)  NOT NULL,
    APELLIDO_PARTENO varchar(30)  NOT NULL,
    APELLIDO_MATERNO varchar(30)  NOT NULL,
    DNI char(8)  NOT NULL,
    CONSTRAINT PERSONA_pk PRIMARY KEY  (IDPER)
);

