super() must be the very first statement in the subclass constructor. 
You can only call super() once per constructor execution.


Only one allowed: A single constructor can only have this() or super() as its very first line.
this() calls super() indirectly: If your constructor calls this(), it jumps to another constructor in the same class.That second constructor will then be the one to call super().
The parent always runs first: No matter which path the code takes, the parent class constructor must execute before the child class constructor finishes.



First Line Only: Both this() and super() must be the very first statement in a constructor.
No Duplicates: You cannot use both this() and super() in the same constructor.
No Recursion: You cannot create loops where constructors call each other.
Static Restriction: Neither can be used inside static methods or static blocks.