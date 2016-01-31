/*
Navicat MySQL Data Transfer

Source Server         : mhx_log
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2016-01-31 14:19:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `login`
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `id` int(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('boss', 'boss', '100');
INSERT INTO `login` VALUES ('hr', 'hr', '500');
INSERT INTO `login` VALUES ('law', 'law', '400');
INSERT INTO `login` VALUES ('mark', 'mark', '200');
INSERT INTO `login` VALUES ('sales', 'sales', '300');

-- ----------------------------
-- Table structure for `valuation`
-- ----------------------------
DROP TABLE IF EXISTS `valuation`;
CREATE TABLE `valuation` (
  `ID` int(255) NOT NULL,
  `ΙΑΝΟΥΑΡΙΟΣ` int(255) DEFAULT NULL,
  `ΦΕΒΡΟΥΑΡΙΟΣ` int(255) DEFAULT NULL,
  `ΜΑΡΤΙΟΣ` int(255) DEFAULT NULL,
  `ΑΠΡΙΛΙΟΣ` int(255) DEFAULT NULL,
  `ΜΑΪΟΣ` int(255) DEFAULT NULL,
  `ΙΟΥΝΙΟΣ` int(255) DEFAULT NULL,
  `ΙΟΥΛΙΟΣ` int(255) DEFAULT NULL,
  `ΑΥΓΟΥΣΤΟΣ` int(255) DEFAULT NULL,
  `ΣΕΠΤΕΜΒΡΙΟΣ` int(255) DEFAULT NULL,
  `ΟΚΤΩΜΒΡΙΟΣ` int(255) DEFAULT NULL,
  `ΝΟΕΜΒΡΙΟΣ` int(255) DEFAULT NULL,
  `ΔΕΚΕΜΒΡΙΟΣ` int(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `valuation_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `worker` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of valuation
-- ----------------------------
INSERT INTO `valuation` VALUES ('100', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `valuation` VALUES ('200', '5', '5', '5', '3', '5', '5', '5', '5', '5', '5', '5', '5');
INSERT INTO `valuation` VALUES ('201', '5', '4', '3', '3', '4', '2', null, '5', '5', '4', '5', '2');
INSERT INTO `valuation` VALUES ('202', '5', '4', '5', '3', '5', '4', '3', '5', '2', '4', '5', '4');
INSERT INTO `valuation` VALUES ('300', '5', '4', '5', '3', '5', '4', '3', '5', '2', '4', '5', '4');
INSERT INTO `valuation` VALUES ('301', '5', '4', '5', '3', '5', '4', '3', '5', '2', '4', '5', '4');
INSERT INTO `valuation` VALUES ('302', '5', '4', '5', '3', '5', null, '3', '5', '2', '4', '5', '4');
INSERT INTO `valuation` VALUES ('400', '5', '4', '5', '3', '5', '4', '3', '5', '2', '4', '5', '4');
INSERT INTO `valuation` VALUES ('401', '5', '4', null, '3', '5', '4', '3', '5', '2', '4', '5', '4');
INSERT INTO `valuation` VALUES ('500', '5', '4', '5', '3', '5', '4', '3', '5', '2', '4', '5', '4');
INSERT INTO `valuation` VALUES ('501', '5', '4', '5', '3', '5', '4', '3', '5', '2', '4', '5', '4');

-- ----------------------------
-- Table structure for `worker`
-- ----------------------------
DROP TABLE IF EXISTS `worker`;
CREATE TABLE `worker` (
  `lastname` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `afm` int(255) DEFAULT NULL,
  `amka` int(255) DEFAULT NULL,
  `phone` int(255) DEFAULT NULL,
  `bank_number` int(255) DEFAULT NULL,
  `salary` int(255) DEFAULT NULL,
  `date_bir` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `asfaleia` varchar(255) DEFAULT NULL,
  `tmhma` varchar(255) DEFAULT NULL,
  `ID` int(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of worker
-- ----------------------------
INSERT INTO `worker` VALUES ('ΠΕΤΡΟΥΛΑΚΗΣ', 'ΚΩΣΤΑΣ', 'ΑΘΗΝΑ', null, null, null, null, '1500', '10/05/1970', '15/06/1995', 'ΙΚΑ', 'BOSS', '100');
INSERT INTO `worker` VALUES ('ΑΣΙΜΑΚΟΠΟΥΛΟΣ', 'ΠΕΤΡΟΣ', 'ΑΘΗΝΑ', null, null, null, null, '1000', null, null, 'ΙΚΑ', 'MARKETING', '200');
INSERT INTO `worker` VALUES ('ΜΟΥΡΓΙΑΣ', 'ΠΑΝΑΓΙΩΤΗΣ', 'ΑΘΗΝΑ', null, null, null, null, '850', null, null, 'ΙΚΑ', 'MARKETING', '201');
INSERT INTO `worker` VALUES ('ΤΙΚΟΥ', 'ΜΑΡΙΑ', 'ΑΘΗΝΑ', '112548', '21548', '2105236548', '215486', '850', '1975', '2008', 'ΙΚΑ', 'MARKETING', '202');
INSERT INTO `worker` VALUES ('ΚΑΡΑΖΙΟΣ', 'ΓΙΩΡΓΟΣ', 'ΑΘΗΝΑ', null, null, null, null, '1000', null, null, 'ΙΚΑ', 'ΠΩΛΗΣΕΩΝ', '300');
INSERT INTO `worker` VALUES ('ΚΡΙΓΚΑΣ', 'ΣΠΥΡΙΔΩΝ', 'ΑΘΗΝΑ', '114528515', '215698541', '210254854', '521548521', '850', '29/01/1994', '05/08/2014', 'ΙΚΑ', 'ΠΩΛΗΣΕΩΝ', '301');
INSERT INTO `worker` VALUES ('ΚΥΡΙΑΚΟΥ', 'ΕΛΕΝΗ', 'ΑΘΗΝΑ', '21548', '21548', '2105124587', '56985', '850', '1970', '2010', 'ΙΚΑ', 'ΠΩΛΗΣΕΩΝ', '302');
INSERT INTO `worker` VALUES ('ΜΑΡΚΗ', 'ΜΑΡΙΑ', 'ΑΘΗΝΑ', null, null, null, null, '1000', null, null, 'ΙΚΑ', 'ΝΟΜΙΚΟ', '400');
INSERT INTO `worker` VALUES ('ΓΙΩΤΗΣ', 'ΚΩΣΤΑΣ', 'ΑΘΗΝΑ', null, null, null, null, '850', null, null, 'ΙΚΑ', 'a', '401');
INSERT INTO `worker` VALUES ('ΠΟΤΗΣ', 'ΝΙΚΟΣ', 'ΑΘΗΝΑ', null, null, null, null, '1000', null, null, 'ΙΚΑ', 'HUMAN_RESOYRCE', '500');
INSERT INTO `worker` VALUES ('ΠΕΤΡΟΥ', 'ΚΑΤΕΡΙΝΑ', 'ΑΘΗΝΑ', null, null, null, null, '850', null, null, 'ΙΚΑ', null, '501');
