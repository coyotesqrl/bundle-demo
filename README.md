# Bad-bundle-demo #

###Don't Do That###

+ Embed a bundle
+ Make a bundle when you want a jar
+ Export packages with no API defined to be exported
+ Pass embedded objects between bundles that are not
    + loaded by the root classloader
    + or managed by the OSGi framework (ie: service interfaces)
+ Export concrete classes from bundles except for
    + JAXB objects to be shared
    + ???

Embedding is an *implementation detail*; it should never effect other bundles because no other 
bundles should interact with a bundle except through exported services or exported packages.

## How to use this demo ##
1. Download the `apache-karaf-2.4.3` distribution appropriate to your OS from 
[Apache](https://karaf.apache.org/index/community/download.html)
2. Unpack and deploy the karaf distro to your environment.
3. Clone and build this demo.
4. Copy the resulting KAR file - `bundle-app/target/bundle-app-1.0-SNAPSHOT.kar` - to your karaf 
distro's `$KARAF_HOME/deploy` directory.
