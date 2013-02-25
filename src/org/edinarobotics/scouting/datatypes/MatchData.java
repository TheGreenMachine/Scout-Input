package org.edinarobotics.scouting.datatypes;

/**
 *
 * @author aoneill
 */
public class MatchData 
{
  public int matchNum;
  public int blueAllianceScore;
  public int redAllianceScore;
  
  public MatchData(int matchNum, int blueAllianceScore, int redAllianceScore)
  {
    this.matchNum = matchNum;
    this.blueAllianceScore = blueAllianceScore;
    this.redAllianceScore = redAllianceScore;
  }
}
