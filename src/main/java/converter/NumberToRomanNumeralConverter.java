package converter;



public class NumberToRomanNumeralConverter {

    public String convert(int i) {
        if(i<1){
            return "the lowest number we support is 1";
        }
        if(i>3999){
            return "we do not support a numbere there is bigger then 3999";
        }
        String result ="";

        switch (String.valueOf(i).length()){
            case 4:
                result += thousands(i/1000);
                i = i%1000;
            case 3:

                result += hundreds(i/100);
                i = i%100;
            case 2:

                result += tens(i/10);
                i = i%10;
            case 1:
                result += onesToRoman(i/1);
        }

        return result;
    }

    private String onesToRoman(int i ){
        switch (i){
            case 9:
                return "IX";
            case 8:
                return "VIII";
            case 7:
                return "VII";
            case 6:
                return "VI";
            case 5:
                return "V";
            case 4:
                return "IV";
            default:
                return "III".substring(0,i);
        }
    }
    private String tens(int i ){
        switch (i){
            case 9:
                return "XC";
            case 8:
                return "LXXX";
            case 7:
                return "LXX";
            case 6:
                return "LX";
            case 5:
                return "L";
            case 4:
                return "XL";
            default:
                return "XXX".substring(0,i);
        }
    }
    private String hundreds(int i ){
        switch (i){
            case 9:
                return "CM";
            case 8:
                return "DCCC";
            case 7:
                return "DCC";
            case 6:
                return "DC";
            case 5:
                return "D";
            case 4:
                return "CD";
            default:
                return "CCC".substring(0,i);
        }
    }
    private String thousands(int i){
        switch (i){

            default:
                return ("MMM").substring(0,i);
        }
    }
}
