class Val
{
    public static void main(String[] args)
    {

        String str = "100.375";

        // returns the double value
        // represented by the string argument
        double valueOf = Double.parseDouble(str);
        float valueF=(float)valueOf;
        long valueL=(long)valueF;
        int valueI=(int)valueL;
        char valueCh=(char)valueI;
        short valueSh=(short)valueCh;
        byte valueBe=(byte)valueSh;
        String d = Double.toString(3.14);
        System.out.println("Value = " + valueBe);
        System.out.println("d = " + d);
    }

}