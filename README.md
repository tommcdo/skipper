Skipper
=======

Skipper is an Android application that gives you a better inter-application
experience while using Facebook.

Bypass the web browser
----------------------

Facebook wants to track the links you click. They do this by changing the URL
to a link that your friend posted. Say your friend posted a link to
`https://github.com/tommcdo/skipper`, Facebook will rewrite this as
`http://m.facebook.com/l.php?u=https%3A%2F%2Fgithub.com%2Ftommcdo%2Fskipper`,
so that the link will first visit Facebook's server, where it will mark the
link as clicked by you and then redirect you to the website your friend
originally linked.

I don't really have a problem with Facebook tracking the links I visit; that's
not why I made this app. The problem here is that these rewritten links will
not be presented to any of my installed applications which may be looking for
links matching a certain pattern. Using the above example, when I click a link
matching `https://github.com` from an Android app, and I have the GitHub app
installed, Android will ask me which app I want to use to complete the action
(offering GitHub, web browsers such as Chrome, and potentially others). But
when these links come out of Facebook, the rewritten URLs don't match what the
GitHub app is looking for, so only web browsers are willing to respond.

Skipper is an app that handles URLs matching `http://m.facebook.com/l.php`.
Once you choose to use Skipper to complete the action of opening a link coming
from Facebook, the Skipper will extract and decode the original link and send
it out to the system. You'll be presented with another choice for which app
to use to complete the action (or, if you've already chosen to always use a
particular app, it will just go straight there).

How to use Skipper
------------------

Using Skipper is very easy. In most cases, you will only have to see it once.

1. Click on any link posted on Facebook.

2. You will be presented with a choice to open the link with a web browser or
   with Skipper. Choose Skipper, and select "Always".

   ![](https://raw.github.com/wiki/tommcdo/skipper/assets/images/choose-skipper.jpg)

   This step will never be required again unless you install another
   application that handles web links (such as a new web browser).

3. Choose the application you want to open the link with.

   ![](https://raw.github.com/wiki/tommcdo/skipper/assets/images/choose-application.jpg)

4. Enjoy!

Note that Skipper will not show up in the application drawer. There's nothing
to do within the Skipper app itself, as its only job is to redirect traffic
coming from Facebook.
