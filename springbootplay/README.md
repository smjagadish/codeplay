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
       * one of the options to have immutable dependencies
       * to check further on cyclic dependencies part 
       * fits nicely within unit test framework
