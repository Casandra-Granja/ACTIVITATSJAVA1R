package Basiques.TIPUS_ABSTRACTE_DE_DADES.Arbre;

public class ExempleArbreBST {
    public static void main(String[] args) {
        NodeBST arrel = new NodeBST(23);
        NodeBST n11 = new NodeBST(11);
        NodeBST n44 = new NodeBST(44);
        NodeBST n5 = new NodeBST(5);
        NodeBST n28 = new NodeBST(28);

        arrel.setFillEsq(n11);
        arrel.setFillDret(n44);
        n11.setFillEsq(n5);
        n44.setFillEsq(n28);

        System.out.println("\n Recorregut inordre:");
        inordre(arrel);
        System.out.println("\n Recorregut preordre:");
        preordre(arrel);
        System.out.println("\n Recorregut postordre:");
        postordre(arrel);
        System.out.println("\n Recorregut reverse:");
        reverse(arrel);
    }
    //statica no fa falta crear un objecte per cridar-la, inordre, imprimeix els valors en ordre ascendent. LNR
    public static void inordre(NodeBST n){
        if (n!= null){
            inordre(n.esq);
            n.visitar();
            inordre(n.dret);
        }
    }
    //no surt ordenat numericament NLR
    public static void preordre(NodeBST n){
        if (n!= null){
            n.visitar();  //NODE actual, no s'ha de tornar a possar "visitar" perquè el que és node esquerr passarà a ser un Node
            preordre(n.esq); // LEFT
            preordre(n.dret); // RIGHT
        }
    }
    // recorrer LRN
    public static void postordre(NodeBST n){
        if (n!= null){
            postordre(n.esq); //LEFT
            postordre(n.dret); //RIGHT
            n.visitar();   // NODE

        }

    }

    // ordre descendent
    public static void reverse(NodeBST n){
        if (n!= null){
            reverse(n.dret); //RIGHT
            n.visitar();   // NODE
            reverse(n.esq); //LEFT

        }

    }

}
