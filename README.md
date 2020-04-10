# Exercício Programa: Pong!

## Enunciado

"Você foi recentemente contratado pela *EACH Game Dev.* Co. para atuar no desenvolvimento de **Pong!** seu mais novo e aguardado lançamento. Entretanto, poucos dias antes do início do seu trabalho, o único desenvolvedor da equipe deixou o emprego
para trabalhar na maior concorrente da empresa. Cabe a você agora a tarefa de finalizar o
desenvolvimento do projeto **Pong!**"

O projeto **Pong!** é escrito Java, e é composto pelas seguintes classes:

- **Pong:** classe principal do jogo (contém o método `main` que gerencia o todo andamento da partida e a interação entre os demais elementos).
- **GameLib/MyFrame/MyKeyAdapter:** três classes que implementam funcionalidades gráficas (criação de janela em modo gráfico, métodos para desenhos de formas geométricas) e para processar entrada via teclado.
- **Wall:** implementa as paredes do jogo.
- **Ball:** implementa as bolas do jogo.
- **Player:** implementa os jogadores (controláveis) pelo usuários.
- **Score:** implementa o placar do jogo.

Felizmente, algumas destas classes já estavam 100% prontas quando o antigo desenvolvedor deixou a empresa: **Pong**, **GameLib**, **MyFrame**, **MyKeyAdapter** e **Wall**. Entretanto, o antigo desenvolvedor apagou, por acidente, os códigos fontes destas classes, e só restaram os arquivos **.class**. Desta forma, não há a possibilidade modificar o comportamento destas classes, de modo que as classes restantes, que deverão ser implementadas por você,  recisam obrigatoriamente “conversar em sintonia” com as classes que já estão prontas.

Para ajudar, um esqueleto de cada uma das classes que precisam ser implementadas (Ball, Player e Score) já foi disponibilizado para você. Desta  orma, sua tarefa consiste em completar cada um dos arquivos fontes de modo que cada classe implemente o comportamento esperado delas, fazendo com que o jogo passe a funcionar de forma plena. É extremamente importante que os construtores e as declarações de métodos fornecidos nos esqueletos das classes não sejam alterados, tanto em relação ao nome, quanto em relação aos parâmetros recebidos. Juntamente com os esqueletos das classes, também foi disponibilizado para você a documentação das mesmas em formato javadoc explicando o papel de cada método e parâmetro.

## Autor

Esse é um exercício programa proposto pelo professor [Daniel Cordeiro](http://www.each.usp.br/dc/) e implementado por [Guilherme Balog Gardino](https://github.com/GuilhermeBalog)
