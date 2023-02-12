INSERT INTO `dwd`.`dwd_equ_info_admin_mp_basic_o_a_d`
SELECT `mp_data_source`
FROM (
         SELECT `mp_sr` AS `mp_data_source` -- 测点数据来源
         FROM `ods`.`ods_db_check_tb_check_info4_o_a_d`
     ) `t1`
;