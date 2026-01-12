package Basiques.TIPUS_ABSTRACTE_DE_DADES.Arbre;

public class NodeBST {

    int valor;
    NodeBST esq, dret;

    public NodeBST(int v){
        this.valor= v;
        this.esq= null;
        this.dret= null;
    }

    public void setFillEsq(NodeBST esq){
        this.esq= esq;
    }
    public void setFillDret(NodeBST dret){
        this.dret= dret;
    }

    public void visitar(){
        System.out.println(this.valor);
    }


}
