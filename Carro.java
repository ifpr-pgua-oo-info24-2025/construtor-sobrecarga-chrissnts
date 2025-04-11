public class Carro{
    private String marca;
    private String modelo;
    private String placa;
    private Motor motor;
    private Condutor condutor;


    public String trocarCondutor(Condutor condutor){
        this.setCondutor(condutor);
        return "Condutor trocado com sucesso";
    }

    public Carro(String marca, String modelo, String placa, Motor motor, Condutor condutor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
        this.condutor = condutor;
    }


    public Carro(String marca, String modelo, String placa, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
    }

    public Carro() {
    }
    public String getmarca() {
        return this.marca;
    }
    public void setmarca(String marca) {
        this.marca = marca;
    }
    public String getmodelo() {
        return this.modelo;
    }
    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }
    public String getplaca() {
        return this.placa;
    }
    public void setplaca(String placa) {
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

    

    

}