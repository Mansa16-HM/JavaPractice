public class EncryptDecpryptMsg {
    public static void PrintMsg(char[] CharArray) {
        for (int i = 0; i < CharArray.length; i++) {
            System.out.print(CharArray[i] + " ");
        }
    }

    public static char[] EncryptMethod(char[] EncryptMsg) {
        char[] EncryptedMsg = new char[] {};
        for (int i = 0; i < EncryptMsg.length; i++) {
            if (EncryptMsg[i] == 'A' || EncryptMsg[i] == 'E' || EncryptMsg[i] == 'I' || EncryptMsg[i] == 'O'
                    || EncryptMsg[i] == 'U') {
                EncryptedMsg[i] = '*';
            } else {
                EncryptMsg[i] += 3;
                EncryptedMsg[i] = EncryptMsg[i];
            }
        }
        return EncryptedMsg;
    }

    public static void main(String args[]) {
        String msg = "hii Hamza!How are you";
        char[] message = msg.toCharArray();
        /* PrintMsg(message); */
        char[] EncryptionMsg = EncryptMethod(message);
        PrintMsg(message);
        System.out.println(EncryptionMsg);

    }
}
