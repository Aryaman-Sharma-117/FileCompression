public class RleEncode {
    public static String encode(String string){
        int count=0;
        String encoded="";
        for(int i=0;i<string.length();i++){
            if(i==0){
                encoded+=string.charAt(i);
                count++;
            }
            else if(string.charAt(i)==string.charAt(i-1)){
                count++;
            }
            else if(string.charAt(i)!=string.charAt(i-1)){
                encoded+=count;
                count=1;
                encoded+=string.charAt(i);
            }
            if(i==string.length()-1){
                encoded+=count;
            }
        }
        return encoded;
    }
}
