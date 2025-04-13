public class Carro {

    private String marca;
    private String modelo;
    private String placa;
    private Motor motor;
    private Condutor condutor;
    
    public Carro(String marca, String modelo, String placa, Motor motor, Condutor condutor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
        this.condutor = condutor;
    }

    public String trocarCondutor(Condutor condutor) {
        this.setCondutor(condutor);
        return "Condutor trocado com sucesso";
    }

    public String trocarMotor(Motor motor) {
        this.setMotor(motor);
        return "Motor trocado com sucesso";
    }

    public Carro(String marca, String modelo, String placa, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
    }

    public Carro() {
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Condutor getCondutor() {
        return this.condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    @Override
    public String toString() {

        if(this.condutor != null){
            return "\nCarro >>>>"
                + "  Marca: " + marca + ","
                + "  Modelo: " + modelo + ","
                + "  Placa: " + placa + ","
                + "  Motor: " + this.motor.getTipo() + ","
                + "  Condutor: " + this.condutor.getNome()+ ""
                + "";
        }else{
            return "\nCarro >>>>"
                + "  Marca: " + marca + ","
                + "  Modelo: " + modelo + ","
                + "  Placa: " + placa + ","
                + "  Motor: " + this.motor.getTipo() + ","
                + "";
        }
        
    }

}
