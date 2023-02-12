INSERT into `db_test`.`table_result`
SELECT `t1`.`id` + `t2`.`id` AS `idff`,
       `t2`.`name`
FROM (SELECT `id1` + `id2` AS `id` FROM `db_test`.`table1`) `t1`
         LEFT JOIN
     (
         SELECT `id`, `name`
         FROM (
                  SELECT `t11`.`id`,
                         `t11`.`sourcename` AS `name`
                  FROM (SELECT `idd` AS `id`, `sourcename` FROM `db_test`.`table2`) `t11`
              )
     ) `t2` ON `t1`.`id` = `t2`.`id`
;

-- INSERT INTO `db_test`.`table_result`
-- SELECT `t2`.`id` AS `idff`
-- FROM (SELECT `id1` AS `id` FROM `db_test`.`table1`) `t1`
--          LEFT JOIN
--      (
--          SELECT `id`
--          FROM `db_test`.`table2`
--      ) `t2` ON `t1`.`id` = `t2`.`id`
-- ;