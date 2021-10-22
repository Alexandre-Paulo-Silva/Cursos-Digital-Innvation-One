programa {
	funcao inicio() {
	    
	    inteiro numeros [] = {39, 45, 54 , 55}
	    cadeia nomes[] = {"Andre","Thiago","Bruno","Carlos","Cassio"}
	    real altura[] = { 1.71, 1.78, 1.75 , 1.87, 1.71}
	    
	    escreva("-----------------------------\n")
	    escreva("          Tabela             \n")
	    escreva("-----------------------------\n")
	    
	    para (inteiro posicao = 0 ; posicao < 5; posicao++){
	        
	        escreva(nomes[posicao], "\t\t", altura [posicao], "\n")
	    }
	    
	    escreva(numeros[1])
		
	}
}
