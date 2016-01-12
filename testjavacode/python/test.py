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
array = "dfsdf,锁定,llll".split(',');
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

#tuple元组操作
L = ('spam1', 'spam2', 'spam3', 'Spam', 'SPAM!')
print L
print L[:-1]
print L[1:]
print L[:2]
print len(L[:2])
L = L[:1]+L[2:]
print L
print len(('11',))
M = (('dfs','fds'),('fsd','fsdf'))
N = ();
N = N + tuple(M[0])+tuple(M[1])
print N

#list列表操作
list = []
list.append(L)
list.append(L)
print list
print len(list)
for i in range(len(list)):
    print list[i]
for i in list:
    print i

#字符串
teststr = '0123456789'
print teststr[0:(len(teststr)-1)]
print teststr[0:(len(teststr)-4)]

#字典操作
dicvar = {}
dicvar['one'] = ['1dsf','1sdfs','1fsdf']
dicvar['two'] = ['2dsf','2sdfs','2fsdf']
for i in dicvar:
    print i
    print dicvar[i]