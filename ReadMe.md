# Thread Assignment
In this assignment, we're going to start 2
threads and each one should print numbers from 350 to 1 and then print **'FINISH !'**.

And of course we would like the display to be **synchronized**.
In other words, when one thread finishes counting the other one starts counting
(consider managing the race condition).

And finally, when both threads finish counting, 
print **'DONE !'**

### Tasks

- Implement the count method (line 5)
- Manage race condition so that the counting doesn't overlap
- Print **'Done !'** when both threads terminate

### Output
```
350
349
348
..
2
1
FINISH !
350
349
348
..
2
1
FINISH !
DONE !
```