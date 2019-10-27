# JMH-Practice

A sample JMH benchmark program for Array sort with API and without API

run the code with the below comments,

```java -jar target\benchmarks.jar ArraySortingBenchmark```

The benchmark has been tested and got result as below,

```
Intel(R) Core(TM) i5-8250U CPU @1.60GHz 1.80GHz
16.0 GB RAM
```

```
Benchmark                             Mode  Cnt  Score    Error  Units
ArraySortingBenchmark.sortByAPI       avgt   15  0.009 ?  0.001  ms/op
ArraySortingBenchmark.sortWithoutAPI  avgt   15  0.015 ?  0.001  ms/op
```
We can view the measures in GUI, for that you need to execute the command to produce JSON result with the following commands,

```
java -jar target\benchmarks.jar -rf json ArraySortingBenchmark
```

the jmh-result.json will be produced in the same directory, and upload into https://jmh.morethan.io/ online tool to visualize it,

i got the following out result,

![JMH](https://user-images.githubusercontent.com/13926114/67635278-53d19280-f8c5-11e9-94bf-130e6c6c294c.jpg)





