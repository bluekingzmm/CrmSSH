/*
Navicat MySQL Data Transfer

Source Server         : blue
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : crm

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-10-12 12:43:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `cst_customer`
-- ----------------------------
DROP TABLE IF EXISTS `cst_customer`;
CREATE TABLE `cst_customer` (
  `cust_id` varchar(255) NOT NULL,
  `cust_name` varchar(255) DEFAULT NULL,
  `cust_level` varchar(255) DEFAULT NULL,
  `cust_address` varchar(255) DEFAULT NULL,
  `cust_linkman` varchar(255) DEFAULT NULL,
  `cust_phone` varchar(255) DEFAULT NULL,
  `cust_mobile` varchar(255) DEFAULT NULL,
  `cust_source` varchar(255) DEFAULT NULL,
  `cust_fax` varchar(255) DEFAULT NULL,
  `cust_zip` varchar(255) DEFAULT NULL,
  `cust_website` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cst_customer
-- ----------------------------
INSERT INTO `cst_customer` VALUES ('8ae5a08d5efc5b47015efc5ea5910002', 'fasd', 'ewtq', 'ewrtwe', 'wetq', 'gfer', 'wtt', 'fewrfger', 'rtwe', 'twe', 'rtwqe');
INSERT INTO `cst_customer` VALUES ('8ae5a08d5efc5b47015efc5ecccf0003', 'rwetr', 'twe', 'ewt', 'twe', 'wetew', 'twe', 'wetew', 'ew', 'tq', 'we');
INSERT INTO `cst_customer` VALUES ('8ae6b9865efe7b91015efe7c34d80001', 'a', 'ASD', 'DAS', 'DAS', 'DAS', 'DSA', 'DAS', 'DAS', 'DAS', 'DAS');
INSERT INTO `cst_customer` VALUES ('8ae6b9865efe7b91015efe7c66f00002', 'AQ', 'AQ', 'AQ', 'AQ', 'AQ', 'AQ', 'AQ', 'AQ', 'AQ', 'AQ');
INSERT INTO `cst_customer` VALUES ('8ae6b9865efe7b91015efe7c9dd60003', 'AZqwe', 'ZA', 'ZAZA', 'ZA', 'ZAZ', 'ZA', 'ZA', 'ZA', 'ZA', 'ZA');
INSERT INTO `cst_customer` VALUES ('8ae6b9865efe7b91015efe84fa860004', 'asddasdasdas', 'dsa', 'das', 'DAS', 'dasd', 'das', 'dsa', 'dsa', 'DAS', 'dsa');
INSERT INTO `cst_customer` VALUES ('8ae6b9865efe7b91015efe853ee70005', '2132sadas', 'DAS', 's2', '2e', 's2', 's22s', 'das', 's2', 's2', 's2');

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` varchar(255) NOT NULL,
  `user_name` varchar(20) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  `user_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '123', '1');

-- ----------------------------
-- Table structure for `t_lingman`
-- ----------------------------
DROP TABLE IF EXISTS `t_lingman`;
CREATE TABLE `t_lingman` (
  `lkm_id` varchar(255) NOT NULL,
  `lkm_name` varchar(20) DEFAULT NULL,
  `lkm_gender` varchar(255) DEFAULT NULL,
  `lkm_phone` varchar(255) DEFAULT NULL,
  `lkm_mobile` varchar(255) DEFAULT NULL,
  `clid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`lkm_id`),
  KEY `FK_89q1pp6fx91t8mc0665ngfx3c` (`clid`),
  CONSTRAINT `FK_89q1pp6fx91t8mc0665ngfx3c` FOREIGN KEY (`clid`) REFERENCES `cst_customer` (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_lingman
-- ----------------------------
INSERT INTO `t_lingman` VALUES ('8ae548985f075c79015f075cfcef0001', 'das', '1', 'das', 'das', '8ae6b9865efe7b91015efe7c34d80001');
INSERT INTO `t_lingman` VALUES ('8ae548985f075c79015f075fd5790002', '452', '2', '5451', '12', '8ae6b9865efe7b91015efe7c66f00002');
INSERT INTO `t_lingman` VALUES ('8ae548985f07853e015f07858e060001', 'dasd', '1', 'fas', 'fas', '8ae5a08d5efc5b47015efc5ea5910002');
INSERT INTO `t_lingman` VALUES ('8ae548985f07853e015f0785b3260002', 'fasfas', '1', 'fasfsa', 'fsa', '8ae6b9865efe7b91015efe7c34d80001');
INSERT INTO `t_lingman` VALUES ('8ae548985f07853e015f0785d5500003', 'fasf', '1', 'fAf', 'FS', '8ae6b9865efe7b91015efe84fa860004');
