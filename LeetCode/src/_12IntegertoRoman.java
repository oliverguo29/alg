public class _12IntegertoRoman {

    StringBuilder roman = new StringBuilder();

    public String intToRoman(int num) {
        int count=-1;

        if(num>=1000){
            count=num/1000;
            num=num%1000;
            toRoman("M",count);
        }

        if(num>=900){
            num=num%900;
            toRoman("CM",1);
        }

        if(num>=500){
            num=num%500;
            toRoman("D",1);
        }

        if(num>=400){

            num=num%400;
            toRoman("CD",1);
        }

        if(num>=100){
            count=num/100;
            num=num%100;
            toRoman("C",count);
        }

        if(num>=90){

            num=num%90;
            toRoman("XC",1);
        }

        if(num>=50){
            num=num%50;
            toRoman("L",1);
        }

        if(num>=40){
            num=num%40;
            toRoman("XL",1);
        }

        if(num>=10){
            count=num/10;
            num=num%10;
            toRoman("X",count);
        }

        if(num>=9){

            num=num%9;
            toRoman("IX",1);
        }

        if(num>=5){

            num=num%5;
            toRoman("V",1);
        }

        if(num>=4){
            num=num%4;
            toRoman("IV",1);
        }

        if(num>=1){
            count=num/1;
            toRoman("I",count);

        }

        return roman.toString();

    }

    public String toRoman(String value, int count){
        for(int i=0;i<count;i++){
            roman.append(value);
        }
        return roman.toString();
    }
}
