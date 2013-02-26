package org.edinarobotics.scouting.gui;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.edinarobotics.scouting.datatypes.MatchData;
import org.edinarobotics.scouting.datatypes.TeamData;
import org.edinarobotics.scouting.input.MatchFillerInput;
import org.edinarobotics.scouting.input.TeamListInput;
import org.edinarobotics.scouting.output.OutFiles;

/**
 *
 * @author aoneill
 */
public class DataInputFrame extends javax.swing.JFrame
{
  private static String MATCH_NUMBER_LABEL_TEXT = "Match:";
  private static String BLUE_MATCH_SCORE_LABEL_TEXT = "Blue Alliance Score:";
  private static String RED_MATCH_SCORE_LABEL_TEXT = "Red Alliance Score:";
  
  private static String[] teamInputIndex = new String[] 
    {"[Top, Left]", "[Top, Middle]", "[Top, Right]",
     "[Bottom, Left]","[Bottom, Middle]", "[Bottom, Right]"};
  /**
   * Creates new form DataInputFrame
   */
  public DataInputFrame() {
    initComponents();
    
    teamInputPanel1.setBorderColor(Color.BLUE);
    teamInputPanel2.setBorderColor(Color.BLUE);
    teamInputPanel3.setBorderColor(Color.BLUE);
    teamInputPanel4.setBorderColor(Color.RED);
    teamInputPanel5.setBorderColor(Color.RED);
    teamInputPanel6.setBorderColor(Color.RED);
    
    TeamListInput teamListIn = new TeamListInput();
    teamInputPanel1.setTeamList(teamListIn.getTeamList());
    teamInputPanel2.setTeamList(teamListIn.getTeamList());
    teamInputPanel3.setTeamList(teamListIn.getTeamList());
    teamInputPanel4.setTeamList(teamListIn.getTeamList());
    teamInputPanel5.setTeamList(teamListIn.getTeamList());
    teamInputPanel6.setTeamList(teamListIn.getTeamList());

    setVisible(true);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    teamInputPanel1 = new org.edinarobotics.scouting.gui.TeamInputPanel();
    teamInputPanel2 = new org.edinarobotics.scouting.gui.TeamInputPanel();
    teamInputPanel3 = new org.edinarobotics.scouting.gui.TeamInputPanel();
    teamInputPanel4 = new org.edinarobotics.scouting.gui.TeamInputPanel();
    teamInputPanel5 = new org.edinarobotics.scouting.gui.TeamInputPanel();
    teamInputPanel6 = new org.edinarobotics.scouting.gui.TeamInputPanel();
    matchLabel = new javax.swing.JLabel();
    matchInput = new javax.swing.JTextField();
    blueMatchScoreLabel = new javax.swing.JLabel();
    blueMatchScoreInput = new javax.swing.JTextField();
    redMatchScoreLabel = new javax.swing.JLabel();
    redMatchScoreInput = new javax.swing.JTextField();
    scoutButton = new javax.swing.JButton();
    menuBar = new javax.swing.JMenuBar();
    fileMenu = new javax.swing.JMenu();
    clearOption = new javax.swing.JMenuItem();
    testDataOption = new javax.swing.JMenuItem();
    editMenu = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    matchLabel.setText(MATCH_NUMBER_LABEL_TEXT);

    blueMatchScoreLabel.setText(BLUE_MATCH_SCORE_LABEL_TEXT);

    redMatchScoreLabel.setText(RED_MATCH_SCORE_LABEL_TEXT);

    scoutButton.setText("Scout!");
    scoutButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        scoutButtonActionPerformed(evt);
      }
    });

    fileMenu.setText("File");

    clearOption.setText("Clear Data");
    clearOption.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        clearOptionActionPerformed(evt);
      }
    });
    fileMenu.add(clearOption);

    testDataOption.setText("Test Data Entry");
    testDataOption.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        testDataOptionActionPerformed(evt);
      }
    });
    fileMenu.add(testDataOption);

    menuBar.add(fileMenu);

    editMenu.setText("Edit");
    menuBar.add(editMenu);

    setJMenuBar(menuBar);

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(6, 6, 6)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createSequentialGroup()
            .add(teamInputPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(6, 6, 6)
            .add(teamInputPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(6, 6, 6)
            .add(teamInputPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(0, 0, Short.MAX_VALUE))
          .add(layout.createSequentialGroup()
            .add(teamInputPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(6, 6, 6)
            .add(teamInputPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(6, 6, 6)
            .add(teamInputPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                  .add(org.jdesktop.layout.GroupLayout.TRAILING, matchLabel)
                  .add(blueMatchScoreLabel)
                  .add(redMatchScoreLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                  .add(org.jdesktop.layout.GroupLayout.TRAILING, blueMatchScoreInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                  .add(org.jdesktop.layout.GroupLayout.TRAILING, matchInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                  .add(redMatchScoreInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
              .add(layout.createSequentialGroup()
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(scoutButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        .add(6, 6, 6))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(6, 6, 6)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, teamInputPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, teamInputPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, teamInputPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .add(layout.createSequentialGroup()
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
              .add(matchInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
              .add(matchLabel))
            .add(6, 6, 6)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
              .add(blueMatchScoreInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
              .add(blueMatchScoreLabel))
            .add(6, 6, 6)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
              .add(redMatchScoreInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
              .add(redMatchScoreLabel))
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(scoutButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        .add(6, 6, 6)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
          .add(org.jdesktop.layout.GroupLayout.LEADING, teamInputPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(org.jdesktop.layout.GroupLayout.LEADING, teamInputPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(org.jdesktop.layout.GroupLayout.LEADING, teamInputPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  @SuppressWarnings("ResultOfObjectAllocationIgnored")
  private void scoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoutButtonActionPerformed
    TeamData[] teams = new TeamData[] {
      new TeamData(teamInputPanel1),
      new TeamData(teamInputPanel2),
      new TeamData(teamInputPanel3),
      new TeamData(teamInputPanel4),
      new TeamData(teamInputPanel5),
      new TeamData(teamInputPanel6)};
    
    for(int i = 0; i < 6; i++)
      if(!teams[i].isValidData())
      {
        String id = String.valueOf(teams[i].teamNum);
        if(id.equals("0"))
          id = teamInputIndex[i];
        
        JOptionPane.showMessageDialog(this, 
                "Error in Team " + id + "'s data!", 
                "Error!", JOptionPane.ERROR_MESSAGE);
        return;
      }
    
    if(!isValidTeamsData(teams))
    {
      JOptionPane.showMessageDialog(this, 
                "Duplicate Teams!", 
                "Error!", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    if(!isValidMatchData())
    {
      JOptionPane.showMessageDialog(this, 
                "Error in Match data!", 
                "Error!", JOptionPane.ERROR_MESSAGE);
      return;
    }
    
    MatchData match = new MatchData(
            Integer.parseInt(matchInput.getText()),
            teams[0].teamNum, teams[1].teamNum, teams[2].teamNum, 
            Integer.parseInt(blueMatchScoreInput.getText()),
            teams[3].teamNum, teams[4].teamNum, teams[5].teamNum, 
            Integer.parseInt(redMatchScoreInput.getText()));
    
    new OutFiles(teams, match);
    
    MatchFillerInput matchFillerIn = new MatchFillerInput();
    
    teamInputPanel1.clear(matchFillerIn.getTeams(match.matchNum + 1, 0));
    teamInputPanel2.clear(matchFillerIn.getTeams(match.matchNum + 1, 1));
    teamInputPanel3.clear(matchFillerIn.getTeams(match.matchNum + 1, 2));
    teamInputPanel4.clear(matchFillerIn.getTeams(match.matchNum + 1, 3));
    teamInputPanel5.clear(matchFillerIn.getTeams(match.matchNum + 1, 4));
    teamInputPanel6.clear(matchFillerIn.getTeams(match.matchNum + 1, 5));
    
    matchInput.setText(String.valueOf(Integer.parseInt(matchInput.getText()) + 1));
    blueMatchScoreInput.setText(null);
    redMatchScoreInput.setText(null);
  }//GEN-LAST:event_scoutButtonActionPerformed

  private void testDataOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testDataOptionActionPerformed
    // TODO add your handling code here:
    TeamData[] teams;
    do
    {
      teamInputPanel1.setRandomData();
      teamInputPanel2.setRandomData();
      teamInputPanel3.setRandomData();
      teamInputPanel4.setRandomData();
      teamInputPanel5.setRandomData();
      teamInputPanel6.setRandomData();
      
      teams = new TeamData[] {
      new TeamData(teamInputPanel1),
      new TeamData(teamInputPanel2),
      new TeamData(teamInputPanel3),
      new TeamData(teamInputPanel4),
      new TeamData(teamInputPanel5),
      new TeamData(teamInputPanel6)};
    } while(!isValidTeamsData(teams));
  }//GEN-LAST:event_testDataOptionActionPerformed

  private void clearOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearOptionActionPerformed
    // TODO add your handling code here:
    teamInputPanel1.clear("");
    teamInputPanel2.clear("");
    teamInputPanel3.clear("");
    teamInputPanel4.clear("");
    teamInputPanel5.clear("");
    teamInputPanel6.clear("");
    
    matchInput.setText("");
    blueMatchScoreInput.setText(null);
    redMatchScoreInput.setText(null);
  }//GEN-LAST:event_clearOptionActionPerformed

  private boolean isValidMatchData()
  {
    if(matchInput.getText().equals("") || 
            blueMatchScoreInput.getText().equals("") ||
            redMatchScoreInput.getText().equals(""))
      return false;
    
    return true;
  }
  
  private boolean isValidTeamsData(TeamData[] teams)
  {
    ArrayList<Integer> teamList = new ArrayList();
    teamList.add(teams[0].teamNum);
    teamList.add(teams[1].teamNum);
    teamList.add(teams[2].teamNum);
    teamList.add(teams[3].teamNum);
    teamList.add(teams[4].teamNum);
    teamList.add(teams[5].teamNum);
    
    for(int i = 0; i < teamList.size(); i++)
      for(int j = 0; j < teamList.size(); j++)
        if(j != i)
          if(teamList.get(i).equals(teamList.get(j)))
            return false;
    
    return true;
  }
  
  private void clear()
  {
    matchInput.setText(
            matchInput.getText().equals("") ?
            String.valueOf(Integer.parseInt(matchInput.getText()) + 1) :
            "");
    blueMatchScoreInput.setText(null);
    redMatchScoreInput.setText(null);
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField blueMatchScoreInput;
  private javax.swing.JLabel blueMatchScoreLabel;
  private javax.swing.JMenuItem clearOption;
  private javax.swing.JMenu editMenu;
  private javax.swing.JMenu fileMenu;
  private javax.swing.JTextField matchInput;
  private javax.swing.JLabel matchLabel;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JTextField redMatchScoreInput;
  private javax.swing.JLabel redMatchScoreLabel;
  private javax.swing.JButton scoutButton;
  private org.edinarobotics.scouting.gui.TeamInputPanel teamInputPanel1;
  private org.edinarobotics.scouting.gui.TeamInputPanel teamInputPanel2;
  private org.edinarobotics.scouting.gui.TeamInputPanel teamInputPanel3;
  private org.edinarobotics.scouting.gui.TeamInputPanel teamInputPanel4;
  private org.edinarobotics.scouting.gui.TeamInputPanel teamInputPanel5;
  private org.edinarobotics.scouting.gui.TeamInputPanel teamInputPanel6;
  private javax.swing.JMenuItem testDataOption;
  // End of variables declaration//GEN-END:variables
}
