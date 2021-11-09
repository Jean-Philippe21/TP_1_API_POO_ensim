import org.junit.Test;

public class TestZoo {
    @Test
    public void test(){
        Exception o = null;
        Zoo monZoo = new Zoo(1,2);

        try {
            monZoo.setVisiteurs(3);
        } catch (Exception e) {
            o=e;
            e.printStackTrace();
        }
        assert(o!=null);

    }



}
