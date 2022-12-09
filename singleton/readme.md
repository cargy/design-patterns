### Why use the Singleton Pattern

    1. Ensure that a class has just a single instance
    2. Provide a global access point to that instance

#### Pros

    1. You can be sure that a class has only a single instance.
    2. You gain a global access point to that instance.
    3. The singleton object is initialized only when it’s requested for the first time.

#### Cons


    1. The Singleton pattern can mask bad design, for instance, when the components of the program know too much about each other.
    2. The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create a singleton object several times.
    3. It may be difficult to unit test the client code of the Singleton because many test frameworks rely on inheritance when producing mock objects.