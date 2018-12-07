import api.API;
import error.OTMException;
import org.junit.Test;

public class AllTests {

    @Test
    public void test1(){
        try {
            Entry_Point_OTM entry_point = new Entry_Point_OTM();
            API api = entry_point.get_OTM_API();
            String configfile ="C:\\Users\\gomes\\code\\otm\\otm-base\\src\\main\\resources\\test_configs\\line.xml";
            api.load(configfile,2f,true,"ctm");
        } catch (OTMException e) {
            e.printStackTrace();
        }
    }
}
