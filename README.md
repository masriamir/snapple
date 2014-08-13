Snapple Real Facts Library
==========================

This is a Java library allows you to retrieve random Snapple Real Facts from [Snapple.com](http://www.snapple.com).

Download
-------------------

Download the latest release from [GitHub](https://github.com/masriamir/snapple/releases/tag/v1.0).

Usage
-----

    FactGenerator factGenerator = new FactGenerator();
    Fact fact = factGenerator.generateFact();

Notes
-----

Each request has a one second delay in order to prevent any issues when generating the fact. Issues sometimes occur when making many quick, successive requests to Snapple's website. This delay prevents that.