-- DECIMAL从MySQL 5.1引入，列的声明语法是DECIMAL(M,D)。在MySQL 5.1中，参量的取值范围如下：
-- M是数字的最大数（精度）。其范围为1～65（在较旧的MySQL版本中，允许的范围是1～254），M 的默认值是10。
-- D是小数点右侧数字的数目（标度）。其范围是0～30，但不得超过M。
-- 说明：float占4个字节，double占8个字节，decimail(M,D)占M+2个字节。
-- 保留两位小数
SELECT CONVERT(4545.1366,DECIMAL(10,2));-- CONVERT(expr,type)
SELECT CAST(4545.1366 AS DECIMAL(10,2));-- CAST(expr AS type)
-- Formats the number X to a format like '#,###,###.##', rounded to D decimal places, and returns the result as a string. 
-- If D is 0, the result has no decimal point or fractional part.
-- 整数部分超过三位的时候以逗号分割，并且返回的结果是string类型的
SELECT FORMAT(12562.6655,2);