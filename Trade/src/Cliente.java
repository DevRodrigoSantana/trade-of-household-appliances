public class Cliente {
    private int CPF;
    private String nome;
    private String endereço;


    public Cliente(int cPF, String nome, String endereço) {
        CPF = cPF;
        this.nome = nome;
        this.endereço = endereço;
    }


    public int getCPF() {
        return CPF;
    }


    public void setCPF(int cPF) {
        CPF = cPF;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEndereço() {
        return endereço;
    }


    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String toString(){
        return "\nNome: " + getNome() +
                "\nCPF : " + getCPF()+
                "\nEndereço: " + getEndereço();
    }
    

    
    
}
