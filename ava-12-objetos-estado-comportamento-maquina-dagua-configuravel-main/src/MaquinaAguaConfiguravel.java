class MaquinaAguaConfiguravel {

    //constantes
    final int capacidadeAgua;
    final int capacidadeCopos200;
    final int capacidadeCopos300;

    //variaveis
    private int copos200;
    private int copos300;
    private int agua;

    MaquinaAguaConfiguravel(int capacidadeAgua, int capacidadeCopos200, int capacidadeCopos300) {
        if(capacidadeAgua <= 0){
            throw new IllegalArgumentException("Capacidade de Água deve ser positiva");
        }
        if(capacidadeCopos200 <= 0){
            throw new IllegalArgumentException("Capacidade de Copos200 deve ser positiva");
        }
        if(capacidadeCopos300 <= 0){
            throw new IllegalArgumentException("Capacidade de Copos300 deve ser positiva");
        }
        this.capacidadeAgua = capacidadeAgua;
        this.capacidadeCopos200 = capacidadeCopos200;
        this.capacidadeCopos300 = capacidadeCopos300;
        this.agua = 0;
        this.copos200 = 0;
        this.copos300 = 0;
    }
    
    int agua() {
        return agua;
    }

    int copos200() {
        return copos200;
    }


	int copos300() {
		return copos300;
	}

    void abastecerAgua() {
        if(agua < capacidadeAgua){
            agua = capacidadeAgua;
        }
    }

    void abastecerCopo200() {
        if(copos200 < capacidadeCopos200){
            copos200 = capacidadeCopos200;
        }
    }

    void abastecerCopo300() {
        if(copos300 < capacidadeCopos300){
            copos300 = capacidadeCopos300;
        }
    }

    void servirCopo200() {
        if(agua < 200){
            throw new IllegalStateException("Não há água suficiente");
        }
        if(copos200 <= 0){
            throw new IllegalStateException("Não há copos de 200ml");
        }
        copos200--;
        agua -=200;
    }

    void servirCopo300() {
        if(agua < 300){
            throw new IllegalStateException("Não há água suficiente");
        }
        if(copos300 <= 0){
            throw new IllegalStateException("Não há copos de 300ml");
        }
        copos300--;
        agua -=300;
    }





}
