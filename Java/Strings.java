public class Strings {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        for (char i = 'a'; i <= 'z'; i++){
            sb.append(i);
        }
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer();
        String a = "Hello   world and   bye you  ";
        String[] arr =  a.trim().split("\\s+");

        for (int i = arr.length-1; i >= 0; i--){
            sb1.append(arr[i]).append(" ");
        }
        System.out.println(sb1);
    }
}
