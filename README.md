# forseti
File manager between desktops and file server.

## Overview:
This application is meant to be a lightweight service that runs on my fileserver and scans directories on my other computers to see if files should get moved over to my server.

## General Design:
- What I'm thinking initially is this:
    - Use Python used to run scripts.
    - Application code is Scala since its lightweight and should be portable.
    - Might use a few AWS SDKs if needed.