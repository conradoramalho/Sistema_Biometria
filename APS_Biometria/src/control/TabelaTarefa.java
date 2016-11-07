package control;

import java.util.List;

import javax.swing.table.AbstractTableModel;
import model.Tarefa;

public final class TabelaTarefa extends AbstractTableModel {

    private List linhas;
    private String[] colunas;

    public TabelaTarefa(List pacote_de_dados, String[] nome_das_colunas) {

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
        final Tarefa t = (Tarefa) linhas.get(linha);
        switch (coluna) {
            case 0:
                value = t.getId_tarefa();
                break;
            case 1:
                value = t.getDt_tarefa();
                break;
            case 2:
                value = t.getTx_nome();
                break;
            case 3:
                value = t.getId_animal();
                break;
            case 4:
                value = t.getId_usuario();
                break;
            case 5:
                value = t.getId_servico();
                break;
            case 6:
                value = t.getId_cliente();
                break;
        }
        return value;
    }

    public Tarefa getTarefa(int line) {
        Tarefa t = (Tarefa) linhas.get(line);
        return t;
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

}
