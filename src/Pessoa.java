public class Pessoa {

    private String nome;
    private Pessoa mae;
    private Pessoa pai;

    public Pessoa(String nome) { //Construtor apneas com o nome
        this.nome = nome;
    }

    public Pessoa(String nome, Pessoa mae, Pessoa pai) {
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
    }

    public void mesmaPessoa(Pessoa p1, Pessoa p2){
        if (p1.nome.equals(p2.nome) & p1.mae.equals(p2.mae)){
            System.out.println("As pessoas são as mesmas!");
        }
        else{
            System.out.println("Não são as mesmas pessoas!");
        }
    }

    public void saoIrmao(Pessoa p1, Pessoa p2){
        if(p1.mae.equals(p2.mae) & p1.pai.equals(p2.pai)){
            System.out.println("Essas 2 pessoas são irmãos(ãns)");
        }
        else{
            System.out.println("Não são irmãos(ãns)");
        }
    }

    public void eAntecessor(Pessoa p){
        if (p.mae != null & p.pai != null){
            if (p.mae.equals(this.mae) || (p.pai.equals(this.pai))){

            }
        }







    }
}
