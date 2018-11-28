package pt.ulusofona.lp2.crazyChess;

public class CrazyPiece {
    int ID_peca;
    int ID_tipoPeca;
    int ID_equipa;
    String alcunha;
    int posX;
    int posY;
    boolean capture_status;


    public CrazyPiece(int ID_peca, int ID_tipoPeca, int ID_equipa, String alcunha){
        this.ID_peca = ID_peca;
        this.ID_tipoPeca = ID_tipoPeca;
        this.ID_equipa = ID_equipa;
        this.alcunha = alcunha;
    }


    public int getID() {
        return ID_peca;

    }

    public String getImagePNG() {
        return "ree";

    }

    public String toString() {
        return "";

    }

    void setPos(int x, int y){
        this.posX = x;
        this.posY = y;

    }

    boolean getCaptureStatus(){
        return capture_status;
    }
}
