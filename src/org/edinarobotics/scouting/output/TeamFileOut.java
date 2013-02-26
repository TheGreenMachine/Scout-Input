package org.edinarobotics.scouting.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.edinarobotics.scouting.datatypes.MatchData;
import org.edinarobotics.scouting.datatypes.TeamData;

/**
 *
 * @author aoneill
 */
public class TeamFileOut
{
  private static String folderPath = 
          DefaultWorkspace.location + DefaultWorkspace.teamsDirPath;
  
  public TeamFileOut(TeamData team, MatchData match)
  { 
    String path = folderPath + "/" + String.valueOf(team.teamNum) + OutFiles.extension;
    
    File out = new File(path);
    if(!out.exists())
      try 
      {
        out.createNewFile();
      }
      catch (Exception e)
      {
        JOptionPane.showMessageDialog(new JPanel(), 
                "Could not generate Team File!", 
                "Error!", JOptionPane.ERROR_MESSAGE);
        return;
      }
    
    Scanner scan;
    try
    {
      scan = new Scanner(out);
    }
    catch (FileNotFoundException ex)
    {
      JOptionPane.showMessageDialog(new JPanel(), 
                "Could not open the Team File!", 
                "Error!", JOptionPane.ERROR_MESSAGE);
      return;
    }
    
    ArrayList<String> fileContent = new ArrayList();
    while(scan.hasNext())
      fileContent.add(scan.nextLine());
    scan.close();
    
    String insertLine = String.format(
            "%s%s%d%s%d%s%d%s%d%s%s",
            match.matchNum, OutFiles.separator, 
            team.autoScore, OutFiles.separator,
            team.teleopScore, OutFiles.separator,
            team.pyramidAttempt, OutFiles.separator,
            team.pyramidScore, OutFiles.separator,
            team.penalties);
    
    if(fileContent.size() > 0)
      fileContent.add(System.getProperty("line.separator"));
    fileContent.add(insertLine);
    
    Formatter format;
    try 
    {
      format = new Formatter(out);
    }
    catch (FileNotFoundException ex) 
    {
      JOptionPane.showMessageDialog(new JPanel(), 
                "Could not open the Team File!", 
                "Error!", JOptionPane.ERROR_MESSAGE);
      return;
    }
    
    for(String data : fileContent)
      format.format("%s", data);
    format.close();
  }
}
