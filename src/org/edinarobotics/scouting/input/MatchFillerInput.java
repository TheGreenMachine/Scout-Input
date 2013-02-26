package org.edinarobotics.scouting.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.edinarobotics.scouting.gui.TeamInputPanel;
import org.edinarobotics.scouting.output.DefaultWorkspace;
import org.edinarobotics.scouting.output.OutFiles;

/**
 *
 * @author aoneill
 */
public class MatchFillerInput
{
  private static String filePath = 
          DefaultWorkspace.location + DefaultWorkspace.matchFillerFile;
  
  private static ArrayList<String> matchFiller = new ArrayList();
  
  public MatchFillerInput()
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
    
    matchFiller.clear();
    
    while(scan.hasNext())
      matchFiller.add(scan.nextLine());
    scan.close();
  }
  
  public String getTeams(int matchNum, int boxPos)
  {
    for(String match : matchFiller)
      if(match.startsWith(String.valueOf(matchNum) + OutFiles.separator))
      {
        StringTokenizer st = new StringTokenizer(match, OutFiles.separator);
        
        ArrayList<String> tokenized = new ArrayList();
        while(st.hasMoreElements())
          tokenized.add(st.nextToken());
        tokenized.remove(String.valueOf(matchNum));
        
        if(tokenized.size() != 6)
        {
          JOptionPane.showMessageDialog(new JPanel(), 
                "Bad line for Match #" + matchNum + " in Match Filler!", 
                "Error!", JOptionPane.ERROR_MESSAGE);
          return "";
        }
        
        if(!Arrays.asList(TeamInputPanel.teamList).contains(tokenized.get(boxPos)))
        {
          JOptionPane.showMessageDialog(new JPanel(), 
                "Bad line for Match #" + matchNum + " in Match Filler!", 
                "Error!", JOptionPane.ERROR_MESSAGE);
          return "";
        }
        
        return tokenized.get(boxPos);
      }
        
      return "";
  }
}
