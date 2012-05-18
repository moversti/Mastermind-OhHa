package mastermind;

/**
 * Neljän värinappulan muodostama arvaus tai ratkaisurivi.
 *
 * @author Arvoitusmies
 */
public class Rivi {

    /**
     * Lista nappuloista.
     */
    private Vari[] varit;

    /**
     * Uusi rivi valmiista listasta.
     *
     * @param varit neljän pituinen lista värejä.
     */
    public Rivi(Vari[] varit) {
        if (varit.length != 4) {
            throw new IllegalArgumentException("Rivin pitää koostua neljästä väristä");
        }
        this.varit = varit;
    }

    /**
     * Uusi rivi argumentteina olevista väreistä.
     *
     * @param vari1 väri 1
     * @param vari2 väri 2
     * @param vari3 väri 3
     * @param vari4 väri 4
     */
    public Rivi(Vari vari1, Vari vari2, Vari vari3, Vari vari) {
        Vari[] variLista = {vari1, vari2, vari3, vari};
        this.varit = variLista;
    }

    /**
     * Palauttaa rivin värit listana.
     *
     * @return
     */
    public Vari[] getVarit() {
        return varit;
    }
}
