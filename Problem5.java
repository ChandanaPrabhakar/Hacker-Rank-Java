import java.util.Scanner;

public class Problem5 {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        char[] CharArray1 = a.toCharArray();
        char[] CharArray2 = b.toCharArray();
        
        char temp;
        
        if(a.length() == b.length()){
            for(int i =0; i< a.length();i++){
                
                for(int j=i+1;j<a.length();j++)
                {
                    if(CharArray1[i]>CharArray1[j])
                    {
                        temp=CharArray1[i];
                        CharArray1[i]=CharArray1[j];
                        CharArray1[j]=temp;
                    }
                    if(CharArray2[i]>CharArray2[j])
                    {
                        temp=CharArray2[i];
                        CharArray2[i]=CharArray2[j];
                        CharArray2[j]=temp;
                    }
                }
            }
        }else{
            return false;
        }
        

        for(int i=0;i<a.length();i++) 
        { 
            if(CharArray1[i]!=CharArray2[i]) 
            { 
                return false; 
            }
        } 
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
