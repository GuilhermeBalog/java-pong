# Executa a 'função' run
# Chamado com o comando make
default: run

# Executa a 'função' compile e roda o jogo com taxa de atualização 1 e em "safe mode" (1 true)
# Pode ser chamado com o comando make run
run: compile
	java Pong 1 true

# Compila os arquivos .java do EP
# Pode ser chamado com o comando make complile
compile:
	javac Ball.java Player.java Score.java
