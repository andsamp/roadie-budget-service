# Introduction

project details go here

# Configuring The Application
You will need to update dev_config.yml with your databse configurations. dev_config.yml is the default configuration used when running the application.

# Running The Application

To test the example application run the following commands.

* To run the tests run

`gradle test`

* To package the example run.

        gradle shadowJar

* To drop an existing postgresql database run.

        gradle dropAll

* To setup the postgresql database run.

        gradle migrate

* To run the server run.

        gradle runShadow



