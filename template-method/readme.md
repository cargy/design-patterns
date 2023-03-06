### Why use the Template Method Pattern

To define an implementation broken down in simple steps, and force subclasses to override specific 
steps in order to achieve the result.

#### Pros
1. Only certain parts of the implementation will be overriden by the subclass leaving the main business intact.
2. Duplicate code is eliminated

#### Cons
1. Limitations may apply due to the "lock" of the parent implementation
2. The more the steps the more complex it becomes to maintain