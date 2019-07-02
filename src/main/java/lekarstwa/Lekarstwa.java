// Napisać klasę Lekarstwa, która umożliwia przechowanie i zarządzanie informacjami
// związanymi z aktualną listą leków.
// Na potrzeby zadania można założyć, że tablice są poprawnie uzupełnione.
package lekarstwa;


public class Lekarstwa {

    private String[] nazwa;
    private double[] cena;
    private double[] refundacja;


    public Lekarstwa(String[] nazwa, double[] cena, double[] refundacja) {
        this.cena = cena;
        this.refundacja = refundacja;

        String[] tabWynikowa = new String[nazwa.length];
        int i = 0;
        for (String iterator : nazwa) {
            String litera = iterator.substring(0, 1);
            String reszta = iterator.substring(1, iterator.length());
            litera = litera.toUpperCase();
            reszta = reszta.toLowerCase();
            tabWynikowa[i] = litera + reszta;
            i++;
        }
        this.nazwa = tabWynikowa;
    }

    public boolean isValid() {
        if (nazwa.length == cena.length && nazwa.length == refundacja.length) {
            return true;
        }
        return false;
    }

    public String[] getNazwa() {
        return this.nazwa;
    }

    public double cena(String lek, boolean ubezpieczony) {

        double cena = 0;
        double refundacja = 0;

        for (int i = 0; i < nazwa.length; i++) {
            if (nazwa[i].equals(lek)) {
                cena = this.cena[i];
                refundacja = this.refundacja[i];
                break;
            }
        }

        if (ubezpieczony && refundacja > 0) {
            return cena - cena * refundacja;
        }
        return cena;
    }

    public String maksymalnaRefundacji() {

        double[] tabWynikowa = new double[nazwa.length];
        double max = tabWynikowa[0];

        for (int i = 0; i < nazwa.length; i++) {
            tabWynikowa[i] =  cena[i] * refundacja[i];
            if(tabWynikowa[i] > max){
                max = tabWynikowa[i];
            }
        }

        for (int i =0; i < tabWynikowa.length; i++){
            if(max == tabWynikowa[i]){
                return nazwa[i];
            }
        }
        return "0";
    }

    public double kosztCalkowity(){

        double[] tabWynikowa = new double[nazwa.length];
        double suma = 0;

        for (int i = 0; i < nazwa.length; i++) {
            tabWynikowa[i] = cena[i] - cena[i] * refundacja[i];
        }

        for (int i = 0; i < nazwa.length; i++) {
            suma = suma + tabWynikowa[i];
        }

        return suma;
    }

    public void wyswietl(){

        for (int i = 0; i < nazwa.length; i++) {
            System.out.print("Nazwa: " + nazwa[i]);
            System.out.println();
            System.out.print("Cena: " + cena[i]);
            System.out.println();
            System.out.print("Refundacja: " + refundacja[i]);
        }
    }
}
