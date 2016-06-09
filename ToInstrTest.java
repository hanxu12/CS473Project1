
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ToInstrTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ToInstrTest
{
    /**
     * Default constructor for test class ToInstrTest
     */
    public ToInstrTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void Test1(){
        ToInstr t = new ToInstr();
        assertEquals(t.convert(0x022DA822,0x7A060),"sub $21,$17,$13");

    } 

    @Test
    public void Test2(){
        ToInstr t = new ToInstr();
        assertEquals(t.convert(0x8EF30018,0x7A060),"lw $19,24($23)");

    } 

    @Test
    public void Test4(){
        ToInstr t = new ToInstr();
        assertEquals(t.convert(0x02689820,0x7A060),"add $19,$19,$8");

    } 
    @Test
    public void Test5(){
        ToInstr t = new ToInstr();
        assertEquals(t.convert(0xad930018,0x7A060),"sw $19,24($12)");

    } 
    @Test
    public void Test6(){
        ToInstr t = new ToInstr();
        assertEquals(t.convert(0x02697824,0x7A060),"and $15,$19,$9");

    } 
    @Test
    public void Test7(){
        ToInstr t = new ToInstr();
        assertEquals(t.convert(0xad8FFFF4,0x7A060),"sw $15,-12($12)");

    } 
    @Test
    public void Test8(){
        ToInstr t = new ToInstr();
        assertEquals(t.convert(0x018C6020,0x7A060),"add $12,$12,$12");

    } 
    @Test
    public void Test9(){
        ToInstr t = new ToInstr();
        assertEquals(t.convert(0x02A4A825,0x7A060),"or $21,$21,$4");

    } 
    @Test
    public void Test10(){
        ToInstr t = new ToInstr();
        assertEquals(t.convert(0x158FFFF6,0x7A060),"bne $12,$15,address 0x7a050");

    } 
    @Test
    public void Test11(){
        ToInstr t = new ToInstr();
        assertEquals(t.convert(0x8E59FFF0,0x7A060),"lw $25,-16($18)");

    } 
}
