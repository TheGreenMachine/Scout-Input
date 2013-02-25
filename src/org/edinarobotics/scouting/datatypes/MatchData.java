package org.edinarobotics.scouting.datatypes;

/**
 *
 * @author aoneill
 */
public class MatchData 
{
  public int matchNum;
  
  public int blueTeam1;
  public int blueTeam2;
  public int blueTeam3;
  public int blueAllianceScore;
  
  public int redTeam1;
  public int redTeam2;
  public int redTeam3;
  public int redAllianceScore;
  
  public MatchData(int matchNum, int blueTeam1, int blueTeam2, int blueTeam3,
          int blueAllianceScore, int redTeam1, int redTeam2, int redTeam3,
          int redAllianceScore)
  {
    this.matchNum = matchNum;
    
    this.blueTeam1 = blueTeam1;
    this.blueTeam2 = blueTeam2;
    this.blueTeam3 = blueTeam3;
    this.blueAllianceScore = blueAllianceScore;
    
    this.redTeam1 = redTeam1;
    this.redTeam2 = redTeam2;
    this.redTeam3 = redTeam3;
    this.redAllianceScore = redAllianceScore;
  }
}
