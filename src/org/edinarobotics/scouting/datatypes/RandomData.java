package org.edinarobotics.scouting.datatypes;

import java.util.Random;

/**
 *
 * @author aoneill
 */
public class RandomData 
{
  private static int AUTO_HIGH_GOAL_LIMIT = 7;
  private static int AUTO_MIDDLE_GOAL_LIMIT = 5;
  private static int AUTO_LOW_GOAL_LIMIT = 3;
  
  private static int TELEOP_HIGH_GOAL_LIMIT = 20;
  private static int TELEOP_MIDDLE_GOAL_LIMIT = 15;
  private static int TELEOP_LOW_GOAL_LIMIT = 10;
  
  public int autoHighGoal;
  public int autoMiddleGoal;
  public int autoBottomGoal;
  
  public int teleopHighGoal;
  public int teleopMiddleGoal;
  public int teleopBottomGoal;
  
  public boolean teleopPyramdidNo;
  public boolean teleopPyramdid10;
  public boolean teleopPyramdid20;
  public boolean teleopPyramdid30;
  
  public RandomData()
  {
    autoHighGoal = new Random().nextInt(AUTO_HIGH_GOAL_LIMIT);
    autoMiddleGoal = new Random().nextInt(AUTO_MIDDLE_GOAL_LIMIT);
    autoBottomGoal = new Random().nextInt(AUTO_LOW_GOAL_LIMIT);
    
    teleopHighGoal = new Random().nextInt(TELEOP_HIGH_GOAL_LIMIT);
    teleopMiddleGoal = new Random().nextInt(TELEOP_MIDDLE_GOAL_LIMIT);
    teleopBottomGoal = new Random().nextInt(TELEOP_LOW_GOAL_LIMIT);
    
    switch(new Random().nextInt(5))
    {
      case 1:
        teleopPyramdidNo = true;
        break;
        
      case 2:
        teleopPyramdid10 = true;
        break;
        
      case 3:
        teleopPyramdid20 = true;
        break;
        
      case 4:
        teleopPyramdid30 = true;
        break;
    }
  }
}
