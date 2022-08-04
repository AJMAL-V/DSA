public class Encryption {


        public  static String change(String str,int key){
            int newkey=key%26;
            char[] charaaarray=new char[str.length()];

            for (int i=0;i<str.length();i++){
                int letterposition=str.charAt(i)+newkey;
                if (letterposition<=122){
                    charaaarray[i]=(char) letterposition;
                }else {
                    charaaarray[i]=(char) (96+letterposition%2);
                }
            }
            return new String(charaaarray);

        }
        public  static  void main(String arg[]){
            String value="hai";
            System.out.println(change(value,2));
        }

}
