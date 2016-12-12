# jHipster based Set list composer

This folder contains a set list composer set developed using jHipster. It uses the Drools/Optaplanner REST service
found on the ``drools/`` folder.

## Overview

The Set list composer defines an optimal set list for a show given the amount of allocated time and the songs you know how to play.
Each song is defined by its audience enjoyment, technical difficulty and playing fun level, besides its duration in minutes.

When you open the Set list composer, a set of songs is already provided. You can use the ``Add`` and ``Remove`` links to 
customize your list of songs.

Once you are done, use the ``Submit`` link to request for an optimized set list.

## Usage instructions

In order to use it:

1. Install Node JS and install the development tools with ``npm install`` and then ``npm install -g gulp-cli``.

2. Open two terminals and run ``./mvnw`` and ``gulp``.

3. The set list composer will be available under [http://localhost:9000/#/music](http://localhost:9000/#/music).
No authentication is necessary.



