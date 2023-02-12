INSERT INTO `dwd_xs_jbxx_ndf`
SELECT `t1`.`stu_no`
FROM (
         SELECT `t1`.`stu_no` AS `stu_no`
         FROM (
                  SELECT DISTINCT `ks`.`xh` `stu_no`
                  FROM `ods_zsj_t_bzks_ndf` `ks`
                           LEFT JOIN
                           (SELECT CAST(`dm` AS INT) AS `dm`, `mc` FROM `ods_zsj_t_zxbz_mz_ndf`) `d`
                           ON CAST(`ks`.`mzdm` AS INT) = `d`.`dm`
              ) `t1`
         UNION ALL
         SELECT `T1`.`student_nooo` AS `stu_no`
         FROM `ods_yjs_jbxx_ndf` `T1`
     ) `t1`