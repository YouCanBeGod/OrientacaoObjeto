public class Carro {

    String modelo;
    String cor;
    double capacidadeTanque;

    Carro(String modelo, String cor, double capacidadeTanque) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public double valorEncherTanque(double valorGasolina) {
        return capacidadeTanque * valorGasolina;
    }

    public double valorEncherTanque(double valorGasolina, double desconto) {
        return (capacidadeTanque * valorGasolina) * desconto / 100;
    }

}
