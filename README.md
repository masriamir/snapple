Snapple Real Facts Library
==========================

This library allows you to retrieve random Snapple Real Facts from [Snapple.com](http://www.snapple.com).

Usage
-----
    FactGenerator factGenerator = new FactGenerator();
    Fact fact = factGenerator.generateFact();

Notes
-----

Each request has a one second delay in order to prevent any issues when generating the fact. Issues sometimes occur when making many quick, successive requests to Snapple's website. This delay prevents that.