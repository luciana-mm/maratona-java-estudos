# Calculadora de Console — Bloco 01

**Projeto:** `01-fundamentos`

## Descrição
Calculadora de console em Java que realiza operações básicas (soma, subtração, multiplicação e divisão), com menu interativo que permite ao usuário repetir os cálculos até optar por sair.

## Tópicos aplicados
- Tipos primitivos (`int`, `double`, `char`)
- Operadores aritméticos
- Estruturas condicionais (`switch`)
- Estruturas de repetição (`while`)
- Leitura de dados via `Scanner`
- Separação em pacotes (domínio e execução)

## Como funciona
1. O programa exibe um menu com as opções **1 - Calcular** e **2 - Sair**
2. Se a opção escolhida for `1`, o usuário informa dois números e a operação desejada (`+`, `-`, `*`, `/`)
3. O resultado é calculado e exibido na tela
4. O menu é exibido novamente, repetindo o processo até que o usuário escolha `2`

## Estrutura do projeto
- **dominio**: classe `Calculadora`, responsável pela lógica pura do cálculo
- **execucao**: classe `CalculadoraTeste`, responsável pela interação com o usuário (menu e leitura via `Scanner`)

## Status
⬜ concluído