package six;

import java.text.NumberFormat;
import java.util.Locale;

public class Utils {
    //To format money amount
    public String formatMoney(double amount){
        NumberFormat formatter= NumberFormat.getCurrencyInstance(Locale.UK); //For the currency formatter of the UK
        return formatter.format(amount);
    }
}
