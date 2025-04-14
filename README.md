#1 IncDec Execution Time Logger

This project demonstrates how to **measure and log execution time (in milliseconds)** for method calls to `increment()` and `decrement()` defined in the `IncDec` interface — **without modifying existing implementations**.

---
##Features

- Uses **Java Dynamic Proxy** to intercept and log method calls.
- Clean, non-intrusive design — existing implementations stay untouched.

#2 Subarray Index Finder
This Java project provides a utility method that determines the **starting index of a sub-array** within a main array. If the sub-array is not found, it returns `-1`.

## Example
```
int[] main = {4, 9, 3, 7, 8};
int[] sub = {3, 7};

int result = SubarraySearch.findSubarrayIndex(main, sub);
// result = 2
```

##Student Eligibility Check with feedback

This Java project provides a utility method `checkStudy()` that determines if a student is eligible based on the following criteria:

- The student is **logged in**.
- The student has the teacher **"Lee"**.
- The student is **enrolled in Maths**.
- The student has **distinction**.

---

### Method Signature: 

```java
boolean checkStudy(Student student)