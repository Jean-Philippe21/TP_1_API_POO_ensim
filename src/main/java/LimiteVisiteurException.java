public class LimiteVisiteurException extends  Exception{

    String s;

    LimiteVisiteurException(String s){
        super(s);
        this.s = s;
    }

    public String toString(){
        return  getMessage() + s + "\n";
    }
}
