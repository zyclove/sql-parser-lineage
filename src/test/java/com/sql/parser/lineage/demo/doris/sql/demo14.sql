insert OVERWRITE default_catalog.dw.dwd_exp_lme_driver_block_ha partition(p2023011612)
with s_lme_driver_lme_driver_block_a as (
    select
        block_no     -- 箱号
        ,driver_id     -- 司机id
        ,id       -- 箱分发id
        ,block_serial_no       -- 箱子序号
        ,central_warehouse_id      -- 中心仓id
        ,distribute_warehouse_id      -- 配送仓id
        ,package_num      -- 包裹数量
        ,price      -- 预计收入
        ,delivery_date      -- 预计的配送日期
        ,spilt_time       -- 分箱时间
        ,receiving_time      -- 接单时间
        ,complete_time     -- 箱完成时间
        ,sign_in_time      -- 司机签到时间
        ,pick_up_time     
        ,status 
        ,settlement
        ,delete_flag 
        ,created_time 
        ,updated_time 
    from
    (
        select
            block_no     -- 箱号
            ,driver_id     -- 司机id
            ,id       -- 箱分发id
            ,block_serial_no       -- 箱子序号
            ,central_warehouse_id      -- 中心仓id
            ,distribute_warehouse_id      -- 配送仓id
            ,package_num      -- 包裹数量
            ,price      -- 预计收入
            ,delivery_date      -- 预计的配送日期
            ,spilt_time       -- 分箱时间
            ,receiving_time      -- 接单时间
            ,complete_time     -- 箱完成时间
            ,sign_in_time      -- 司机签到时间
            ,pick_up_time     
            ,status 
            ,settlement
            ,delete_flag 
            ,created_time 
            ,updated_time 
            ,row_number() over(partition by id order by updated_time desc) rn
        from 
        (
        select
            block_no     -- 箱号
            ,driver_id     -- 司机id
            ,id       -- 箱分发id
            ,block_serial_no       -- 箱子序号
            ,central_warehouse_id      -- 中心仓id
            ,distribute_warehouse_id      -- 配送仓id
            ,package_num      -- 包裹数量
            ,price      -- 预计收入
            ,delivery_date      -- 预计的配送日期
            ,spilt_time       -- 分箱时间
            ,receiving_time      -- 接单时间
            ,complete_time     -- 箱完成时间
            ,sign_in_time      -- 司机签到时间
            ,pick_up_time     
            ,status 
            ,settlement
            -- ,case when settlement = 10 then 0 when settlement = 20 then 1 end as is_settle   -- 是否结算
            ,delete_flag 
            ,created_time 
            ,updated_time 
        from stage.s_lme_driver_lme_driver_block_a
        where dt = '2023-01-16'  
        union all
        select
            block_no     -- 箱号
            ,driver_id     -- 司机id
            ,id       -- 箱分发id
            ,block_serial_no       -- 箱子序号
            ,central_warehouse_id      -- 中心仓id
            ,distribute_warehouse_id      -- 配送仓id
            ,package_num      -- 包裹数量
            ,price      -- 预计收入
            ,delivery_date      -- 预计的配送日期
            ,spilt_time       -- 分箱时间
            ,receiving_time      -- 接单时间
            ,complete_time     -- 箱完成时间
            ,sign_in_time      -- 司机签到时间
            ,pick_up_time     
            ,status 
            ,settlement
            -- ,case when settlement = 10 then 0 when settlement = 20 then 1 end as is_settle   -- 是否结算
            ,delete_flag 
            ,created_time 
            ,updated_time 
        from stage.s_lme_driver_lme_driver_block_hi
        where dt = '2023-01-16'  
            and hour <= 12
        ) a
    ) a
    where rn = 1 

)
select