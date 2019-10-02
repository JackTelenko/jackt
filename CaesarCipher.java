package AllLabs;

public class CaesarCipher {

    //empty constructor
    public CaesarCipher() {

    }

    //return encrypted message

    public String encrypt(String message, int key)
    {
        String str="";
        int Key[] = new int [3];
        Key[0] = key/100;
        Key[1] = (key%100)/10;
        Key[2] = key%10;

        for(int i=0;i<message.length();i++) {
            char ch = message.charAt(i);
            if(ch>='a'&&ch<='z')
                str+=(char)((ch-'a'+Key[i%3])%26+'a');
            else if(ch>='A'&&ch<='Z')
                str+=(char)((ch-'A'+Key[i%3])%26+'A');
            else str+=ch;
        }
        return str;

    }
    //return message from secret
    public String decrypt(String secret, int key)
    {
        String str="";
        int Key[] = new int [3];
        Key[0] = key/100;
        Key[1] = (key%100)/10;
        Key[2] = key%10;

        for(int i=0;i<secret.length();i++) {
            char ch = secret.charAt(i);
            if(ch>='a'&&ch<='z')
                str+=(char)((ch-'a'-Key[i%3])%26+'a');
            else if(ch>='A'&&ch<='Z')
                str+=(char)((ch-'A'-Key[i%3])%26+'A');
            else str+=ch;
        }
        return str;

    }

}
