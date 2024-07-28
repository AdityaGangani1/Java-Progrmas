// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        
        // System.out.println("Try programiz.pro");
        String input = "CDEEFGH";
        
        for(int i = 0; i<input.length(); i++){
                    boolean unique=true;

            
            for(int j=0; j<input.length(); j++){
                
                if(i!=j&&input.charAt(i)==input.charAt(j)){
                    unique=false;
                }
            }
            if(unique){
             System.out.println(input.charAt(i));
             break;

                
            }
            }
        }
        
        
    }
