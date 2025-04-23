# ds-implementation
This Project contains Data Structure implementation using Java

### LRU Cache ###
An **LRU (Least Recently Used) Cache** is a data structure and algorithm designed to store and retrieve the most recently accessed data efficiently, while automatically removing the least recently accessed entries when the cache reaches its maximum capacity.

To implement an LRU Cache using *LinkedHashMap* in Java, extend the *LinkedHashMap* class with the *accessOrder* flag set to true. This ensures that elements are ordered based on access rather than insertion. Additionally, override the *removeEldestEntry* method to enforce the size constraint of the cache.

For a working implementation, refer to the **LRUCacheDemo** project.
