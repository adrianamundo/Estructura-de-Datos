#se sortea y luego se busca
def binary_sort(sorted_list, length, key):
    inicio = 0
    final = length-1
    while inicio <= final:
        mitad = int((inicio + final)/2)
        if key == sorted_list[mitad]:
            print("\nEl número ingresado es: %d y se encuentra en la posición: %d" % (key, mitad))
            return -1

        elif key < sorted_list[mitad]:
            final = mitad - 1

        elif key > sorted_list[mitad]:
            inicio = mitad + 1
            
    print("\nNo se encontró\n")
    return -1
 
lst = []
 
size = int(input("Ingrese el número de la lista"))
 
for n in range(size):
    numbers = int(input("Ingrese número:"))
    lst.append(numbers)
 
lst.sort()
print('\n\nLista:', lst)
 
x = int(input("\nIngrese el número que desea buscar: "))
 
binary_sort(lst, size, x)




























#base: https://medium.com/programminginpython-com/python-program-to-implement-binary-search-algorithm-bf914dcb9700