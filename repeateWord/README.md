# Challenge Summary

<!-- Description of the challenge -->

Find the first repeated word in a book.

## Whiteboard Process
<!-- Embedded whiteboard image -->
![repating](repeateWord/repeating.jpg)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
 Complexity
time  O(n) 
space  O(n) 

## Solution

<!-- Show how to run your code, and examples of it in action -->

```String text = "Once upon a time, there was a brave princess who...";
      String words = Reapeating.repeitingWords(text);
      if (!words.equals("Try Again ,No Repeating Words"))
        System.out.println("repeated word .... " + words);
      else
        System.out.println("Try Again ,No Repeating Words");
```
results: repeated word .... a
