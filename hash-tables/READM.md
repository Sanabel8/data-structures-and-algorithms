# Hashtables
<!-- Short summary or background information -->

Hashing is a technique that is used to uniquely identify a specific object from a group of similar objects. Some examples of how hashing is used in our lives include:

1. In universities
2. In libraries

Hashing is implemented in two steps:
1. An element is converted into an integer by using a hash function. This element can be used as an index to store the original element, which falls into the hash table.
2. The element is stored in the hash table where it can be quickly retrieved using hashed key.

hash = hashfunc(key)
index = hash % array_size

## Challenge
<!-- Description of the challenge -->

![]()

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

Gig o/complexity
space: o(n)
time :O(n)

## API
<!-- Description of each method publicly available in each of your hashtable -->


# Features
# add
Arguments: key, value
Returns: nothing
This method should hash the key, and add the key and value pair to the table, handling collisions as needed.

# get
Arguments: key
Returns: Value associated with that key in the table

# contains
Arguments: key
Returns: Boolean, indicating if the key exists in the table already.

# hash
Arguments: key
Returns: Index in the collection for that key