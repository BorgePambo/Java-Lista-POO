package entidades;


public class Aluno {
    
    private String nome;
    private int idade;
    private float nota1;
    private float nota2;

    
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }   
    
    public Aluno(String nome, int idade, float nota1, float nota2) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    
    private float media(){
        return (nota1 + nota2)/2;
    }
    
    private String verificar(){
        if(media() >= 7.0){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }
    
    @Override
    public String toString(){
        System.out.println("........................");
        String s = String.format("Nome: %s%n", nome)+
                   String.format("Idade: %d%n", idade)+
                   String.format("Media: %.2f\n", media())+
                   String.format("Condição: %s%n", verificar());
       return s;
                
    }
    
}
