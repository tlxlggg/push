/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/11/2 17:05:13                           */
/*==============================================================*/


DROP TABLE IF EXISTS a_user;

DROP TABLE IF EXISTS a_user_detail;

/*==============================================================*/
/* Table: a_user                                                */
/*==============================================================*/
CREATE TABLE a_user
(
   id                   BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户编号',
   login_name           VARCHAR(64) NOT NULL COMMENT '登录名称',
   user_name            VARCHAR(64) NOT NULL COMMENT '用户名',
   PASSWORD             VARCHAR(64) NOT NULL COMMENT '登录密码',
   cell_phone           VARCHAR(16) NOT NULL COMMENT '手机号码',
   company_id           BIGINT UNSIGNED COMMENT '所属企业',
   work_number          VARCHAR(32) COMMENT '工号',
   PRIMARY KEY (id)
);

/*==============================================================*/
/* Table: a_user_detail                                         */
/*==============================================================*/
CREATE TABLE a_user_detail
(
   id                   BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户详情编号',
   user_id              BIGINT UNSIGNED NOT NULL COMMENT '用户编号',
   id_number            VARCHAR(32) NOT NULL COMMENT '身份证号',
   home_address         VARCHAR(256) NOT NULL COMMENT '家庭住址',
   PRIMARY KEY (id)
)