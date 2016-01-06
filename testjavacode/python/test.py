#coding:utf-8
import datetime
# for循环
# list2 = [1, 2, 3, 4, 5 ]
# for a in list2:
#     print a
#     for b in list2:
#         print b
for i in range(5):
    print i
        
# str,split函数
print "dfsdf,sdfsdf".split(',',1)
array = "dfsdf".split(',',1);
if array:
    print len(array)
    print array[0]
    for a in array:
        print a
teststr = 'sdfs,,'
print teststr[0:(len(teststr)-1)]
        
#日期转化
time1 = datetime.datetime.strptime("2015-12-31 00:00:00", "%Y-%m-%d %H:%M:%S")
time2 = time1+datetime.timedelta(minutes=-int(1440))
timestring = datetime.datetime.strftime(time2,"%Y-%m-%d")
print timestring
time21 = time1+datetime.timedelta(days=int(1))
timestring1 = datetime.datetime.strftime(time21,"%Y-%m-%d")
print timestring1

#数值
print int('1')
print abs(-2.5) #取绝对值
print (2-9)/float(8)
print 'jjjjj'+str(round(abs(-0.08333333333333333333333333333333),4)*100)+'%'
numbertest = 0
numbertest+=1
print numbertest
print (0==0.0000)
print (0!=0.0000)
# print int(None)

#流程控制语句
stefsfs = None
stefsfs = 0 if (stefsfs==None) else stefsfs
print 0 if (stefsfs==None) else stefsfs