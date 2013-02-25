/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edinarobotics.scouting.output;

import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.edinarobotics.scouting.datatypes.MatchData;

/**
 *
 * @author aoneill
 */
public class MatchFileOut
{
  private static String folderPath = 
          DefaultWorkspace.location + DefaultWorkspace.matchesDirPath;
  
  public MatchFileOut(MatchData match)
  { 
    String path = folderPath + "/" + String.valueOf(match.matchNum) + OutFiles.extension;
    if(!exists(match.matchNum))
      try 
      {
        new File(path).createNewFile();
      }
      catch (Exception e)
      {
        JOptionPane.showMessageDialog(new JPanel(), 
                "Could not generate Match File!", 
                "Error!", JOptionPane.ERROR_MESSAGE);
      }
  }
  
  private boolean exists(int matchNum)
  {
    String path = folderPath + "/" + String.valueOf(matchNum) + OutFiles.extension;
    return new File(path).exists();
  }
}
