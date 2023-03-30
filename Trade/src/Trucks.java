public class Trucks {
    private  double pesoMax;
    private  String placa;
    private String motorista;


    public Trucks(String placa, String motorista) {
        this.placa = placa;
        this.motorista = motorista;
        this.pesoMax = 2500;

    }


    public double getPesoMax() {
        return pesoMax;
    }
    
    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }


    public String getPlaca() {
        return placa;
    }


    public String getMototrista() {
        return motorista;
    }
    public String toString(){
        return "\n Motorista: "+this.getMototrista()+
                "\nPlaca: " + this.getPlaca()+
                "\nPeso Maximo Ataual: " + this.getPesoMax();
    
}
}