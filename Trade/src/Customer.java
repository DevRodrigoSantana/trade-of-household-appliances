public class Customer {
    private int customer_id;
    private String nome;
    private int tel;

        // Getter e setter customer_id
        public int getCustomer_id(){
            return customer_id;
        }
        public void setCustomer_id(int customer_id){
            this.customer_id = customer_id;
        }

        // Getter e setter nome
        public String getNome(){
            return nome;
        }
        public void setnome(String nome){
            this.nome = nome;
        }
        
        // Getter e setter tel
        public int getTel(){
            return tel;
        }
        public void setTel(int tel){
            this.tel = tel;
        }
        
        public String info(){
            return
                "\nId: " + this.getCustomer_id() +
                "\nNome: " + this.getNome() +
                "\nTel: " + this.getTel() + "\n";

        }
}
