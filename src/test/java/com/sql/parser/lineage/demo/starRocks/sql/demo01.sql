INSERT INTO `db_test`.`table_result`
SELECT order_id FROM  `db_test`.`table2`;
-- INSERT INTO `db_test`.`table_result`
-- SELECT `t2`.`id` AS `idff`
-- FROM (SELECT `id1` AS `id` FROM `db_test`.`table1`) `t1`
--          LEFT JOIN
--      (
--          SELECT `id`
--          FROM `db_test`.`table2`
--      ) `t2` ON `t1`.`id` = `t2`.`id`
-- ;