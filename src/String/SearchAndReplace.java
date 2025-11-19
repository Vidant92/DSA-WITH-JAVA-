package String;

public class SearchAndReplace {
    static String SearchAndReplace(String str , char search,char replace){
        if(str.length() == 0){
            return "";
        }
        String x;
        if( str.charAt(0) == search){
            x=replace +SearchAndReplace(str.substring(1), search,replace );
        }
        else{
            x = str.charAt(0) + SearchAndReplace(str.substring(1), search, replace);
        }
    return x;
    }
    public static void main(String[] args) {
        String res = SearchAndReplace("hello", 'l','x');
        System.out.println(res);
    }
}
