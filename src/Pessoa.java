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

    public void mesmaPessoa(Pessoa p1, Pessoa p2) {
        if (p1.nome.equals(p2.nome) & p1.mae.equals(p2.mae)) {
            System.out.println("As pessoas são as mesmas!");
        } else {
            System.out.println("Não são as mesmas pessoas!");
        }
    }

    public void saoIrmao(Pessoa p1, Pessoa p2) {
        if (p1.mae.equals(p2.mae) & p1.pai.equals(p2.pai)) {
            System.out.println("Essas 2 pessoas são irmãos(ãns)");
        } else {
            System.out.println("Não são irmãos(ãns)");
        }
    }

    public void verificaAntecessor(Pessoa p) {
        Pessoa primeiraPessoa = p;
        if (this.mae.nome.equals(p.nome) || this.pai.nome.equals(p.nome)) {
            System.out.println("É ANTECESSOR");
        } else if ((this.mae.mae != null && this.mae.mae.nome.equals(p.nome))) {
            verificaAntecessor(this.mae.mae);
        } else if (this.mae.pai != null && this.mae.pai.nome.equals(p.nome)) {
            verificaAntecessor(this.mae.pai);
        } else if (this.pai.mae != null && this.pai.mae.nome.equals(p.nome)) {
            verificaAntecessor(this.pai.mae);
        } else if (this.pai.pai != null && this.pai.pai.nome.equals(p.nome))
        {
            verificaAntecessor(this.pai.pai);
        } else {
            System.out.println("CU");
        }


    }
}
