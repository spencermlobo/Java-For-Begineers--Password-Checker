class InvalidPasswordException extends Exception {   
    int passwordConditionViolated = 0;   
    public InvalidPasswordException(int conditionViolated) 
    { 
        super("Invalid Password: "); 
        passwordConditionViolated = conditionViolated; 
    }   
    public String printMessage() 
    {         
        switch (passwordConditionViolated) {           
            case 1: 
                return ("Please enter valid password of length 8 containing one digit and one Special Symbol."); 
        
            case 2: 
                return ("Please enter valid password of length 8 containing one digit and one Special Symbol."); 
  
            case 3: 
                return ("Please enter valid password of length 8 containing one digit and one Special Symbol."); 
  
            case 4: 
                return ("Please enter valid password of length 8 containing one digit and one Special Symbol."); 
  
            case 5: 
                return ("Please enter valid password of length 8 containing one digit and one Special Symbol."); 
        }   
        return (""); 
    } 
} 