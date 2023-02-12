INSERT INTO `dwd`.`dwd_equ_info_admin_mp_basic_o_a_d`
SELECT ROW_NUMBER() OVER ()                                     AS `id`
     , `t1`.`mp_data_source`
     , IFNULL(IF(`t1`.`units` = "NA", NULL, `t1`.`units`), "-") AS `units` -- 单位
FROM (
         SELECT "汽轮机"  AS `mp_data_source` -- 测点数据来源
              , `unit` AS `units`          -- 单位
         FROM `ods`.`ods_db_station_tb_fcg_station_info_o_a_d`
         UNION ALL
         SELECT `mp_sr`            AS `mp_data_source` -- 测点数据来源
              , `appearance_units` AS `units`          -- 单位
         FROM `ods`.`ods_db_check_tb_check_info4_o_a_d`
     ) `t1`
GROUP BY `mp_data_source`
       , `units`
;