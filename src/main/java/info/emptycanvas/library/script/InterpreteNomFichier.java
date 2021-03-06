/*

 Copyright (C) 2010-2013  DAHMEN, Manuel, Daniel

 This library is free software; you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public
 License as published by the Free Software Foundation; either
 version 2.1 of the License, or (at your option) any later version.

 This library is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public
 License along with this library; if not, write to the Free Software
 Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA

 */
/**
 *
 */
package info.emptycanvas.library.script;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author MANUEL DAHMEN
 *
 * dev
 *
 * 27 oct. 2011
 *
 */
public class InterpreteNomFichier implements Interprete {

    private int pos;
    private String repertoire;

    /*
     * (non-Javadoc) @see
     * be.ibiiztera.md.pmatrix.pushmatrix.scripts.Interprete#constant()
     */
    @Override
    public InterpreteConstants constant() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc) @see
     * be.ibiiztera.md.pmatrix.pushmatrix.scripts.Interprete#getPosition()
     */
    @Override
    public int getPosition() {
        return pos;
    }

    @Override
    public Object interprete(String text, int pos) throws InterpreteException {
        try {
            int pos1 = text.indexOf("\"", pos);
            int pos2 = text.indexOf("\"", pos1 + 1);

            this.pos = pos2 + 1;

            return InterpreteIO.getFile(text.substring(pos1 + 1, pos2), repertoire);
            //new File(repertoire+File.separator+text.substring(pos1+1, pos2));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InterpreteNomFichier.class.getName()).log(Level.SEVERE, null, ex);
            throw new InterpreteException(ex);
        }
    }

    /*
     * (non-Javadoc) @see
     * be.ibiiztera.md.pmatrix.pushmatrix.scripts.Interprete#setConstant(be.ibiiztera.md.pmatrix.pushmatrix.scripts.InterpreteConstants)
     */
    @Override
    public void setConstant(InterpreteConstants c) {
        // TODO Auto-generated method stub
    }

    @Override
    public void setRepertoire(String r) {
        this.repertoire = r;
    }
    /*
     * (non-Javadoc) @see
     * be.ibiiztera.md.pmatrix.pushmatrix.scripts.Interprete#interprete(java.lang.String,
     * int)
     */

}
