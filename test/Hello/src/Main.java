public class Main {

    public static void main(String[] args) {
        int iCode;
        char cCode;
        int count = 0;
        for(iCode=19966;iCode<=40959;iCode++)
        {
            cCode = (char)iCode;
            System.out.print(cCode+" ");
            count++;
            if(count%20==0)
            {
                System.out.println();
            }
        }
    }
}
