--// create table tb_tc_order_flow_monitoring
-- Migration SQL that makes the change goes here.
DROP TABLE IF EXISTS tb_tc_order_flow_monitoring;

CREATE TABLE tb_tc_order_flow_monitoring(
dp_id VARCHAR(50) NOT NULL COMMENT '店铺ＩＤ',
order_status VARCHAR(50) NOT NULL COMMENT '订单状态',
order_count INT NOT NULL COMMENT '订单数',
flow_rate VARCHAR(50) COMMENT '当前订单状态流转率/%',
flow_interval_time VARCHAR(50) COMMENT '当前订单状态平均流转间隔时间/小时',
number_days INT COMMENT '统计天数',
PRIMARY KEY(dp_id, order_status)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT = '订单监控-统计订单流转监控信息';


--//@UNDO
-- SQL to undo the change goes here.
DROP TABLE IF EXISTS tb_tc_order_flow_monitoring;

CREATE TABLE tb_tc_order_flow_monitoring(
dp_id VARCHAR(50) NOT NULL COMMENT '店铺ＩＤ',
order_status VARCHAR(50) NOT NULL COMMENT '订单状态',
order_count INT NOT NULL COMMENT '订单数',
flow_rate DOUBLE(5,2) COMMENT '流转率',
flow_interval_time DOUBLE(5,2) COMMENT '平均流转间隔时间/小时',
number_days INT COMMENT '统计天数',
PRIMARY KEY(dp_id, order_status)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT = '订单监控-统计订单流转监控信息';