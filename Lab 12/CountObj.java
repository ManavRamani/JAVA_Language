// 6. Object Count :-
class TotalCount{
    static int count=0;

    TotalCount(){
        count++;
    }
    static int Count(){
        return count;
    }
}
public class CountObj{
    public static void main(String[] args) {
        
        TotalCount c1=new TotalCount();        
        TotalCount c2=new TotalCount();
        TotalCount c3=new TotalCount();
        TotalCount c4=new TotalCount();

        System.out.println("Count is : "+TotalCount.Count());

    }
}