package recursion;
// tree recursion explore options

public class gridgame {
    static void gridgame(int startrow , int startcol,int endrow,int endcol,String result){
        if(startrow == endrow && startcol == startcol){
            System.out.println(result);
            return;
        }
        // negative base case jb
        if(startcol>endcol || startcol>endcol){
            return;
        }
        // col move right side
        gridgame(startrow,startcol+1,endrow,endcol,result+"R");
        gridgame(startrow+1,startcol,endrow,endcol,result+"D");


    }

    public static void main(String[] args) {
        gridgame(1,1,3,3,"");

    }
}
