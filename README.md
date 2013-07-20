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

There's no configuration needed, and absolutely minimal setup required. After
installing Skipper, launch Facebook and click any link that someone has shared.
Android will ask you if you'd like to use Skipper or one of your web browsers
to complete the action; choose Skipper, and be sure to select "always" for this
type of action. You'll never have to look at Skipper again, and all of the
links coming out of Facebook will have the opportunity to open in your
favourite app.

Note that Skipper will not show up in the application drawer. There's nothing
to do within the Skipper app itself, as its only job is to redirect traffic
coming from Facebook.
