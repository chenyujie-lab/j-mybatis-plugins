SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_hobby
-- ----------------------------
DROP TABLE IF EXISTS `user_hobby`;
CREATE TABLE `user_hobby`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(255) NOT NULL COMMENT '用户ID',
  `hobby` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '爱好(字典项)',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户爱好关系表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_hobby
-- ----------------------------
INSERT INTO `user_hobby` VALUES (1, 10, '11');
INSERT INTO `user_hobby` VALUES (2, 10, '21');
INSERT INTO `user_hobby` VALUES (3, 11, '22');
INSERT INTO `user_hobby` VALUES (4, 11, '31');
INSERT INTO `user_hobby` VALUES (5, 1, '11');
INSERT INTO `user_hobby` VALUES (6, 2, '41');

-- ----------------------------
-- Table structure for sys_dict_data
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict_data`;
CREATE TABLE `sys_dict_data`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `parent_id` int(11) NOT NULL DEFAULT 0 COMMENT '父级字典id',
  `dict_type` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字典类型',
  `dict_label` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '字典标签',
  `dict_value` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '字典键值',
  `sequence` int(11) NOT NULL DEFAULT 0 COMMENT '排序号',
  `comments` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '数据状态（0：未删除 1：已删除）',
  `creator_user_id` bigint(20) NOT NULL COMMENT '创建人',
  `creation_time` datetime(0) NOT NULL COMMENT '创建时间',
  `last_modifier_user_id` bigint(20) NULL DEFAULT NULL COMMENT '修改人',
  `last_modification_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `date_time_stamp` int(11) NOT NULL DEFAULT 0 COMMENT '时间戳（秒级）',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_dict_type`(`dict_type`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 132 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '字典数据表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_dict_data
-- ----------------------------
INSERT INTO `test`.`sys_dict_data`(`id`, `parent_id`, `dict_type`, `dict_label`, `dict_value`, `sequence`, `comments`, `is_deleted`, `creator_user_id`, `creation_time`, `last_modifier_user_id`, `last_modification_time`, `date_time_stamp`) VALUES (101, 0, 'sex', '男', '1', 0, NULL, 0, 1, '2022-07-03 17:23:51', NULL, NULL, 0);
INSERT INTO `test`.`sys_dict_data`(`id`, `parent_id`, `dict_type`, `dict_label`, `dict_value`, `sequence`, `comments`, `is_deleted`, `creator_user_id`, `creation_time`, `last_modifier_user_id`, `last_modification_time`, `date_time_stamp`) VALUES (102, 0, 'sex', '女', '0', 0, NULL, 0, 1, '2022-07-03 17:24:14', NULL, NULL, 0);
INSERT INTO `test`.`sys_dict_data`(`id`, `parent_id`, `dict_type`, `dict_label`, `dict_value`, `sequence`, `comments`, `is_deleted`, `creator_user_id`, `creation_time`, `last_modifier_user_id`, `last_modification_time`, `date_time_stamp`) VALUES (103, 0, 'sex', '未知', '2', 0, NULL, 0, 1, '2022-07-03 17:24:47', NULL, NULL, 0);
INSERT INTO `test`.`sys_dict_data`(`id`, `parent_id`, `dict_type`, `dict_label`, `dict_value`, `sequence`, `comments`, `is_deleted`, `creator_user_id`, `creation_time`, `last_modifier_user_id`, `last_modification_time`, `date_time_stamp`) VALUES (104, 0, 'hobby', '篮球', '11', 0, NULL, 0, 1, '2022-07-03 17:25:40', NULL, NULL, 0);
INSERT INTO `test`.`sys_dict_data`(`id`, `parent_id`, `dict_type`, `dict_label`, `dict_value`, `sequence`, `comments`, `is_deleted`, `creator_user_id`, `creation_time`, `last_modifier_user_id`, `last_modification_time`, `date_time_stamp`) VALUES (105, 0, 'hobby', '足球', '12', 0, NULL, 0, 1, '2022-07-03 17:25:59', NULL, NULL, 0);
INSERT INTO `test`.`sys_dict_data`(`id`, `parent_id`, `dict_type`, `dict_label`, `dict_value`, `sequence`, `comments`, `is_deleted`, `creator_user_id`, `creation_time`, `last_modifier_user_id`, `last_modification_time`, `date_time_stamp`) VALUES (106, 0, 'hobby', '乒乓球', '13', 0, NULL, 0, 1, '2022-07-03 17:26:20', NULL, NULL, 0);
INSERT INTO `test`.`sys_dict_data`(`id`, `parent_id`, `dict_type`, `dict_label`, `dict_value`, `sequence`, `comments`, `is_deleted`, `creator_user_id`, `creation_time`, `last_modifier_user_id`, `last_modification_time`, `date_time_stamp`) VALUES (107, 0, 'hobby', '钢琴', '21', 0, NULL, 0, 1, '2022-07-03 17:27:06', NULL, NULL, 0);
INSERT INTO `test`.`sys_dict_data`(`id`, `parent_id`, `dict_type`, `dict_label`, `dict_value`, `sequence`, `comments`, `is_deleted`, `creator_user_id`, `creation_time`, `last_modifier_user_id`, `last_modification_time`, `date_time_stamp`) VALUES (108, 0, 'hobby', '长笛', '22', 0, NULL, 0, 1, '2022-07-03 17:27:23', NULL, NULL, 0);
INSERT INTO `test`.`sys_dict_data`(`id`, `parent_id`, `dict_type`, `dict_label`, `dict_value`, `sequence`, `comments`, `is_deleted`, `creator_user_id`, `creation_time`, `last_modifier_user_id`, `last_modification_time`, `date_time_stamp`) VALUES (109, 0, 'hobby', '画画', '31', 0, NULL, 0, 1, '2022-07-03 17:28:02', NULL, NULL, 0);
INSERT INTO `test`.`sys_dict_data`(`id`, `parent_id`, `dict_type`, `dict_label`, `dict_value`, `sequence`, `comments`, `is_deleted`, `creator_user_id`, `creation_time`, `last_modifier_user_id`, `last_modification_time`, `date_time_stamp`) VALUES (110, 0, 'hobby', '摄影', '41', 0, NULL, 0, 1, '2022-07-03 17:28:49', NULL, NULL, 0);
INSERT INTO `test`.`sys_dict_data`(`id`, `parent_id`, `dict_type`, `dict_label`, `dict_value`, `sequence`, `comments`, `is_deleted`, `creator_user_id`, `creation_time`, `last_modifier_user_id`, `last_modification_time`, `date_time_stamp`) VALUES (111, 0, 'hobby', '其他', '91', 0, NULL, 0, 1, '2022-07-03 17:29:08', NULL, NULL, 0);
INSERT INTO `test`.`sys_dict_data`(`id`, `parent_id`, `dict_type`, `dict_label`, `dict_value`, `sequence`, `comments`, `is_deleted`, `creator_user_id`, `creation_time`, `last_modifier_user_id`, `last_modification_time`, `date_time_stamp`) VALUES (112, 0, 'CompanyState', '开业', '1', 0, NULL, 0, 1, '2022-07-03 17:34:02', NULL, NULL, 0);
INSERT INTO `test`.`sys_dict_data`(`id`, `parent_id`, `dict_type`, `dict_label`, `dict_value`, `sequence`, `comments`, `is_deleted`, `creator_user_id`, `creation_time`, `last_modifier_user_id`, `last_modification_time`, `date_time_stamp`) VALUES (113, 0, 'CompanyState', '停业', '2', 0, NULL, 0, 1, '2022-07-03 17:35:16', NULL, NULL, 0);
INSERT INTO `test`.`sys_dict_data`(`id`, `parent_id`, `dict_type`, `dict_label`, `dict_value`, `sequence`, `comments`, `is_deleted`, `creator_user_id`, `creation_time`, `last_modifier_user_id`, `last_modification_time`, `date_time_stamp`) VALUES (114, 0, 'CompanyState', '注销', '3', 0, NULL, 0, 1, '2022-07-03 17:36:24', NULL, NULL, 0);


-- ----------------------------
-- Table structure for sys_dict_type
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict_type`;
CREATE TABLE `sys_dict_type`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `dict_name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '字典名称',
  `dict_type` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '字典类型',
  `sequence` int(11) NOT NULL DEFAULT 0 COMMENT '排序号',
  `comments` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '数据状态（0：未删除 1：已删除）',
  `creator_user_id` bigint(20) NOT NULL COMMENT '创建人',
  `creation_time` datetime(0) NOT NULL COMMENT '创建时间',
  `last_modifier_user_id` bigint(20) NULL DEFAULT NULL COMMENT '修改人',
  `last_modification_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `date_time_stamp` int(11) NOT NULL DEFAULT 0 COMMENT '时间戳（秒级）',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `dict_name`(`dict_name`) USING BTREE,
  UNIQUE INDEX `dict_type`(`dict_type`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 104 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '字典类型表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_dict_type
-- ----------------------------
INSERT INTO `test`.`sys_dict_type`(`id`, `dict_name`, `dict_type`, `sequence`, `comments`, `is_deleted`, `creator_user_id`, `creation_time`, `last_modifier_user_id`, `last_modification_time`, `date_time_stamp`) VALUES (101, '性别', 'sex', 0, NULL, 0, 1, '2022-07-03 17:22:29', NULL, NULL, 0);
INSERT INTO `test`.`sys_dict_type`(`id`, `dict_name`, `dict_type`, `sequence`, `comments`, `is_deleted`, `creator_user_id`, `creation_time`, `last_modifier_user_id`, `last_modification_time`, `date_time_stamp`) VALUES (102, '爱好', 'hobby', 0, NULL, 0, 1, '2022-07-03 17:23:03', NULL, NULL, 0);
INSERT INTO `test`.`sys_dict_type`(`id`, `dict_name`, `dict_type`, `sequence`, `comments`, `is_deleted`, `creator_user_id`, `creation_time`, `last_modifier_user_id`, `last_modification_time`, `date_time_stamp`) VALUES (103, '公司经营状态', 'CompanyState', 0, NULL, 0, 1, '2022-07-03 17:23:16', NULL, NULL, 0);


-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工ID',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工名称',
  `age` int(11) NULL DEFAULT NULL COMMENT '员工年龄',
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工性别(字典项)',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工邮箱',
  `phone_number` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工手机号',
  `company_id` int(11) NULL DEFAULT NULL COMMENT '所属公司',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `labels` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标签',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, '张三', 23, '1', 'zhangsan@163.com', '17320297101', NULL, '2022-04-16 13:38:25', NULL);
INSERT INTO `users` VALUES (2, '李四', 24, '1', 'lisi@163.com', '17320297102', NULL, '2022-04-16 13:38:44', NULL);
INSERT INTO `users` VALUES (3, '王五', 26, '1', 'wangwu@163.com', '17320297103', NULL, '2022-04-16 13:39:06', NULL);
INSERT INTO `users` VALUES (4, '小鬼', 20, '1', 'xiaogui@163.com', '17320297104', NULL, '2022-04-16 13:39:36', NULL);
INSERT INTO `users` VALUES (5, '小涛', 21, '1', 'xiaotao@163.com', '17320297105', NULL, '2022-04-16 13:40:00', NULL);
INSERT INTO `users` VALUES (6, '乐乐', 21, '1', 'lele@163.com', '17320297106', NULL, '2022-04-16 13:40:16', NULL);
INSERT INTO `users` VALUES (7, '宁宁', 21, '1', 'ningning@163.com', '17320297107', NULL, '2022-04-16 13:40:38', NULL);
INSERT INTO `users` VALUES (8, '静静', 21, '0', 'jingjing@163.com', '17320297108', NULL, '2022-04-16 13:40:59', NULL);
INSERT INTO `users` VALUES (9, '蓉蓉', 23, '0', 'rongrong@163.com', '17320297109', NULL, '2022-04-16 13:41:29', NULL);
INSERT INTO `users` VALUES (10, '张三丰', 123, '1', 'zhangsanfeng@163.com', '17320297110', 1, '2022-04-16 13:41:56', NULL);
INSERT INTO `users` VALUES (11, '殷素素', 33, '0', 'yinsusu@163.com', '17320297111', 2, '2022-04-16 13:42:57', NULL);
INSERT INTO `users` VALUES (12, '张无忌', 34, '1', 'zhangwuji@163.com', '17320297112', NULL, '2022-04-16 13:42:57', NULL);



-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '公司ID',
  `company_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '公司名称',
  `state` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '营业状态',
  `registration_date` datetime(0) NULL DEFAULT NULL COMMENT '注册时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '公司信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of company
-- ----------------------------
INSERT INTO `company` VALUES (1, '晶优智能科技有限公司', '1', '2022-07-03 14:02:35');
INSERT INTO `company` VALUES (2, '一胜科技有限公司', '1', '2022-07-03 14:04:45');



SET FOREIGN_KEY_CHECKS = 1;