package steve;

import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.geometry.Primitive;
import com.sun.j3d.utils.geometry.Sphere;
import java.io.File;
import java.io.IOException;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.PointLight;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;

public class crearEscenaGrafica {
    int paraTextura = Primitive.GENERATE_NORMALS + Primitive.GENERATE_TEXTURE_COORDS;
    textura textura = new textura();
    
    
    
    BranchGroup bgRaiz = new BranchGroup();
    
    TransformGroup tgSpHomDer;
    TransformGroup tgSpHomIzq;
    TransformGroup tgSpCodoDer;
    TransformGroup tgSpCodoIzq;
    TransformGroup tgSpMusDer;
    TransformGroup tgSpPrnDer;
    TransformGroup tgSpMusIzq;
    TransformGroup tgSpPrnIzq;
    TransformGroup tgPanza;
    TransformGroup tgMundo;
    
    
    int pasos;
    int baile=0;
    public crearEscenaGrafica() {   
        
        
        
        bgRaiz.addChild(FondoUniverso.crearFondo(new Color3f(0.5f, 0.5f, 1.0f))); // Color azul claro

        color c = new color();
        Transform3D t3dPanza = new Transform3D();
        Transform3D t3dCabeza = new Transform3D();
        Transform3D t3dHomDer = new Transform3D();
        Transform3D t3dSpHomDer = new Transform3D();
        Transform3D t3dHomIzq = new Transform3D();
        Transform3D t3dSpHomIzq = new Transform3D();
        Transform3D t3dSpCodoDer = new Transform3D();
        Transform3D t3dSpCodoIzq = new Transform3D();
        Transform3D t3dBraDer = new Transform3D();
        Transform3D t3dBraIzq = new Transform3D();
        Transform3D t3dMusDer = new Transform3D();
        Transform3D t3dMusIzq = new Transform3D();
        Transform3D t3dSpMusDer = new Transform3D();
        Transform3D t3dSpMusIzq = new Transform3D();
        Transform3D t3dPrnDer = new Transform3D();
        Transform3D t3dSpPrnDer = new Transform3D();
        Transform3D t3dPrnIzq = new Transform3D();
        Transform3D t3dSpPrnIzq = new Transform3D();
        
        
        t3dPanza.set(new Vector3d(0.0f,0.0f,0.0f));
        t3dCabeza.set(new Vector3d(0.0f, 0.5f, 0.0f));
        t3dHomDer.set(new Vector3d(0.10f, -0.15f, 0.0f));
        t3dSpHomDer.set(new Vector3f(0.20f, 0.30f, 0.0f));
        t3dHomIzq.set(new Vector3d(-0.10f, -0.15f, 0.0f));
        t3dSpHomIzq.set(new Vector3f(-0.20f, 0.30f, 0.0f));
        t3dSpCodoDer.set(new Vector3f(0.0f, -0.15f, 0.0f));
        t3dSpCodoIzq.set(new Vector3f(0.0f, -0.15f, 0.0f));
        t3dBraDer.set(new Vector3d(0.0f, -0.15f, 0.0f));
        t3dBraIzq.set(new Vector3d(0.0f, -0.15f, 0.0f));
        t3dMusDer.set(new Vector3d(0.0f,-0.15f,0.0f));
        t3dSpMusDer.set(new Vector3d(0.10f,-0.30f,0.0f));
        t3dMusIzq.set(new Vector3d(0.0f,-0.15f,0.0f));
        t3dSpMusIzq.set(new Vector3d(-0.10f,-0.30f,0.0f));
        t3dPrnDer.set(new Vector3d(0.0f,-0.15f,0.0f));
        t3dSpPrnDer.set(new Vector3d(0.0f,-0.15f,0.0f));
        t3dPrnIzq.set(new Vector3d(0.0f,-0.15f,0.0f));
        t3dSpPrnIzq.set(new Vector3d(0.0f,-0.15f,0.0f));
        
        tgMundo = new TransformGroup();
        tgPanza = new TransformGroup(t3dPanza);
        
        TransformGroup tgCabeza = new TransformGroup(t3dCabeza);
        TransformGroup tgHomDer = new TransformGroup(t3dHomDer);
        TransformGroup tgHomIzq = new TransformGroup(t3dHomIzq);
        TransformGroup tgBraDer = new TransformGroup(t3dBraDer);
        TransformGroup tgBraIzq = new TransformGroup(t3dBraIzq);
        TransformGroup tgMusDer = new TransformGroup(t3dMusDer);
        TransformGroup tgMusIzq = new TransformGroup(t3dMusIzq);
        TransformGroup tgPrnDer = new TransformGroup(t3dPrnDer);
        TransformGroup tgPrnIzq = new TransformGroup(t3dPrnIzq);
        
        tgSpHomDer = new TransformGroup(t3dSpHomDer);
        tgSpHomIzq = new TransformGroup(t3dSpHomIzq);
        tgSpCodoDer = new TransformGroup(t3dSpCodoDer);
        tgSpCodoIzq = new TransformGroup(t3dSpCodoIzq);
        tgSpMusDer = new  TransformGroup(t3dSpMusDer);
        tgSpMusIzq = new TransformGroup(t3dSpMusIzq);
        tgSpPrnDer = new TransformGroup(t3dSpPrnDer);
        tgSpPrnIzq = new TransformGroup(t3dSpPrnIzq);
        
        tgMundo.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tgPanza.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tgSpHomDer.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tgSpHomIzq.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tgSpCodoDer.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tgSpCodoIzq.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tgSpMusDer.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tgSpMusIzq.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tgSpPrnDer.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tgSpPrnIzq.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        
        Box mundo = new Box(-2.0f, 2.0f, 4.0f, paraTextura,textura.crearTexturas("FPjpg.jpg"));
        mundo.setAppearance(1,textura.crearTexturas("F1.jpg"));
        mundo.setAppearance(4,textura.crearTexturas("lamina.jpg"));
        mundo.setAppearance(5,textura.crearTexturas("piso.jpg"));
        mundo.setAppearance(0,textura.crearTexturas("eden.jpg"));
        Box bxPanza = new Box(0.20f, 0.3f, 0.1f, paraTextura,textura.crearTexturas("aTorso.jpg"));
        bxPanza.setAppearance(0,textura.crearTexturas("fTorso.jpg"));
        bxPanza.setAppearance(2,textura.crearTexturas("lTorso.jpg"));
        bxPanza.setAppearance(3,textura.crearTexturas("lTorso.jpg"));
        bxPanza.setAppearance(4,textura.crearTexturas("lTorso.jpg"));
        bxPanza.setAppearance(5,textura.crearTexturas("bTorso.jpg"));
        Box bxCabeza = new Box(0.24f, 0.2f, 0.14f, paraTextura,textura.crearTexturas("pelo.jpg"));
        bxCabeza.setAppearance(0,textura.crearTexturas("caraStve.jpg"));
        Box bxHomDer = new Box(0.1f, 0.15f, 0.1f, paraTextura, textura.crearTexturas("lTorso.jpg"));
        bxHomDer.setAppearance(1,textura.crearTexturas("brazoDes.jpg"));
        bxHomDer.setAppearance(5,textura.crearTexturas("brazoDes.jpg"));
        Box bxHomIzq = new Box(0.1f, 0.15f, 0.1f, paraTextura, textura.crearTexturas("lTorso.jpg"));
        bxHomIzq.setAppearance(1,textura.crearTexturas("brazoDes.jpg"));
        bxHomIzq.setAppearance(5,textura.crearTexturas("brazoDes.jpg"));
        Box bxBraDer = new Box(0.1f, 0.15f, 0.1f, paraTextura, textura.crearTexturas("homTraje.jpg"));
        bxBraDer.setAppearance(1,textura.crearTexturas("brazoDes.jpg"));
        bxBraDer.setAppearance(4,textura.crearTexturas("brazoDes.jpg"));
        bxBraDer.setAppearance(5,textura.crearTexturas("brazoDes.jpg"));
        Box bxBraIzq = new Box(0.1f, 0.15f, 0.1f, paraTextura, textura.crearTexturas("homTraje.jpg"));
        bxBraIzq.setAppearance(1,textura.crearTexturas("brazoDes.jpg"));
        bxBraIzq.setAppearance(4,textura.crearTexturas("brazoDes.jpg"));
        bxBraIzq.setAppearance(5,textura.crearTexturas("brazoDes.jpg"));
        Box bxMusDer = new Box(0.10f, 0.15f, 0.1f, paraTextura, textura.crearTexturas("lTorso.jpg"));
        bxMusDer.setAppearance(1,textura.crearTexturas("pomaDer.jpg"));
        bxMusDer.setAppearance(4,textura.crearTexturas("bTorso.jpg"));
        bxMusDer.setAppearance(5,textura.crearTexturas("brazoDes.jpg"));
        Box bxMusIzq = new Box(0.10f,0.15f,0.1f, paraTextura, textura.crearTexturas("lTorso.jpg"));
        bxMusIzq.setAppearance(1,textura.crearTexturas("pomaIzq.jpg"));
        bxMusIzq.setAppearance(4,textura.crearTexturas("bTorso.jpg"));
        bxMusIzq.setAppearance(5,textura.crearTexturas("brazoDes.jpg"));
        Box bxPrnDer = new Box(0.10f, 0.15f, 0.1f, paraTextura, textura.crearTexturas("pie.jpg"));
        bxPrnDer.setAppearance(1,textura.crearTexturas("pieTra.jpg"));
        bxPrnDer.setAppearance(4,textura.crearTexturas("brazoDes.jpg"));
        bxPrnDer.setAppearance(5,textura.crearTexturas("lTorso.jpg"));
        Box bxPrnIzq = new Box(0.10f, 0.15f, 0.1f, paraTextura, textura.crearTexturas("pie.jpg"));
        bxPrnIzq.setAppearance(1,textura.crearTexturas("pieTra.jpg"));
        bxPrnIzq.setAppearance(4,textura.crearTexturas("brazoDes.jpg"));
        bxPrnIzq.setAppearance(5,textura.crearTexturas("lTorso.jpg"));
        
        Sphere spHomDer = new Sphere(0.01f, c.setColor(255, 0, 0));
        Sphere spHomIzq = new Sphere(0.01f, c.setColor(255, 0, 0));
        Sphere SpCodoDer = new Sphere(0.01f, c.setColor(255, 0, 0));
        Sphere SpCodoIzq = new Sphere(0.01f, c.setColor(255, 0, 0));
        Sphere SpMusDer = new Sphere(0.01f, c.setColor(255, 0, 0));
        Sphere SpMusIzq = new Sphere(0.01f, c.setColor(255, 0, 0));
        Sphere spPrnDer = new Sphere(0.01f, c.setColor(255, 0, 0));
        Sphere spPrnIzq = new Sphere(0.01f, c.setColor(255, 0, 0));        
        
        
        EscalarTG(tgPanza, 0.5f);
        MouseRotate myMouseRotate = new MouseRotate();
        myMouseRotate.setTransformGroup(tgMundo);
        myMouseRotate.setSchedulingBounds(new BoundingSphere());
        
        bgRaiz.addChild(myMouseRotate);
        bgRaiz.addChild(tgPanza);
        bgRaiz.addChild(tgMundo);
        tgMundo.addChild(mundo);
        
        tgPanza.addChild(bxPanza);
        tgPanza.addChild(tgCabeza);
        tgPanza.addChild(tgSpHomDer);
        tgPanza.addChild(tgSpHomIzq);
        tgPanza.addChild(tgSpMusDer);
        tgPanza.addChild(tgSpMusIzq);
        tgSpHomDer.addChild(tgHomDer);
        tgSpHomIzq.addChild(tgHomIzq);
        tgSpHomDer.addChild(spHomDer);
        tgSpHomIzq.addChild(spHomIzq);
        tgSpMusDer.addChild(tgMusDer);
        tgSpMusIzq.addChild(tgMusIzq);
        tgSpMusDer.addChild(SpMusDer);
        tgSpMusIzq.addChild(SpMusIzq);
        tgHomDer.addChild(bxHomDer);
        tgHomIzq.addChild(bxHomIzq);
        tgMusDer.addChild(bxMusDer);
        tgMusIzq.addChild(bxMusIzq);
        tgHomDer.addChild(tgSpCodoDer);
        tgHomIzq.addChild(tgSpCodoIzq);
        tgMusDer.addChild(tgSpPrnDer);
        tgMusIzq.addChild(tgSpPrnIzq);
        
        tgSpCodoDer.addChild(tgBraDer);
        tgSpCodoIzq.addChild(tgBraIzq);
        tgSpCodoDer.addChild(SpCodoDer);
        tgSpCodoIzq.addChild(SpCodoIzq);
        tgSpPrnDer.addChild(tgPrnDer);
        tgSpPrnIzq.addChild(tgPrnIzq);
        tgSpPrnDer.addChild(spPrnDer);
        tgSpPrnIzq.addChild(spPrnIzq);
        
        tgBraDer.addChild(bxBraDer);
        tgBraIzq.addChild(bxBraIzq);
        tgPrnDer.addChild(bxPrnDer);
        tgPrnIzq.addChild(bxPrnIzq);
        tgCabeza.addChild(bxCabeza);
        
        
        
        float intensidad = 1.0f;
      
        addPointLight(-5.0f, 50.0f, 50.0f, 255*intensidad, 0*intensidad, 0*intensidad);
        addPointLight(2.0f, -50.0f, -50.0f, 255*intensidad, 0*intensidad, 0*intensidad);

    }
    
