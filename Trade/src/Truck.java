public class Truck {

    private int id;
    private String placa;
    private int peso_maximo;
    // Isso poderia ser uma classe:
    private String motorista;

        // Getter e Setter id
        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id = id;
        }

        // Getter e Setter placa
        public String getPlaca(){
            return placa;
        }
        public void setPlaca(String placa){
            this.placa = placa;
        }

        // Getter e Setter peso máximo
        public int getPeso_maximo(){
            return peso_maximo;
        }
        public void setPeso_maximo(int peso_maximo){
            this.peso_maximo = peso_maximo;
        }

        // Getter e Setter motorista
        public String getMotorista(){
            return motorista;
        }
        public void setMotorista(String motorista){
            this.motorista = motorista;
        }

        // Função para retornar os valores da classe:
        public String info(){
        return "\nId: " + this.getId() + 
            "\nPlaca: " + this.getPlaca() +
            "\nPeso máximo: " + this.getPeso_maximo() +
            "\nMotorista: " + this.getMotorista() + "\n";
        }
}
