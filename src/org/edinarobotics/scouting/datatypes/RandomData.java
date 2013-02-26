package org.edinarobotics.scouting.datatypes;

import java.util.Random;
import org.edinarobotics.scouting.gui.TeamInputPanel;

/**
 *
 * @author aoneill
 */
public class RandomData 
{
  private static int AUTO_HIGH_GOAL_LIMIT = 7;
  private static int AUTO_MIDDLE_GOAL_LIMIT = 5;
  private static int AUTO_LOW_GOAL_LIMIT = 3;
  
  private static int TELEOP_PYRAMID_GOAL_LIMIT = 5;
  private static int TELEOP_HIGH_GOAL_LIMIT = 20;
  private static int TELEOP_MIDDLE_GOAL_LIMIT = 15;
  private static int TELEOP_LOW_GOAL_LIMIT = 10;
  
  public int teamNum;
  
  public int autoHighGoal;
  public int autoMiddleGoal;
  public int autoLowGoal;
  
  public int teleopPyramidGoal;
  public int teleopHighGoal;
  public int teleopMiddleGoal;
  public int teleopLowGoal;
  
  public boolean teleopPyramdidNo = false;
  public boolean teleopPyramdid10 = false;
  public boolean teleopPyramdid20 = false;
  public boolean teleopPyramdid30 = false;
  
  public RandomData()
  {
    teamNum = Integer.parseInt(TeamInputPanel.teamList[
            new Random().nextInt(TeamInputPanel.teamList.length)]);
    
    autoHighGoal = new Random().nextInt(AUTO_HIGH_GOAL_LIMIT);
    autoMiddleGoal = new Random().nextInt(AUTO_MIDDLE_GOAL_LIMIT);
    autoLowGoal = new Random().nextInt(AUTO_LOW_GOAL_LIMIT);
    
    teleopPyramidGoal = new Random().nextInt(TELEOP_PYRAMID_GOAL_LIMIT);
    teleopHighGoal = new Random().nextInt(TELEOP_HIGH_GOAL_LIMIT);
    teleopMiddleGoal = new Random().nextInt(TELEOP_MIDDLE_GOAL_LIMIT);
    teleopLowGoal = new Random().nextInt(TELEOP_LOW_GOAL_LIMIT);
    
    switch(new Random().nextInt(4))
    {
      case 0:
        teleopPyramdidNo = true;
        break;
        
      case 1:
        teleopPyramdid10 = true;
        break;
        
      case 2:
        teleopPyramdid20 = true;
        break;
        
      case 3:
        teleopPyramdid30 = true;
        break;
    }
  }
}
