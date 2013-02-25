package org.edinarobotics.scouting.output;

import org.edinarobotics.scouting.datatypes.MatchData;
import org.edinarobotics.scouting.datatypes.TeamData;

/**
 *
 * @author aoneill
 */
public class OutFiles
{
  public static String extension = ".csv";
  public static String separator = "|";
  
  @SuppressWarnings("ResultOfObjectAllocationIgnored")
  public OutFiles(TeamData[] teams, MatchData match)
  {
    new MatchFileOut(match);
    
    for(TeamData team : teams)
    {
      new TeamFileOut(team, match);
      new CommentFileOut(team);
    }
    
  }
}
