//Java Program to illustrate the use of continue statement  
//with label inside an inner loop to break outer loop  
public class BreakExample1 {  
public static void main(String[] args) {  
            aa:  
            for(int i=1;i<=3;i++){    
                    bb:  
                    for(int j=1;j<=3;j++){    
                        if(i==2&&j==2){    
                            //using break statement with label  
                            break aa;    
                        }    
                        System.out.println(i+" "+j);    
                    }    
            }    
}  
} 