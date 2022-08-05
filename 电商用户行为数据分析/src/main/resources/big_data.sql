/*
Navicat MySQL Data Transfer

Source Server         : mysql5.6
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : big_data

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2022-08-01 11:50:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_category
-- ----------------------------
DROP TABLE IF EXISTS `t_category`;
CREATE TABLE `t_category` (
  `categoryId` varchar(255) NOT NULL,
  `clickCount` bigint(20) DEFAULT NULL,
  `orderCount` bigint(20) DEFAULT NULL,
  `payCount` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`categoryId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_category
-- ----------------------------
INSERT INTO `t_category` VALUES ('11', '6093', '1781', '1202');
INSERT INTO `t_category` VALUES ('12', '6095', '1740', '1218');
INSERT INTO `t_category` VALUES ('13', '6036', '1781', '1161');
INSERT INTO `t_category` VALUES ('15', '6120', '1672', '1259');
INSERT INTO `t_category` VALUES ('17', '6079', '1752', '1231');
INSERT INTO `t_category` VALUES ('19', '6044', '1722', '1158');
INSERT INTO `t_category` VALUES ('2', '6119', '1767', '1196');
INSERT INTO `t_category` VALUES ('20', '6098', '1776', '1244');
INSERT INTO `t_category` VALUES ('7', '6074', '1796', '1252');
INSERT INTO `t_category` VALUES ('9', '6045', '1736', '1230');
