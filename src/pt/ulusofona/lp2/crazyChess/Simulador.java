package pt.ulusofona.lp2.crazyChess;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Simulador {
    int tamanhoTabuleiro;
    int nmrPecas;
    int[][] tabuleiro;


    public Simulador(){

    }


    public boolean iniciaJogo() {
        String nomeFicheiro = "simulacao.txt";
        try {
            File ficheiro = new File(nomeFicheiro);
            Scanner leitorFicheiro = new Scanner(ficheiro);
            int linhasLidas = 0;
            int matrix_line = 0;

            while(leitorFicheiro.hasNextLine()) {

                String linha = leitorFicheiro.nextLine();
                String dados[] = linha.split(":");

                if(linhasLidas > 1 && linhasLidas <= nmrPecas + 1) {

                    int ID_peca = Integer.parseInt(dados[0]);
                    int ID_tipoPeca = Integer.parseInt(dados[1]);
                    int ID_equipa = Integer.parseInt(dados[2]);
                    String alcunha = dados[3];

                    CrazyPiece pecaMaluca = new CrazyPiece(ID_peca, ID_tipoPeca, ID_equipa, alcunha);
                } else if(linhasLidas == 0) {
                    tamanhoTabuleiro = Integer.parseInt(dados[0]);

                } else if(linhasLidas == 1) {
                    nmrPecas = Integer.parseInt(dados[0]);

                } else {


                    }
                linhasLidas++;
            }
            leitorFicheiro.close();
        }
        catch(FileNotFoundException exception) {
            String mensagem = "Erro: o ficheiro " + nomeFicheiro + " nao foi encontrado. ";
            System.out.println(mensagem);
            return false;
        }



        return true;

    }

    public int getTamanhoTabuleiro() {
        return tamanhoTabuleiro;

    }

    public boolean processaJogada(int xO, int yO, int xD, int Yd) {
        return true;

    }

    public List<CrazyPiece> getPecasMalucas() {

    }

    public boolean jogoTerminado(){
        return true;

    }

    public List<String> getAutores(){

    }

    public List<String> getResultados()  {

    }

    public int getIDPeca(int x, int y) {
        return 1;

    }

    public int getIDEquipaAJogar() {
        return 1;

    }




}
