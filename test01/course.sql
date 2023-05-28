/*
Navicat MySQL Data Transfer

Source Server         : mysql5.5
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2023-04-23 17:15:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL,
  `hours` int(11) DEFAULT NULL,
  `sid` int(32) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `sid` (`sid`),
  CONSTRAINT `course_ibfk_1` FOREIGN KEY (`sid`) REFERENCES `s_school` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', 'C语言程序设计', '70', '1');
INSERT INTO `course` VALUES ('2', 'Python程序设计', '40', '1');
INSERT INTO `course` VALUES ('3', '大学英语', '96', '2');
INSERT INTO `course` VALUES ('4', '高级Web技术', '40', '1');
INSERT INTO `course` VALUES ('6', '大数据存储', '32', '1');
INSERT INTO `course` VALUES ('7', '大数据存储', '32', '1');
INSERT INTO `course` VALUES ('8', '大数据存储', '32', '1');
