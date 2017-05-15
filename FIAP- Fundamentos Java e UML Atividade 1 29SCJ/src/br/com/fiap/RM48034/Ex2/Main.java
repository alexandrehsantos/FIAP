package br.com.fiap.RM48034.Ex2;

/**
 * Como fica muito fácil de saber o resultado apenas executando esta é a
 * explicação do resultado das variáveis.
 * 
 * Na linha 4 a=1,b=2,c=1. 
 * Na linha 5 linha c recebe um pós incremento (c++), porém seu valor ainda é 1 e só valerá 2 quando for acessado novamente
 * Na linha 6 c já tem o valor de 2. 
 * Na linha 7 continue volta a execução para o inicio do loop linha 4.
 * Na linha 4 a=2 (recebeu pós incremento e foi testado em a<=b, ou seja o valor só será dois após o incremento e isso ocorre quando a variável a é testada)
 * Na linha 5 c=2, mas recebe um pós incremento. 
 * Na linha 6 c=3, pois agora após o incremento a variável foi acessada novamente e já possui o valor. 
 * Na linha 9 c=3 e recebe um pós decremento e somente após o decremento ela valerá 2. 
 * Na linha 10 volta a próxima volta do loop. 
 * Na linha 4 a=2, mas recebe um pós incremento e ao ser testada em a<=b já possui o valor 3 e o loop é encerrado. 
 * Na linha 11 saída do loop, agora a tem o valor de 3 a=3, b ainda continua com o valor 2 e não sofreu nenhuma alteração, c que tinha o valor 3, após o decremento agora possuí o valor 2 c=2.
 * 
 *
 * @author alexandre
 *
 */

public class Main {
	public static void main(String[] args) {
		/* 1 */ int a = 0, b = 0, c = 0;
		/* 2 */c = 1;
		/* 3 */b = 2;
		/* 4 */for (a = 1; a <= b; a++) {
			/* 5 */ c++;
			/* 6 */if (c == 2) {
				/* 7 */ continue;
				/* 8 */ }
			/* 9 */ c--;
			/* 10 */ }
		/* 1 1 */System.out.println("a=" + a + ",b=" + b + ",c=" + c);
	}
}
