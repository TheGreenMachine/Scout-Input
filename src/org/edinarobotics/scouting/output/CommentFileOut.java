package org.edinarobotics.scouting.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.edinarobotics.scouting.datatypes.TeamData;

/**
 *
 * @author aoneill
 */
public class CommentFileOut 
{
  private static String folderPath = 
          DefaultWorkspace.location + DefaultWorkspace.commentsDirPath;
  
  public CommentFileOut(TeamData team)
  {
    if(team.comments.equals(""))
      return;
    
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
                "Could not generate Comment File!", 
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
                "Could not open the Comment File!", 
                "Error!", JOptionPane.ERROR_MESSAGE);
      return;
    }
    
    ArrayList<String> fileContent = new ArrayList();
    while(scan.hasNext())
      fileContent.add(scan.nextLine());
    scan.close();
    
    String insertLine = String.format(
            "<pre>%s</pre>", team.comments);
    
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
                "Could not open the Comment File!", 
                "Error!", JOptionPane.ERROR_MESSAGE);
      return;
    }
    
    for(String data : fileContent)
      format.format("%s", data);
    format.close();
  }
}
