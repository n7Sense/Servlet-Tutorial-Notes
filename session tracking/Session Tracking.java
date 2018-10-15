	Session Tracking
=======================
If we want to store data Temporarly, i.e some specific priod of time then wh shuld go for Session Tracking mechanism.

We can store the data in two way
	i. Permanently
	ii. Temporarly

A. 	Permanently
	 To store the data Permanently, the we shuld have to use any database like, Oracle, MySql, H2DB, Mongo DB etc.

B. Temporarly
	If we want to store data Temporarly, i.e some perioud of time then wh shuld go for Session Tracking.


Types Of Technique To Store Temporarly
======================================

	1. HttpSessionTracking  (temporarly store data at SERVER side for some perioud of time)
	2. Cookies				(temporarly store data at CLIENT side for some perioudd of time)
	3. HiddenFormField		(temporarly store data at CLIENT side for some perioudd of time)
	4. UrlRewriting			(temporarly store data at CLIENT side for some perioudd of time)


DrawBack
===========
Heare more no. of client connected with the same application, and rhe Session object are created internally
at server side, if more no. of Session object created at server side then it will not give a proper response

to overcome this problem we have to go for Cookies, HiddenFormField, UrlRewriting. 

how many client are connected to the server that much session will be created at server, and performence will be decresed
and we will not get response on proper time.

Syntax To create
=================

		HttpSession hs = req.getSession();
		String items = (String)req.getParameter("fruit");
		String quantity = (String)req.getParameter("qt");
		hs.setAttribute(items, quantity);