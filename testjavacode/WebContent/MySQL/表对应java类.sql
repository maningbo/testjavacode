SELECT CONCAT
(
'private ',
CASE 
WHEN DATA_TYPE IN ('int','bigint') THEN 'Integer' 
WHEN DATA_TYPE='varchar' THEN 'String' 
WHEN DATA_TYPE IN ('decimal','double') THEN 'Double' 
WHEN DATA_TYPE IN('timestamp','datetime') THEN 'Date' END,
' ',
COLUMN_NAME,
';'
) 
colum 
FROM information_schema.`COLUMNS` WHERE table_name='maningbo';