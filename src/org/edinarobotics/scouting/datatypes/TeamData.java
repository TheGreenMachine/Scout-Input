package org.edinarobotics.scouting.datatypes;

import org.edinarobotics.scouting.gui.TeamInputPanel;

/**
 *
 * @author aoneill
 */
public class TeamData
{
  public int teamNum;
  public int autoScore;
  public int teleopScore;
  public int pyramidAttempt;
  public int pyramidScore;
  
  private boolean valid;
  
  public TeamData(TeamInputPanel panel)
  {
    this.teamNum = panel.getTeamNumber();
    this.autoScore = panel.getAutoScore();
    this.teleopScore = panel.getTeleOpScore();
    this.pyramidAttempt = panel.getPyramidAttempt();
    this.pyramidScore = panel.getPyramidScore();
    
    this.valid = panel.isValidData();
  }
  
  public boolean isValidData()
  {
    return valid;
  }
}
