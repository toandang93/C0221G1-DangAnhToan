public class main {
    public static void main(String[] args) {
        String abc ="abcdeabe";
        findarr(abc);

    }
    public static void findarr(String chuoi){
        String temp = "";
        boolean check = true;
        String[] arr1 = chuoi.split("");
        String[] arr2 = chuoi.split("");
        System.out.println(arr1.toString());
        System.out.println(arr2.toString());
//       for (int i = 0 ;i<chuoi.length();i++){
//          for (int a  = 0 ;a <chuoi.length();a++){
//              if (chuoi.substring(i,1).equals(chuoi.substring(a,1))){
//                  check =  false;
//                  break;
//              }
//          }
//          if (check){
//              temp += chuoi.substring(i,1);
//          }
//       }
//        System.out.println(temp);
















    }

}
