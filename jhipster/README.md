# jHipster based Set list composer

This folder contains a set list composer set developed using jHipster. It uses the Drools/Optaplanner REST service
found on the ``drools/`` folder.

## Overview

![Set list composer](/jhipster/Capture1.PNG)
The Set list composer defines an optimal set list for a show given the amount of allocated time and the songs you know how to play.
Each song is defined by its audience enjoyment, technical difficulty and playing fun level, besides its duration in minutes.

When you open the Set list composer, a set of songs is already provided. You can use the ``Add`` and ``Remove`` links to 
customize your list of songs.

![Submit button](/jhipster/Capture2.PNG)

Once you are done, use the ``Submit`` link to request for an optimized set list.

![Result](/jhipster/Capture3.PNG)

A ``Job information`` section will appear on the bottom of the page, it will display the status of the server side work, and
the current best set list.

## Usage instructions

In order to use it:

1. Install Node JS and install the development tools with ``npm install`` and then ``npm install -g gulp-cli``.

2. Open two terminals and run ``./mvnw`` and ``gulp``.

3. The set list composer will be available under [http://localhost:9000/#/music](http://localhost:9000/#/music).
No authentication is necessary.



