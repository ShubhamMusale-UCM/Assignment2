package BankAccount;
class InvalidInput extends Exception{
    public InvalidInput(String message){
        super(message);
        }
    }
    class InvalidAccountNoOrPassword extends Exception{
    public InvalidAccountNoOrPassword(String message){
        super(message);
        }
    }

public class BankAccount{
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
