SELECT VERSION();-- 查看版本号

-- show status like '%Connections%';-- 查看连接状态

-- show variables like '%max_connections%';-- 查看最大连接数

-- show processlist;-- 查看连接数详情列表

select SUBSTRING_INDEX(host,':',1) as ip , count(*) from information_schema.processlist group by ip;

SHOW VARIABLES LIKE 'character%'    -- 查看字符编码