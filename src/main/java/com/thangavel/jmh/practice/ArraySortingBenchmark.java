package com.thangavel.jmh.practice;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
@Fork(value = 3, warmups = 2)
//@Warmup(iterations = 5, time = 55, timeUnit = TimeUnit.MILLISECONDS)
//@Measurement(iterations = 4, time = 44, timeUnit = TimeUnit.MILLISECONDS)
public class ArraySortingBenchmark {

    private static final int SIZE = 222;

    public static void main(String[] args) throws RunnerException {
        Options builder = new OptionsBuilder()
                            .include(ArraySortingBenchmark.class.getSimpleName())
                            .forks(1)
                            .build();
        new Runner(builder).run();
    }
    @Benchmark
    public void sortByAPI(){
        int [] numbers = new int[SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = random.nextInt();
        }
        Arrays.sort(numbers);
    }

    @Benchmark
    public void sortWithoutAPI(){
        int [] numbers = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = i;
        }
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-1;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp=numbers[j+1];
                    numbers[j+1]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
    }
}
