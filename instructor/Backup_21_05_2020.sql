CREATE DATABASE  IF NOT EXISTS `eduappdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `eduappdb`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: eduappdb
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `tbl_mst_course`
--

DROP TABLE IF EXISTS `tbl_mst_course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_mst_course` (
  `Course_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Course_Name` varchar(1000) DEFAULT NULL,
  `Course_Description` varchar(1000) DEFAULT NULL,
  `Course_Fee` varchar(45) DEFAULT NULL,
  `Course_Duration` varchar(1000) DEFAULT NULL,
  `Is_Certification_Course` int(11) DEFAULT NULL,
  `Is_Active` int(11) DEFAULT '1',
  `Created_By` int(11) DEFAULT NULL,
  `Created_Date` datetime DEFAULT NULL,
  `Modified_By` int(11) DEFAULT NULL,
  `Modified_Date` datetime DEFAULT NULL,
  PRIMARY KEY (`Course_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_mst_course`
--

LOCK TABLES `tbl_mst_course` WRITE;
/*!40000 ALTER TABLE `tbl_mst_course` DISABLE KEYS */;
INSERT INTO `tbl_mst_course` VALUES (24,'Core JAVA','Experties in JAVA with CSD','10000','110 hr',1,1,7,'2020-05-09 16:38:08',7,'2020-05-13 22:21:54'),(25,'Java Script','Introduction to java script','8000','90 hr',1,1,7,'2020-05-09 16:38:56',7,'2020-05-09 16:38:56'),(26,'Java Script','Introduction to java script','8000','90 hr',1,0,7,'2020-05-09 16:42:12',7,'2020-05-09 16:53:38'),(27,'PYThon','Language Fundamental','8000','100 hr',1,0,7,'2020-05-13 19:02:56',7,'2020-05-21 22:19:15'),(28,'PYThon','Language Fundamental','8000','100 hr',1,1,7,'2020-05-13 19:42:08',NULL,NULL),(29,'AI','adsad','30000','50:00:00',1,1,8,'2020-05-19 13:44:36',NULL,NULL);
/*!40000 ALTER TABLE `tbl_mst_course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_mst_lecture`
--

DROP TABLE IF EXISTS `tbl_mst_lecture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_mst_lecture` (
  `Lecture_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Lecture_Name` varchar(1000) DEFAULT NULL,
  `Lecture_Description` varchar(1000) DEFAULT NULL,
  `Created_By` int(11) DEFAULT NULL,
  `Created_Date` datetime DEFAULT NULL,
  `Modified_By` int(11) DEFAULT NULL,
  `Modified_Date` datetime DEFAULT NULL,
  PRIMARY KEY (`Lecture_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_mst_lecture`
--

LOCK TABLES `tbl_mst_lecture` WRITE;
/*!40000 ALTER TABLE `tbl_mst_lecture` DISABLE KEYS */;
INSERT INTO `tbl_mst_lecture` VALUES (14,'Fundamentals','Java Fundamentals',7,'2020-05-09 18:17:24',7,'2020-05-13 22:15:37'),(15,'Exception Handling','Introduction to Exceptions',7,'2020-05-09 18:25:59',7,'2020-05-09 18:25:59'),(16,'Exception Handling','Introduction to Exceptions',7,'2020-05-12 23:45:49',NULL,NULL),(17,'Exception Handling','Introduction to Exceptions',7,'2020-05-12 23:53:21',NULL,NULL),(18,'Exception Handling','Introduction to Exceptions',7,'2020-05-12 23:57:22',NULL,NULL),(19,'Exception Handling','Introduction to Exceptions',7,'2020-05-12 23:58:38',NULL,NULL),(20,'Exception Handling','Introduction to Exceptions',7,'2020-05-12 23:58:57',NULL,NULL),(21,'Exception Handling','Introduction to Exceptions',7,'2020-05-13 19:42:57',NULL,NULL),(22,'Exception Handling','Introduction to Exceptions',7,'2020-05-13 22:19:08',NULL,NULL);
/*!40000 ALTER TABLE `tbl_mst_lecture` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_mst_resource_type`
--

