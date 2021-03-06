-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: juegopreguntasrespuestas
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `id_categoria` int NOT NULL AUTO_INCREMENT,
  `nivel_dificultad` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'facil'),(2,'normal'),(3,'dificil'),(4,'muy dificil'),(5,'maximo');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historico`
--

DROP TABLE IF EXISTS `historico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historico` (
  `id_historico` int NOT NULL AUTO_INCREMENT,
  `id_jugador` int DEFAULT NULL,
  PRIMARY KEY (`id_historico`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historico`
--

LOCK TABLES `historico` WRITE;
/*!40000 ALTER TABLE `historico` DISABLE KEYS */;
INSERT INTO `historico` VALUES (1,1),(2,2),(3,3);
/*!40000 ALTER TABLE `historico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jugador`
--

DROP TABLE IF EXISTS `jugador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jugador` (
  `id_jugador` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `puntaje` int DEFAULT NULL,
  PRIMARY KEY (`id_jugador`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jugador`
--

LOCK TABLES `jugador` WRITE;
/*!40000 ALTER TABLE `jugador` DISABLE KEYS */;
INSERT INTO `jugador` VALUES (1,'Camila',15500),(2,'Camila x2',NULL),(3,'Camila x3',3500);
/*!40000 ALTER TABLE `jugador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pregunta`
--

DROP TABLE IF EXISTS `pregunta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pregunta` (
  `id_pregunta` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(500) DEFAULT NULL,
  `id_categoria` int DEFAULT NULL,
  PRIMARY KEY (`id_pregunta`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pregunta`
--

LOCK TABLES `pregunta` WRITE;
/*!40000 ALTER TABLE `pregunta` DISABLE KEYS */;
INSERT INTO `pregunta` VALUES (1,'??Qui??n escribi?? La Odisea?',1),(2,'??Qu?? tipo de animal es la ballena?',1),(3,'??A cu??nto equivale ?? (pi)?',1),(4,'??Cu??ntos minutos dura un partido de f??tbol?',1),(5,'??Cu??l es un lenguaje de programaci??n?',1),(6,'??Cu??l no es un sabor primario? ',2),(7,'??Cu??ntos a??os tengo sabiendo que la tercera parte de ellos menos 1 es igual a la sexta parte?',2),(8,'??Cu??l es el autor de la letra del Himno Nacional?',2),(9,'??Cu??l es la ??nica ave capaz de volar hacia atr??s?',2),(10,'??Qui??n es el autor del libro ???Cien a??os de soledad????',2),(11,'??C??mo se llama este templo subterr??neo situado en Colombia?',3),(12,'??En qu?? pa??s se encuentra ubicada la Casa Rosada?',3),(13,'??Cu??nto es la cuarta parte de la tercera parte?',3),(14,'??Cu??nto habr?? que rebajar un producto para que valga lo mismo que val??a antes de que incrementase un 25% su precio?',3),(15,'??Qu?? a??o fue bisiesto?',3),(16,'??Cu??l es la ??nica ciudad que est?? en dos continentes distintos?',4),(17,'??Cu??l fue el segundo hombre en ir a la luna?',4),(18,'??Cu??l es el ??rgano m??s grande del cuerpo humano?',4),(19,'??En qu?? deporte puedes hacer una tacada?',4),(20,'??Qu?? elemento de la tabla peri??dica tiene este s??mbolo qu??mico Co?',4),(21,'??Cu??l es la estrella m??s cercana al Sol?',5),(22,'??Qu?? animal tiene 47 piezas de esmalte fijadas a los huesos maxilares?',5),(23,'??Cu??ntos mares rodean la pen??nsula de los Balcanes?',5),(24,'??Qu?? es el colt??n?',5),(25,'??Cuantos a??os tiene la mujer m??s longeva del mundo?',5);
/*!40000 ALTER TABLE `pregunta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `respuesta`
--

DROP TABLE IF EXISTS `respuesta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `respuesta` (
  `id_respuesta` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(200) DEFAULT NULL,
  `es_correcta` tinyint DEFAULT NULL,
  `id_pregunta` int DEFAULT NULL,
  PRIMARY KEY (`id_respuesta`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `respuesta`
--

LOCK TABLES `respuesta` WRITE;
/*!40000 ALTER TABLE `respuesta` DISABLE KEYS */;
INSERT INTO `respuesta` VALUES (1,'Plat??n',0,1),(2,'Homero',1,1),(3,'S??crates',0,1),(4,'Her??doto',0,1),(5,'Reptiles',0,2),(6,'Por??feros',0,2),(7,'Peces',0,2),(8,'Mam??feros',1,2),(9,'3,141592',1,3),(10,'3,151692',0,3),(11,'3,135215',0,3),(12,'3,145215',0,3),(13,'80',0,4),(14,'105',0,4),(15,'90',1,4),(16,'95',0,4),(17,'NodeJS',0,5),(18,'React JS',0,5),(19,'Java',1,5),(20,'Angular',0,5),(21,'Dulce',0,6),(22,'Umami',0,6),(23,'Amargo',0,6),(24,'Agrio',1,6),(25,'8',0,7),(26,'6',1,7),(27,'9',0,7),(28,'3',0,7),(29,'Rafael N????ez',1,8),(30,'Oreste S??ndici',0,8),(31,'Blas Parera',0,8),(32,'Miguel Antonio Caro',0,8),(33,'Chipe Azul',0,9),(34,'Gerig??n piquicorto',0,9),(35,'Colibr??',1,9),(36,'B??ho',0,9),(37,'Mario Vargas Llosa',0,10),(38,'Julio Cort??zar',0,10),(39,'Juan Rulfo',0,10),(40,'Gabriel Garc??a Marquez ',1,10),(41,'Catedral de Sal',1,11),(42,'Catedral Primada',0,11),(43,'Templo de San Agust??n',0,11),(44,'Templo Bogot?? Colombia',0,11),(45,'Chile',0,12),(46,'Mexico',0,12),(47,'Colombia',0,12),(48,'Argentina',1,12),(49,'Un doceavo',1,13),(50,'3/4 partes',0,13),(51,'Dos',0,13),(52,'Un S??ptimo',0,13),(53,'25%',0,14),(54,'75%',0,14),(55,'20%',1,14),(56,'10%',0,14),(57,'2021',0,15),(58,'2013',0,15),(59,'2018',0,15),(60,'2012',1,15),(61,'Mosc??',0,16),(62,'Estambul',1,16),(63,'Berl??n',0,16),(64,'Nairobi',0,16),(71,'Edwin Eugene Aldrin',1,17),(72,'Neil Armstrong',0,17),(73,'Eugene Cernan',0,17),(74,'Michael Armstrong',0,17),(75,'La piel',1,18),(76,'El coraz??n',0,18),(77,'El h??gado',0,18),(78,'El cerebro',0,18),(79,'Baloncesto',0,19),(80,'Golf',0,19),(81,'Voley',0,19),(82,'Billar',1,19),(83,'Cromo',0,20),(84,'Copernicio',0,20),(85,'Cadmio',0,20),(86,'Ninguna de las anteriores',1,20),(87,'Alfa Centauri',1,21),(88,'Betelgeuse',0,21),(89,'Achernar',0,21),(90,'Rigel',0,21),(91,'Tibur??n',0,22),(92,'Mosquito',1,22),(93,'Nutria',0,22),(94,'Caballo',0,22),(95,'5',0,23),(96,'2',0,23),(97,'7',0,23),(98,'4',1,23),(99,'Animal',0,24),(100,'Pueblo',0,24),(101,'Mineral',1,24),(102,'Rio',0,24),(103,'114',0,25),(104,'117',0,25),(105,'119',1,25),(106,'121',0,25);
/*!40000 ALTER TABLE `respuesta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-11 19:39:12
