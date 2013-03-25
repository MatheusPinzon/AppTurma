package br.unisep.aula;
import java.util.ArrayList;

public class AppTurma {
    private int codigo;
    private String descricao;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    
    public AppTurma(int codigo, String descricao){
    this.codigo = codigo;
    this.descricao = descricao;
}

    public int quantidadeAlunos(){
        return alunos.size();
    }
    
    public int quantidadeAlunosAprovados(){
        int cont;
        int total_aprovados = 0;
        
        for(cont=0;cont<=alunos.size();cont++){
            if (alunos.get(cont).media() >= 7){
                total_aprovados ++;
            }
        }
        return total_aprovados;
    }
    
    public int quantidadeAlunosReprovados(){
       
        return alunos.size()-quantidadeAlunosAprovados();
    }
    
    public double media_geral(){
            
            int cont2;
            float total_media = 0, total_media_final = 0;
        
        for(cont2=0;cont2<=alunos.size();cont2++){
            total_media += alunos.get(cont2).media();
            total_media_final = total_media / cont2; 
        }
        
        return total_media_final;
    }
    
   public double porcentagem_aprovados(){
        double porcentagem_aprov;
        
        porcentagem_aprov = (alunos.size() /  100) * quantidadeAlunosAprovados();
        return porcentagem_aprov;
        }
   
   public double porcentagem_reprovados(){
       double porcentagem_reprov;
       
       porcentagem_reprov = (alunos.size() / 100) * quantidadeAlunosReprovados();
       return porcentagem_reprov;
   }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
