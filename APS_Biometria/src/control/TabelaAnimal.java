package control;

import java.util.List;

import javax.swing.table.AbstractTableModel;
import model.Animal;

public final class TabelaAnimal extends AbstractTableModel {

    private List linhas;
    private String[] colunas;

    public TabelaAnimal(List pacote_de_dados, String[] nome_das_colunas) {

        setLinhas(pacote_de_dados);
        setColunas(nome_das_colunas);
    }

    @Override
    public int getColumnCount() {
        int tamanho = colunas.length;
        return tamanho;
    }

    @Override
    public int getRowCount() {
        int tamanho = linhas.size();
        return tamanho;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Object value = null;
        final Animal a = (Animal) linhas.get(linha);
        switch (coluna) {
            case 0:
                value = a.getId_animal();
                break;
            case 1:
                value = a.getTx_nome();
                break;
            case 2:
                value = a.getTx_raca();
                break;
            case 3:
                value = a.getTx_categoria();
                break;
            case 4:
                value = a.getId_cliente();
                break;
        }
        return value;
    }

    public Animal getAnimal(int line) {
        Animal a = (Animal) linhas.get(line);
        return a;
    }

    @Override
    public boolean isCellEditable(int r, int c) {
        boolean pode = false;
        return pode;
    }

    @Override
    public String getColumnName(int num) {
        String nome = colunas[num];
        return nome;
    }

    public List getLinhas() {
        return linhas;
    }

    public void setLinhas(List linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    public String toString(){
        return getColumnName(0);
    }

}
