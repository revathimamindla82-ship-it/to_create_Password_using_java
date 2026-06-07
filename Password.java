public class Password {
    public static void main(String[] args) {


        String s="Bits^8924";
        int len=s.length();
        char[] chr = s.toCharArray();
        int ucount=0,lcount=0,dcount=0,scount=0;
        if(len>=8){
        for(char c:chr){
            if(c>='A'&&c<='Z')
            {
                ucount++;

            }
            else if(c>='a'&&c<='z')
            {
                lcount++;

            }
            else if(c>='0' && c<='9')
            {
                dcount++;
            }
            else{
                scount++;
            }

        }
    }
        else{
            System.out.println("length is less than 8");
        }
        if(len>=8 && ucount>0 && lcount>0 && dcount>0 && scount>0){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
      
        }
        
    }

    

    
