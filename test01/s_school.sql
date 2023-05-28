/*
Navicat MySQL Data Transfer

Source Server         : mysql5.5
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2023-04-23 17:15:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `s_school`
-- ----------------------------
DROP TABLE IF EXISTS `s_school`;
CREATE TABLE `s_school` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `schoolname` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of s_school
-- ----------------------------
INSERT INTO `s_school` VALUES ('1', '计算机学院');
INSERT INTO `s_school` VALUES ('2', '外国语学院');
