package org.edinarobotics.scouting.output;

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
      File imagesDir = new File(location + imagesDirPath);
      File matchesDir = new File(location + matchesDirPath);
      File teamsDir = new File(location + teamsDirPath);
      File teamList = new File(location + teamListFile);
      
      if(!(imagesDir.exists() && imagesDir.isDirectory()))
        imagesDir.mkdir();
      
      if(!(matchesDir.exists() && matchesDir.isDirectory()))
        matchesDir.mkdir();
      
      if(!(teamsDir.exists() && teamsDir.isDirectory()))
        teamsDir.mkdir();
      
      if(!(teamList.exists() && teamList.isFile()))
        teamList.mkdir();
    }
    catch(Exception e) 
    {
      JOptionPane.showMessageDialog(new JPanel(), 
                "Could not generate Default Workspace!", 
                "Error!", JOptionPane.ERROR_MESSAGE);
    }
  }
}
