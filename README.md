# stopwatch tasks by Pawan Intawongsa (590545752)
I ran the tasks on a MSI laptop , and got these result:

Task | Time
--------------------------------------|-------:
Append 50,000 chars to String | 0.715762 sec
Append 100,000 chars to String | 2.068439 sec
Append 100,000 chars to StringBuilder | 0.002088 sec
Add 1 billion double using array | 1.751018 sec
Add 1 billion Double object | 5.020187 sec
Add 1 billion BigDecimal object | 9.450131 sec

## Explanation of Results
1.Why does appending 100,000 chars to a String take more than 2X the time to append 50,000
chars?

Becasue everytime when String appened it will create a begin object and object of String to add and the last is object of the result
next it will make reult object to become a begin object and add next String object and the result object of this precess become its next begin object until the last String. That why the time doesn't 2X but it go exponential.

2.Why is appending to StringBuilder so much different than appending to String? What is
happening to the String?

Because in StringBuilder its has an attribute char[] which mean it will update this array as like what you input in.And char[] will increase automatically when the input is more than its length this is why StringBuilder is faster than String.

3.Explain difference in time to sum double, Double, and BigDecimal. Which is faster and
why?

double is the fastest Double is second and BogDecimal is the last.double is primitive number so it can add straight by doing nothing but just 1mathematics. Double is wrapper class so when add a number its have to unwrap first so It have to change an object of the number to primitive number and add another primitive number and chage result primitive number to an oject so it take time longer.BigDecimal have a lot of medthods and attribute than Double.BigDecimal also keep a lot decimal than Double so it consume a lot memory than Double.
