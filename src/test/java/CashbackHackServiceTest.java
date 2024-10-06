import org.junit.Assert;
import org.junit.Test;
import ru.netologia.service.CashbackHackService;

public class CashbackHackServiceTest {


    @Test
    public void testDefaultCase(){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEdgeCase(){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }


}
