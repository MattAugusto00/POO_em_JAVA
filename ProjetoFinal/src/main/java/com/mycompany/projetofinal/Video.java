package com.mycompany.projetofinal;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao=1;
        this.views=0;
        this.curtidas=0;
        this.reproduzindo=false;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public int getViews() {
        return views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova=(this.getAvaliacao()+avaliacao)/this.getViews();
        
        this.avaliacao = avaliacao;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas()+1);
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
}
