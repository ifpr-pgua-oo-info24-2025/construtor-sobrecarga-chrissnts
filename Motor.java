public class Motor {
    private String tipo;
    private int potencia;

    

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        if (tipo == 1){
            this.tipo = "Gasolina";
        }else if (tipo == 2){
            this.tipo = "Eletrico";
        }else if (tipo == 3){
            this.tipo = "Diesel";
        }else{
            this.tipo = "Desconhecido ou invalido";
        }
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    
}
