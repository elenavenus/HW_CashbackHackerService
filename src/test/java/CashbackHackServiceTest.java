import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netologia.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void testDefaultCase(){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        Assert.assertEquals(actual, 100);
    }

    @Test
    public void testEdgeCase(){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        Assert.assertEquals(actual, 0);
    }


}

