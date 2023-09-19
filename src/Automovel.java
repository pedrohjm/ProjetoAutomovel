

public class Automovel {
    private String modelo;
    private String cor;
    private String combustivel;
    private double preco;

    public Automovel(){
        modelo = "Maquin";
        cor = "Amarelo";
        combustivel = "Diesel";
        preco = 25000;
    }

    public Automovel(String modelo, String cor, String combustivel){
        this.modelo = modelo;
        this.cor = modelo;
        this.combustivel = combustivel;
        preco = valorAutomovel(combustivel);
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    

    @Override
    public String toString() {
        return "Automovel: modelo = " + modelo + ", cor = " + cor + ", combustivel = " + combustivel + ", preco = " + preco;
    }

    public static Double valorAutomovel(String combustivel){
        switch(combustivel){
            case "Gasolina":
            return (double) 20000;

            case "Alcool":
            return (double) 17000;

            case "Diesel":
            return (double) 25000;

            case "Gas":
            return (double) 30000;

            default:
            throw new IllegalArgumentException("Combustivel invalido!");
        }
        
    }
}
