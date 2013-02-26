package org.edinarobotics.scouting.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
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
    
    File out = new File(path);
    try 
    {
      out.createNewFile();
    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(new JPanel(), 
              "Could not generate Match File!", 
              "Error!", JOptionPane.ERROR_MESSAGE);
      return;
    }
    
    ArrayList<String> fileContent = new ArrayList();
    
    String insertLine1 = String.format(
            "%s%s%d%s%d%s%d%s%d",
            "blue", OutFiles.separator, 
            match.blueTeam1, OutFiles.separator,
            match.blueTeam2, OutFiles.separator,
            match.blueTeam3, OutFiles.separator,
            match.blueAllianceScore);
    
    String insertLine2 = String.format(
            "%s%s%d%s%d%s%d%s%d",
            "red", OutFiles.separator, 
            match.redTeam1, OutFiles.separator,
            match.redTeam2, OutFiles.separator,
            match.redTeam3, OutFiles.separator,
            match.redAllianceScore);
    
    fileContent.add(insertLine1);
    fileContent.add(System.getProperty("line.separator"));
    fileContent.add(insertLine2);
    
    Formatter format;
    try 
    {
      format = new Formatter(out);
    }
    catch (FileNotFoundException ex) 
    {
      JOptionPane.showMessageDialog(new JPanel(), 
                "Could not open the Match File!", 
                "Error!", JOptionPane.ERROR_MESSAGE);
      return;
    }
    
    for(String data : fileContent)
      format.format("%s", data);
    format.close();
  }
}
