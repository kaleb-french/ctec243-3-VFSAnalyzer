# Journal
Write your Journal questions and notes here.

Phase 1-
In the example here the recursive call base case is hit when the item is a fold and not a file. This sends a count back to the caller, but if it was called on just a file and not a fold it ends there.
If called on a folder it uses getItems() to get the list from the folder and calls iself to count each file in the folder and returns it. Each step is a small count ontop the bigger job, and after the last one is counted the whole counts is returned terminating recursion.

Phase 2-
