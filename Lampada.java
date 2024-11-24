public class Lampada{
        private String modelo;
        private int potencia;
        private String tipo;
        private int voltagem;
        private String cor;
        private double preco;
        private boolean emEstoque;

    public Lampada(String modelo, int potencia, String tipo, int voltagem, String cor, double preco, boolean emEstoque) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.cor = cor;
        this.preco = preco;
        this.emEstoque = emEstoque;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isEmEstoque() {
        return emEstoque;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEmEstoque(boolean emEstoque) {
        this.emEstoque = emEstoque;
    }
}