DROP TABLE IF EXISTS `tbl_mst_resource_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_mst_resource_type` (
  `Resource_Type_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Resource_Type_Title` varchar(1000) DEFAULT NULL,
  `Created_Date` datetime DEFAULT NULL,
  `Created_by` int(11) DEFAULT NULL,
  `Modified_Date` datetime DEFAULT NULL,
  `Modified_By` int(11) DEFAULT NULL,
  PRIMARY KEY (`Resource_Type_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_mst_resource_type`
--

LOCK TABLES `tbl_mst_resource_type` WRITE;
/*!40000 ALTER TABLE `tbl_mst_resource_type` DISABLE KEYS */;
INSERT INTO `tbl_mst_resource_type` VALUES (1,'Article',NULL,NULL,NULL,NULL),(2,'Paid Video',NULL,NULL,NULL,NULL),(3,'Free Video',NULL,NULL,NULL,NULL),(4,'External Website Link',NULL,NULL,NULL,NULL),(5,'Quiz',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `tbl_mst_resource_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_mst_user_details`
--

DROP TABLE IF EXISTS `tbl_mst_user_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_mst_user_details` (
  `User_Id` int(11) NOT NULL AUTO_INCREMENT,
  `First_Name` varchar(1000) DEFAULT NULL,
  `Last_Name` varchar(1000) DEFAULT NULL,
  `Email_Id` varchar(1000) DEFAULT NULL,
  `Password` varchar(1000) DEFAULT NULL,
  `Mobile_No` varchar(1000) DEFAULT NULL,
  `Profile_Pic_Url` varchar(1000) DEFAULT NULL,
  `Is_Google_Login` int(1) DEFAULT '0',
  `Is_Verified` int(1) DEFAULT '0',
  `Created_Date` datetime DEFAULT NULL,
  `Modified_Date` datetime DEFAULT NULL,
  PRIMARY KEY (`User_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_mst_user_details`
--

LOCK TABLES `tbl_mst_user_details` WRITE;
/*!40000 ALTER TABLE `tbl_mst_user_details` DISABLE KEYS */;
INSERT INTO `tbl_mst_user_details` VALUES (5,'Divyanshu','Rawat','divyanshu@gmail.com','password','9782078240',NULL,NULL,0,'2020-03-27 10:07:33',NULL),(7,'vinay,1,5,7,7','gupta','vinay@gmail.com','Password','9079395649',NULL,NULL,0,'2020-03-29 15:31:51','2020-05-10 17:27:15'),(8,'mohit','jain','jainmanu436@gmail.com','password','8561011235',NULL,NULL,0,'2020-03-31 17:54:56','2020-04-09 11:29:48');
/*!40000 ALTER TABLE `tbl_mst_user_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_mst_user_role`
--

DROP TABLE IF EXISTS `tbl_mst_user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_mst_user_role` (
  `Role_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Role_Title` varchar(1000) DEFAULT NULL,
  `Created_Date` datetime DEFAULT NULL,
  `Created_by` int(11) DEFAULT NULL,
  `Modified_Date` datetime DEFAULT NULL,
  `Modified_By` int(11) DEFAULT NULL,
  PRIMARY KEY (`Role_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_mst_user_role`
--

LOCK TABLES `tbl_mst_user_role` WRITE;
/*!40000 ALTER TABLE `tbl_mst_user_role` DISABLE KEYS */;
INSERT INTO `tbl_mst_user_role` VALUES (1,'Instructor',NULL,NULL,NULL,NULL),(2,'Student',NULL,NULL,NULL,NULL),(3,'Working Professional',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `tbl_mst_user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_trns_course_details`
--

DROP TABLE IF EXISTS `tbl_trns_course_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_trns_course_details` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Fk_Course_Id` int(11) DEFAULT NULL,
  `Course_Pre_Requisites` varchar(1000) DEFAULT NULL,
  `Lecture_Order` varchar(1000) DEFAULT NULL,
  `Course_Tags` varchar(1000) DEFAULT NULL,
  `Course_Rating` float DEFAULT '0',
  `Created_By` int(11) DEFAULT NULL,
  `Created_Date` datetime DEFAULT NULL,
  `Modified_By` int(11) DEFAULT NULL,
  `Modified_Date` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Fk_Course_Id_idx` (`Fk_Course_Id`),
  CONSTRAINT `Fk_Course_Id2` FOREIGN KEY (`Fk_Course_Id`) REFERENCES `tbl_mst_course` (`Course_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_trns_course_details`
--

LOCK TABLES `tbl_trns_course_details` WRITE;
/*!40000 ALTER TABLE `tbl_trns_course_details` DISABLE KEYS */;
INSERT INTO `tbl_trns_course_details` VALUES (4,24,'No previous knowledge Required','19,18,22','JAVA FROM BEGINNER TO EXPERT',NULL,7,'2020-05-09 16:38:08',7,'2020-05-13 20:04:57'),(5,27,'No previous knowledge Required','-1','PYTHON FOR BEGINNERS',0,7,'2020-05-13 19:02:57',NULL,NULL),(6,28,'No previous knowledge Required','21','PYTHON FOR BEGINNERS',0,7,'2020-05-13 19:42:08',NULL,NULL),(7,29,NULL,NULL,NULL,0,8,'2020-05-19 13:44:36',NULL,NULL);
/*!40000 ALTER TABLE `tbl_trns_course_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_trns_lecture_details`
--

DROP TABLE IF EXISTS `tbl_trns_lecture_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_trns_lecture_details` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Fk_Lecture_Id` int(11) DEFAULT NULL,
  `Fk_Course_Id` int(11) DEFAULT NULL,
  `Is_Active` int(11) DEFAULT '1',
  `Created_Date` datetime DEFAULT NULL,
  `Created_By` int(11) DEFAULT NULL,
  `Modified_Date` datetime DEFAULT NULL,
  `Modified_By` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Course_Id_idx` (`Fk_Course_Id`),
  KEY `Lecture_Id_idx` (`Fk_Lecture_Id`),
  CONSTRAINT `Course_Id` FOREIGN KEY (`Fk_Course_Id`) REFERENCES `tbl_mst_course` (`Course_Id`),
  CONSTRAINT `Lecture_Id` FOREIGN KEY (`Fk_Lecture_Id`) REFERENCES `tbl_mst_lecture` (`Lecture_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_trns_lecture_details`
--

LOCK TABLES `tbl_trns_lecture_details` WRITE;
/*!40000 ALTER TABLE `tbl_trns_lecture_details` DISABLE KEYS */;
INSERT INTO `tbl_trns_lecture_details` VALUES (14,14,24,1,'2020-05-09 18:17:24',7,'2020-05-13 22:21:54',7),(15,15,24,1,'2020-05-09 18:25:59',7,'2020-05-13 22:21:54',7),(16,16,24,1,'2020-05-12 23:45:49',7,'2020-05-13 22:21:54',7),(17,17,24,1,'2020-05-12 23:53:21',7,'2020-05-13 22:21:54',7),(18,18,24,1,'2020-05-12 23:57:22',7,'2020-05-13 22:21:54',7),(19,19,24,1,'2020-05-12 23:58:38',7,'2020-05-13 22:21:54',7),(20,20,25,1,'2020-05-12 23:58:57',7,NULL,NULL),(21,21,28,1,'2020-05-13 19:42:57',7,NULL,NULL),(22,22,24,0,'2020-05-13 22:19:08',7,'2020-05-13 22:21:54',7);
/*!40000 ALTER TABLE `tbl_trns_lecture_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_trns_lecture_resource`
--

DROP TABLE IF EXISTS `tbl_trns_lecture_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_trns_lecture_resource` (
  `Lecture_Resource_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Resource_Name` varchar(1000) DEFAULT NULL,
  `Fk_Resource_Id` int(11) DEFAULT NULL,
  `Fk_Course_Id` int(11) DEFAULT NULL,
  `Fk_Lecture_Id` int(11) DEFAULT NULL,
  `Is_Active` int(11) DEFAULT '1',
  `Created_By` int(11) DEFAULT NULL,
  `Created_Date` datetime DEFAULT NULL,
  `Modified_By` int(11) DEFAULT NULL,
  `Modified_Date` datetime DEFAULT NULL,
  PRIMARY KEY (`Lecture_Resource_Id`),
  KEY `Course_Id_idx` (`Fk_Course_Id`),
  KEY `Lecture_Id_idx` (`Fk_Lecture_Id`),
  KEY `Resource_Id_idx` (`Fk_Resource_Id`),
  CONSTRAINT `Fk_Course_Id` FOREIGN KEY (`Fk_Course_Id`) REFERENCES `tbl_mst_course` (`Course_Id`),
  CONSTRAINT `Fk_Lecture_Id` FOREIGN KEY (`Fk_Lecture_Id`) REFERENCES `tbl_mst_lecture` (`Lecture_Id`),
  CONSTRAINT `Fk_Resource_Id` FOREIGN KEY (`Fk_Resource_Id`) REFERENCES `tbl_trns_resource` (`Resource_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_trns_lecture_resource`
--

LOCK TABLES `tbl_trns_lecture_resource` WRITE;
/*!40000 ALTER TABLE `tbl_trns_lecture_resource` DISABLE KEYS */;
INSERT INTO `tbl_trns_lecture_resource` VALUES (1,'video1',1,24,14,1,7,'2020-05-11 15:13:14',7,'2020-05-11 23:35:31'),(2,'1Article',2,24,14,1,7,'2020-05-11 15:16:04',7,'2020-05-11 23:00:58'),(3,'aa',3,24,14,1,7,'2020-05-19 13:48:04',NULL,NULL);
/*!40000 ALTER TABLE `tbl_trns_lecture_resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_trns_lecture_resource_details`
--

DROP TABLE IF EXISTS `tbl_trns_lecture_resource_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_trns_lecture_resource_details` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Fk_Lecture_Id` int(11) DEFAULT NULL,
  `Resource_Order` varchar(100) DEFAULT NULL,
  `Created_Date` datetime DEFAULT NULL,
  `Created_By` int(11) DEFAULT NULL,
  `Modified_Date` datetime DEFAULT NULL,
  `Modified_By` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Fk_lecture_Id_idx` (`Fk_Lecture_Id`),
  CONSTRAINT `FkLectureId` FOREIGN KEY (`Fk_Lecture_Id`) REFERENCES `tbl_mst_lecture` (`Lecture_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_trns_lecture_resource_details`
--

LOCK TABLES `tbl_trns_lecture_resource_details` WRITE;
/*!40000 ALTER TABLE `tbl_trns_lecture_resource_details` DISABLE KEYS */;
INSERT INTO `tbl_trns_lecture_resource_details` VALUES (1,14,'2,1,3','2020-05-11 15:13:15',7,'2020-05-19 13:48:04',7);
/*!40000 ALTER TABLE `tbl_trns_lecture_resource_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_trns_resource`
--

DROP TABLE IF EXISTS `tbl_trns_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_trns_resource` (
  `Resource_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Fk_Resource_Type_Id` int(11) DEFAULT NULL,
  `Resource_Title` varchar(1000) DEFAULT NULL,
  `Resource_Url` varchar(1000) DEFAULT NULL,
  `Resource_Length` varchar(100) DEFAULT NULL,
  `Created_By` int(11) DEFAULT NULL,
  `Created_Date` datetime DEFAULT NULL,
  `Modified_By` int(11) DEFAULT NULL,
  `Modified_Date` datetime DEFAULT NULL,
  PRIMARY KEY (`Resource_Id`),
  KEY `FkResoursetypeId_idx` (`Fk_Resource_Type_Id`),
  CONSTRAINT `Fk_Resourse_Type_Id` FOREIGN KEY (`Fk_Resource_Type_Id`) REFERENCES `tbl_mst_resource_type` (`Resource_Type_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_trns_resource`
--

LOCK TABLES `tbl_trns_resource` WRITE;
/*!40000 ALTER TABLE `tbl_trns_resource` DISABLE KEYS */;
INSERT INTO `tbl_trns_resource` VALUES (1,2,'xyz.mp4','www.codeplanet.com','12min',7,'2020-05-11 15:13:14',NULL,NULL),(2,1,'pqr.txt','www.stackoverflow.com','12min',7,'2020-05-11 15:16:04',NULL,NULL),(3,1,'video','mohit.in','22',7,'2020-05-19 13:48:04',NULL,NULL);
/*!40000 ALTER TABLE `tbl_trns_resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_trns_user_profile_details`
--

DROP TABLE IF EXISTS `tbl_trns_user_profile_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_trns_user_profile_details` (
  `Profile_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Fk_User_Id` int(11) DEFAULT NULL,
  `User_Role_Id` int(11) DEFAULT NULL,
  `Is_Active` int(11) DEFAULT '1',
  `Created_Date` datetime DEFAULT NULL,
  `Modified_Date` datetime DEFAULT NULL,
  PRIMARY KEY (`Profile_Id`),
  KEY `FkUserId_idx` (`Fk_User_Id`),
  CONSTRAINT `FkUserId` FOREIGN KEY (`Fk_User_Id`) REFERENCES `tbl_mst_user_details` (`User_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_trns_user_profile_details`
--

LOCK TABLES `tbl_trns_user_profile_details` WRITE;
/*!40000 ALTER TABLE `tbl_trns_user_profile_details` DISABLE KEYS */;
INSERT INTO `tbl_trns_user_profile_details` VALUES (1,5,2,1,'2020-03-27 10:07:33',NULL),(2,7,3,1,'2020-03-29 15:31:51',NULL),(3,8,2,1,'2020-03-31 17:54:56','2020-04-09 11:25:09');
/*!40000 ALTER TABLE `tbl_trns_user_profile_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'eduappdb'
--

--
-- Dumping routines for database 'eduappdb'
--
/*!50003 DROP PROCEDURE IF EXISTS `Course` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Course`(
Action varchar(45),
Course_Name varchar(45),
Course_Description varchar(1000),
Course_Fee varchar(45),
Course_Duration varchar(45),
Is_Certification int,
Lecture_Order varchar(1000),
Course_Rating float,
Course_Tags varchar(500),
Course_Pre_Requisites varchar(1000),
Course_Id int,
User_Id int)
BEGIN

IF(Action="getCourses")
THEN
	IF EXISTS(select * from eduappdb.tbl_mst_user_details where tbl_mst_user_details.User_Id=User_Id)
	THEN
		SELECT *,1 as 'Status' FROM eduappdb.tbl_mst_course AS c INNER JOIN (SELECT cdd.Fk_Course_Id,cdd.Course_Pre_Requisites,
		cdd.Lecture_Order,cdd.Course_Tags,cdd.Course_Rating FROM eduappdb.tbl_trns_course_details AS cdd WHERE 
        cdd.Created_By=User_Id) AS ld ON c.Course_Id=ld.Fk_Course_Id AND c.Is_Active=1 AND c.Created_By = User_Id ;
	ELSE
	select -1 as 'Status';
    END IF;
END IF;
IF(Action="getAllCourses")
THEN
	IF EXISTS(select * from eduappdb.tbl_mst_user_details where tbl_mst_user_details.User_Id=User_Id)
	THEN
		SELECT *,1 as 'Status' FROM eduappdb.tbl_mst_course AS c INNER JOIN (SELECT cdd.Fk_Course_Id,cdd.Course_Pre_Requisites,
		cdd.Lecture_Order,cdd.Course_Tags,cdd.Course_Rating FROM eduappdb.tbl_trns_course_details AS cdd WHERE 
        cdd.Created_By=User_Id) AS ld ON c.Course_Id=ld.Fk_Course_Id AND c.Created_By = User_Id ;
	ELSE
	select -1 as 'Status';
    END IF;
END IF;


IF(Action="getCourseInfo")
THEN
	SELECT * FROM eduappdb.tbl_mst_course AS c INNER JOIN (SELECT cdd.Fk_Course_Id,cdd.Course_Pre_Requisites,
	cdd.Lecture_Order,cdd.Course_Tags,cdd.Course_Rating FROM eduappdb.tbl_trns_course_details AS cdd WHERE 
	cdd.Fk_Course_Id=Course_Id) AS ld ON c.Course_Id=ld.Fk_Course_Id AND c.Is_Active=1 ;
END IF;

IF(Action="updateCourse")
THEN
	IF EXISTS(select * from eduappdb.tbl_mst_user_details where tbl_mst_user_details.User_Id=User_Id)
	THEN
		UPDATE eduappdb.tbl_mst_course AS c SET c.Course_Name = Course_Name, c.Course_Description = Course_Description ,
		c.Course_Fee = Course_Fee , c.Course_Duration = Course_Duration , c.Is_Certification_Course = Is_Certification_Course ,
		c.Modified_By = User_Id, c.Modified_Date = current_timestamp() WHERE c.Course_Id = Course_Id AND c.Created_By = User_Id AND c.Is_Active = 1;
        
        IF(row_count()>0)
        THEN
			UPDATE eduappdb.tbl_trns_course_details AS cd SET cd.Course_Pre_Requisites=Course_Pre_Requisites,
            cd.Lecture_Order=Lecture_Order,cd.Course_Tags=Course_Tags,cd.Modified_By=User_Id,cd.Modified_Date=current_timestamp()
            WHERE cd.Fk_Course_Id=Course_Id AND cd.Created_By=User_Id;
		END IF;
	ELSE
	select -1 as 'status';
    END IF;
END IF;

IF(Action="deleteCourse")
THEN
	IF EXISTS(select * from eduappdb.tbl_mst_user_details where tbl_mst_user_details.User_Id=User_Id)
	THEN
		UPDATE eduappdb.tbl_mst_course AS c SET c.Is_Active = 0 , c.Modified_By=User_Id ,c.Modified_Date=current_timestamp() WHERE c.Course_Id = Course_Id AND c.Is_Active=1 AND c.Created_By=User_Id ;
        IF(SELECT row_count()>0)
        THEN
			UPDATE eduappdb.tbl_trns_lecture_details AS ld SET ld.Is_Active=0 ,ld.Modified_By=User_Id ,ld.Modified_Date=current_timestamp()WHERE ld.Fk_Course_Id = Course_Id;
		ELSE
        select -2 as 'status';
        END IF;
	ELSE
	select -1 as 'status';
    END IF;
END IF;

IF(Action="addCourse")
THEN
	IF EXISTS(select * from eduappdb.tbl_mst_user_details where tbl_mst_user_details.User_Id=User_Id)
	THEN
		INSERT INTO eduappdb.tbl_mst_course(Course_Name,Course_Description,Course_Fee,Course_Duration,Is_Certification_Course,Created_By,Created_Date) 
		VALUES(Course_Name,Course_Description,Course_Fee,Course_Duration,Is_Certification,User_Id,current_timestamp());
        
        INSERT INTO eduappdb.tbl_trns_course_details(Fk_Course_Id,Course_Pre_Requisites,Course_Tags,Created_By,Created_Date)
        VALUES((SELECT c.Course_Id FROM eduappdb.tbl_mst_course AS c ORDER BY c.Course_Id DESC LIMIT 1),Course_Pre_Requisites,
        Course_Tags,User_Id,current_timestamp());
    END IF;
END IF;

IF(Action="getResourcesOfLectures")
THEN
	SELECT lr.Fk_Lecture_Id,r.Resource_Id,r.Fk_Resource_Type_Id,r.Resource_Title,r.Resource_Url,r.Resource_Length,r.Created_By,
	r.Created_Date,r.Modified_By,r.Modified_Date,lr.Resource_Name,rt.Resource_Type_Title FROM eduappdb.tbl_trns_resource 
	AS r INNER JOIN (SELECT temp.Resource_Name,temp.Fk_Resource_Id,temp.Fk_Lecture_Id FROM eduappdb.tbl_trns_lecture_resource AS temp WHERE 
	temp.Fk_Course_Id=Course_Id AND temp.Is_Active=1) as lr ON r.Resource_Id=lr.Fk_Resource_Id INNER JOIN eduappdb.tbl_mst_resource_type
	as rt ON  r.Fk_Resource_Type_Id= rt.Resource_Type_Id ORDER BY lr.Fk_Lecture_Id;
END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Lecture` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Lecture`(
Action varchar(45),
Lecture_Name varchar(45),
Lecture_Description varchar(1000),
Lecture_Id int,
User_Id int,
Course_Id int,
Resource_Order varchar(1000))
BEGIN

IF(Action="getLectures")
THEN
	IF EXISTS(SELECT * FROM eduappdb.tbl_mst_user_details AS u WHERE u.User_Id=User_Id)
	THEN
		IF EXISTS(SELECT * FROM eduappdb.tbl_mst_course AS c WHERE c.Course_Id = Course_Id AND c.Is_Active=1 AND c.Created_By=User_Id)
        THEN 
			SELECT 1 AS "Status" ,lrd.Resource_Order,l.Lecture_Id, l.Lecture_Name, l.Lecture_Description, l.Created_By, l.Created_Date,l.Modified_By,
            l.Modified_Date FROM eduappdb.tbl_mst_lecture AS l INNER JOIN 
			(SELECT ldd.Fk_Lecture_Id FROM eduappdb.tbl_trns_lecture_details AS ldd WHERE ldd.Fk_Course_Id = Course_Id AND ldd.Is_Active = 1 AND ldd.Created_By=User_Id) AS ld 
			ON l.Lecture_Id=ld.Fk_Lecture_Id LEFT OUTER JOIN eduappdb.tbl_trns_lecture_resource_details AS lrd ON l.Lecture_Id=lrd.Fk_Lecture_Id ORDER BY l.Lecture_Id;
		ELSE
			SELECT -2 as "Status";
		END IF;
	ELSE
		SELECT -1 as "Status";
	END IF;
END IF;

IF(Action="deleteLecture")
THEN
	IF EXISTS(SELECT * FROM eduappdb.tbl_mst_user_details AS u WHERE u.User_Id=User_Id)
	THEN
		IF EXISTS(SELECT * FROM eduappdb.tbl_mst_course AS c WHERE c.Course_Id = Course_Id AND c.Is_Active=1 AND c.Created_By=User_Id)
        THEN
			UPDATE eduappdb.tbl_trns_lecture_details AS ld SET ld.Is_Active = 0 WHERE ld.Fk_Course_Id = Course_Id 
			AND ld.Fk_Lecture_Id = Lecture_Id AND ld.Is_Active = 1 AND ld.Id <> 0;
            if(select row_count()>0)
            THEN
				UPDATE eduappdb.tbl_trns_lecture_resource AS lr SET lr.Is_Active = 0 WHERE lr.Fk_Course_Id = Course_Id 
				AND lr.Fk_Lecture_Id = Lecture_Id AND lr.Is_Active = 1 ;
			ELSE
				SELECT -3 as "Status";
			END IF;
		ELSE
			SELECT -2 as "Status";
		END IF;
	ELSE
		SELECT -1 as "Status";
	END IF;
end if;

IF(Action="updateLecture")
THEN
	IF EXISTS(SELECT * FROM eduappdb.tbl_mst_user_details AS u WHERE u.User_Id=User_Id)
	THEN
		IF EXISTS(SELECT * FROM eduappdb.tbl_mst_course AS c WHERE c.Course_Id = Course_Id AND c.Is_Active=1 AND c.Created_By=User_Id)
        THEN
			IF EXISTS(SELECT * FROM eduappdb.tbl_trns_lecture_details AS ld WHERE ld.Fk_Lecture_Id = Lecture_Id AND ld.Fk_Course_Id = Course_Id AND ld.Is_Active = 1)
            THEN
				UPDATE eduappdb.tbl_mst_lecture as l SET l.Lecture_Name = Lecture_Name, l.Lecture_Description = Lecture_Description,
				l.Modified_By = User_Id, l.Modified_Date = current_timestamp() WHERE l.Lecture_Id = Lecture_Id;
                
                UPDATE eduappdb.tbl_trns_lecture_resource_details AS lr SET lr.Resource_Order=Resource_Order, lr.Modified_By=User_Id, lr.Modified_Date=current_timestamp() 
				Where lr.Fk_Lecture_Id=Lecture_Id AND lr.Created_By=User_Id;
            ELSE
				SELECT -3 as "Status";
            END IF;
		ELSE
			SELECT -2 as "Status";
		END IF;
	ELSE
		SELECT -1 as "Status";
	END IF;
END IF;

IF(Action="addLecture")
THEN
	IF EXISTS(SELECT * FROM eduappdb.tbl_mst_user_details AS u WHERE u.User_Id=User_Id)
	THEN
		IF EXISTS(SELECT * FROM eduappdb.tbl_mst_course AS c WHERE c.Course_Id = Course_Id AND c.Is_Active=1 AND c.Created_By=User_Id)
        THEN
			INSERT INTO eduappdb.tbl_mst_lecture(Lecture_Name,Lecture_Description,Created_By,Created_Date)
			VALUES(Lecture_Name,Lecture_Description,User_Id,current_timestamp());
			
            SET Lecture_Id=(SELECT l.Lecture_Id FROM eduappdb.tbl_mst_lecture AS l ORDER BY l.Lecture_Id DESC LIMIT 1);
            
			INSERT INTO eduappdb.tbl_trns_lecture_details(Fk_Lecture_Id,Fk_Course_Id,Created_By,Created_Date) 
			VALUES(Lecture_Id,Course_Id,User_Id,current_timestamp());
            
            IF((SELECT temp.Lecture_Order from eduappdb.tbl_trns_course_details AS temp WHERE temp.Fk_Course_Id=Course_Id) is NULL)
            THEN
				UPDATE eduappdb.tbl_trns_course_details AS cd SET cd.Lecture_Order=Lecture_Id WHERE cd.Fk_Course_Id=Course_Id;
			ELSE
				UPDATE eduappdb.tbl_trns_course_details AS cd SET cd.Lecture_Order=concat(cd.Lecture_Order,',',Lecture_Id) WHERE cd.Fk_Course_Id=Course_Id;
			END IF;
		ELSE
			SELECT -2 as "Status";
		END IF;
	ELSE
		SELECT -1 as "Status";
	END IF;
END IF;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Resource` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Resource`(
Action varchar(45),
User_Id int,
Course_Id int,
Lecture_Id int,
inout Resource_Id int,
Resource_Name varchar(1000),
Resource_Title varchar(1000),
Resource_Type_Id int,
Resource_Url varchar(1000),
Resource_Length varchar(100),
Resource_Order varchar(500)
)
BEGIN

if(Action="addResource")
THEN
	IF EXISTS(SELECT * FROM eduappdb.tbl_mst_user_details as ud WHERE ud.User_Id = User_Id)
	THEN
		IF EXISTS(SELECT * FROM eduappdb.tbl_mst_course AS c WHERE c.Course_Id = Course_Id AND c.Is_Active = 1 AND c.Created_By=User_Id )
		THEN
			IF EXISTS(SELECT * FROM eduappdb.tbl_trns_lecture_details AS ld WHERE ld.Fk_Lecture_Id = Lecture_Id AND ld.Fk_Course_Id=Course_Id AND ld.Is_Active=1 AND ld.Created_By=User_Id )
			THEN
				INSERT INTO eduappdb.tbl_trns_resource(Fk_Resource_Type_Id,Resource_Title,Resource_Url,Resource_Length,Created_By,Created_Date)
				VALUES(Resource_Type_Id,Resource_Title,Resource_Url,Resource_Length,User_Id,current_timestamp());
			
				SET Resource_Id =(SELECT r.Resource_Id FROM eduappdb.tbl_trns_resource AS r ORDER BY r.Resource_Id DESC LIMIT 1);
                
				INSERT INTO eduappdb.tbl_trns_lecture_resource(Fk_Resource_Id,Fk_Course_Id,Fk_Lecture_Id,Resource_Name,Created_By,Created_Date) 
				VALUES(Resource_Id,
				Course_Id,Lecture_Id,Resource_Name,User_Id,current_timestamp());
				
				UPDATE eduappdb.tbl_trns_lecture_resource_details AS lrd SET lrd.Resource_Order=concat(lrd.Resource_Order,',',Resource_Id)
                ,lrd.Modified_By=User_Id, lrd.Modified_Date=current_timestamp() 
				Where lrd.Fk_Lecture_Id=Lecture_Id;
                IF(SELECT row_count()=0)
                THEN
					INSERT INTO eduappdb.tbl_trns_lecture_resource_details(Fk_Lecture_Id,Resource_Order,Created_By,Created_Date) 
					VALUES(Lecture_Id,Resource_Id,User_Id,current_timestamp());
				end if;
			else
			SELECT -3 as "Status";
			end if;
		else
		SELECT -2 as "Status";
		end if;
	else
	SELECT -1 as "Status";
	end if;
end if;

if(Action="updateResource")
THEN
if EXISTS(SELECT * FROM eduappdb.tbl_mst_user_details as ud WHERE ud.User_Id = User_Id)
THEN
	if EXISTS(SELECT * FROM eduappdb.tbl_mst_course AS c WHERE c.Course_Id = Course_Id AND c.Is_Active = 1 AND c.Created_By=User_Id )
	THEN
		if EXISTS(SELECT * FROM eduappdb.tbl_trns_lecture_details AS ld WHERE ld.Fk_Lecture_Id = Lecture_Id AND ld.Fk_Course_Id=Course_Id AND ld.Is_Active=1 AND ld.Created_By=User_Id )
		THEN
			UPDATE eduappdb.tbl_trns_lecture_resource AS lr SET lr.Resource_Name=Resource_Name, lr.Modified_By=User_Id, lr.Modified_Date=current_timestamp() 
			Where lr.Fk_Resource_Id=Resource_Id AND lr.Fk_Course_Id=Course_Id AND lr.Fk_Lecture_Id=Lecture_Id AND lr.Created_By=User_Id AND lr.Is_Active=1;
		else
        SELECT -3 as "Status";
		end if;
	else
    SELECT -2 as "Status";
	end if;
else
SELECT -1 as "Status";
end if;
end if;

if(Action="deleteResource")
THEN
if EXISTS(SELECT * FROM eduappdb.tbl_mst_user_details as ud WHERE ud.User_Id = User_Id)
THEN
	if EXISTS(SELECT * FROM eduappdb.tbl_mst_course AS c WHERE c.Course_Id = Course_Id AND c.Is_Active = 1 AND c.Created_By=User_Id )
	THEN
		if EXISTS(SELECT * FROM eduappdb.tbl_trns_lecture_details AS ld WHERE ld.Fk_Lecture_Id = Lecture_Id AND ld.Fk_Course_Id=Course_Id AND ld.Is_Active=1 AND ld.Created_By=User_Id )
		THEN
			UPDATE eduappdb.tbl_trns_lecture_resource AS lr SET lr.Is_Active=0 , lr.Modified_By=User_Id, lr.Modified_Date=current_timestamp() 
			WHERE lr.Fk_Resource_Id=Resource_Id AND lr.Fk_Course_Id=Course_Id AND lr.Fk_Lecture_Id=Lecture_Id AND lr.Created_By=User_Id AND lr.Is_Active=1;
			
            IF(select row_count()>0)
            THEN
				UPDATE eduappdb.tbl_trns_lecture_resource_details AS lrd SET lrd.Resource_Order=Resource_Order, lrd.Modified_By=User_Id, lrd.Modified_Date=current_timestamp() 
				Where lrd.Fk_Lecture_Id=Lecture_Id;
			end if;
		ELSE
		SELECT -3 as "Status";
		end if;
	else
    SELECT -2 as "Status";
	end if;
else
SELECT -1 as "Status";
end if;
end if;

if(Action="getResources")
THEN
if EXISTS(SELECT * FROM eduappdb.tbl_mst_user_details as ud WHERE ud.User_Id = User_Id)
THEN
	if EXISTS(SELECT * FROM eduappdb.tbl_mst_course AS c WHERE c.Course_Id = Course_Id AND c.Is_Active = 1 AND c.Created_By=User_Id )
	THEN
		if EXISTS(SELECT * FROM eduappdb.tbl_trns_lecture_details AS ld WHERE ld.Fk_Lecture_Id = Lecture_Id AND ld.Fk_Course_Id=Course_Id AND ld.Is_Active=1 AND ld.Created_By=User_Id )
		THEN
			SELECT r.Resource_Id,r.Fk_Resource_Type_Id,r.Resource_Title,r.Resource_Url,r.Resource_Length,r.Created_By,r.Created_Date,r.Modified_By,
			r.Modified_Date,lr.Resource_Name,rt.Resource_Type_Title,1 AS 'Status' FROM eduappdb.tbl_trns_resource AS r INNER JOIN 
			(SELECT temp.Resource_Name,temp.Fk_Resource_Id FROM eduappdb.tbl_trns_lecture_resource AS temp WHERE temp.Fk_Course_Id=Course_Id 
			AND temp.Fk_Lecture_Id=Lecture_Id AND temp.Created_By=User_Id AND temp.Is_Active=1) as lr ON r.Resource_Id=lr.Fk_Resource_Id
			INNER JOIN eduappdb.tbl_mst_resource_type as rt ON  r.Fk_Resource_Type_Id= rt.Resource_Type_Id;
        else
        SELECT -3 as "Status";
		end if;
	else
    SELECT -2 as "Status";
	end if;
else
SELECT -1 as "Status";
end if;
end if;



END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `User_Sign_In` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `User_Sign_In`(
Action varchar(100),
User_Id int,
User_Role_Id int,
First_Name varchar(100),
Last_Name varchar(100),
Email_Id varchar(100),
Mobile_No varchar(100),
Password varchar(100),
Profile_Pic_Url varchar(100),
Is_Google_Login int,
New_Password varchar(100)
)
BEGIN

if(Action = 'user_sign_up')
then
	if exists(SELECT * FROM eduappdb.tbl_mst_user_details as ud where ud.Mobile_No = Mobile_No) then
		SELECT 0 as 'status';
    else
		if exists(SELECT * FROM eduappdb.tbl_mst_user_details as ud where ud.Email_Id = Email_Id) then
			SELECT -1 as 'status';
        else
			INSERT INTO eduappdb.tbl_mst_user_details(First_Name,Last_Name,Email_Id,Password,Mobile_No,Profile_Pic_Url,Is_Google_Login,Created_Date)
            VALUES(First_Name,Last_Name,Email_Id,Password,Mobile_No,Profile_Pic_Url,Is_Google_Login,current_timestamp());
            
            SELECT *,1 as 'status' FROM eduappdb.tbl_mst_user_details as ud order by ud.User_Id desc limit 1;
        end if;
	end if;
end if;

if(Action = 'add_user_details')
then
	INSERT INTO eduappdb.tbl_trns_user_profile_details(Fk_User_Id,User_Role_Id,Created_Date) VALUES(User_Id,User_Role_Id,current_timestamp());
end if;

if(Action = 'user_sign_in')
then
	if exists(SELECT * from eduappdb.tbl_mst_user_details where eduappdb.tbl_mst_user_details.Email_Id=Email_Id)
    then
		if exists(SELECT * from eduappdb.tbl_mst_user_details where eduappdb.tbl_mst_user_details.Email_Id=Email_Id
        and eduappdb.tbl_mst_user_details.Password=Password) then
			SELECT ud.*,upd.User_Role_Id,ul.Role_Title,1 as 'Status' from eduappdb.tbl_mst_user_details as ud
            inner join eduappdb.tbl_trns_user_profile_details as upd on ud.User_Id = upd.Fk_User_Id
            inner join eduappdb.tbl_mst_user_role as ul on upd.User_Role_Id = ul.Role_Id
            where ud.Email_Id=Email_Id and ud.Password=Password;
		else
			SELECT -1 as "Status";
		end if;
	else
		SELECT 0 as "Status";
	end if;
end if;
IF(Action="update_user")
THEN
	IF EXISTS(SELECT * FROM eduappdb.tbl_mst_user_details as ud WHERE ud.User_Id = User_Id)
    THEN
		UPDATE eduappdb.tbl_mst_user_details AS ud SET ud.First_Name=First_Name, ud.Last_Name=Last_Name ,
        ud.Email_Id=Email_Id, ud.Mobile_No=Mobile_No, ud.Modified_Date=current_timestamp(), ud.Profile_Pic_Url=Profile_Pic_Url WHERE ud.User_Id = User_Id; 
        UPDATE eduappdb.tbl_trns_user_profile_details AS upd SET upd.User_Role_Id=User_Role_Id, upd.Modified_Date=current_timestamp() Where upd.Fk_User_Id=User_Id;
	END IF;
END IF;

IF(Action="update_password")
THEN
	IF EXISTS(SELECT * FROM eduappdb.tbl_mst_user_details as ud WHERE ud.User_Id = User_Id)
    THEN
		IF EXISTS(SELECT * FROM eduappdb.tbl_mst_user_details as ud WHERE ud.User_Id = User_Id AND ud.Password=Password)
		THEN
			UPDATE eduappdb.tbl_mst_user_details AS ud SET ud.Password=New_Password, ud.Modified_Date=current_timestamp() WHERE ud.User_Id = User_Id; 
			else
			SELECT -2 as "Status";
        END IF;
    else
		SELECT -1 as "Status";
	END IF;
END IF;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-21 22:20:55
