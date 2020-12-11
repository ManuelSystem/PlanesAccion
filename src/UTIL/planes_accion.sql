-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-05-2019 a las 07:12:09
-- Versión del servidor: 10.1.28-MariaDB
-- Versión de PHP: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `planes_accion`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `accion`
--

CREATE TABLE `accion` (
  `idAccion` int(11) NOT NULL,
  `descripcionAccion` varchar(100) NOT NULL,
  `meta` varchar(50) NOT NULL,
  `responsableSeguimiento` varchar(50) NOT NULL,
  `idCondicionCalidad` int(11) NOT NULL,
  `idAnalisisInterno` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `accion`
--

INSERT INTO `accion` (`idAccion`, `descripcionAccion`, `meta`, `responsableSeguimiento`, `idCondicionCalidad`, `idAnalisisInterno`) VALUES
(1, 'Mucha debilidad', 'Mejorar siempre', 'Edgar', 2, 1),
(2, 'Seguir manteniendo las fortalezas', 'Seguir mejorando', 'Douglas', 2, 2),
(3, 'accion del primero', 'terminar primero', 'Edgar', 7, 3),
(4, 'accion del segundo', 'terminar el segundo', 'Marieth Maria', 7, 4),
(5, 'Descrip accion prueba 1', 'meta prueba 1', 'Douglas', 3, 5),
(9, 'dsadas', 'sdas', 'Marieth Maria', 6, 10),
(10, 'dasdasdasdas', 'dasdas', 'Edgar', 9, 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `idAdministrador` int(11) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `idPersona` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`idAdministrador`, `codigo`, `idPersona`) VALUES
(1, '16132045', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `analisisinterno`
--

CREATE TABLE `analisisinterno` (
  `idAnalisisInterno` int(11) NOT NULL,
  `tipoAnalisis` varchar(50) NOT NULL,
  `descripcionAnalisis` varchar(100) NOT NULL,
  `solucion` varchar(50) NOT NULL,
  `idEjeEstrategico` int(11) NOT NULL,
  `idCondicionCalidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `analisisinterno`
--

INSERT INTO `analisisinterno` (`idAnalisisInterno`, `tipoAnalisis`, `descripcionAnalisis`, `solucion`, `idEjeEstrategico`, `idCondicionCalidad`) VALUES
(1, 'Debilidad', 'Prueba 1', 'Mejoramiento', 1, 2),
(2, 'Fortaleza', 'Prueba 2', 'Mantenimiento', 3, 2),
(3, 'Debilidad', 'primero hola mundo', 'Mejoramiento', 1, 7),
(4, 'Fortaleza', 'segundo', 'Mantenimiento', 2, 7),
(5, 'Fortaleza', 'fortaleza prueba 1', 'Mantenimiento', 6, 3),
(10, 'Fortaleza', 'dsadsadsa', 'Mejora', 4, 6),
(11, 'Debilidad', 'dsadasdas', 'Mejora', 2, 9);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `condicioncalidad`
--

CREATE TABLE `condicioncalidad` (
  `idCondicionCalidad` int(11) NOT NULL,
  `nombreCondicion` varchar(100) NOT NULL,
  `Descripcion` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `condicioncalidad`
--

INSERT INTO `condicioncalidad` (`idCondicionCalidad`, `nombreCondicion`, `Descripcion`) VALUES
(1, 'Denominación', 'La denominación de un programa se expresa en coherencia con el nivel, la especificidad de su hacer, el perfil, la justificación, el currículo, el contenido general de las actividades académicas y su o'),
(2, 'Justificación', 'La justificación del programa parte de los atributos o factores que constituyen los rasgos distintivos del mismo. Se basa en un estudio que muestre diferencias, particularidades y afinidades en relaci'),
(3, 'Contenidos Curriculares', 'Los contenidos curriculares parten de la fundamentación teórica del programa expresada en un modelo pedagógico o en un proyecto educativo, de los propósitos de formación del plan general de estudios q'),
(4, 'Organización de las Actividades Académicas', 'La organización de las actividades académicas se establece en función de la\r\ncoherencia de los componentes y de la metodología, con el fin de alcanzar\r\nlas metas de formación en torno a la docencia en'),
(5, 'Investigación', 'La investigación se fundamenta en el desarrollo del conocimiento o en\r\nsu aplicación. Esto último es la innovación en la puesta en el mercado de\r\nproductos y servicios para lograr la articulación de l'),
(6, 'Relación con el sector externo', 'Se establece esta condición en función del impacto del programa en la\r\nsociedad, los planes medios y objetivos propuestos, la vinculación con el\r\nsector productivo, el trabajo con la comunidad, el imp'),
(7, 'Personal Docente', 'El número de docentes dependerá de aspectos tales como el nivel\r\nde formación, la modalidad, las metodologías utilizadas y los medios\r\ne infraestructura disponibles para atender al número de estudiant'),
(8, 'Medios Educativos', 'Los medios educativos representan los soportes que una institución de\r\neducación superior debe poseer para ofrecer un programa académico y\r\ndesarrollar las funciones de docencia, investigación y '),
(9, 'Infraestructura Física', 'En esta condición es preciso mostrar una planta física organizada, señalizada,\r\nespacios para la docencia, la investigación y la administración; aulas, biblioteca,\r\nauditorios, laboratorios, talleres '),
(10, 'Mecanismos de Selección y Evaluación', 'Esta condición se refiere a la aplicación efectiva de una política y procesos de\r\nselección y evaluación de estudiantes y profesores.'),
(11, 'Estructura Académica y Administrativa', 'Se refiere esta condición a la importancia de mostrar una estructura académico\r\nadministrativa sólida con fundamento en la estructura organizativa, sistemas\r\nde información, mecanismos de gestión, con'),
(12, 'Cultura de la Autoevaluación ', 'Esta condición fundamenta a las demás y se basa en la descripción de las\r\nactividades que se desarrollan para promover la cultura de la autoevaluación.\r\nPara cumplirla se evidenciará el diseño y aplic'),
(13, 'Programa de Egresados', 'Se fundamenta esta condición en la estrategia y las actividades de\r\nseguimiento a egresados, con el fin de conocer, valorar su trabajo y evaluar\r\nel impacto de su desempeño laboral, de manera que sea '),
(14, 'Bienestar Universitario', 'La condición de bienestar universitario se fundamenta en la organización,\r\nplaneación y descripción de actividades para el aprovechamiento del\r\ntiempo libre y la atención de las áreas de salud, cultur'),
(15, 'Recursos Financieros Suficientes', 'Se fundamenta esta condición en la viabilidad financiera para la oferta y\r\ndesarrollo del programa. De esta manera se debe presentar el estudio de\r\nfactibilidad económica si se trata de un programa nu');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `coordinadorcalidad`
--

CREATE TABLE `coordinadorcalidad` (
  `idCoordinadorCalidad` int(11) NOT NULL,
  `programaAcademico` varchar(50) NOT NULL,
  `cargo` varchar(50) NOT NULL,
  `idPersona` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `coordinadorcalidad`
--

INSERT INTO `coordinadorcalidad` (`idCoordinadorCalidad`, `programaAcademico`, `cargo`, `idPersona`) VALUES
(1, 'Ingeniería de Sistemas', 'Coordinador de Calidad ', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `coordinadorprograma`
--

CREATE TABLE `coordinadorprograma` (
  `idCoordinadorPrograma` int(11) NOT NULL,
  `programaAcademico` varchar(50) NOT NULL,
  `cargo` varchar(50) NOT NULL,
  `idPersona` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `coordinadorprograma`
--

INSERT INTO `coordinadorprograma` (`idCoordinadorPrograma`, `programaAcademico`, `cargo`, `idPersona`) VALUES
(1, 'Ingeniería de Sistemas', 'Coordinador de Programa', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docente`
--

CREATE TABLE `docente` (
  `idDocente` int(11) NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `Facultad` varchar(100) NOT NULL,
  `idPersona` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `docente`
--

INSERT INTO `docente` (`idDocente`, `titulo`, `Facultad`, `idPersona`) VALUES
(1, 'Ingeniero de Sistemas', 'Ingeniería', 3),
(3, 'Ingeniera de Sistemas', 'Ingeniería', 4),
(4, 'Ingeniero de Sistemas', 'Ingenieria', 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ejeestrategico`
--

CREATE TABLE `ejeestrategico` (
  `idEjeEstrategico` int(11) NOT NULL,
  `nombreEje` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ejeestrategico`
--

INSERT INTO `ejeestrategico` (`idEjeEstrategico`, `nombreEje`) VALUES
(1, 'Eje aseguramiento de la calidad Académica'),
(2, 'Eje fortalecimiento de la investigación institucional'),
(3, 'Eje relación universidad-sector social y productivo'),
(4, 'Eje incorporación tics en procesos académicos'),
(5, 'Eje de posicionamiento nacional e internacional'),
(6, 'Eje modernización y gestión administrativa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `informe`
--

CREATE TABLE `informe` (
  `idInforme` int(11) NOT NULL,
  `fechaGeneracion` date NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `idPlanAccion` int(11) NOT NULL,
  `idCoordinadorPrograma` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modulo`
--

CREATE TABLE `modulo` (
  `idModulo` int(11) NOT NULL,
  `nomModulo` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `modulo`
--

INSERT INTO `modulo` (`idModulo`, `nomModulo`) VALUES
(1, 'iniP'),
(2, 'gesM'),
(3, 'gesT'),
(4, 'admi');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `idPersona` int(11) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Apellido` varchar(100) NOT NULL,
  `Cedula` varchar(11) NOT NULL,
  `Telefono` varchar(10) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `usuario` varchar(100) NOT NULL,
  `password` varchar(20) NOT NULL,
  `codigoSeguridad` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`idPersona`, `Nombre`, `Apellido`, `Cedula`, `Telefono`, `Email`, `usuario`, `password`, `codigoSeguridad`) VALUES
(1, 'Carlos Ilich', 'Torrado', '1093887001', '3105638850', 'ingsistemas@cucuta.udes.edu.co', 'carlos', 'torrado', '12345'),
(2, 'Nataly', 'Duque Paez', '1091811138', '3123414103', 'natali.duque@gmail.com', 'nataly', 'duque', '6162'),
(3, 'Edgar', 'Rolón Camargo', '789456123', '3144050606', 'proyectosudes2018@gmail.com', 'edgar', 'rolon', '78945'),
(4, 'Marieth Maria', 'Perpiñan Araujo', '887012456', '3016947301', 'ma.perpinan@mail.udes.edu.co', 'marieth', 'perpiñan', '1234'),
(6, 'Douglas', 'Acosta Contreras', '1024758632', '3103268608', 'do.acosta@mail.udes.edu.co', 'douglas', 'acosta', '1234'),
(7, 'LESLEY FABIOLA ', 'BOHORQUEZ', '00000000', '000000000', 'fbohorquez@cucuta.udes.edu.co', 'fabiola', 'bohorquez', '90335'),
(8, 'MARÍA DEL PILAR', 'ROJAS', '00000', '000000', 'ma.rojas@mail.udes.edu.co', 'pilar', 'rojas', '3081'),
(9, 'JESUS REINALDO', 'RINCÓN CARRILLO', '00000', '00000', 'visibilidad@cucuta.udes.edu.co', 'jesus', 'rincon', '18122'),
(10, 'FEISSAN ALONSO', 'GERENA MATEUS', '0000', '00000', 'FE.GERENA@MAIL.UDES.EDU.CO', 'feissan', 'gerena', '57246'),
(11, 'OLMAN GERARDO', 'SUAREZ MORENO', '0000', '00000', 'OL.SUAREZ@MAIL.UDES.EDU.CO', 'olman', 'suarez', '34050');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `planaccion`
--

CREATE TABLE `planaccion` (
  `idPlanAccion` int(11) NOT NULL,
  `NombrePlan` varchar(50) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFinalizacion` date NOT NULL,
  `idCondicion` int(11) NOT NULL,
  `ResponsableEjecucion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `planaccion`
--

INSERT INTO `planaccion` (`idPlanAccion`, `NombrePlan`, `fechaInicio`, `fechaFinalizacion`, `idCondicion`, `ResponsableEjecucion`) VALUES
(5, 'MAT- Justificación', '2019-05-01', '2019-05-31', 2, 'Coordinador de Calidad '),
(6, 'MAT- Personal Docente', '2019-05-16', '2019-05-17', 7, 'Coordinador de Calidad '),
(7, 'MAT- Contenidos Curriculares', '2019-05-18', '2019-05-31', 3, 'Coordinador de Calidad '),
(19, 'MAT- Relación con el sector externo', '2019-05-15', '2019-05-24', 6, 'Coordinador de Calidad '),
(20, 'MAT- Infraestructura Física', '2019-05-24', '2019-05-25', 9, 'Coordinador de Calidad ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `privilegios`
--

CREATE TABLE `privilegios` (
  `idPrivilegios` int(11) NOT NULL,
  `idRolPersona` int(11) NOT NULL,
  `idReq` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `privilegios`
--

INSERT INTO `privilegios` (`idPrivilegios`, `idRolPersona`, `idReq`) VALUES
(1, 2, 1),
(2, 2, 3),
(3, 2, 4),
(4, 2, 5),
(5, 3, 1),
(6, 3, 2),
(7, 3, 3),
(8, 3, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `requerimiento`
--

CREATE TABLE `requerimiento` (
  `idReq` int(11) NOT NULL,
  `idModulo` int(11) NOT NULL,
  `nomRequerimiento` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `requerimiento`
--

INSERT INTO `requerimiento` (`idReq`, `idModulo`, `nomRequerimiento`) VALUES
(1, 1, 'RF01-INICIO'),
(2, 2, 'RF01-NewMatr'),
(3, 2, 'RF02-VisuMat'),
(4, 2, 'RF03-Vlistad'),
(5, 2, 'RF04-VerMatr'),
(6, 2, 'RF05-CrearMa'),
(7, 2, 'RF06-AgAnali'),
(8, 2, 'RF07-AggAcci'),
(9, 2, 'RF08-AggTare');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `idRol` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`idRol`, `nombre`) VALUES
(1, 'Coordinador Programa'),
(2, 'Coordinador Calidad'),
(3, 'Docente'),
(4, 'Administrador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rolpersona`
--

CREATE TABLE `rolpersona` (
  `idRolPersona` int(11) NOT NULL,
  `idRol` int(11) NOT NULL,
  `idPersona` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `rolpersona`
--

INSERT INTO `rolpersona` (`idRolPersona`, `idRol`, `idPersona`) VALUES
(1, 4, 1),
(2, 1, 1),
(3, 2, 2),
(4, 3, 3),
(5, 3, 4),
(16, 3, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarea`
--

CREATE TABLE `tarea` (
  `idTarea` int(11) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `observacion` varchar(100) NOT NULL,
  `fechaInicioEjecucion` date NOT NULL,
  `fechaFinalizacionEjecucion` date NOT NULL,
  `DescripcionRecursos` varchar(300) NOT NULL,
  `Costos` varchar(50) NOT NULL,
  `idDocente` int(11) NOT NULL,
  `idAccion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tarea`
--

INSERT INTO `tarea` (`idTarea`, `descripcion`, `observacion`, `fechaInicioEjecucion`, `fechaFinalizacionEjecucion`, `DescripcionRecursos`, `Costos`, `idDocente`, `idAccion`) VALUES
(1, 'Tarea 1 para edgar', '', '2019-05-01', '2019-05-02', 'Computadores', '$2.000.000,00', 1, 1),
(3, 'Segunda tarea para edgar', '', '2019-05-03', '2019-05-04', 'mesas', '$150.000,00', 1, 1),
(4, 'Douglas tarea 1', '', '2019-05-14', '2019-05-15', 'sillas', '$230.000,00', 4, 2),
(5, 'Douglas tarea numero 2', '', '2019-05-16', '2019-05-17', 'parlantes', '$142.000,00', 4, 2),
(6, 'tarea primero', '', '2019-05-01', '2019-05-02', 'dasjdhasd', '$1.200,00', 1, 3),
(7, 'tarea 2', '', '2019-05-03', '2019-05-04', 'dasdsa', '$15.421,00', 1, 3),
(8, 'tarea 4', '', '2019-05-08', '2019-05-09', 'sdadsad', '$20.000,00', 3, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `valoracionplan`
--

CREATE TABLE `valoracionplan` (
  `idValoracionPlan` int(11) NOT NULL,
  `tipoValoracion` varchar(100) NOT NULL,
  `Observacion` text NOT NULL,
  `fechaValoracionPlan` datetime DEFAULT CURRENT_TIMESTAMP,
  `idPlanAccion` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `accion`
--
ALTER TABLE `accion`
  ADD PRIMARY KEY (`idAccion`),
  ADD KEY `idCondicionCalidad` (`idCondicionCalidad`),
  ADD KEY `idAnalisisInterno` (`idAnalisisInterno`);

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`idAdministrador`),
  ADD UNIQUE KEY `idPersona` (`idPersona`);

--
-- Indices de la tabla `analisisinterno`
--
ALTER TABLE `analisisinterno`
  ADD PRIMARY KEY (`idAnalisisInterno`),
  ADD KEY `idEjeEstrategico` (`idEjeEstrategico`),
  ADD KEY `idCondicionCalidad` (`idCondicionCalidad`);

--
-- Indices de la tabla `condicioncalidad`
--
ALTER TABLE `condicioncalidad`
  ADD PRIMARY KEY (`idCondicionCalidad`);

--
-- Indices de la tabla `coordinadorcalidad`
--
ALTER TABLE `coordinadorcalidad`
  ADD PRIMARY KEY (`idCoordinadorCalidad`),
  ADD UNIQUE KEY `idPersona` (`idPersona`);

--
-- Indices de la tabla `coordinadorprograma`
--
ALTER TABLE `coordinadorprograma`
  ADD PRIMARY KEY (`idCoordinadorPrograma`),
  ADD UNIQUE KEY `idPersona` (`idPersona`);

--
-- Indices de la tabla `docente`
--
ALTER TABLE `docente`
  ADD PRIMARY KEY (`idDocente`),
  ADD UNIQUE KEY `idPersona` (`idPersona`);

--
-- Indices de la tabla `ejeestrategico`
--
ALTER TABLE `ejeestrategico`
  ADD PRIMARY KEY (`idEjeEstrategico`);

--
-- Indices de la tabla `informe`
--
ALTER TABLE `informe`
  ADD PRIMARY KEY (`idInforme`),
  ADD KEY `idPlanAccion` (`idPlanAccion`),
  ADD KEY `idCoordinadorPrograma` (`idCoordinadorPrograma`);

--
-- Indices de la tabla `modulo`
--
ALTER TABLE `modulo`
  ADD PRIMARY KEY (`idModulo`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`idPersona`);

--
-- Indices de la tabla `planaccion`
--
ALTER TABLE `planaccion`
  ADD PRIMARY KEY (`idPlanAccion`),
  ADD UNIQUE KEY `idCondicion` (`idCondicion`);

--
-- Indices de la tabla `privilegios`
--
ALTER TABLE `privilegios`
  ADD PRIMARY KEY (`idPrivilegios`),
  ADD KEY `idReq` (`idReq`),
  ADD KEY `idRolPersona` (`idRolPersona`);

--
-- Indices de la tabla `requerimiento`
--
ALTER TABLE `requerimiento`
  ADD PRIMARY KEY (`idReq`),
  ADD KEY `idModulo` (`idModulo`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`idRol`);

--
-- Indices de la tabla `rolpersona`
--
ALTER TABLE `rolpersona`
  ADD PRIMARY KEY (`idRolPersona`),
  ADD KEY `idRol` (`idRol`),
  ADD KEY `idPersona` (`idPersona`);

--
-- Indices de la tabla `tarea`
--
ALTER TABLE `tarea`
  ADD PRIMARY KEY (`idTarea`),
  ADD KEY `idAccion` (`idAccion`),
  ADD KEY `idDocente` (`idDocente`) USING BTREE;

--
-- Indices de la tabla `valoracionplan`
--
ALTER TABLE `valoracionplan`
  ADD PRIMARY KEY (`idValoracionPlan`),
  ADD UNIQUE KEY `idPlanAccion` (`idPlanAccion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `accion`
--
ALTER TABLE `accion`
  MODIFY `idAccion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `administrador`
--
ALTER TABLE `administrador`
  MODIFY `idAdministrador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `analisisinterno`
--
ALTER TABLE `analisisinterno`
  MODIFY `idAnalisisInterno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `condicioncalidad`
--
ALTER TABLE `condicioncalidad`
  MODIFY `idCondicionCalidad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `coordinadorcalidad`
--
ALTER TABLE `coordinadorcalidad`
  MODIFY `idCoordinadorCalidad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `coordinadorprograma`
--
ALTER TABLE `coordinadorprograma`
  MODIFY `idCoordinadorPrograma` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `docente`
--
ALTER TABLE `docente`
  MODIFY `idDocente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `ejeestrategico`
--
ALTER TABLE `ejeestrategico`
  MODIFY `idEjeEstrategico` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `informe`
--
ALTER TABLE `informe`
  MODIFY `idInforme` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `modulo`
--
ALTER TABLE `modulo`
  MODIFY `idModulo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `idPersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `planaccion`
--
ALTER TABLE `planaccion`
  MODIFY `idPlanAccion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `privilegios`
--
ALTER TABLE `privilegios`
  MODIFY `idPrivilegios` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `requerimiento`
--
ALTER TABLE `requerimiento`
  MODIFY `idReq` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `idRol` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `rolpersona`
--
ALTER TABLE `rolpersona`
  MODIFY `idRolPersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `tarea`
--
ALTER TABLE `tarea`
  MODIFY `idTarea` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `valoracionplan`
--
ALTER TABLE `valoracionplan`
  MODIFY `idValoracionPlan` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `accion`
--
ALTER TABLE `accion`
  ADD CONSTRAINT `accion_ibfk_1` FOREIGN KEY (`idCondicionCalidad`) REFERENCES `condicioncalidad` (`idCondicionCalidad`),
  ADD CONSTRAINT `accion_ibfk_2` FOREIGN KEY (`idAnalisisInterno`) REFERENCES `analisisinterno` (`idAnalisisInterno`);

--
-- Filtros para la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD CONSTRAINT `administrador_ibfk_1` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`);

--
-- Filtros para la tabla `analisisinterno`
--
ALTER TABLE `analisisinterno`
  ADD CONSTRAINT `analisisinterno_ibfk_2` FOREIGN KEY (`idEjeEstrategico`) REFERENCES `ejeestrategico` (`idEjeEstrategico`),
  ADD CONSTRAINT `analisisinterno_ibfk_3` FOREIGN KEY (`idCondicionCalidad`) REFERENCES `condicioncalidad` (`idCondicionCalidad`);

--
-- Filtros para la tabla `coordinadorcalidad`
--
ALTER TABLE `coordinadorcalidad`
  ADD CONSTRAINT `coordinadorcalidad_ibfk_1` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`);

--
-- Filtros para la tabla `coordinadorprograma`
--
ALTER TABLE `coordinadorprograma`
  ADD CONSTRAINT `coordinadorprograma_ibfk_1` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`);

--
-- Filtros para la tabla `docente`
--
ALTER TABLE `docente`
  ADD CONSTRAINT `docente_ibfk_1` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`);

--
-- Filtros para la tabla `informe`
--
ALTER TABLE `informe`
  ADD CONSTRAINT `informe_ibfk_1` FOREIGN KEY (`idCoordinadorPrograma`) REFERENCES `coordinadorprograma` (`idCoordinadorPrograma`),
  ADD CONSTRAINT `informe_ibfk_2` FOREIGN KEY (`idPlanAccion`) REFERENCES `planaccion` (`idPlanAccion`);

--
-- Filtros para la tabla `planaccion`
--
ALTER TABLE `planaccion`
  ADD CONSTRAINT `planaccion_ibfk_1` FOREIGN KEY (`idCondicion`) REFERENCES `condicioncalidad` (`idCondicionCalidad`);

--
-- Filtros para la tabla `privilegios`
--
ALTER TABLE `privilegios`
  ADD CONSTRAINT `privilegios_ibfk_2` FOREIGN KEY (`idReq`) REFERENCES `requerimiento` (`idReq`),
  ADD CONSTRAINT `privilegios_ibfk_3` FOREIGN KEY (`idRolPersona`) REFERENCES `rolpersona` (`idRolPersona`);

--
-- Filtros para la tabla `requerimiento`
--
ALTER TABLE `requerimiento`
  ADD CONSTRAINT `requerimiento_ibfk_1` FOREIGN KEY (`idModulo`) REFERENCES `modulo` (`idModulo`);

--
-- Filtros para la tabla `rolpersona`
--
ALTER TABLE `rolpersona`
  ADD CONSTRAINT `rolpersona_ibfk_1` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`),
  ADD CONSTRAINT `rolpersona_ibfk_2` FOREIGN KEY (`idRol`) REFERENCES `rol` (`idRol`);

--
-- Filtros para la tabla `tarea`
--
ALTER TABLE `tarea`
  ADD CONSTRAINT `tarea_ibfk_1` FOREIGN KEY (`idDocente`) REFERENCES `docente` (`idDocente`),
  ADD CONSTRAINT `tarea_ibfk_3` FOREIGN KEY (`idAccion`) REFERENCES `accion` (`idAccion`);

--
-- Filtros para la tabla `valoracionplan`
--
ALTER TABLE `valoracionplan`
  ADD CONSTRAINT `valoracionplan_ibfk_1` FOREIGN KEY (`idPlanAccion`) REFERENCES `planaccion` (`idPlanAccion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
