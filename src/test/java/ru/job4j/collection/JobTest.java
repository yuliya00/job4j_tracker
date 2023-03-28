package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndAsc() {
        Comparator<Job> cmpNamePriority = new SortByNameJob().thenComparing(new SortByPriorityJob());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl).isLessThan(0);

        int rslIsGreater = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rslIsGreater).isGreaterThan(0);

        int rslIsZero = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 1)
        );
        assertThat(rslIsZero).isEqualTo(0);
    }

    @Test
    public void whenComparatorByPriorityAndAsc() {
        Comparator<Job> cmpNamePriority = new SortByPriorityJob().thenComparing(new SortByNameJob());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl).isGreaterThan(0);

        int rslIsZero = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 1)
        );
        assertThat(rslIsZero).isEqualTo(0);

        int rslIsLess = cmpNamePriority.compare(
                new Job("Task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rslIsLess).isLessThan(0);
    }

    @Test
    public void whenComparatorByNameAndDesc() {
        Comparator<Job> cmpNamePriority = new SortByNameJob().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl).isLessThan(0);

        int rslIsZero = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 1)
        );
        assertThat(rslIsZero).isEqualTo(0);

        int rslIsGreater = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rslIsGreater).isGreaterThan(0);
    }

    @Test
    public void whenComparatorByPriorityAndDesc() {
        Comparator<Job> cmpNamePriority = new SortByPriorityJob().thenComparing(new SortDescByNameJob());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

}