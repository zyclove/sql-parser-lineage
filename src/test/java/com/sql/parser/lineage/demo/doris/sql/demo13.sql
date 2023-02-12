INSERT INTO `dwd_xs_jbxx_ndf`
SELECT `t1`.`stu_no`
FROM (
         SELECT DISTINCT `ks`.`xh` `stu_no`
         FROM `ods_zsj_t_bzks_ndf` `ks`
     ) `t1`
UNION ALL
SELECT `t1`.`student_no` AS `stu_no`
FROM (
         SELECT `ks`.`xh` `student_no`
         FROM `ods_yjs_jbxx_ndf` `ks`
     ) `t1`
;