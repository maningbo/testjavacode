#coding:utf-8
'''
Created on 2016年3月24日

@author: maningbo
'''

from datetime import timedelta,date
import time
from calendar import monthrange
import os
import sys

if __name__=='__main__':
    print sys.argv[1]
    os.system("echo 343242342")
    
    dt='2016-03-24'
    timestamp = int(time.mktime(time.strptime(str(dt), "%Y-%m-%d")))#字符串转时间戳
    print dt
    print timestamp
    print time.strftime('%Y-%m-%d %H:%M:%S',time.localtime(timestamp))#时间戳转字符串
    timesplit=dt.split("-")
    day=date(int(timesplit[0]),int(timesplit[1]),int(timesplit[2]))
    goal = timedelta(days=-60)
    goalday = day + goal
    data=goalday.strftime('%Y-%m-%d')
    print data
    
    monthlater = day + timedelta(days=monthrange(day.year,day.month)[1])
    print monthlater.strftime('%Y-%m-%d')
    print '-----------------------------------------------------'
    dt2='2016-04-01'
    timestamp2 = int(time.mktime(time.strptime(str(dt), "%Y-%m-%d")))
    print dt2
    print timestamp2
    timesplit2=dt2.split("-")
    day2 = date(int(timesplit2[0]),int(timesplit2[1]),int(timesplit2[2]))
    goal2 = timedelta(days=-1)
    goalday2 = day2 + goal2
    data2=goalday2.strftime('%Y-%m')
    print data2+'-01'