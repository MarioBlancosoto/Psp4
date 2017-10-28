
package exercicio4psp;


public class Fios extends Thread{
    
    static int select;
    static int par=0;
    static int imPar =0;
    static int finDos=0;
    static int finTres=0;
    static int dosTres =0;
    
     public Fios(String nome,int selector){
        super(nome);
        selector = this.select;
       
    }
    
    public void run(){
             
        if(select==0){
        
        for(int i=2;i<1000;i+=2){
          
            par +=i;
            System.out.println(""+par);
        }
        }
        else if(select==1){
           for(int i=0;i<1000;i+=2){
          
            imPar +=i;
            
            System.out.println(""+imPar);
        }  
            
            
        }else if (select==2){
            
            for(int i=0;i<1000;i++){
                if(i%10==2){
                    finDos+=i;
                }else if(i%10==3){
                    finTres+=i;
                }
                System.out.println(" en dos "+(finDos+finTres));
            }
            
        }
           
        }
    }
        
   
    
    
    