    public void EscalarTG(TransformGroup tg, float x){
        Transform3D leer = new Transform3D();
        Transform3D mover = new Transform3D();
        tg.getTransform(leer);
        
        mover.setScale(x);
        leer.mul(mover);
        tg.setTransform(leer);
    }
    
    public void girarTG(TransformGroup tg, int grados, String eje)
    {
        Transform3D leerBrazo = new Transform3D();
        Transform3D moverBrazo = new Transform3D();
        tg.getTransform(leerBrazo);
        
        if(eje.equals("X"))
        {
            moverBrazo.rotX(Math.PI/180*grados);
        }
        if(eje.equals("Y"))
        {
            moverBrazo.rotY(Math.PI/180*grados);
        }
        if(eje.equals("Z"))
        {
            moverBrazo.rotZ(Math.PI/180*grados);
            //moverBrazo.set(new Vector3d(0.0f,0.0f,0.1f));
        }
        
        leerBrazo.mul(moverBrazo);
        tg.setTransform(leerBrazo);
       
    }
    
    public void  TrasladarTg(TransformGroup tg, float x, float y, float z){
        Transform3D leer = new Transform3D();
        Transform3D mover = new Transform3D();
        tg.getTransform(leer);
        
        mover.set(new Vector3f(x,y,z));
        leer.mul(mover);
        tg.setTransform(leer);
    }
    
