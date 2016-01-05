#!/usr/bin/env python
#coding: utf-8
import smtplib
from email.mime.text import MIMEText

sender = 'dasdasda'    #发件人
receiver = 'fdsfs'  #收件人
subject = 'python email test'   #邮件标题
smtpserver = 'fsdfsf'   #邮箱发送服务器
username = 'sdfsfd'  #邮箱登录名
password = 'fsfs'   #邮箱密码

msg = MIMEText('</pre>' #发送html 格式的邮件
'<h1>你好</h1>'  #邮件内容太
'<pre>','html','utf-8') #设置发送邮件的格式
msg['Subject'] = subject    #设置邮件标题
msg['From'] = sender    #设置邮件发件人
msg['To'] = receiver    #设置邮件收件人

#连接发送服务器并发送邮件
smtp = smtplib.SMTP()
smtp.connect(smtpserver)
smtp.login(username, password)
smtp.sendmail(sender, receiver, msg.as_string())
smtp.quit()