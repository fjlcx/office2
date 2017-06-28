/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : db_office

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-06-27 23:15:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for oa_admin
-- ----------------------------
DROP TABLE IF EXISTS `oa_admin`;
CREATE TABLE `oa_admin` (
  `ad_id` int(11) NOT NULL AUTO_INCREMENT,
  `ad_loginname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `ad_pwd` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `ad_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `ad_type` int(11) NOT NULL,
  `ad_state` int(11) NOT NULL,
  `ad_lastlogindate` datetime DEFAULT NULL,
  `ad_lastloginip` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ad_adddate` datetime NOT NULL,
  PRIMARY KEY (`ad_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of oa_admin
-- ----------------------------

-- ----------------------------
-- Table structure for oa_user
-- ----------------------------
DROP TABLE IF EXISTS `oa_user`;
CREATE TABLE `oa_user` (
  `us_id` int(11) NOT NULL AUTO_INCREMENT,
  `us_loginname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `us_pwd` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `us_head` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `us_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `us_sex` int(11) NOT NULL COMMENT '0：男\r\n1：女',
  `us_phone` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `us_mail` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `us_address` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `us_state` int(11) NOT NULL COMMENT '0：正常\r\n1：禁用',
  `us_registdate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`us_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of oa_user
-- ----------------------------
INSERT INTO `oa_user` VALUES ('1', 'fjlcx', '123456', '1', '凌传锨', '0', '18950998802', 'fj.lcx@foxmail.com', '福建省福州市晋安区', '0', '2017-05-30 21:59:00');
