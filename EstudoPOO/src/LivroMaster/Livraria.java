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
public class Livraria {
    private Livro[] livros;// lista de livros
    
    public Livraria(){ // contrutor aloca espaço para 100 livros e chama o menu
        livros = new Livro[100];
        menu();
    }
    
    //menu
    
    private void menu(){
        int escolha = 0;
        do {
            //menu de opçoes
            System.out.println("===========================================");
            System.out.println("= 1 - Cadastar livro                      =");
            System.out.println("= 2 - Remover livro                       =");
            System.out.println("= 3 - Listar acervo                      =");
            System.out.println("= 4 - Resetar livraria                      =");
            System.out.println("= 5 - Modificar livro no acervo                      =");
            System.out.println("= 6 - listar capitulos livro                      =");
            System.out.println("= 9 - Sair                     =");
            System.out.println("===========================================");
            
            try{
                System.out.println("Escolha uma opção: ");
                switch(escolha){
                    case 1:
                        cadastrarLivro();
                        break;
                } 
            } catch(Exception ex){
                System.err.println(ex.getMessage());
                Thread.sleep(1000);
            }
            
            
        } while (escolha != 9);
        
    }
}
