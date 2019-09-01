package jd2.ref.lamda;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LamdaDemo {

    void test(){
        List<Integer> result = Stream.of(1, 2, 3, 4)
                .map(new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer it) {
                        return it + 3;
                    }
                })
                .map(new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer it) {
                        return it * 3;
                    }
                })
                .collect(toList());
    }
}