    public void caminar(){
        girarTG(tgPanza,0,"Z");
        if (pasos<10){
            girarTG(tgSpMusDer,-5,"X");
            girarTG(tgSpPrnDer,5,"X");
        
            girarTG(tgSpMusIzq,5,"X");
            girarTG(tgSpPrnIzq,5,"X"); 
            
            
            girarTG(tgSpHomDer, 5, "X");
            girarTG(tgSpCodoDer, -5, "X");
            
            girarTG(tgSpHomIzq, -5, "X");
            girarTG(tgSpCodoIzq, -5, "X");
        }else
            if(pasos<20){
                girarTG(tgSpMusDer,5,"X");
                girarTG(tgSpPrnDer,-5,"X");
        
                girarTG(tgSpMusIzq,-5,"X");
                girarTG(tgSpPrnIzq,-5,"X"); 
                
                girarTG(tgSpHomDer, -5, "X");
                girarTG(tgSpCodoDer, 5, "X");

                girarTG(tgSpHomIzq, 5, "X");
                girarTG(tgSpCodoIzq, 5, "X");
            } else
                if (pasos<30){
                    girarTG(tgSpMusDer,5,"X");
                    girarTG(tgSpPrnDer,5,"X");

                    girarTG(tgSpMusIzq,-5,"X");
                    girarTG(tgSpPrnIzq,5,"X");   
                    
                    girarTG(tgSpHomDer, -5, "X");
                    girarTG(tgSpCodoDer,-5, "X");

                    girarTG(tgSpHomIzq, 5, "X");
                    girarTG(tgSpCodoIzq, -5, "X");
                }else
                    if(pasos<40){
                        girarTG(tgSpMusDer,-5,"X");
                        girarTG(tgSpPrnDer,-5,"X");

                        girarTG(tgSpMusIzq,5,"X");
                        girarTG(tgSpPrnIzq,-5,"X"); 
                        
                        girarTG(tgSpHomDer, 5, "X");
                        girarTG(tgSpCodoDer, 5, "X");

                        girarTG(tgSpHomIzq, -5, "X");
                        girarTG(tgSpCodoIzq, 5, "X");
                    }else pasos = 0;
        
                    pasos++;
                    TrasladarTg(tgPanza, 0.0f, 0.0f, 0.0f);
    }
    public void bailar(){

        if(baile<10){
            girarTG(tgSpMusIzq, -2, "Y");
            girarTG(tgSpMusDer, 2, "Y");
            girarTG(tgSpMusIzq,-1,"Z");
            girarTG(tgSpMusDer,1,"Z");
            girarTG(tgSpMusIzq,-6,"X");
            girarTG(tgSpMusDer,-6,"X");
            girarTG(tgSpPrnDer,6,"X");
            girarTG(tgSpPrnIzq,6,"X");
            girarTG(tgSpHomIzq,-6,"Z");
            girarTG(tgSpHomIzq,-6,"X");
            girarTG(tgSpCodoIzq,4,"Z");
            girarTG(tgSpHomDer,-2,"Z");
            girarTG(tgSpHomDer,-2,"X");
            TrasladarTg(tgPanza, 0.0f, -0.01f, 0.0f);
            girarTG(tgPanza, 10, "Y");
        }else 
            if(baile<20){
                girarTG(tgSpHomDer,-5,"X");
                girarTG(tgSpMusDer, 5, "X");
                girarTG(tgSpMusIzq, 5, "X");
                TrasladarTg(tgPanza, 0.0f, 0.01f, 0.0f);
                girarTG(tgSpPrnDer,-6,"X");
                girarTG(tgSpPrnIzq,-6,"X");
                girarTG(tgSpHomIzq,5,"X");
                girarTG(tgSpCodoIzq,5,"Z");
                girarTG(tgPanza, 10, "Y");
            }else
                if(baile<30){
                    girarTG(tgSpHomDer,5,"X");
                    girarTG(tgSpMusDer, -5, "X");
                    girarTG(tgSpMusIzq, -5, "X");
                    TrasladarTg(tgPanza, 0.0f, -0.01f, 0.0f);
                    girarTG(tgSpPrnDer,6,"X");
                    girarTG(tgSpPrnIzq,6,"X");
                    girarTG(tgSpHomIzq,-5,"X");
                    girarTG(tgSpCodoIzq,-5,"Z");
                    girarTG(tgPanza, 10, "Y");
                }else
                    if(baile<40){
                        girarTG(tgSpHomDer,-5,"X");
                        girarTG(tgSpMusDer, 5, "X");
                        girarTG(tgSpMusIzq, 5, "X");
                        TrasladarTg(tgPanza, 0.0f, 0.01f, 0.0f);
                        girarTG(tgSpPrnDer,-6,"X");
                        girarTG(tgSpPrnIzq,-6,"X");
                        girarTG(tgSpHomIzq,5,"X");
                        girarTG(tgSpCodoIzq,5,"Z");
                        girarTG(tgPanza, 10, "Y");
                    }else
                        if(baile<50){
                            girarTG(tgSpHomDer,5,"X");
                            girarTG(tgSpMusDer, -5, "X");
                            girarTG(tgSpMusIzq, -5, "X");
                            TrasladarTg(tgPanza, 0.0f, -0.01f, 0.0f);
                            girarTG(tgSpPrnDer,6,"X");
                            girarTG(tgSpPrnIzq,6,"X");
                            girarTG(tgSpHomIzq,-5,"X");
                            girarTG(tgSpCodoIzq,-5,"Z");
                            girarTG(tgPanza, 10, "Y");
                        }else
                            if(baile<60){
                                girarTG(tgSpHomDer,-5,"X");
                                girarTG(tgSpMusDer, 5, "X");
                                girarTG(tgSpMusIzq, 5, "X");
                                TrasladarTg(tgPanza, 0.0f, 0.01f, 0.0f);
                                girarTG(tgSpPrnDer,-6,"X");
                                girarTG(tgSpPrnIzq,-6,"X");
                                girarTG(tgSpHomIzq,5,"X");
                                girarTG(tgSpCodoIzq,5,"Z");
                                girarTG(tgPanza, 10, "Y");
                            }else
                                if(baile<70){
                                    girarTG(tgSpHomDer,5,"X");
                                    girarTG(tgSpMusDer, -5, "X");
                                    girarTG(tgSpMusIzq, -5, "X");
                                    TrasladarTg(tgPanza, 0.0f, -0.01f, 0.0f);
                                    girarTG(tgSpPrnDer,6,"X");
                                    girarTG(tgSpPrnIzq,6,"X");
                                    girarTG(tgSpHomIzq,-5,"X");
                                    girarTG(tgSpCodoIzq,-5,"Z");
                                    girarTG(tgPanza, 10, "Y");
                                }else
                                    if(baile<80){
                                        girarTG(tgSpHomDer,-5,"X");
                                        girarTG(tgSpMusDer, 5, "X");
                                        girarTG(tgSpMusIzq, 5, "X");
                                        TrasladarTg(tgPanza, 0.0f, 0.01f, 0.0f);
                                        girarTG(tgSpPrnDer,-6,"X");
                                        girarTG(tgSpPrnIzq,-6,"X");
                                        girarTG(tgSpHomIzq,5,"X");
                                        girarTG(tgSpCodoIzq,5,"Z");
                                        girarTG(tgPanza, 10, "Y");
                                    }else
                                        if(baile<90){
                                            girarTG(tgSpHomDer,5,"X");
                                            girarTG(tgSpMusDer, -5, "X");
                                            girarTG(tgSpMusIzq, -5, "X");
                                            TrasladarTg(tgPanza, 0.0f, -0.01f, 0.0f);
                                            girarTG(tgSpPrnDer,6,"X");
                                            girarTG(tgSpPrnIzq,6,"X");
                                            girarTG(tgSpHomIzq,-5,"X");
                                            girarTG(tgSpCodoIzq,-5,"Z");
                                            girarTG(tgPanza, 10, "Y");
                                        }else{
                                            baile = 0;
                                            resetearPosiciones();
                                            TrasladarTg(tgPanza, 0.0f, 0.1f, 0.0f);
                                        }

        baile++;
    }
    
