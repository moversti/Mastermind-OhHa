/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;
import mastermind.*;

/**
 *
 * @author moversti
 */
public class Logiikkatest {
    
    public Logiikkatest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        Vari[] ratkaisu = {Vari.KELTAINEN,Vari.PUNAINEN,Vari.SININEN,Vari.VIHREA};
        Logiikka l = new Logiikka();
        l.setRatkaisu(new Rivi(ratkaisu));
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testataanEiYhtaanOikein(){
        Vari[] arvaus = {Vari.MUSTA,Vari.VALKOINEN,Vari.MUSTA,Vari.VALKOINEN};
        assertEquals(0, l.arvaa(new Rivi(arvaus)));
    }
    
    @Test
    public void testataanArvausYksiMusta(){
        Vari[] arvaus = {Vari.MUSTA,Vari.VALKOINEN,Vari.SININEN,Vari.VALKOINEN};
        assertEquals(10, l.arvaa(new Rivi(arvaus)));
    }
        
    @Test
    public void testataanArvausYksiValkoinen(){
        Vari[] arvaus = {Vari.MUSTA,Vari.VALKOINEN,Vari.MUSTA,Vari.SININEN};
        assertEquals(1, l.arvaa(new Rivi(arvaus)));
    }
    
    @Test
    public void testataanHankalaTapaus(){
        Vari[] ratkaisu = {Vari.VALKOINEN,Vari.VALKOINEN,Vari.MUSTA,Vari.MUSTA};
        l.setRatkaisu(new Rivi(ratkaisu));
        Vari[] arvaus = {Vari.VALKOINEN,Vari.VALKOINEN,Vari.VALKOINEN,Vari.MUSTA};
        assertEquals(30, l.arvaa(new Rivi(arvaus)));
    }
}
