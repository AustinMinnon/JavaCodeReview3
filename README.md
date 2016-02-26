# _Hair Salon Database_

#### _Database program for a hair salon with stylists, and their clients. February 26, 2016_

#### By _**Austin Minnon**_

## Description

_Add a stylist, and then later add clients to that stylist. The main objective of this program is to keep track of all clients, and which stylist they belong to._

## Setup/Installation Requirements

* _Clone this repository._
* _Make sure you have Java and Gradle installed._
    * _For Java:_
        * _Download and install [Java SDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)_
        * _Download and install [Java JRE](http://www.java.com/en/)_
    * _For Gradle: if you are using Homebrew on Mac:_
        -$ brew update_
        -$ brew install gradle_
    * _Download and install Postgresql_
* _Open a command line, and run postgres to enable databases locally_
 1. CREATE DATABASE hair_salon;
 2. CREATE TABLE stylists (id serial PRIMARY KEY, name varchar);
 3. CREATE TABLE clients (id serial PRIMARY KEY, name varchar, stylistId int);  
 4. CREATE DATABASE hair_salon_test WITH TEMPLATE hair_salon;

* _In the top level of the cloned directory, run the following command in your terminal:_
    * _$ gradle run_
* _Open your web browser of choice to localhost:4567_

## Bugs

_No known bugs_

## Technologies Used

_Java, Spark, Junit, Velocity, Fluentlenium, Bootstrap_

### License

_This software is licensed under the MIT license._

Copyright (c) 2016 _**Austin Minnon**_
