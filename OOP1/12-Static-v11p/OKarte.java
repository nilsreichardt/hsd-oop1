/**
 * Eine Oben-Karte, die von Karte eerbt.
 */
class OKarte extends Karte {
	OKarte(int zeile, int spalte, Spielfeld spielfeld) {
    	super(zeile, spalte, "zufall", "^^^", spielfeld);
    }
    
    /**
    * Übernimmt das Aussehen mit dem obereren Nachbarn und gibt die Karte in der Konsole aus
    */
    void klickAuf() {
    	super.klickAuf();
        
        meinSpielfeld.addPunkte(1);
        
        Karte obererNachbar = meinSpielfeld.sucheNachbar(id, "oben");
        
        // Falls die Karte am Rand ist, gibt es keinen oberern Nachbarn, 
        // weswegen überprüft werden muss, ob ein oberer Nachbar gefunden 
        // werden konnte.
        if(obererNachbar != null) {
        	obererNachbar.uebernehmeAussehen(this);
        }
    }
}