import java.awt.*;

/**
	Esta classe representa um placar no jogo. A classe princial do jogo (Pong)
	instancia dois objeto deste tipo, cada um responsável por gerenciar a pontuação
	de um player, quando a execução é iniciada.
*/

public class Score {

	/**
		Construtor da classe Score.

		@param playerId uma string que identifica o player ao qual este placar está associado.
	*/

	public Score(String playerId){

	}

	/**
		Método de desenho do placar.
	*/

	public void draw(){

		GameLib.drawText("placar?", 70, GameLib.ALIGN_LEFT);			
	}

	/**
		Método que incrementa em 1 unidade a contagem de pontos.
	*/

	public void inc(){

	}

	/**
		Método que devolve a contagem de pontos mantida pelo placar.

		@return o valor inteiro referente ao total de pontos.
	*/

	public int getScore(){

		return 0;
	}
}
