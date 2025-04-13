public class Motor {

    private String tipo;
    private int potencia;

    public Motor(int tipo, int potencia) {
        setTipo(tipo);
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {

        switch (tipo) {
            case 1:
                this.tipo = "Gasolina";
                break;
            case 2:
                this.tipo = "Eletrico";
                break;
            case 3:
                this.tipo = "Diesel";
                break;
            default:
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
