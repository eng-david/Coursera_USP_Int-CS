# Implemente a função fibonacci(n), que recebe como parâmetro um número inteiro e devolve um número 
# inteiro correspondente ao n-ésimo elemento da sequência de Fibonacci. Sua solução deve ser implementada 
# utilizando recursão.

def fibonacci(x):
    if x <= 1:
        return x

    return fibonacci(x - 1) + fibonacci(x - 2)

# print(fibonacci(0))
