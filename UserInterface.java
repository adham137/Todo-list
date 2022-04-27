/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adham
 */
import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list , Scanner scan){
        this.list=list;
        this.scan=scan;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String command = scan.nextLine();
            
            if(command.equals("stop")){
                break;
            }
            if(command.equals("add")){
                this.add();
                continue;
            }
            if(command.equals("list")){
                list.print();
                continue;
            }
            if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int num = Integer.valueOf(scan.nextLine());
                list.remove(num);
                continue;
            }
            

            
        }
        System.out.println("Good bye!");
    }
    public void add(){
        System.out.println("To add:");
        String toBeAdded = scan.nextLine();
        list.add(toBeAdded);
    }
    
}
