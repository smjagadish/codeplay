* stub project to understand and articulate differences in DI types
* takeaway is as follows
   - constructor injection is the safest and recommended option 
       * dependency resolution and construction happens as part of referring object construction
       * one of the options to have immutable dependencies
       * can detect cyclic dependencis
       * fits nicely within unit test framework
   -  field injection is the least recommended option for DI
       * dependency construction is typically AFTER the construction of referring object
       * uses reflection to set the dependency
       * not possible to model immutable dependency
       * cannot detect cyclic dependencies
       * unit testing challenges
   -  Setter injection is better off than field injection but still behind constructor injection
       * dependency  construction is typically AFTER the constriction of referring object 
       * uses setters to set the dependency 
       * to check further on cyclic dependencies part 
       * fits nicely within unit test framework

* Autowired rules 

  - only one constructor with autowired required = true permitted at all times 
  - either all constructors must have autowired required = false or have only one constructor in entire class with autowired set as either true or false 
  - if the class itself has only 1 constructor, autowired is optional

