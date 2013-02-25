package org.edinarobotics.scouting.gui;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author aoneill
 */
public class TeamInputPanel extends JPanel
{
  private static String TEAM_LABEL_TEXT = "Team:";
  private static String TEAM_LIST_DEFAULT_TEXT = "Select...";
  private static String PENALTIES_LABEL_TEXT = "Penalties:";
  private static String COMMENTS_LABEL_TEXT = "Comments:";
  
  private static String PYRAMID_GOAL_LABEL_TEXT = "Pyramid Goal:";
  private static String HIGH_GOAL_LABEL_TEXT = "High Goal:";
  private static String MIDDLE_GOAL_LABEL_TEXT = "Middle Goal";
  private static String LOW_GOAL_LABEL_TEXT = "Low Goal:";
  
  private static String PYRAMID_CLIMB_LABEL_TEXT = "Climbing:";
  private static String PYRAMID_CLIMB_TOP_LABEL_TEXT = "30";
  private static String PYRAMID_CLIMB_MIDDLE_LABEL_TEXT = "20";
  private static String PYRAMID_CLIMB_BOTTOM_LABEL_TEXT = "10";
  private static String PYRAMID_NO_CLIMB_LABEL_TEXT = "No";
  
  private static String FRISBEES_SHOT_LABEL_TEXT = "Frisbees Shot:";
  
  private static int AUTO_GOAL_MULTIPLIER = 2;
  private static int GOAL_UPPER = 3;
  private static int GOAL_MIDDLE = 2;
  private static int GOAL_LOW = 1;
  
  private static int CLIMB_UPPER = 30;
  private static int CLIMB_MIDDLE = 20;
  private static int CLIMB_BOTTOM = 10;
  
  private static int borderThickness = 4; 
  private Color borderColor = Color.GRAY;
  
  private String[] teamList = {};
  
