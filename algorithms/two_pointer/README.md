# Two Pointers

## Overview

When we require to find certain condition or criterion using an array or a linked list, the two pointers algorithm is suitable to use.

Need to use when...
- Problem asks for as set of elements.
- Problem asks for something to be found in, inserted into, or removed from a linked list

## Time Complexity

The two pointers algorithm can save the time complexity from $O(N^2)$ to $O(N)$. 
## Examples

-  Two Sum Problem with ==Sorted== Input Array

```
function(array, target){  
	set a left pointer to the first element of the array  
	set a right pointer to the last element of the array  
	loop through the array; check if left and right add to target  
	sum is less than the target, increase left pointer  
	sum is greater than the target, decrease right pointer  
	once their sum equals the target, return their indices  
}
```
- Removing the nth Element from the End of Linked List
- Finding the Middle of a Linked List

References : 
- [r1](https://medium.com/codex/the-two-pointer-technique-8c44b0b3890)

