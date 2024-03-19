public class RleDecode {
    public static String decode (String string){
        String decoded="";
        char temp=' ';
        for(int i=0;i<string.length();i++){
            if(!Character.isDigit(string.charAt(i))){
                temp=string.charAt(i);
            }
            else if(Character.isDigit(string.charAt(i))){
                String str="";
                while(i<string.length() && Character.isDigit(string.charAt(i))){
                    str+=String.valueOf(string.charAt(i));
                    i++;
                }
                for(int j=0;j<Integer.parseInt(str);j++){
                    decoded+=temp;
                }
            }
        }
        return decoded;
    }
    
}
