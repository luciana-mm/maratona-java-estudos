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



# Jogo da Forca — Bloco 01

**Projeto:** `01-fundamentos`

## Descrição
Jogo da forca em Java jogado via console, onde o usuário tenta descobrir uma palavra secreta letra por letra, com o progresso sendo exibido a cada tentativa até a palavra ser completamente revelada.

## Tópicos aplicados
- Tipos primitivos (`char`, `int`)
- Arrays (`char[]`)
- Estruturas condicionais (`if/else`)
- Estruturas de repetição (`for`, `while`)
- Métodos com retorno (`boolean`)
- Leitura de dados via `Scanner`
- Separação em pacotes (domínio e execução)

## Como funciona
1. O programa exibe um menu com as opções **1 - Iniciar jogo da forca** e **2 - Sair**
2. Se a opção escolhida for `1`, o jogo começa com uma palavra secreta pré-definida
3. O usuário digita uma letra por vez
4. Se a letra existir na palavra, ela é revelada na posição correta; caso contrário, permanece oculta (`_`)
5. O progresso é exibido a cada tentativa
6. O jogo continua até que todas as letras da palavra tenham sido descobertas

## Estrutura do projeto
- **dominio**: classe `Forca`, responsável pela lógica do jogo (registrar acertos, montar a exibição do progresso e verificar se a palavra foi completada)
- **execucao**: classe `ForcaTeste`, responsável pela interação com o usuário (menu e leitura via `Scanner`)

## Status
⬜ concluído