public class Truck {

    private int id;
    private String placa;
    private int peso_maximo;
    private String motorista;

        // CRIAR UM CONSTRUTOR
        public Truck() {
            this.id = 1;
            this.placa = "abc-1234";
            this.peso_maximo = 2500;
            motorista = "Claudiney";
        }

        // Getter id
        public int getId(){
            return id;
        }

        // Getter placa
        public String getPlaca(){
            return placa;
        }

        // Getter peso máximo
        public int getPeso_maximo(){
            return peso_maximo;
        }

        // Getter motorista
        public String getMotorista(){
            return motorista;
        }

        // Função para retornar os valores da classe:
        public String info(){
        return "\nId: " + this.getId() + 
            "\nPlaca: " + this.getPlaca() +
            "\nPeso máximo: " + this.getPeso_maximo() +
            "\nMotorista: " + this.getMotorista() + "\n";
        }
}
