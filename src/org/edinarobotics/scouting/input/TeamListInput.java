package org.edinarobotics.scouting.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.edinarobotics.scouting.output.DefaultWorkspace;

/**
 *
 * @author aoneill
 */
public class TeamListInput
{
  private static String filePath = 
          DefaultWorkspace.location + DefaultWorkspace.teamListFile;
  
  private static ArrayList<String> teamList = new ArrayList();
  
  public TeamListInput()
  {
    File in = new File(filePath);
    
    Scanner scan;
    try
    {
      scan = new Scanner(in);
    }
    catch (FileNotFoundException ex)
    {
      JOptionPane.showMessageDialog(new JPanel(), 
                "Could not open the Team List File!", 
                "Error!", JOptionPane.ERROR_MESSAGE);
      return;
    }
    
    teamList.clear();
    
    while(scan.hasNext())
      teamList.add(scan.nextLine());
    scan.close();
    
    if(teamList.isEmpty())
    {
      JOptionPane.showMessageDialog(new JPanel(), 
                "There are no teams!", 
                "Error!", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
    }
  }
  
  public ArrayList<String> getTeamList()
  {
    return teamList;
  }
}
