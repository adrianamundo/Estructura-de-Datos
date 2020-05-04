from random import sample
from sorting import selection_sort, bubble_sort, insertion_sort

'''
unsorted_list = sample(range(1, 1000), 999)
sorted_list = list(range(1, 1000))

def test_selection_sort(benchmark):
    result = benchmark(selection_sort, unsorted_list)
    assert result == sorted_list

def test_bubble_sort(benchmark):
    result = benchmark(bubble_sort, unsorted_list)
    assert result == sorted_list

def test_insertion_thousand(benchmark):
    result=benchmark(insertion_sort,unsorted_list)
    assert result == sorted_list
'''

unsorted_list = sample(range(1, 4000), 3999)
sorted_list = list(range(1, 4000))

def test_selection_sort(benchmark):
    result = benchmark(selection_sort, unsorted_list)
    assert result == sorted_list

def test_bubble_sort(benchmark):
    result = benchmark(bubble_sort, unsorted_list)
    assert result == sorted_list

def test_insertion_thousand(benchmark):
    result=benchmark(insertion_sort,unsorted_list)
    assert result == sorted_list

'''
#tercer
nsorted_list = sample(range(1, 100), 99)
sorted_list = list(range(1, 100))

def test_selection_sort(benchmark):
    result = benchmark(selection_sort, unsorted_list)
    assert result == sorted_list

def test_bubble_sort(benchmark):
    result = benchmark(bubble_sort, unsorted_list)
    assert result == sorted_list

def test_insertion_thousand(benchmark):
    result=benchmark(insertion_sort,unsorted_list)
    assert result == sorted_list


'''

