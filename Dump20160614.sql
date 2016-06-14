CREATE DATABASE  IF NOT EXISTS `retalia_db` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `retalia_db`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: retalia_db
-- ------------------------------------------------------
-- Server version	5.7.10-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `challenge`
--

DROP TABLE IF EXISTS `challenge`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `challenge` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(45) NOT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `PendingUserChallenges` int(11) DEFAULT NULL,
  `RepliedUserChallenges` int(11) DEFAULT NULL,
  `CompletedUserChallenges` int(11) DEFAULT NULL,
  `UncompletedUserChallenges` int(11) DEFAULT NULL,
  `CreatedDate` varchar(45) DEFAULT NULL,
  `Owner_id` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `Owner_id` (`Owner_id`),
  CONSTRAINT `Owner` FOREIGN KEY (`Owner_id`) REFERENCES `user` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `challenge`
--

LOCK TABLES `challenge` WRITE;
/*!40000 ALTER TABLE `challenge` DISABLE KEYS */;
INSERT INTO `challenge` VALUES (1,'Reto desde postman','descripción',1,0,0,0,'16/02/2016 12:03:02','0');
/*!40000 ALTER TABLE `challenge` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `multimedia`
--

DROP TABLE IF EXISTS `multimedia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `multimedia` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Link` varchar(45) NOT NULL,
  `Duration` varchar(45) NOT NULL,
  `Format` varchar(45) DEFAULT NULL,
  `Type` int(11) DEFAULT NULL,
  `id_Owner` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `id_Owner` (`id_Owner`),
  CONSTRAINT `Owner_M` FOREIGN KEY (`id_Owner`) REFERENCES `user` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `multimedia`
--

LOCK TABLES `multimedia` WRITE;
/*!40000 ALTER TABLE `multimedia` DISABLE KEYS */;
INSERT INTO `multimedia` VALUES (1,'https://www.youtube.com/watch?v=OJ2WCy1C494','14','.mp4',0,'1');
/*!40000 ALTER TABLE `multimedia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `ID` varchar(45) NOT NULL,
  `FacebookID` varchar(45) NOT NULL,
  `Type` int(11) unsigned NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Photo` varchar(310) DEFAULT NULL,
  `Likes` int(20) DEFAULT '0',
  `Dislikes` int(20) DEFAULT '0',
  `RegistredDate` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('0','14',0,'María Díaz Calvo','mdiaz_calvo@hotmail.com','https://scontent.xx.fbcdn.net/hprofile-prn2/v/t1.0-1/c33.0.200.200/p200x200/544122_10200162153588842_2023102720_n.jpg?oh=f86afe86c2681a1e2b346a3b765ed3e2&oe=576E304B',0,0,'16/02/2016 12:03:02'),('1','17',0,'Álvaro Arbeloa','arbeloa@hotmail.com','https://www.google.es/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwimvK3HyJ3NAhUE2hoKHeRrCtgQjRwIBw&url=http%3A%2F%2Fokdiario.com%2Fdeportes%2Ffutbol%2F2016%2F03%2F31%2Fsera-el-ultimo-clasico-de-cristiano-ronaldo-99279&psig=AFQjCNFDy_vJIz6Hs-0eD33e5URFUJGgIw&ust=1465651785925310',1,0,'16/02/2016 12:03:02'),('2','7',0,'Cristiano Ronaldo','cristiano@hotmail.com','http://www.nosoloposters.com/3750/postal-real-madrid-arbeloa-2014-15.jpg',0,0,'16/02/2016 12:03:02'),('3','22',0,'Isco','isco@hotmail.com','https://www.google.es/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwityKHH4J_NAhWDDRoKHYAkAIAQjRwIBw&url=http%3A%2F%2Fwww.transfermarkt.es%2Fisco%2Fprofil%2Fspieler%2F85288&psig=AFQjCNEzIZH8VZIp3DCaK3kbO1S14-dAKg&ust=1465726946741604',0,0,'16/02/2016 12:03:02'),('4','19',0,'Luka modric','lukita@hotmail.com','https://www.google.es/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwig05_b4J_NAhXKhRoKHdCNCyUQjRwIBw&url=http%3A%2F%2Fes.uefa.com%2Fuefasupercup%2Fseason%3D2014%2Fclubs%2Fplayer%3D74699%2Findex.html&bvm=bv.124272578,d.d2s&psig=AFQjCNErVyH8O_EuVGhScktiC1a9J49ogQ&ust=1465726982767941',0,0,'16/02/2016 12:03:02'),('5','18',0,'Lucas Vazquez','lvazquez@hotmail.com','https://www.google.es/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwj6-u3k4J_NAhWE1hoKHRM9BP4QjRwIBw&url=http%3A%2F%2Fwww.diariolagrada.com%2Fnoticias%2Fespanyol%2Flucas-vazquez-perico_12223.html&bvm=bv.124272578,d.d2s&psig=AFQjCNFhBZpsV3WpVtR4y5bCUqn73updCQ&ust=1465727017331131',0,0,'16/02/2016 12:03:02'),('6','12',0,'Marcelo','marcelo@hotmail.com','https://www.google.es/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwi65fzu4J_NAhWDVhoKHUS5BL8QjRwIBw&url=http%3A%2F%2Fwww.mediavida.com%2Fforo%2Fdeportes%2Fquien-regatea-mejor-marcelo-neymar-558754&bvm=bv.124272578,d.d2s&psig=AFQjCNEClHvuOC8D1qlHs3Ss6cxetflWew&ust=1465727039478936',0,0,'16/02/2016 12:03:02');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_challenge`
--

DROP TABLE IF EXISTS `user_challenge`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_challenge` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `id_challenge` int(11) NOT NULL,
  `id_sender` varchar(45) NOT NULL,
  `id_Owner` varchar(45) NOT NULL,
  `id_multimedia` int(11) DEFAULT NULL,
  `Status` int(11) NOT NULL,
  `Likes` int(11) DEFAULT NULL,
  `Dislikes` int(11) DEFAULT NULL,
  `UserVote` varchar(45) DEFAULT NULL,
  `SendDate` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `id_challenge` (`id_challenge`),
  KEY `id_sender` (`id_sender`),
  KEY `id_Owner` (`id_Owner`),
  KEY `id_multimedia` (`id_multimedia`),
  CONSTRAINT `Challenge` FOREIGN KEY (`id_challenge`) REFERENCES `challenge` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `Multimedia` FOREIGN KEY (`id_multimedia`) REFERENCES `multimedia` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `Owner_UC` FOREIGN KEY (`id_Owner`) REFERENCES `user` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `Sender` FOREIGN KEY (`id_sender`) REFERENCES `user` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_challenge`
--

LOCK TABLES `user_challenge` WRITE;
/*!40000 ALTER TABLE `user_challenge` DISABLE KEYS */;
INSERT INTO `user_challenge` VALUES (1,1,'0','1',1,0,1,0,'0','16/02/2016 12:03:02');
/*!40000 ALTER TABLE `user_challenge` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vote`
--

DROP TABLE IF EXISTS `vote`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vote` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `id_user_challenge` int(11) NOT NULL,
  `id_voter` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vote`
--

LOCK TABLES `vote` WRITE;
/*!40000 ALTER TABLE `vote` DISABLE KEYS */;
INSERT INTO `vote` VALUES (1,1,0);
/*!40000 ALTER TABLE `vote` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-14 13:21:44
