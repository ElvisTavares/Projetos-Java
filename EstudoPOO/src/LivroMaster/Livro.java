/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivroMaster;

/**
 *
 * @author Elvis
 */
public class Livro {
    private String titulo;
    private String isbn;
    private Capitulo[] capitulos; //Lista capitulos
    private Autor[] autores; //Lista de autores
    
    //contrutor constrói livro com dados recebidos e aloca espaço para vetores
    public Livro(String titulo, String isbn){
        this.titulo = titulo;
        this.isbn = isbn;
        capitulos = new Capitulo[30];
        autores = new Autor[5];
        
    }
    
   public Capitulo[] getCapitulo(){
       return capitulos;
   }
   
   public void setCapitulo(Capitulo[] capitulos){
       this.capitulos = capitulos;
   }
   
   
   public Autor[] getAutor(){
       return autores;
   }
   
   public void setutores(Autor[] autores){
       
   }
    
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    
    public int adcionarCapitulo(String titulo, String texto){
       
    }
    
    
    
    
    
    
    
}
