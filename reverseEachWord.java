// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        String input = "java code";
                System.out.println("orignal string" + input);
                String output = "";
                
                String[] words =input.split(" ");
                
                for(String word : words){
                    String revWord = "";
                    
                    
                    for(int i = word.length()-1; i>=0; i-- ){
                        revWord = revWord+word.charAt(i);
                        
                    }
                    output = output+revWord + " ";
                    System.out.println("reversed string" +revWord);

                }


    }
}