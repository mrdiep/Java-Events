/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UILayer;

/**
 *
 * @author diepnguyenv
 */
public interface IEventDataReceived {
    void OnAdded(String name, String date, String timeFrom, String timeTo, String note);
    void OnCancelled();
}


    
