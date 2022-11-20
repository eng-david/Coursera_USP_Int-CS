# Implemente a função encontra_impares(lista), que recebe como parâmetro uma lista de números inteiros e 
# devolve uma outra lista apenas com os números ímpares da lista dada.
# Sua solução deve ser implementada utilizando recursão.
# Dica: você vai precisar do método extend() que as listas possuem.

def encontra_impares(lista):
    impares = []

    if len(lista) == 0:
        return impares
    
    if lista[0] % 2 == 1: 
        impares.extend(lista[0:1])

    impares.extend(encontra_impares(lista[1:]))
    return impares


# lista = [2, 3, 4, 5, 6, 7, 8]
# print(encontra_impares(lista))