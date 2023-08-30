package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Impl task", 5),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("Impl task", 0),
                new Job("Reboot server", 1)
        );
        System.out.println(jobs);
        Comparator<Job> comp = new SortByNameJob();
        Collections.sort(jobs, comp);
//        Comparator<Job> comb = new JobDescByNameLn()
//                .thenComparing(new JobDescByName())
//                .thenComparing(new JobDescByPriority());
//        Collections.sort(jobs, comb);
        System.out.println(jobs);
    }
}
