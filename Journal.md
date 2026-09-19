# Journal
Write your Journal questions and notes here.

Phase 1-
In the example here the recursive call base case is hit when the item is a fold and not a file. This sends a count back to the caller, but if it was called on just a file and not a fold it ends there.
If called on a folder it uses getItems() to get the list from the folder and calls iself to count each file in the folder and returns it. Each step is a small count ontop the bigger job, and after the last one is counted the whole counts is returned terminating recursion.

Phase 2-
A null value is expected for a non-value of anything really so it is something pretty expected when a method returns a result of nothing. Basically I am using a condtional if the largest value is null try to
assign the value of the temp child assigned from the list and or to include a simple comparison that would only trigger if the new is bigger than the existing then also try to assign from list.

Phase 3-
While not really a fan of recursion I feel that the code is a little more concise, and easier to maintain that the interative version. As far as overhead it's not really going to be a problem unless the file system is really deep with nested files. 
I do begrudgingly admint I like is see a usfulness with the recursive solution for file system transversing. 

