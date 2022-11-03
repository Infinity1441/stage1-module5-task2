package com.epam.mjc;

import java.util.List;
import java.util.stream.Collectors;

public class InterfaceCreator{

    public Operation<Integer> divideBy(Integer divider) {
        return arg -> arg.stream().map(item -> item/divider).collect(Collectors.toList());
    }
}
