// Repère dans une courbe // associé à la courbe.
// Change en fonction de l'évolution de la courbe.
// 
package info.emptycanvas.library;

import info.emptycanvas.library.object.Point3D;
import info.emptycanvas.library.tribase.Chemin;

/**
 *
 * @author Se7en
 */
public class Maths {
    
    static double approxTangente = 0.000001;
    static double approxNormale = 0.000001;

    /**
     * @param c chemin à parcourir
     * @param emplacementT Valeur de la variable de la courbe paramétrique.
     * @return Les 3 segments de droites (vecteurs) qui composent le repère. 0:
     * l'origine du système d'axe dans le système où se trouve la courbe.
     * Fonction pour calculer le repère dans une courbe. Le repère est construit
     * avec la tangente et deux droites perpenducaires à la droite tangente.
     * (Normales)
     *
     * Calcul par approximation simple au 1er degré. Une autre méthode permettra
     * d'autres approximations.
     *
     *
     *
     * Choix des normales.
     *
     */
    public Point3D[] calculRepere(Chemin c, double emplacementT) {
        Point3D[] pts = new Point3D[4];

        pts[0] = calculerPointCourbe(c, emplacementT);

        pts[1] = tangente(c, emplacementT, 1).norme1();

        pts[2] = normale1(c, emplacementT, 1).norme1();

        pts[3] = pts[0].prodVect(pts[1]).norme1();
        
        /**
         * Contrairement à ce que j'ai écrit sur Empty3, il semble que j'aie 
         * fait une erreur de vocabulaire: une courbe ne possède pas deux normale
         * mais un plan normal en chaque point (pour une courbe 2 fois continu-
         * ment dérivable) et on veut que les 2 autres axes soient dans ce
         * plan. Camera FPS-Like.
         */
        
        pts[2] = normale1(c, emplacementT, 1);

        return pts;
    }

    public Point3D calculerPointCourbe(Chemin c, double t) {
        return c.calculerPoint3D(t);
    }

    public Point3D tangente(Chemin c, double t, int degre) {
        if (degre > 1) {
            System.out.println("Degré est supérieur à 1: pas d'implémentation actuelle");
        }
        Point3D p;
        try {

            p = c.calculerVitesse3D(t);

            return p;

        } catch (Exception ex) {
            Point3D p1 = c.calculerPoint3D(t);
            Point3D p2 = c.calculerPoint3D(t + approxTangente);

            p = (p2.moins(p1)).norme1();
        }

        return p;
    }

    
    /**
     * On va essayer de trouver la première normale: alors je ne connais
     * pas les détails du calcul à l'avance. ON va essayer de voir, de dessiner
     * cette courbe mentalement avant de la dessiner sur l'écran, de la calculer
     * avec plus de précision.
     * 
     * Même essayer de trouver un procédé imaginatif, une façon de voir graphique
     * @param c Courbe
     * @param t Paramètre de la courbe
     * @param tangente Tangente
     * @param degre = 1
     * @return 
     */
    public Point3D normale1(Chemin c, double t,int degre) {
        // Calcul de la direction générale de la courbe:
        /*for(double  a=0; a<Math.log((long)(1/approxTangente)); a++)
        {
            Point3D p = c.calculerPoint3D(t);
        }*/
                
        if (degre > 1) {
            System.out.println("Degré est supérieur à 1: pas d'implémentation actuelle, ici, maintenant");
        }
        Point3D p;
        try {

            p = c.calculerVitesse3D(t);

            return p;

        } catch (Exception ex) {
            Point3D p1 = tangente(c, t, degre);
            Point3D p2 = c.calculerPoint3D(t + approxNormale);

            p = (p2.moins(p1)).norme1();
        }

        return p;
        
        
    }
}