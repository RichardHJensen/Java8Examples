# Java 8 Examples
## Lambdas & Method References
* What problems do lambdas address?
    - Removes boilerplate code by simplifying how implementation of a functional interface is defined
    - Pass functionality (behavior) as a parameter
* What problems do Method References address?
    - Lambdas are often simply calls to existing methods

## Use case: sorting a list of strings
* How do we sort things? _These are all **EVIL** because they change the original collection_
    - **`Collections.sort(collection)`** Class in collection must implement `Comparable<T>`
    - **`Collections.sort(collection, comparator)`** 
    - **`List.sort(Comparator<T> c)`** _(default method on List interface in Java 8)_

### AnonymousInner
* We've all done this (and felt a bit dirty afterward)

### AnonymousFunction
* No less evil, but looks nicer and is easier to understand

### MethodReference
* No less evil, but is it even clearer?

### SeeNoEvil
* Streams for the win!
