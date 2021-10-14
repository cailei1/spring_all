package com.cl.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {


    private String[] bookNames;

    private Set<String> bookSet;

    private List<String> bookList;

    private Map<String,String> bookMap;

    private List<Book> bookList2;
}
