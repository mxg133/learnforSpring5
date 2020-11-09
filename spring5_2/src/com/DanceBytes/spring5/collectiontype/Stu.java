package com.DanceBytes.spring5.collectiontype;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author 孟享广
 * @date 2020-11-09 4:41 下午
 * @description
 */
public class Stu {
    private String courses[];
    private List<String> list;
    private Map<String, String> maps;
    private Set<String> sets;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }
    public void show() {
        System.out.println();
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
    }
}
