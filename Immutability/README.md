# Java 8 Examples
## Immutability
* Don't _torture_ your variables
* Side-effect free functions

### Imperative
* Mutated _(tortured)_ variable
* Combines:
    - Iteration
    - Operation
    - Summarizing
* What if I need to do something else after the operation?

### Declarative
* No mutation
* Once the stream has been started (iteration)
* I can have zero or more intermediate operations
* I can change the terminal operation.
