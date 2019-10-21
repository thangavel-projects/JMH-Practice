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
