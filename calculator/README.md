##Calculator Implementations##
* rootclass - Returns long
* rootclass-withembed - Returns long, but embeds Guava for its internals
* local-concrete - Returns and exports a locally defined concrete class
* library-class - Embeds a library with the class to return
* contract - Implements an interface declared in the api module for the return value
* exported-concrete - Similar to the local-concrete implementation, but in this case the exported 
  package is not the same as the service package to facilitate importing by other bundles. This 
  demonstrates an uncommon use case that should be taken only with careful thought and analysis.