public class Trucks {
    private  double pesoMax;
    private  String placa;
    private String mototrista;


    public Trucks(String placa, String mototrista) {
        this.placa = placa;
        this.mototrista = mototrista;
        this.pesoMax = 2500;

    }


    public double getPesoMax() {
        return pesoMax;
    }


    public String getPlaca() {
        return placa;
    }


    public String getMototrista() {
        return mototrista;
    }
    public String toString(){
        return "\n Motorista: "+this.getMototrista()+
                "\nPlaca: " + this.getPlaca()+
                "\nPeso Maximo Ataual: " + this.pesoMax;
    
}
