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

    public void inordre(){
        if(this.esq!=null){
            this.esq.inordre();
        }
        visitar();
        if(this.dret!=null){
            this.dret.inordre();
        }
    }

    public void postordre(){
        if(this.esq!=null){
            this.esq.postordre();
        }
        if(this.dret!=null){
            this.dret.postordre();
        }
        visitar();
    }
    public void preordre(){
        visitar();

        if(this.esq!=null){
            this.esq.preordre();
        }
        if(this.dret!=null){
            this.dret.preordre();
        }
    }

    public void reverse(){
        if(this.dret!=null){
            this.dret.reverse();
        }
        visitar();

        if(this.esq!=null){
            this.esq.reverse();
        }
    }





}
