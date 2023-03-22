public class Product {
    
    private static int counter=1;

    private int id;
    private String nome_produto;
    private double valor_produto;
    private double peso_produto;

        // Constructor
        public Product(String nome, double valor, double peso  ){
            // Auto increment ID:
            this.id=counter; 
            this.nome_produto = nome;
            this.valor_produto = valor;
            this.peso_produto = peso;
            Product.counter+=1;
        }
    
      
        public int getId() {
            return id;
        }
    
        
        public void setId(int id) {
            this.id = id;
        }
    
       
        public String getNome_produto() {
            return nome_produto;
        }
    
      
        public void setNome_produto(String nome_produto) {
            this.nome_produto = nome_produto;
        }
    
        
        public double getValor_produto() {
            return valor_produto;
        }
    
       
        public void setValor_produto(double valor_produto) {
            this.valor_produto = valor_produto;
        }
    
        
        public double getPeso() {
            return peso_produto;
        }
    
        public void setPeso(double peso) {
            this.peso_produto = peso;
        }
    
        // Função para retornar os valores da classe:
        public String info(){
            return "\nID: " + this.getId()+
                    "\nProduto: " + this.nome_produto+
                    "\nPreço: " + this.getValor_produto()+
                    "\nPeso do Produto: " + this.getPeso() + " Kg" + "\n";
        }
    }