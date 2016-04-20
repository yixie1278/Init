
import UserPackage.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixxie
 */
public class Test {
    public static void main(String[] args){
        
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "308ProjectPU" );
      
      EntityManager entitymanager = emfactory.createEntityManager( );
      entitymanager.getTransaction( ).begin( );

      User employee = new User( ); 
      employee.setFirstName( "1202" );
      employee.setLastName( "Gopall" );
      employee.setUserName( "400000");
      employee.setPassword( "Technical Manager" );
      
      entitymanager.persist( employee );
      entitymanager.getTransaction( ).commit( );

      entitymanager.close( );
      emfactory.close( );
    }
}
