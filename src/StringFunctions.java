public class StringFunctions {

    //______________________________________________________________________________________________________________________
    /* Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true
    */


    boolean doubleX(String str) {
        for(int i = 0; i < str.length(); i++){
            if(str.regionMatches(i,"xx",0,2)){return true;}
            if(str.regionMatches(i,"x",0,1)|!(str.regionMatches(i+1,"x",0,1))){return false;}
        }
        return false;
    }

//______________________________________________________________________________________________________________________
    /*Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


    stringBits("Hello") → "Hlo"
    stringBits("Hi") → "H"
    stringBits("Heeololeo") → "Hello"*/


    public String stringBits(String str) {
        String newString = new String();
        for(int i = 0; i < str.length(); i++){
            if(i%2==0){newString += str.charAt(i);}
        }
        return newString;
    }

//______________________________________________________________________________________________________________________

    /*Given a non-empty string like "Code" return a string like "CCoCodCode".


    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"*/



    public String stringSplosion(String str) {
        String newString = new String();
        int i;
        for(i = 0; i<str.length(); i++){
            newString += str.subSequence(0,i);
        }
        newString += str.subSequence(0,i);
        return newString;
    }

}


