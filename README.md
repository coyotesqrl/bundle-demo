# Bundle-demo #

## Bundle 101 ##
Bundles are jar archives where the `META-INF/MANIFEST.MF` defines the properties of the bundle. The 
best resource for learning about the structure and headers in the manifest definition is in section 
3.6 of the [OSGi Core Specification](https://osgi.org/download/r5/osgi.core-5.0.0.pdf). 
Additionally, the tools we use to generate our manifests - the [Apache Felix Maven Bundle Plugin]
(http://felix.apache.org/documentation/subprojects/apache-felix-maven-bundle-plugin-bnd.html) and 
the underlying [BND tool](http://bnd.bndtools.org/) - have concise and valuable documentation.

There are a few simple rules about the definition and use of bundles that will make developing with 
them much less stressful:

* *Embedding is an implementation detail.* Using the Embed-Dependency instruction provided by the 
maven-bundle-plugin will insert the specified jar(s) into the target archive and add them to the 
Bundle-ClassPath. These jars and their contained packages/classes are not for public consumption; 
they are for the internal implementation of this service implementation only.
* *Bundles should never be embedded.* Bundles expose service implementations; they do not provide 
arbitrary classes to be used by other bundles.
* *Bundles should expose service implementations.* This is the corollary to the previous rule. 
Bundles should not be created when arbitrary concrete classes are being extracted to a library. In 
that case, a library/jar is the appropriate module packaging type.
* *Bundles should generally only export service packages.* If there are packages internal to a 
bundle that comprise its implementation but not its public manifestation of the API, they should be 
excluded from export and kept as private packages.
* *Concrete objects that are not loaded by the root classloader should not be passed in or out of a 
bundle.* This is a general rule with some exceptions (JAXB generated classes being the most 
prominent example). Where complex objects need to be passed in or out of a service method, an 
interface should be defined in the API bundle.

## How to use this demo ##
1. Download the `apache-karaf-2.4.3` distribution appropriate to your OS from 
[Apache](https://karaf.apache.org/index/community/download.html)
2. Unpack and deploy the karaf distro to your environment.
3. Clone and build this demo.
4. Copy the resulting KAR file - `bundle-app/target/bundle-app-1.0-SNAPSHOT.kar` - to your karaf 
distro's `$KARAF_HOME/deploy` directory.
