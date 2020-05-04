from typing import Tuple


def linear_search(sorted_list: list, value: int) -> Tuple[bool, int]:

    for i in range(0, len(sorted_list)):
        if sorted_list[i] == value:
            return True, i

    return False, -1

def binary_search(sorted_list: list, valor:int) -> Tuple[bool,int]:
    inicio=0
    final=(len(sorted_list))-1
    while (inicio<=final):
        mitad=int(inicio+((final-inicio)/2))
        if (sorted_list[int(mitad)]==valor):
            return True, mitad
        elif (valor<sorted_list[int(mitad)]):
            final=mitad-1
        else:
            inicio=mitad+1
    return False, -1
#basado en binarysearch.py


def jump_search(sorted_list: list, value: int, step_size: int) -> Tuple[bool, int]:

    for i in range(0, len(sorted_list), step_size):
        if sorted_list[i] > value:
            for j in range(i - step_size, i):
                if sorted_list[j] == value:
                    return True, j
            return False, -1

    for k in range(len(sorted_list) - step_size, len(sorted_list)):
        if sorted_list[k] == value:
            return True, k

    return False, -1
