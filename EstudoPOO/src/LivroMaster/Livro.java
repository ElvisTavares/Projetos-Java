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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    
    public int adcionarCapitulo(String titulo, String texto){
       Capitulo cap = new Capitulo(titulo, texto);
        for (int i = 0; i < capitulos.length; i++) {
            if (capitulos[i] == null) {
                capitulos[i] = cap;
                return i;
            }
        }
        
        return -1;
       
    }
    
    public int removerCap(Capitulo cap){
        for (int i = 0; i < capitulos.length; i++) {
            if (capitulos[i].equals(cap)) {
                capitulos[i] = null;
                return i;
            }
        }
        return -1;
    }
    
    
    public int adcionarAutor(Autor autor){
        for (int i = 0; i < autores.length; i++) {
            if (autores[i] == null) {
                autores[i] = autor;
                return i;
            }
        }
        return -1;
    }
    
    public int removerAutor(Autor autor){
        for (int i = 0; i < autores.length; i++) {
            if (autores[i].equals(autor)) {
                autores[i] = null;
                
                return i;
            }
        }
        
        return -1;
    }
    
    
    
    
    
    
    
}
