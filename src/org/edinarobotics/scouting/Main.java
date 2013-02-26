package org.edinarobotics.scouting;

import org.edinarobotics.scouting.gui.DataInputFrame;
import org.edinarobotics.scouting.output.DefaultWorkspace;

/**
 *
 * @author aoneill
 */
public class Main {
  
  /**
   * @param args the command line arguments
   */
  @SuppressWarnings("ResultOfObjectAllocationIgnored")
  public static void main(String[] args) 
  {
    new DefaultWorkspace();
    new DataInputFrame();
  }
}
