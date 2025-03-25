/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package steve;

/**
 *
 * @author rober
 */
import javax.media.j3d.*;
import javax.vecmath.*;

public class FondoUniverso {
    public static Background crearFondo(Color3f color) {
        Background fondo = new Background(color);
        fondo.setApplicationBounds(new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0));
        return fondo;
    }
}