    public void resetearPosiciones() {
    // Brazos derechos
    Transform3D t3d = new Transform3D();
    t3d.set(new Vector3f(0.20f, 0.30f, 0.0f));
    tgSpHomDer.setTransform(t3d);
    
    t3d.set(new Vector3f(0.0f, -0.15f, 0.0f));
    tgSpCodoDer.setTransform(t3d);
    
    // Brazos izquierdos
    t3d.set(new Vector3f(-0.20f, 0.30f, 0.0f));
    tgSpHomIzq.setTransform(t3d);
    
    t3d.set(new Vector3f(0.0f, -0.15f, 0.0f));
    tgSpCodoIzq.setTransform(t3d);
    
    // Piernas derechas
    t3d.set(new Vector3d(0.10f,-0.30f,0.0f));
    tgSpMusDer.setTransform(t3d);
    
    t3d.set(new Vector3d(0.0f,-0.15f,0.0f));
    tgSpPrnDer.setTransform(t3d);
    
    // Piernas izquierdas
    t3d.set(new Vector3d(-0.10f,-0.30f,0.0f));
    tgSpMusIzq.setTransform(t3d);
    
    t3d.set(new Vector3d(0.0f,-0.15f,0.0f));
    tgSpPrnIzq.setTransform(t3d);
}
    
    private javax.sound.sampled.Clip clip;
    public void cargarSonido(String ruta) {
        try {
            File archivo = new File(ruta);
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(archivo);
            clip = AudioSystem.getClip();
            clip.open(audioInput);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    public void reproducir() {
        if (clip != null) {
            clip.setFramePosition(0); // Reinicia el sonido
            clip.start();
        }
    }
    
    public void addPointLight(float x, float y, float z, float r, float g, float b) {
        BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
        
        PointLight pointLight = new PointLight(
            new Color3f(r, g, b),
            new Point3f(x, y, z),
            new Point3f(0.0f, 1.0f, 0.0f)  // Attenuation (constant, linear, quadratic)
        );
        pointLight.setInfluencingBounds(bounds);
        bgRaiz.addChild(pointLight);
    }

}