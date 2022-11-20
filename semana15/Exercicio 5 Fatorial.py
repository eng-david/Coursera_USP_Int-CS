# Implemente a função fatorial(x), que recebe como parâmetro um número inteiro e devolve um número inteiro 
# correspondente ao fatorial de x.
# Sua solução deve ser implementada utilizando recursão.

def fatorial(x):
    if x < 2:
        return 1

    return x * fatorial (x - 1)


# print(fatorial(7))