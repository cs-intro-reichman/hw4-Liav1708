public class MyString {
    public static void main(String[] args) {
        //System.out.println("Testing lowercase:");
        //System.out.println("UnHappy : " + lowerCase("UnHappy"));
        //System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        //System.out.println("TLV : " + lowerCase("TLV"));
        //System.out.println("lowercase : " + lowerCase("lowercase"));

        //System.out.println("Testing contains:");
        //System.out.println(contains("unhappy", "happy")); // true
        //System.out.println(contains("happy", "unhappy")); // false
        //System.out.println(contains("historical", "story")); // false
        //System.out.println(contains("psychology", "psycho")); // true
        //System.out.println(contains("personality", "son")); // true
        //System.out.println(contains("personality", "dad")); // false
        //System.out.println(contains("resignation", "sign")); // true
        System.out.println(MyString.contains("baba yaga", ""));
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newWord = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                newWord += (char) (str.charAt(i) + 32);
            }
            else {
                newWord += str.charAt(i);
            }
        }
        return newWord;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        str1 = lowerCase(str1);
        str2 = lowerCase(str2);
        boolean result = false;
        String check = "";
        char[] arr = new char[str2.length()];

        //for(int i = 0; i < arr.length; i++){
        //    arr[i] = str2.charAt(i);
        //}

        if(str2.equals("")){
            return true;
        }
        if(str1.length() >= str2.length()){
            for(int i = 0; i < str1.length(); i++){
                for(int j = 0; j < str2.length(); j++){
                    if(str1.charAt(i) == str2.charAt(j)){
                        for(int k = i;k < str1.length(); k ++){
                            check += str1.charAt(k);
                            if(str2.equals(check)){
                                result = true;
                                break;
                            }
                        }
                        
                    }
                    if(str2.equals(check)){
                        break;
                    }
                }
                if(str2.equals(check)){
                    break;
                }
            }
        }
        return result;
    }
}
