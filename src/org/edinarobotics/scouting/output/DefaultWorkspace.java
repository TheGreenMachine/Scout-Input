package org.edinarobotics.scouting.output;

import java.awt.Component;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author aoneill
 */
public class DefaultWorkspace
{
  public static String imagesDirPath = "/images";
  public static String matchesDirPath = "/matches";
  public static String teamsDirPath = "/teams";
  public static String commentsDirPath = "/comments";
  public static String teamListFile = "/TeamList.txt";
  
  public static String location = System.getProperty("user.dir");
  
  public DefaultWorkspace()
  {
    try
    {
      new File(location + imagesDirPath).mkdir();
      new File(location + matchesDirPath).mkdir();
      new File(location + teamsDirPath).mkdir();
      new File(location + teamListFile).createNewFile();
    }
    catch(Exception e) 
    {
      JOptionPane.showMessageDialog(new JPanel(), 
                "Could not generate Default Workspace!", 
                "Error!", JOptionPane.ERROR_MESSAGE);
    }
  }
}
