package mastermind;

import java.util.Random;

/**
 * Pelin kaikki logiikka tapahtuu täällä.
 *
 * @author Arvoitusmies
 */
public class Logiikka {

    /**
     * Arvausyrityksen indeksi 1-10.
     */
    private byte arvausyritys;
    /**
     * Ratkaisurivi.
     */
    private Rivi ratkaisu;

    /**
     * Alustaa arvausyritykset ja kutsuu arvoRatkaisu() , jonka paluun tallettaa
     * ratkaisuun.
     */
    public Logiikka() {
        this.arvausyritys = 1;
        this.ratkaisu = arvoRatkaisu();
    }

    /**
     * Arpoo ratkaisurivin
     *
     * @return Arvottu rivi.
     */
    private Rivi arvoRatkaisu() {
        Random r = new Random();
        Vari[] varilista = new Vari[4];
        for (int i = 0; i < 4; i++) {
            switch (r.nextInt(6)) {
                case 0:
                    varilista[i] = Vari.KELTAINEN;
                    break;
                case 1:
                    varilista[i] = Vari.VALKOINEN;
                    break;
                case 2:
                    varilista[i] = Vari.VIHREA;
                    break;
                case 3:
                    varilista[i] = Vari.SININEN;
                    break;
                case 4:
                    varilista[i] = Vari.MUSTA;
                    break;
                case 5:
                    varilista[i] = Vari.PUNAINEN;
                    break;
            }
        }
        return new Rivi(varilista);
    }

    /**
     * EI VALMIS!! Antaa hyvyyspisteet arvauksesta. 10p jokaisesta oikealla
     * paikalla, 1p oikeasta väristä väärällä paikalla. Siitä sitten
     * käyttöliittymä näyttää mustat = pisteet/10 ja valkeat = pisteet%10.
     *
     * @param arvaus
     * @return arvauksen hyvyyspisteet.
     */
    public int arvaa(Rivi arvaus) {
        int pisteet = 0;
        Vari[] ratkaisuVarit = ratkaisu.getVarit();
        Vari[] arvausVarit = arvaus.getVarit();
        for (int i = 0; i < 4; i++) {
            if (ratkaisuVarit[i] == arvausVarit[i]) {
                pisteet += 10;
            }
        }
        return pisteet;
    }
    
    public void setRatkaisu(Rivi rivi){
        this.ratkaisu=rivi;
    }
}
