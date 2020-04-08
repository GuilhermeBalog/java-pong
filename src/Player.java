import java.awt.*;

/**
	Esta classe representa os jogadores (players) do jogo. A classe princial do jogo (Pong)
	instancia dois objetos deste tipo quando a execução é iniciada.
*/

public class Player {

	/**
		Construtor da classe Player.

		@param cx coordenada x da posição inicial do player (centro do retangulo que o representa).
		@param cy coordenada y da posição inicial do player (centro do retangulo que o representa).
		@param width largura do retangulo que representa o player.
		@param height altura do retangulo que representa o player.
		@param color cor do player.
		@param id uma string que identifica o player
		@param v_limit um array de double contendo dois valores (em pixels) que determinam os limites verticais da área útil da quadra.   
		@param speed velocidade do movimento vertical do player (em pixels por millisegundo).
	*/

	public Player(double cx, double cy, double width, double height, Color color, String id, double [] v_limit, double speed){
	
	}

	/**
		Método chamado sempre que o player precisa ser (re)desenhado.
	*/

	public void draw(){

		GameLib.setColor(Color.GREEN);
		GameLib.fillRect(80, 300, 20, 100);
	}

	/**
		Método chamado quando se deseja mover o player para cima. 
		Este método é chamado sempre que a tecla associada à ação 
		de mover o player para cima estiver pressionada.

		@param delta quantidade de millisegundos que se passou entre o ciclo anterior de atualização do jogo e o atual.
	*/

	public void moveUp(long delta){

	}

	/**
		Método chamado quando se deseja mover o player para baixo. 
		Este método é chamado sempre que a tecla associada à ação 
		de mover o player para baixo estiver pressionada.

		@param delta quantidade de millisegundos que se passou entre o ciclo anterior de atualização do jogo e o atual.
	*/

	public void moveDown(long delta){

	}

	/**
		Método que devolve a string de identificação do player.
		@return a String de indentificação.
	*/

	public String getId() { 

		return ""; 
	}

	/**
		Método que devolve a largura do retangulo que representa o player.
		@return um double com o valor da largura.
	*/

	public double getWidth() { 

		return 20; 
	}

	/**
		Método que devolve a algura do retangulo que representa o player.
		@return um double com o valor da altura.
	*/

	public double getHeight() { 

		return 100;
	}

	/**
		Método que devolve a coordenada x do centro do retangulo que representa o player.
		@return o valor double da coordenada x.
	*/

	public double getCx() { 
		
		return 80;
	}

	/**
		Método que devolve a coordenada y do centro do retangulo que representa o player.
		@return o valor double da coordenada y.
	*/

	public double getCy() { 
	
		return 300;
	}
}

