package Classes;

import java.util.Date;

public class clsInvoice {

    public int id, customerId;
    private Date date;
    boolean printed;
    public double sumBrutto, sumNetto, sumMwst;

    public clsInvoice()
    { }

    public boolean SaveToDb(){
        boolean tmpResult = false;
        String tmpCommand = "INSERT INTO tbInvoice (date, printed, sumBrutto, sumNetto, sumMwst) VALUES (getdate(), false, "+sumBrutto+","+sumNetto+","+sumMwst+")";
        return tmpResult;
    }

    public static int GetId(clsInvoice pInvoice)
    {
return  1;
    }
}
