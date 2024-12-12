package assignments.ex1;
public class Ex1 {

        public static int number2Int(String num) {
            int ans = -1;
            if (isNumber(num)){
                String[] parts= num.split("b");
                String number= parts[0];
                int bace= Integer.parseInt(parts[1]);
                ans= Integer.parseInt(number, bace);
            }
            return ans;
        }

        
        public static boolean isNumber(String a) {
            boolean ans = true;
            // add your code here
            if (a == null || !a.contains("b"))
                ans = false;
            else {
                String [] parts = a.split("b");
                if (parts.length != 2)
                    ans= false;
                else {
                    String number= parts[0];
                    String baseArr= parts[1];
                    if (!isGood (baseArr))
                        ans= false;
                    else {
                        int base= Integer.parseInt(baseArr);
                        if (base<1 || base>16)
                            ans= false;
                        else {
                            char[] charArray = number.toCharArray();
                            for (int i = 0; i < charArray.length; i++) {
                                char n = charArray[i];
                                boolean isNum = Character.isSurrogate(n);
                                boolean isLegal = (n >= 'A' && n <= 'G');
                                if (!isNum && !isLegal) {
                                    ans = false;
                                    break;
                                }
                            }
                        }
                    }
                }

            }
            return ans;
        }


        public static boolean isGood(String s) {
            boolean ans= true;
            if (s == null || s.isEmpty())
                ans= false;
            char[] charArr = s.toCharArray();
            for (int i = 0; i < charArr.length; i++) {
                char a = charArr[i];
                System.out.println(a);
                if (!Character.isDigit(a) && (a< 'A' || a> 'G')) {
                    ans = false;
                    break;
                }
            }
            return ans;
        }

        
        public static String int2Number(int num, int base) {
            String ans = "";
            if (num>= 0 && base>= 1 && base<= 16 )
                ans= Integer.toString(num, base).toUpperCase();
            return ans;
        }

        
        public static boolean equals(String n1, String n2) {
            boolean ans = true;
            int decimal1= number2Int(n1);
            int decimal2= number2Int(n2);
            if (decimal1== -1 || decimal2== -1 || decimal1 != decimal2)
                ans= false;
            return ans;
        }

        
        public static int maxIndex(String[] arr) {
            int ans = 0;
            int maxValue= Integer.MIN_VALUE;
            for (int i=0; i< arr.length; i++) {
                int value= number2Int(arr[i]);
                if (value> maxValue) {
                    maxValue= value;
                    ans= i;
                }
            }
            return ans;
        }
}
