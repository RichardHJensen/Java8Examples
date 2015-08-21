# Java 8 Examples
## Tell, Don't Ask
* Describe **WHAT** not **HOW**_
* **Prefer** _Transformation_ **Over** _Mutation_

### Imperative
* External Iteration
* Mutated variable
* What if I forget **`break`**?
* What if I didn't find any available `TimeSlot`?

### Declarative
* Internal Iteration
* No `timeSlot` variable
* Stops when it satisfies **`findFirst()`**
* Java **`Optional`** to handle no available object
