
public class Pessoa {

    private String nome;

    public Pessoa(String nome) { //*Construtor que estabelece quem é a pessoa */
        this.nome = nome;
    }

    public void acordar() { //* Método que define que a pessoa acordou */
        System.out.println(nome + " acordou!");
    }

    public void andar() { //* Método que define que a pessoa está andando */
        System.out.println(nome + " está andando.");
    }

    public void comer() { //* Método que define que a pessoa está comendo */
        System.out.println(nome + " está comendo.");
    }
    
    public void dormir() { //* Método que define que a pessoa está dormindo */
        System.out.println(nome + " está dormindo.");
    }
}