  /**
   * Creates new form NewJPanel
   */
  public TeamInputPanel()
  {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    teleopClimbButtonGroup = new javax.swing.ButtonGroup();
    tabbedPanel = new javax.swing.JTabbedPane();
    autoJPanel = new javax.swing.JPanel();
    autoHighGoalLabel = new javax.swing.JLabel();
    autoHighGoalInput = new javax.swing.JTextField();
    autoMiddleGoalLabel = new javax.swing.JLabel();
    autoMiddleGoalInput = new javax.swing.JTextField();
    autoLowGoalLabel = new javax.swing.JLabel();
    autoLowGoalInput = new javax.swing.JTextField();
    autoFrisbeesShotLabel = new javax.swing.JLabel();
    autoFrisbeesShotInput = new javax.swing.JTextField();
    teleopJPanel = new javax.swing.JPanel();
    teleopHighGoalInput = new javax.swing.JTextField();
    teleopHighGoalLabel = new javax.swing.JLabel();
    teleopMiddleGoalLabel = new javax.swing.JLabel();
    teleopMiddleGoalInput = new javax.swing.JTextField();
    teleopLowGoalInput = new javax.swing.JTextField();
    teleopLowGoalLabel = new javax.swing.JLabel();
    teleopFrisbeesShotLabel = new javax.swing.JLabel();
    teleopFrisbeesShotInput = new javax.swing.JTextField();
    teleopPyramidGoalLabel = new javax.swing.JLabel();
    teleopPyramidGoalInput = new javax.swing.JTextField();
    teleopClimbLabel = new javax.swing.JLabel();
    teleopClimbNoButton = new javax.swing.JRadioButton();
    teleopClimb10Button = new javax.swing.JRadioButton();
    teleopClimb20Button = new javax.swing.JRadioButton();
    teleopClimb30Button = new javax.swing.JRadioButton();
    comentsJPanel = new javax.swing.JPanel();
    commentsLabel = new javax.swing.JLabel();
    commentsScrollPane = new javax.swing.JScrollPane();
    commentsTextArea = new javax.swing.JTextArea();
    teamLabel = new javax.swing.JLabel();
    teamComboBox = new javax.swing.JComboBox();
    penaltiesInput = new javax.swing.JTextField();
    penaltiesLabel = new javax.swing.JLabel();

    setBorder(new javax.swing.border.LineBorder(borderColor, borderThickness, true));
    setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N

    tabbedPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    tabbedPanel.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N

    autoHighGoalLabel.setText(HIGH_GOAL_LABEL_TEXT);

    autoMiddleGoalLabel.setText(MIDDLE_GOAL_LABEL_TEXT);

    autoLowGoalLabel.setText(LOW_GOAL_LABEL_TEXT);

    autoFrisbeesShotLabel.setText(FRISBEES_SHOT_LABEL_TEXT);

    org.jdesktop.layout.GroupLayout autoJPanelLayout = new org.jdesktop.layout.GroupLayout(autoJPanel);
    autoJPanel.setLayout(autoJPanelLayout);
    autoJPanelLayout.setHorizontalGroup(
      autoJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(autoJPanelLayout.createSequentialGroup()
        .addContainerGap(57, Short.MAX_VALUE)
        .add(autoJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(autoJPanelLayout.createSequentialGroup()
            .add(autoHighGoalLabel)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(autoHighGoalInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
          .add(autoJPanelLayout.createSequentialGroup()
            .add(autoMiddleGoalLabel)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(autoMiddleGoalInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
          .add(autoJPanelLayout.createSequentialGroup()
            .add(autoLowGoalLabel)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(autoLowGoalInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
          .add(autoJPanelLayout.createSequentialGroup()
            .add(autoFrisbeesShotLabel)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(autoFrisbeesShotInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(58, Short.MAX_VALUE))
    );
    autoJPanelLayout.setVerticalGroup(
      autoJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(autoJPanelLayout.createSequentialGroup()
        .add(3, 3, 3)
        .add(autoJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(autoHighGoalLabel)
          .add(autoHighGoalInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(3, 3, 3)
        .add(autoJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(autoMiddleGoalLabel)
          .add(autoMiddleGoalInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(3, 3, 3)
        .add(autoJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(autoLowGoalLabel)
          .add(autoLowGoalInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(9, 9, 9)
        .add(autoJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(autoFrisbeesShotLabel)
          .add(autoFrisbeesShotInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(62, 62, 62))
    );

    tabbedPanel.addTab("Autonomous", autoJPanel);

    teleopHighGoalLabel.setText(HIGH_GOAL_LABEL_TEXT);

    teleopMiddleGoalLabel.setText(MIDDLE_GOAL_LABEL_TEXT);

    teleopLowGoalLabel.setText(LOW_GOAL_LABEL_TEXT);

    teleopFrisbeesShotLabel.setText(FRISBEES_SHOT_LABEL_TEXT);

    teleopPyramidGoalLabel.setText(PYRAMID_GOAL_LABEL_TEXT);

    teleopClimbLabel.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
    teleopClimbLabel.setText(PYRAMID_CLIMB_LABEL_TEXT);

    teleopClimbButtonGroup.add(teleopClimbNoButton);
    teleopClimbNoButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
    teleopClimbNoButton.setSelected(true);
    teleopClimbNoButton.setText(PYRAMID_NO_CLIMB_LABEL_TEXT);

    teleopClimbButtonGroup.add(teleopClimb10Button);
    teleopClimb10Button.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
    teleopClimb10Button.setText(PYRAMID_CLIMB_BOTTOM_LABEL_TEXT);

    teleopClimbButtonGroup.add(teleopClimb20Button);
    teleopClimb20Button.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
    teleopClimb20Button.setText(PYRAMID_CLIMB_MIDDLE_LABEL_TEXT);

    teleopClimbButtonGroup.add(teleopClimb30Button);
    teleopClimb30Button.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
    teleopClimb30Button.setText(PYRAMID_CLIMB_TOP_LABEL_TEXT);

    org.jdesktop.layout.GroupLayout teleopJPanelLayout = new org.jdesktop.layout.GroupLayout(teleopJPanel);
    teleopJPanel.setLayout(teleopJPanelLayout);
    teleopJPanelLayout.setHorizontalGroup(
      teleopJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(teleopJPanelLayout.createSequentialGroup()
        .addContainerGap()
        .add(teleopJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(teleopJPanelLayout.createSequentialGroup()
            .add(57, 57, 57)
            .add(teleopJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(teleopJPanelLayout.createSequentialGroup()
                .add(teleopHighGoalLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(teleopHighGoalInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
              .add(teleopJPanelLayout.createSequentialGroup()
                .add(teleopMiddleGoalLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(teleopMiddleGoalInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
              .add(teleopJPanelLayout.createSequentialGroup()
                .add(teleopLowGoalLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(teleopLowGoalInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
              .add(teleopJPanelLayout.createSequentialGroup()
                .add(teleopFrisbeesShotLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(teleopFrisbeesShotInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
              .add(teleopJPanelLayout.createSequentialGroup()
                .add(teleopPyramidGoalLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(teleopPyramidGoalInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
          .add(teleopJPanelLayout.createSequentialGroup()
            .add(teleopClimbLabel)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(teleopClimbNoButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(teleopClimb10Button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(teleopClimb20Button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(teleopClimb30Button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    teleopJPanelLayout.setVerticalGroup(
      teleopJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(teleopJPanelLayout.createSequentialGroup()
        .add(3, 3, 3)
        .add(teleopJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(teleopPyramidGoalLabel)
          .add(teleopPyramidGoalInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(3, 3, 3)
        .add(teleopJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(teleopHighGoalLabel)
          .add(teleopHighGoalInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(3, 3, 3)
        .add(teleopJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(teleopMiddleGoalLabel)
          .add(teleopMiddleGoalInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(3, 3, 3)
        .add(teleopJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(teleopLowGoalLabel)
          .add(teleopLowGoalInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(9, 9, 9)
        .add(teleopJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(teleopFrisbeesShotLabel)
          .add(teleopFrisbeesShotInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .add(teleopJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(teleopClimbNoButton)
          .add(teleopClimbLabel)
          .add(teleopClimb10Button)
          .add(teleopClimb20Button)
          .add(teleopClimb30Button))
        .addContainerGap())
    );

    tabbedPanel.addTab("Tele-Op / End Game", teleopJPanel);

    commentsLabel.setText(COMMENTS_LABEL_TEXT);

    commentsTextArea.setColumns(18);
    commentsTextArea.setRows(5);
    commentsScrollPane.setViewportView(commentsTextArea);

    org.jdesktop.layout.GroupLayout comentsJPanelLayout = new org.jdesktop.layout.GroupLayout(comentsJPanel);
    comentsJPanel.setLayout(comentsJPanelLayout);
    comentsJPanelLayout.setHorizontalGroup(
      comentsJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(comentsJPanelLayout.createSequentialGroup()
        .add(14, 14, 14)
        .add(comentsJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(commentsScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 252, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(commentsLabel))
        .add(14, 14, 14))
    );
    comentsJPanelLayout.setVerticalGroup(
      comentsJPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(comentsJPanelLayout.createSequentialGroup()
        .addContainerGap()
        .add(commentsLabel)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 7, Short.MAX_VALUE)
        .add(commentsScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(33, Short.MAX_VALUE))
    );

    tabbedPanel.addTab("Comments", comentsJPanel);

    teamLabel.setText(TEAM_LABEL_TEXT);

    teamComboBox.setModel(new javax.swing.DefaultComboBoxModel(teamList));
    teamComboBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        teamComboBoxActionPerformed(evt);
      }
    });

    penaltiesLabel.setText(PENALTIES_LABEL_TEXT);

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
        .add(3, 3, 3)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
          .add(layout.createSequentialGroup()
            .add(penaltiesLabel)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(penaltiesInput))
          .add(layout.createSequentialGroup()
            .add(teamLabel)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(teamComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
          .add(tabbedPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 301, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(3, 3, 3))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
        .add(5, 5, 5)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(teamLabel)
          .add(teamComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(tabbedPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 235, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(penaltiesLabel)
          .add(penaltiesInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(3, 3, 3))
    );
  }// </editor-fold>//GEN-END:initComponents

  /**
   * Easter Egg Code...
   * @param evt 
   */
  private void teamComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamComboBoxActionPerformed
    easterEgg();
  }//GEN-LAST:event_teamComboBoxActionPerformed

  public int getTeamNumber()
  {
    try
    {
      return Integer.parseInt(teamComboBox.getSelectedItem().toString());
    }
    catch (Exception e)
    {
      return 0;
    }
  }
  
  public int getAutoScore()
  {
    int score = 0;
    score += textFieldToScore(autoHighGoalInput.getText()) * GOAL_UPPER * AUTO_GOAL_MULTIPLIER;
    score += textFieldToScore(autoMiddleGoalInput.getText()) * GOAL_MIDDLE * AUTO_GOAL_MULTIPLIER;
    score += textFieldToScore(autoLowGoalInput.getText()) * GOAL_LOW * AUTO_GOAL_MULTIPLIER;
    
    return score;
  }
  
  public int getAutoShots()
  {
    return textFieldToScore(autoFrisbeesShotInput.getText());
  }
  
  public int getTeleOpScore()
  {
    int score = 0;
    score += textFieldToScore(teleopHighGoalInput.getText()) * GOAL_UPPER;
    score += textFieldToScore(teleopMiddleGoalInput.getText()) * GOAL_MIDDLE;
    score += textFieldToScore(teleopLowGoalInput.getText()) * GOAL_LOW;
      
    return score;
  }
  
  public int getTeleOpGameShots()
  {
    return textFieldToScore(teleopFrisbeesShotInput.getText());
  }
  
  public int getPyramidAttempt()
  {
    return teleopClimbButtonGroup.isSelected(teleopClimbNoButton.getModel()) ?
            0 : 1;
  }
  
  public int getPyramidScore()
  {
    int score = 0;
    
    score += teleopClimbButtonGroup.isSelected(teleopClimb10Button.getModel()) ?
            CLIMB_UPPER : 0;
    score += teleopClimbButtonGroup.isSelected(teleopClimb20Button.getModel()) ?
            CLIMB_MIDDLE : 0;
    score += teleopClimbButtonGroup.isSelected(teleopClimb30Button.getModel()) ?
            CLIMB_BOTTOM : 0;
    score *= teleopClimbButtonGroup.isSelected(teleopClimbNoButton.getModel()) ?
            0 : 1;
    
    return score;
  }
  
  public String getPenalties()
  {
    return penaltiesInput.getText();
  }
  
  public String getComments()
  {
    return commentsTextArea.getText();
  }
  
  public void setBorderColor(Color color)
  {
    borderColor = color;
    setBorder(new javax.swing.border.LineBorder(borderColor, borderThickness, true));
  }
  
  public void setTeamList(ArrayList<String> list)
  {
    ArrayList<String> clone = (ArrayList<String>) list.clone();
    clone.add(0, TEAM_LIST_DEFAULT_TEXT);
    setTeamList(clone.toArray(new String[0]));
  }
  
  private void setTeamList(String[] list)
  {
    teamList = list;
    teamComboBox.setModel(new javax.swing.DefaultComboBoxModel(teamList));
    easterEgg();
  }
  
  public boolean isValidData()
  {
    if(teamComboBox.getSelectedItem().toString().equals(TEAM_LIST_DEFAULT_TEXT))
      return false;
    
    return true;
  }
  
  private int textFieldToScore(String s)
  {
    return s.equals("") ? 0 : Integer.parseInt(s);
  }
  
  private void easterEgg()
  {
    if(teamComboBox.getSelectedItem().toString().equals("1816"))
    {
      setBorder(new javax.swing.border.LineBorder(Color.GREEN, borderThickness, true));
    }
    else if(teamComboBox.getSelectedItem().toString().equals("2052"))
    {
      setBorder(new javax.swing.border.LineBorder(new Color(128, 0, 0), borderThickness, true));
    }
    else if(teamComboBox.getSelectedItem().toString().equals("4511"))
    {
      setBorder(new javax.swing.border.LineBorder(new Color(0, 56, 174), borderThickness, true));
    }
    else
    {
      setBorderColor(borderColor);
    }
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField autoFrisbeesShotInput;
  private javax.swing.JLabel autoFrisbeesShotLabel;
  private javax.swing.JTextField autoHighGoalInput;
  private javax.swing.JLabel autoHighGoalLabel;
  private javax.swing.JPanel autoJPanel;
  private javax.swing.JTextField autoLowGoalInput;
  private javax.swing.JLabel autoLowGoalLabel;
  private javax.swing.JTextField autoMiddleGoalInput;
  private javax.swing.JLabel autoMiddleGoalLabel;
  private javax.swing.JPanel comentsJPanel;
  private javax.swing.JLabel commentsLabel;
  private javax.swing.JScrollPane commentsScrollPane;
  private javax.swing.JTextArea commentsTextArea;
  private javax.swing.JTextField penaltiesInput;
  private javax.swing.JLabel penaltiesLabel;
  private javax.swing.JTabbedPane tabbedPanel;
  private javax.swing.JComboBox teamComboBox;
  private javax.swing.JLabel teamLabel;
  private javax.swing.JRadioButton teleopClimb10Button;
  private javax.swing.JRadioButton teleopClimb20Button;
  private javax.swing.JRadioButton teleopClimb30Button;
  private javax.swing.ButtonGroup teleopClimbButtonGroup;
  private javax.swing.JLabel teleopClimbLabel;
  private javax.swing.JRadioButton teleopClimbNoButton;
  private javax.swing.JTextField teleopFrisbeesShotInput;
  private javax.swing.JLabel teleopFrisbeesShotLabel;
  private javax.swing.JTextField teleopHighGoalInput;
  private javax.swing.JLabel teleopHighGoalLabel;
  private javax.swing.JPanel teleopJPanel;
  private javax.swing.JTextField teleopLowGoalInput;
  private javax.swing.JLabel teleopLowGoalLabel;
  private javax.swing.JTextField teleopMiddleGoalInput;
  private javax.swing.JLabel teleopMiddleGoalLabel;
  private javax.swing.JTextField teleopPyramidGoalInput;
  private javax.swing.JLabel teleopPyramidGoalLabel;
  // End of variables declaration//GEN-END:variables
}
