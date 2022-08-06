/*class InvalidInput extends Exception{
    public InvalidInput(String message){
        super(message);
        }
    }
    class InvalidAccountNoOrPassword extends Exception{
    public InvalidAccountNoOrPassword(String message){
        super(message);
        }
    }

class BankAccount{
 private  long password,cPassword,bal;
  private String accNo,cAccNo;
        public void setAccount(String accNo,long password){
            this.password=password;
            this.accNo= accNo;
System.out.println(" account created....");
            }
            public void authorization(String cAccNo,long cPassword){
                this.cPassword=cPassword;
                this.cAccNo=cAccNo;
                }
    public void setBal(long bal){
 if(accNo.equals(cAccNo) && password == cPassword){
         try{
         if(bal<=2000 && bal >0){
          this.bal=this.bal+bal;

             }
         else{
             throw new InvalidInput("please enter value between 0 to 2000");
             }
         }
     catch(Exception e ){
      System.out.println(e);
      }
     }
     else {
      try {
          throw new InvalidAccountNoOrPassword("please enter valid Account no. or password");
          }
          catch(Exception e ){
              System.out.println(e);
              }
      }
      }
    public long getBal(){
 if(accNo.equals(cAccNo) && password == cPassword){
     System.out.println("account Number : "+ accNo);
 System.out.println("Current Balance : "+bal);
       return bal;

    }
    else {
try{
 throw new InvalidAccountNoOrPassword("can't fetch account , please enter valid Account no. or password");
}catch(Exception e){
        System.out.println(e);
        }
        }
        return 0;
    }
}
*/
import BankAccount.*;
public class Customer {
	public static void main(String[] args)
	/*
	** ENCAPSULATION **

this is a type of Enpaculation because here we can't access  anything without validation which is in the methods and all the variables are private in short it provides security

		*/
	{
		BankAccount shubham = new BankAccount();
		shubham.setAccount("ACC01011", 1222);
		shubham.authorization("ACC01011", 1222);
		shubham.setBal(75);
		shubham.getBal();

		BankAccount bham = new BankAccount();
		bham.setAccount("ACC01011", 1222);
		bham.authorization("ACC010112", 1222);
		bham.setBal(7);
		bham.getBal();

	}
}
/*         ** Why we need encapsulation **

** CODE 

class BankAccount{
    long bal;(here variable is not private and not in any method hence not safe accessable to anyone )
    }
public class Cutomer {
 public static void main(String args[]){
BankAccount ibj = new BankAccount();
 ibj.bal      = 121; anyone can change your balance easily
 (for providing security for this data we to do security we have to use )    
        }   
}            

*/