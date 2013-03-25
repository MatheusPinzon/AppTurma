package br.unisep.aula;

public class Aluno {
    private int ra;
    private String nome;
    private float g1, g2, media;
    
    
    public Aluno(int ra, String nome){
        this.ra = ra;
        this.nome=nome;       
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getG1() {
        return g1;
    }

    public void setG1(float g1) {
        this.g1 = g1;
    }

    public float getG2() {
        return g2;
    }

    public void setG2(float g2) {
        this.g2 = g2;
    }
    
    public float media(){
        return (g1+(g2*2)/3);
    }
    
    
}
