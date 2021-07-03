package javaapp11;

import entidades.Aluno;
import java.util.ArrayList;

public class JavaApp11 {

       
    public static void main(String[] args) {
        
        
        ArrayList<Aluno> aluno = new ArrayList<>();
        
        aluno.add(new Aluno("Borge Dias", 22, 7.5f, 5.0f));
        aluno.add(new Aluno("Johnny Choque", 23, 8f, 7f));
        aluno.add(new Aluno("Bruno Pambo", 25, 6f, 7f));
        aluno.add(new Aluno("Carlos Francis", 27, 9f, 10f));
        
        
        for(Aluno i: aluno){  
            System.out.println(i.toString());
           
        }
        
        
        
    }
    
}
