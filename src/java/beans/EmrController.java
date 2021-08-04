/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author buddhika
 */
@Named(value = "emrController")
@SessionScoped
public class EmrController implements Serializable {

    /**
     * Creates a new instance of EmrController
     */
    public EmrController() {
    }
    
}
