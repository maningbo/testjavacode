#coding:utf-8
#获取命令行参数
#参考链接：http://blog.csdn.net/intel80586/article/details/8545572
import sys
import datetime
import time

print "脚本名：", sys.argv[0]
for i in range(1, len(sys.argv)):
    print "参数", i, sys.argv[i]

dt = sys.argv[1]
timestamp = int(time.mktime(time.strptime(dt, "%Y-%m-%d")))
print timestamp

print int(time.mktime(time.strptime('2016-01-12', "%Y-%m-%d")))