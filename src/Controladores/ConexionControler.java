
package Controladores;

import Modelos.Coneccion;
import Vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConexionControler implements ActionListener{
    frmLogIn VistaLogin;
    frmPrincipal VistaPrincipal;
    Coneccion ModeloConexion;

    public ConexionControler(frmLogIn VistaLogin, frmPrincipal VistaPrincipal, Coneccion ModeloConexion) {
        this.VistaLogin = VistaLogin;
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloConexion = ModeloConexion;
        //LEVANTAR FORMULARIO PRINCIPAL
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        //Proner a la escucha boton principal
        this.VistaLogin.btnAceptar.addActionListener(this);
        
        this.VistaLogin.setLocationRelativeTo(null);
        this.VistaLogin.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
       if(arg0.getSource() == this.VistaLogin.btnAceptar)
       
       this.ModeloConexion.Conectar(this.VistaLogin.txtUser.getText(),
               this.VistaLogin.txtPass.getText());
       
    }
}
