-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmgo829
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `ssmgo829`
--

/*!40000 DROP DATABASE IF EXISTS `ssmgo829`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssmgo829` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssmgo829`;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daibanchuyuan`
--

DROP TABLE IF EXISTS `daibanchuyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `daibanchuyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhenliaobianhao` varchar(200) DEFAULT NULL COMMENT '诊疗编号',
  `yishengzhanghao` varchar(200) NOT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) NOT NULL COMMENT '医生姓名',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `chuyuanshijian` datetime DEFAULT NULL COMMENT '出院时间',
  `zhuyuanbingfang` varchar(200) DEFAULT NULL COMMENT '住院病房',
  `zhuyuanchuanghao` varchar(200) DEFAULT NULL COMMENT '住院床号',
  `peizhenzhanghao` varchar(200) DEFAULT NULL COMMENT '陪诊账号',
  `peizhenxingming` varchar(200) DEFAULT NULL COMMENT '陪诊姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=139 DEFAULT CHARSET=utf8 COMMENT='代办出院';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daibanchuyuan`
--

LOCK TABLES `daibanchuyuan` WRITE;
/*!40000 ALTER TABLE `daibanchuyuan` DISABLE KEYS */;
INSERT INTO `daibanchuyuan` VALUES (131,'2023-06-25 07:38:39','诊疗编号1','医生账号1','医生姓名1','账号1','姓名1','2023-06-25 15:38:39','住院病房1','住院床号1','陪诊账号1','陪诊姓名1'),(132,'2023-06-25 07:38:39','诊疗编号2','医生账号2','医生姓名2','账号2','姓名2','2023-06-25 15:38:39','住院病房2','住院床号2','陪诊账号2','陪诊姓名2'),(133,'2023-06-25 07:38:39','诊疗编号3','医生账号3','医生姓名3','账号3','姓名3','2023-06-25 15:38:39','住院病房3','住院床号3','陪诊账号3','陪诊姓名3'),(134,'2023-06-25 07:38:39','诊疗编号4','医生账号4','医生姓名4','账号4','姓名4','2023-06-25 15:38:39','住院病房4','住院床号4','陪诊账号4','陪诊姓名4'),(135,'2023-06-25 07:38:39','诊疗编号5','医生账号5','医生姓名5','账号5','姓名5','2023-06-25 15:38:39','住院病房5','住院床号5','陪诊账号5','陪诊姓名5'),(136,'2023-06-25 07:38:39','诊疗编号6','医生账号6','医生姓名6','账号6','姓名6','2023-06-25 15:38:39','住院病房6','住院床号6','陪诊账号6','陪诊姓名6'),(137,'2023-06-25 07:38:39','诊疗编号7','医生账号7','医生姓名7','账号7','姓名7','2023-06-25 15:38:39','住院病房7','住院床号7','陪诊账号7','陪诊姓名7'),(138,'2023-06-25 07:38:39','诊疗编号8','医生账号8','医生姓名8','账号8','姓名8','2023-06-25 15:38:39','住院病房8','住院床号8','陪诊账号8','陪诊姓名8');
/*!40000 ALTER TABLE `daibanchuyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daibanruyuan`
--

DROP TABLE IF EXISTS `daibanruyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `daibanruyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhenliaobianhao` varchar(200) DEFAULT NULL COMMENT '诊疗编号',
  `yishengzhanghao` varchar(200) NOT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) NOT NULL COMMENT '医生姓名',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `ruyuanshijian` datetime DEFAULT NULL COMMENT '入院时间',
  `zhuyuanbingfang` varchar(200) DEFAULT NULL COMMENT '住院病房',
  `zhuyuanchuanghao` varchar(200) DEFAULT NULL COMMENT '住院床号',
  `peizhenzhanghao` varchar(200) DEFAULT NULL COMMENT '陪诊账号',
  `peizhenxingming` varchar(200) DEFAULT NULL COMMENT '陪诊姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=utf8 COMMENT='代办入院';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daibanruyuan`
--

LOCK TABLES `daibanruyuan` WRITE;
/*!40000 ALTER TABLE `daibanruyuan` DISABLE KEYS */;
INSERT INTO `daibanruyuan` VALUES (121,'2023-06-25 07:38:39','诊疗编号1','医生账号1','医生姓名1','账号1','姓名1','2023-06-25 15:38:39','住院病房1','住院床号1','陪诊账号1','陪诊姓名1'),(122,'2023-06-25 07:38:39','诊疗编号2','医生账号2','医生姓名2','账号2','姓名2','2023-06-25 15:38:39','住院病房2','住院床号2','陪诊账号2','陪诊姓名2'),(123,'2023-06-25 07:38:39','诊疗编号3','医生账号3','医生姓名3','账号3','姓名3','2023-06-25 15:38:39','住院病房3','住院床号3','陪诊账号3','陪诊姓名3'),(124,'2023-06-25 07:38:39','诊疗编号4','医生账号4','医生姓名4','账号4','姓名4','2023-06-25 15:38:39','住院病房4','住院床号4','陪诊账号4','陪诊姓名4'),(125,'2023-06-25 07:38:39','诊疗编号5','医生账号5','医生姓名5','账号5','姓名5','2023-06-25 15:38:39','住院病房5','住院床号5','陪诊账号5','陪诊姓名5'),(126,'2023-06-25 07:38:39','诊疗编号6','医生账号6','医生姓名6','账号6','姓名6','2023-06-25 15:38:39','住院病房6','住院床号6','陪诊账号6','陪诊姓名6'),(127,'2023-06-25 07:38:39','诊疗编号7','医生账号7','医生姓名7','账号7','姓名7','2023-06-25 15:38:39','住院病房7','住院床号7','陪诊账号7','陪诊姓名7'),(128,'2023-06-25 07:38:39','诊疗编号8','医生账号8','医生姓名8','账号8','姓名8','2023-06-25 15:38:39','住院病房8','住院床号8','陪诊账号8','陪诊姓名8');
/*!40000 ALTER TABLE `daibanruyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daiqubaogao`
--

DROP TABLE IF EXISTS `daiqubaogao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `daiqubaogao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhenliaobianhao` varchar(200) DEFAULT NULL COMMENT '诊疗编号',
  `yishengzhanghao` varchar(200) NOT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) NOT NULL COMMENT '医生姓名',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `daiqushijian` datetime DEFAULT NULL COMMENT '代取时间',
  `zhenduanbaogao` longtext COMMENT '诊断报告',
  `peizhenzhanghao` varchar(200) DEFAULT NULL COMMENT '陪诊账号',
  `peizhenxingming` varchar(200) DEFAULT NULL COMMENT '陪诊姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8 COMMENT='代取报告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daiqubaogao`
--

LOCK TABLES `daiqubaogao` WRITE;
/*!40000 ALTER TABLE `daiqubaogao` DISABLE KEYS */;
INSERT INTO `daiqubaogao` VALUES (91,'2023-06-25 07:38:39','诊疗编号1','医生账号1','医生姓名1','账号1','姓名1','2023-06-25 15:38:39','upload/daiqubaogao_zhenduanbaogao1.jpg,upload/daiqubaogao_zhenduanbaogao2.jpg,upload/daiqubaogao_zhenduanbaogao3.jpg','陪诊账号1','陪诊姓名1'),(92,'2023-06-25 07:38:39','诊疗编号2','医生账号2','医生姓名2','账号2','姓名2','2023-06-25 15:38:39','upload/daiqubaogao_zhenduanbaogao2.jpg,upload/daiqubaogao_zhenduanbaogao3.jpg,upload/daiqubaogao_zhenduanbaogao4.jpg','陪诊账号2','陪诊姓名2'),(93,'2023-06-25 07:38:39','诊疗编号3','医生账号3','医生姓名3','账号3','姓名3','2023-06-25 15:38:39','upload/daiqubaogao_zhenduanbaogao3.jpg,upload/daiqubaogao_zhenduanbaogao4.jpg,upload/daiqubaogao_zhenduanbaogao5.jpg','陪诊账号3','陪诊姓名3'),(94,'2023-06-25 07:38:39','诊疗编号4','医生账号4','医生姓名4','账号4','姓名4','2023-06-25 15:38:39','upload/daiqubaogao_zhenduanbaogao4.jpg,upload/daiqubaogao_zhenduanbaogao5.jpg,upload/daiqubaogao_zhenduanbaogao6.jpg','陪诊账号4','陪诊姓名4'),(95,'2023-06-25 07:38:39','诊疗编号5','医生账号5','医生姓名5','账号5','姓名5','2023-06-25 15:38:39','upload/daiqubaogao_zhenduanbaogao5.jpg,upload/daiqubaogao_zhenduanbaogao6.jpg,upload/daiqubaogao_zhenduanbaogao7.jpg','陪诊账号5','陪诊姓名5'),(96,'2023-06-25 07:38:39','诊疗编号6','医生账号6','医生姓名6','账号6','姓名6','2023-06-25 15:38:39','upload/daiqubaogao_zhenduanbaogao6.jpg,upload/daiqubaogao_zhenduanbaogao7.jpg,upload/daiqubaogao_zhenduanbaogao8.jpg','陪诊账号6','陪诊姓名6'),(97,'2023-06-25 07:38:39','诊疗编号7','医生账号7','医生姓名7','账号7','姓名7','2023-06-25 15:38:39','upload/daiqubaogao_zhenduanbaogao7.jpg,upload/daiqubaogao_zhenduanbaogao8.jpg,upload/daiqubaogao_zhenduanbaogao9.jpg','陪诊账号7','陪诊姓名7'),(98,'2023-06-25 07:38:39','诊疗编号8','医生账号8','医生姓名8','账号8','姓名8','2023-06-25 15:38:39','upload/daiqubaogao_zhenduanbaogao8.jpg,upload/daiqubaogao_zhenduanbaogao9.jpg,upload/daiqubaogao_zhenduanbaogao10.jpg','陪诊账号8','陪诊姓名8');
/*!40000 ALTER TABLE `daiqubaogao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guahaoyuyue`
--

DROP TABLE IF EXISTS `guahaoyuyue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guahaoyuyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) DEFAULT NULL COMMENT '预约编号',
  `yishengzhanghao` varchar(200) DEFAULT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) DEFAULT NULL COMMENT '医生姓名',
  `keshi` varchar(200) DEFAULT NULL COMMENT '科室',
  `guahaofei` double DEFAULT NULL COMMENT '挂号费',
  `haoma` varchar(200) DEFAULT NULL COMMENT '号码',
  `yuyueshijian` datetime DEFAULT NULL COMMENT '预约时间',
  `guahaobeizhu` longtext COMMENT '挂号备注',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `peizhenzhanghao` varchar(200) DEFAULT NULL COMMENT '陪诊账号',
  `peizhenxingming` varchar(200) DEFAULT NULL COMMENT '陪诊姓名',
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuyuebianhao` (`yuyuebianhao`),
  UNIQUE KEY `haoma` (`haoma`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8 COMMENT='挂号预约';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guahaoyuyue`
--

LOCK TABLES `guahaoyuyue` WRITE;
/*!40000 ALTER TABLE `guahaoyuyue` DISABLE KEYS */;
INSERT INTO `guahaoyuyue` VALUES (61,'2023-06-25 07:38:39','1111111111','医生账号1','医生姓名1','科室1',1,'1111111111','2023-06-25 15:38:39','挂号备注1','账号1','姓名1','手机1','陪诊账号1','陪诊姓名1','是','','未支付'),(62,'2023-06-25 07:38:39','2222222222','医生账号2','医生姓名2','科室2',2,'2222222222','2023-06-25 15:38:39','挂号备注2','账号2','姓名2','手机2','陪诊账号2','陪诊姓名2','是','','未支付'),(63,'2023-06-25 07:38:39','3333333333','医生账号3','医生姓名3','科室3',3,'3333333333','2023-06-25 15:38:39','挂号备注3','账号3','姓名3','手机3','陪诊账号3','陪诊姓名3','是','','未支付'),(64,'2023-06-25 07:38:39','4444444444','医生账号4','医生姓名4','科室4',4,'4444444444','2023-06-25 15:38:39','挂号备注4','账号4','姓名4','手机4','陪诊账号4','陪诊姓名4','是','','未支付'),(65,'2023-06-25 07:38:39','5555555555','医生账号5','医生姓名5','科室5',5,'5555555555','2023-06-25 15:38:39','挂号备注5','账号5','姓名5','手机5','陪诊账号5','陪诊姓名5','是','','未支付'),(66,'2023-06-25 07:38:39','6666666666','医生账号6','医生姓名6','科室6',6,'6666666666','2023-06-25 15:38:39','挂号备注6','账号6','姓名6','手机6','陪诊账号6','陪诊姓名6','是','','未支付'),(67,'2023-06-25 07:38:39','7777777777','医生账号7','医生姓名7','科室7',7,'7777777777','2023-06-25 15:38:39','挂号备注7','账号7','姓名7','手机7','陪诊账号7','陪诊姓名7','是','','未支付'),(68,'2023-06-25 07:38:39','8888888888','医生账号8','医生姓名8','科室8',8,'8888888888','2023-06-25 15:38:39','挂号备注8','账号8','姓名8','手机8','陪诊账号8','陪诊姓名8','是','','未支付');
/*!40000 ALTER TABLE `guahaoyuyue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `keshixinxi`
--

DROP TABLE IF EXISTS `keshixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `keshixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `keshihao` varchar(200) DEFAULT NULL COMMENT '科室号',
  `guahaofei` double NOT NULL COMMENT '挂号费',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `keshihao` (`keshihao`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COMMENT='科室信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `keshixinxi`
--

LOCK TABLES `keshixinxi` WRITE;
/*!40000 ALTER TABLE `keshixinxi` DISABLE KEYS */;
INSERT INTO `keshixinxi` VALUES (41,'2023-06-25 07:38:38','科室号1',1,'2023-06-25 15:38:38',1),(42,'2023-06-25 07:38:38','科室号2',2,'2023-06-25 15:38:38',2),(43,'2023-06-25 07:38:38','科室号3',3,'2023-06-25 15:38:38',3),(44,'2023-06-25 07:38:38','科室号4',4,'2023-06-25 15:38:38',4),(45,'2023-06-25 07:38:38','科室号5',5,'2023-06-25 15:38:38',5),(46,'2023-06-25 07:38:38','科室号6',6,'2023-06-25 15:38:38',6),(47,'2023-06-25 07:38:38','科室号7',7,'2023-06-25 15:38:38',7),(48,'2023-06-25 07:38:38','科室号8',8,'2023-06-25 15:38:38',8);
/*!40000 ALTER TABLE `keshixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `peizhenyuan`
--

DROP TABLE IF EXISTS `peizhenyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `peizhenyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `peizhenzhanghao` varchar(200) NOT NULL COMMENT '陪诊账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `peizhenxingming` varchar(200) NOT NULL COMMENT '陪诊姓名',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `peizhenfei` double DEFAULT NULL COMMENT '陪诊费',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `zhaopian` longtext COMMENT '照片',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `peizhenzhanghao` (`peizhenzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='陪诊员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peizhenyuan`
--

LOCK TABLES `peizhenyuan` WRITE;
/*!40000 ALTER TABLE `peizhenyuan` DISABLE KEYS */;
INSERT INTO `peizhenyuan` VALUES (21,'2023-06-25 07:38:38','陪诊账号1','e10adc3949ba59abbe56e057f20f883e','陪诊姓名1',1,'男',1,'13823888881','upload/peizhenyuan_zhaopian1.jpg','2023-06-25 15:38:38',1),(22,'2023-06-25 07:38:38','陪诊账号2','e10adc3949ba59abbe56e057f20f883e','陪诊姓名2',2,'男',2,'13823888882','upload/peizhenyuan_zhaopian2.jpg','2023-06-25 15:38:38',2),(23,'2023-06-25 07:38:38','陪诊账号3','e10adc3949ba59abbe56e057f20f883e','陪诊姓名3',3,'男',3,'13823888883','upload/peizhenyuan_zhaopian3.jpg','2023-06-25 15:38:38',3),(24,'2023-06-25 07:38:38','陪诊账号4','e10adc3949ba59abbe56e057f20f883e','陪诊姓名4',4,'男',4,'13823888884','upload/peizhenyuan_zhaopian4.jpg','2023-06-25 15:38:38',4),(25,'2023-06-25 07:38:38','陪诊账号5','e10adc3949ba59abbe56e057f20f883e','陪诊姓名5',5,'男',5,'13823888885','upload/peizhenyuan_zhaopian5.jpg','2023-06-25 15:38:38',5),(26,'2023-06-25 07:38:38','陪诊账号6','e10adc3949ba59abbe56e057f20f883e','陪诊姓名6',6,'男',6,'13823888886','upload/peizhenyuan_zhaopian6.jpg','2023-06-25 15:38:38',6),(27,'2023-06-25 07:38:38','陪诊账号7','e10adc3949ba59abbe56e057f20f883e','陪诊姓名7',7,'男',7,'13823888887','upload/peizhenyuan_zhaopian7.jpg','2023-06-25 15:38:38',7),(28,'2023-06-25 07:38:38','陪诊账号8','e10adc3949ba59abbe56e057f20f883e','陪诊姓名8',8,'男',8,'13823888888','upload/peizhenyuan_zhaopian8.jpg','2023-06-25 15:38:38',8);
/*!40000 ALTER TABLE `peizhenyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shuyepeihu`
--

DROP TABLE IF EXISTS `shuyepeihu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shuyepeihu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhenliaobianhao` varchar(200) DEFAULT NULL COMMENT '诊疗编号',
  `yishengzhanghao` varchar(200) NOT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) NOT NULL COMMENT '医生姓名',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `peihushijian` datetime DEFAULT NULL COMMENT '陪护时间',
  `jieshushijian` datetime DEFAULT NULL COMMENT '结束时间',
  `shuye` longtext COMMENT '输液',
  `peizhenzhanghao` varchar(200) DEFAULT NULL COMMENT '陪诊账号',
  `peizhenxingming` varchar(200) DEFAULT NULL COMMENT '陪诊姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8 COMMENT='输液陪护';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shuyepeihu`
--

LOCK TABLES `shuyepeihu` WRITE;
/*!40000 ALTER TABLE `shuyepeihu` DISABLE KEYS */;
INSERT INTO `shuyepeihu` VALUES (111,'2023-06-25 07:38:39','诊疗编号1','医生账号1','医生姓名1','账号1','姓名1','2023-06-25 15:38:39','2023-06-25 15:38:39','输液1','陪诊账号1','陪诊姓名1'),(112,'2023-06-25 07:38:39','诊疗编号2','医生账号2','医生姓名2','账号2','姓名2','2023-06-25 15:38:39','2023-06-25 15:38:39','输液2','陪诊账号2','陪诊姓名2'),(113,'2023-06-25 07:38:39','诊疗编号3','医生账号3','医生姓名3','账号3','姓名3','2023-06-25 15:38:39','2023-06-25 15:38:39','输液3','陪诊账号3','陪诊姓名3'),(114,'2023-06-25 07:38:39','诊疗编号4','医生账号4','医生姓名4','账号4','姓名4','2023-06-25 15:38:39','2023-06-25 15:38:39','输液4','陪诊账号4','陪诊姓名4'),(115,'2023-06-25 07:38:39','诊疗编号5','医生账号5','医生姓名5','账号5','姓名5','2023-06-25 15:38:39','2023-06-25 15:38:39','输液5','陪诊账号5','陪诊姓名5'),(116,'2023-06-25 07:38:39','诊疗编号6','医生账号6','医生姓名6','账号6','姓名6','2023-06-25 15:38:39','2023-06-25 15:38:39','输液6','陪诊账号6','陪诊姓名6'),(117,'2023-06-25 07:38:39','诊疗编号7','医生账号7','医生姓名7','账号7','姓名7','2023-06-25 15:38:39','2023-06-25 15:38:39','输液7','陪诊账号7','陪诊姓名7'),(118,'2023-06-25 07:38:39','诊疗编号8','医生账号8','医生姓名8','账号8','姓名8','2023-06-25 15:38:39','2023-06-25 15:38:39','输液8','陪诊账号8','陪诊姓名8');
/*!40000 ALTER TABLE `shuyepeihu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` longtext NOT NULL COMMENT '图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩,31:竞拍参与,41:关注)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','管理员','2023-06-25 07:38:39');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wenzhenpaidui`
--

DROP TABLE IF EXISTS `wenzhenpaidui`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wenzhenpaidui` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) DEFAULT NULL COMMENT '预约编号',
  `yishengzhanghao` varchar(200) DEFAULT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) DEFAULT NULL COMMENT '医生姓名',
  `keshi` varchar(200) DEFAULT NULL COMMENT '科室',
  `guahaofei` double DEFAULT NULL COMMENT '挂号费',
  `haoma` varchar(200) DEFAULT NULL COMMENT '号码',
  `yuyueshijian` datetime DEFAULT NULL COMMENT '预约时间',
  `guahaobeizhu` longtext COMMENT '挂号备注',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `peizhenzhanghao` varchar(200) DEFAULT NULL COMMENT '陪诊账号',
  `peizhenxingming` varchar(200) DEFAULT NULL COMMENT '陪诊姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8 COMMENT='问诊排队';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wenzhenpaidui`
--

LOCK TABLES `wenzhenpaidui` WRITE;
/*!40000 ALTER TABLE `wenzhenpaidui` DISABLE KEYS */;
INSERT INTO `wenzhenpaidui` VALUES (71,'2023-06-25 07:38:39','预约编号1','医生账号1','医生姓名1','科室1',1,'号码1','2023-06-25 15:38:39','挂号备注1','账号1','姓名1','手机1','陪诊账号1','陪诊姓名1'),(72,'2023-06-25 07:38:39','预约编号2','医生账号2','医生姓名2','科室2',2,'号码2','2023-06-25 15:38:39','挂号备注2','账号2','姓名2','手机2','陪诊账号2','陪诊姓名2'),(73,'2023-06-25 07:38:39','预约编号3','医生账号3','医生姓名3','科室3',3,'号码3','2023-06-25 15:38:39','挂号备注3','账号3','姓名3','手机3','陪诊账号3','陪诊姓名3'),(74,'2023-06-25 07:38:39','预约编号4','医生账号4','医生姓名4','科室4',4,'号码4','2023-06-25 15:38:39','挂号备注4','账号4','姓名4','手机4','陪诊账号4','陪诊姓名4'),(75,'2023-06-25 07:38:39','预约编号5','医生账号5','医生姓名5','科室5',5,'号码5','2023-06-25 15:38:39','挂号备注5','账号5','姓名5','手机5','陪诊账号5','陪诊姓名5'),(76,'2023-06-25 07:38:39','预约编号6','医生账号6','医生姓名6','科室6',6,'号码6','2023-06-25 15:38:39','挂号备注6','账号6','姓名6','手机6','陪诊账号6','陪诊姓名6'),(77,'2023-06-25 07:38:39','预约编号7','医生账号7','医生姓名7','科室7',7,'号码7','2023-06-25 15:38:39','挂号备注7','账号7','姓名7','手机7','陪诊账号7','陪诊姓名7'),(78,'2023-06-25 07:38:39','预约编号8','医生账号8','医生姓名8','科室8',8,'号码8','2023-06-25 15:38:39','挂号备注8','账号8','姓名8','手机8','陪诊账号8','陪诊姓名8');
/*!40000 ALTER TABLE `wenzhenpaidui` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wenzhenquyao`
--

DROP TABLE IF EXISTS `wenzhenquyao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wenzhenquyao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhenliaobianhao` varchar(200) DEFAULT NULL COMMENT '诊疗编号',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `yishengzhanghao` varchar(200) DEFAULT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) DEFAULT NULL COMMENT '医生姓名',
  `zhuangtai` varchar(200) NOT NULL COMMENT '状态',
  `quyaoshijian` datetime DEFAULT NULL COMMENT '取药时间',
  `yaofang` longtext NOT NULL COMMENT '药方',
  `yongfayongliang` longtext NOT NULL COMMENT '用法用量',
  `peizhenzhanghao` varchar(200) NOT NULL COMMENT '陪诊账号',
  `peizhenxingming` varchar(200) NOT NULL COMMENT '陪诊姓名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhenliaobianhao` (`zhenliaobianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8 COMMENT='问诊取药';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wenzhenquyao`
--

LOCK TABLES `wenzhenquyao` WRITE;
/*!40000 ALTER TABLE `wenzhenquyao` DISABLE KEYS */;
INSERT INTO `wenzhenquyao` VALUES (101,'2023-06-25 07:38:39','1111111111','账号1','姓名1','医生账号1','医生姓名1','已拿药','2023-06-25 15:38:39','药方1','用法用量1','陪诊账号1','陪诊姓名1'),(102,'2023-06-25 07:38:39','2222222222','账号2','姓名2','医生账号2','医生姓名2','已拿药','2023-06-25 15:38:39','药方2','用法用量2','陪诊账号2','陪诊姓名2'),(103,'2023-06-25 07:38:39','3333333333','账号3','姓名3','医生账号3','医生姓名3','已拿药','2023-06-25 15:38:39','药方3','用法用量3','陪诊账号3','陪诊姓名3'),(104,'2023-06-25 07:38:39','4444444444','账号4','姓名4','医生账号4','医生姓名4','已拿药','2023-06-25 15:38:39','药方4','用法用量4','陪诊账号4','陪诊姓名4'),(105,'2023-06-25 07:38:39','5555555555','账号5','姓名5','医生账号5','医生姓名5','已拿药','2023-06-25 15:38:39','药方5','用法用量5','陪诊账号5','陪诊姓名5'),(106,'2023-06-25 07:38:39','6666666666','账号6','姓名6','医生账号6','医生姓名6','已拿药','2023-06-25 15:38:39','药方6','用法用量6','陪诊账号6','陪诊姓名6'),(107,'2023-06-25 07:38:39','7777777777','账号7','姓名7','医生账号7','医生姓名7','已拿药','2023-06-25 15:38:39','药方7','用法用量7','陪诊账号7','陪诊姓名7'),(108,'2023-06-25 07:38:39','8888888888','账号8','姓名8','医生账号8','医生姓名8','已拿药','2023-06-25 15:38:39','药方8','用法用量8','陪诊账号8','陪诊姓名8');
/*!40000 ALTER TABLE `wenzhenquyao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yisheng`
--

DROP TABLE IF EXISTS `yisheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yisheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yishengzhanghao` varchar(200) NOT NULL COMMENT '医生账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `yishengxingming` varchar(200) NOT NULL COMMENT '医生姓名',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `keshi` varchar(200) DEFAULT NULL COMMENT '科室',
  `guahaofei` double DEFAULT NULL COMMENT '挂号费',
  `yiling` int(11) DEFAULT NULL COMMENT '医龄',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `zhaopian` longtext COMMENT '照片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yishengzhanghao` (`yishengzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='医生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yisheng`
--

LOCK TABLES `yisheng` WRITE;
/*!40000 ALTER TABLE `yisheng` DISABLE KEYS */;
INSERT INTO `yisheng` VALUES (31,'2023-06-25 07:38:38','医生账号1','e10adc3949ba59abbe56e057f20f883e','医生姓名1',1,'男','科室1',1,1,'13823888881','upload/yisheng_zhaopian1.jpg'),(32,'2023-06-25 07:38:38','医生账号2','e10adc3949ba59abbe56e057f20f883e','医生姓名2',2,'男','科室2',2,2,'13823888882','upload/yisheng_zhaopian2.jpg'),(33,'2023-06-25 07:38:38','医生账号3','e10adc3949ba59abbe56e057f20f883e','医生姓名3',3,'男','科室3',3,3,'13823888883','upload/yisheng_zhaopian3.jpg'),(34,'2023-06-25 07:38:38','医生账号4','e10adc3949ba59abbe56e057f20f883e','医生姓名4',4,'男','科室4',4,4,'13823888884','upload/yisheng_zhaopian4.jpg'),(35,'2023-06-25 07:38:38','医生账号5','e10adc3949ba59abbe56e057f20f883e','医生姓名5',5,'男','科室5',5,5,'13823888885','upload/yisheng_zhaopian5.jpg'),(36,'2023-06-25 07:38:38','医生账号6','e10adc3949ba59abbe56e057f20f883e','医生姓名6',6,'男','科室6',6,6,'13823888886','upload/yisheng_zhaopian6.jpg'),(37,'2023-06-25 07:38:38','医生账号7','e10adc3949ba59abbe56e057f20f883e','医生姓名7',7,'男','科室7',7,7,'13823888887','upload/yisheng_zhaopian7.jpg'),(38,'2023-06-25 07:38:38','医生账号8','e10adc3949ba59abbe56e057f20f883e','医生姓名8',8,'男','科室8',8,8,'13823888888','upload/yisheng_zhaopian8.jpg');
/*!40000 ALTER TABLE `yisheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yishengzhenzhi`
--

DROP TABLE IF EXISTS `yishengzhenzhi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yishengzhenzhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhenliaobianhao` varchar(200) DEFAULT NULL COMMENT '诊疗编号',
  `yishengzhanghao` varchar(200) NOT NULL COMMENT '医生账号',
  `yishengxingming` varchar(200) DEFAULT NULL COMMENT '医生姓名',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `jiuzhenshijian` datetime DEFAULT NULL COMMENT '就诊时间',
  `zhengzhuangmiaoshu` longtext NOT NULL COMMENT '症状描述',
  `zhenduanbaogao` longtext NOT NULL COMMENT '诊断报告',
  `shuyeyaowu` longtext COMMENT '输液药物',
  `zhuyuanbingfang` varchar(200) DEFAULT NULL COMMENT '住院病房',
  `zhuyuanchuanghao` varchar(200) DEFAULT NULL COMMENT '住院床号',
  `yaofang` longtext COMMENT '药方',
  `yongfayongliang` longtext COMMENT '用法用量',
  `peizhenzhanghao` varchar(200) NOT NULL COMMENT '陪诊账号',
  `peizhenxingming` varchar(200) NOT NULL COMMENT '陪诊姓名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhenliaobianhao` (`zhenliaobianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=utf8 COMMENT='医生诊治';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yishengzhenzhi`
--

LOCK TABLES `yishengzhenzhi` WRITE;
/*!40000 ALTER TABLE `yishengzhenzhi` DISABLE KEYS */;
INSERT INTO `yishengzhenzhi` VALUES (81,'2023-06-25 07:38:39','1111111111','医生账号1','医生姓名1','账号1','姓名1','2023-06-25 15:38:39','症状描述1','upload/yishengzhenzhi_zhenduanbaogao1.jpg,upload/yishengzhenzhi_zhenduanbaogao2.jpg,upload/yishengzhenzhi_zhenduanbaogao3.jpg','输液药物1','住院病房1','住院床号1','药方1','用法用量1','陪诊账号1','陪诊姓名1'),(82,'2023-06-25 07:38:39','2222222222','医生账号2','医生姓名2','账号2','姓名2','2023-06-25 15:38:39','症状描述2','upload/yishengzhenzhi_zhenduanbaogao2.jpg,upload/yishengzhenzhi_zhenduanbaogao3.jpg,upload/yishengzhenzhi_zhenduanbaogao4.jpg','输液药物2','住院病房2','住院床号2','药方2','用法用量2','陪诊账号2','陪诊姓名2'),(83,'2023-06-25 07:38:39','3333333333','医生账号3','医生姓名3','账号3','姓名3','2023-06-25 15:38:39','症状描述3','upload/yishengzhenzhi_zhenduanbaogao3.jpg,upload/yishengzhenzhi_zhenduanbaogao4.jpg,upload/yishengzhenzhi_zhenduanbaogao5.jpg','输液药物3','住院病房3','住院床号3','药方3','用法用量3','陪诊账号3','陪诊姓名3'),(84,'2023-06-25 07:38:39','4444444444','医生账号4','医生姓名4','账号4','姓名4','2023-06-25 15:38:39','症状描述4','upload/yishengzhenzhi_zhenduanbaogao4.jpg,upload/yishengzhenzhi_zhenduanbaogao5.jpg,upload/yishengzhenzhi_zhenduanbaogao6.jpg','输液药物4','住院病房4','住院床号4','药方4','用法用量4','陪诊账号4','陪诊姓名4'),(85,'2023-06-25 07:38:39','5555555555','医生账号5','医生姓名5','账号5','姓名5','2023-06-25 15:38:39','症状描述5','upload/yishengzhenzhi_zhenduanbaogao5.jpg,upload/yishengzhenzhi_zhenduanbaogao6.jpg,upload/yishengzhenzhi_zhenduanbaogao7.jpg','输液药物5','住院病房5','住院床号5','药方5','用法用量5','陪诊账号5','陪诊姓名5'),(86,'2023-06-25 07:38:39','6666666666','医生账号6','医生姓名6','账号6','姓名6','2023-06-25 15:38:39','症状描述6','upload/yishengzhenzhi_zhenduanbaogao6.jpg,upload/yishengzhenzhi_zhenduanbaogao7.jpg,upload/yishengzhenzhi_zhenduanbaogao8.jpg','输液药物6','住院病房6','住院床号6','药方6','用法用量6','陪诊账号6','陪诊姓名6'),(87,'2023-06-25 07:38:39','7777777777','医生账号7','医生姓名7','账号7','姓名7','2023-06-25 15:38:39','症状描述7','upload/yishengzhenzhi_zhenduanbaogao7.jpg,upload/yishengzhenzhi_zhenduanbaogao8.jpg,upload/yishengzhenzhi_zhenduanbaogao9.jpg','输液药物7','住院病房7','住院床号7','药方7','用法用量7','陪诊账号7','陪诊姓名7'),(88,'2023-06-25 07:38:39','8888888888','医生账号8','医生姓名8','账号8','姓名8','2023-06-25 15:38:39','症状描述8','upload/yishengzhenzhi_zhenduanbaogao8.jpg,upload/yishengzhenzhi_zhenduanbaogao9.jpg,upload/yishengzhenzhi_zhenduanbaogao10.jpg','输液药物8','住院病房8','住院床号8','药方8','用法用量8','陪诊账号8','陪诊姓名8');
/*!40000 ALTER TABLE `yishengzhenzhi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `touxiang` longtext COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2023-06-25 07:38:38','账号1','e10adc3949ba59abbe56e057f20f883e','姓名1',1,'男','13823888881','upload/yonghu_touxiang1.jpg'),(12,'2023-06-25 07:38:38','账号2','e10adc3949ba59abbe56e057f20f883e','姓名2',2,'男','13823888882','upload/yonghu_touxiang2.jpg'),(13,'2023-06-25 07:38:38','账号3','e10adc3949ba59abbe56e057f20f883e','姓名3',3,'男','13823888883','upload/yonghu_touxiang3.jpg'),(14,'2023-06-25 07:38:38','账号4','e10adc3949ba59abbe56e057f20f883e','姓名4',4,'男','13823888884','upload/yonghu_touxiang4.jpg'),(15,'2023-06-25 07:38:38','账号5','e10adc3949ba59abbe56e057f20f883e','姓名5',5,'男','13823888885','upload/yonghu_touxiang5.jpg'),(16,'2023-06-25 07:38:38','账号6','e10adc3949ba59abbe56e057f20f883e','姓名6',6,'男','13823888886','upload/yonghu_touxiang6.jpg'),(17,'2023-06-25 07:38:38','账号7','e10adc3949ba59abbe56e057f20f883e','姓名7',7,'男','13823888887','upload/yonghu_touxiang7.jpg'),(18,'2023-06-25 07:38:38','账号8','e10adc3949ba59abbe56e057f20f883e','姓名8',8,'男','13823888888','upload/yonghu_touxiang8.jpg');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuyuepeizhenyuan`
--

DROP TABLE IF EXISTS `yuyuepeizhenyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuyuepeizhenyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) DEFAULT NULL COMMENT '预约编号',
  `peizhenzhanghao` varchar(200) DEFAULT NULL COMMENT '陪诊账号',
  `peizhenxingming` varchar(200) DEFAULT NULL COMMENT '陪诊姓名',
  `peizhenfei` double DEFAULT NULL COMMENT '陪诊费',
  `yuyueshijian` datetime DEFAULT NULL COMMENT '预约时间',
  `yuyueyuanyin` longtext COMMENT '预约原因',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuyuebianhao` (`yuyuebianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8 COMMENT='预约陪诊员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuyuepeizhenyuan`
--

LOCK TABLES `yuyuepeizhenyuan` WRITE;
/*!40000 ALTER TABLE `yuyuepeizhenyuan` DISABLE KEYS */;
INSERT INTO `yuyuepeizhenyuan` VALUES (51,'2023-06-25 07:38:38','1111111111','陪诊账号1','陪诊姓名1',1,'2023-06-25 15:38:38','预约原因1','账号1','姓名1','是','','未支付'),(52,'2023-06-25 07:38:38','2222222222','陪诊账号2','陪诊姓名2',2,'2023-06-25 15:38:38','预约原因2','账号2','姓名2','是','','未支付'),(53,'2023-06-25 07:38:38','3333333333','陪诊账号3','陪诊姓名3',3,'2023-06-25 15:38:38','预约原因3','账号3','姓名3','是','','未支付'),(54,'2023-06-25 07:38:38','4444444444','陪诊账号4','陪诊姓名4',4,'2023-06-25 15:38:38','预约原因4','账号4','姓名4','是','','未支付'),(55,'2023-06-25 07:38:38','5555555555','陪诊账号5','陪诊姓名5',5,'2023-06-25 15:38:38','预约原因5','账号5','姓名5','是','','未支付'),(56,'2023-06-25 07:38:38','6666666666','陪诊账号6','陪诊姓名6',6,'2023-06-25 15:38:38','预约原因6','账号6','姓名6','是','','未支付'),(57,'2023-06-25 07:38:38','7777777777','陪诊账号7','陪诊姓名7',7,'2023-06-25 15:38:38','预约原因7','账号7','姓名7','是','','未支付'),(58,'2023-06-25 07:38:38','8888888888','陪诊账号8','陪诊姓名8',8,'2023-06-25 15:38:38','预约原因8','账号8','姓名8','是','','未支付');
/*!40000 ALTER TABLE `yuyuepeizhenyuan` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-25 15:43:35
