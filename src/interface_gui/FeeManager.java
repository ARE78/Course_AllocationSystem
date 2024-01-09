package interface_gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class FeeManager {
	private JFrame mainFrame;
    private JPanel currentPanel;
    private JRadioButton updateFeeStatusRadioButton;
    private JRadioButton option2RadioButton;
    private JRadioButton option3RadioButton;
    private JComboBox<String> semesterComboBox;
    private JComboBox<String> studentComboBox;
    private JRadioButton paidRadioButton;
    private JRadioButton unpaidRadioButton;
    private JLabel feeStatusLabel;

    public FeeManager() {
        mainFrame = new JFrame("Fee Management Application");
        mainFrame.setSize(500, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout());

        displayInitialScreen();

        mainFrame.setVisible(true);
    }

    private void displayInitialScreen() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));

        updateFeeStatusRadioButton = new JRadioButton("Update Fee Status");
        option2RadioButton = new JRadioButton("Option 2");
        option3RadioButton = new JRadioButton("Option 3");

        ButtonGroup optionGroup = new ButtonGroup();
        optionGroup.add(updateFeeStatusRadioButton);
        optionGroup.add(option2RadioButton);
        optionGroup.add(option3RadioButton);

        panel.add(new JLabel("Select an Option:"));
        panel.add(updateFeeStatusRadioButton);
        panel.add(option2RadioButton);
        panel.add(option3RadioButton);

        JButton nextButton = new JButton("Next");
        nextButton.setPreferredSize(new Dimension(120, 40));
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (updateFeeStatusRadioButton.isSelected()) {
                    displaySemesterSelectionScreen();
                } else if (option2RadioButton.isSelected()) {
                    // Handle option 2
                } else if (option3RadioButton.isSelected()) {
                    // Handle option 3
                }
            }
        });

        panel.add(nextButton);

        currentPanel = panel;
        mainFrame.setContentPane(currentPanel);
        mainFrame.revalidate();
        mainFrame.repaint();
    }

    private void displaySemesterSelectionScreen() {
         JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        String[] semesters = {"Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8"};
        semesterComboBox = new JComboBox<>(semesters);
        semesterComboBox.setPreferredSize(new Dimension(200, 40));

        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        centerPanel.add(new JLabel("Select Semester:"));
        centerPanel.add(semesterComboBox);

        JButton backButton = new JButton("Back");
        backButton.setPreferredSize(new Dimension(120, 40));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayInitialScreen();
            }
        });

        JButton nextButton = new JButton("Next");
        nextButton.setPreferredSize(new Dimension(120, 40));
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayStudentSelectionScreen();
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setPreferredSize(new Dimension(500, 60));
        buttonPanel.add(backButton);
        buttonPanel.add(nextButton);

        centerPanel.add(buttonPanel,BorderLayout.CENTER);
        centerPanel.add(buttonPanel, BorderLayout.SOUTH);

        //currentPanel = panel;
        mainFrame.setContentPane(currentPanel);
        mainFrame.revalidate();
        mainFrame.repaint();
    }

    private void displayStudentSelectionScreen() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        String[] students = {"John Doe", "Jane Smith"};
        studentComboBox = new JComboBox<>(students);
        studentComboBox.setPreferredSize(new Dimension(200, 40));

        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        centerPanel.add(new JLabel("Select Student:"));
        centerPanel.add(studentComboBox);

        JButton backButton = new JButton("Back");
        backButton.setPreferredSize(new Dimension(120, 40));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displaySemesterSelectionScreen();
            }
        });

        JButton nextButton = new JButton("Next");
        nextButton.setPreferredSize(new Dimension(120, 40));
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayFeeUpdateScreen();
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setPreferredSize(new Dimension(500, 60));
        buttonPanel.add(backButton);
        buttonPanel.add(nextButton);

        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        currentPanel = panel;
        mainFrame.setContentPane(currentPanel);
        mainFrame.revalidate();
        mainFrame.repaint();
    }

    private void displayFeeUpdateScreen() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        feeStatusLabel = new JLabel("Current Fee Status: Unpaid", SwingConstants.CENTER);
        panel.add(feeStatusLabel, BorderLayout.NORTH);

        paidRadioButton = new JRadioButton("Paid");
        unpaidRadioButton = new JRadioButton("Unpaid");

        ButtonGroup statusGroup = new ButtonGroup();
        statusGroup.add(paidRadioButton);
        statusGroup.add(unpaidRadioButton);

        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        radioPanel.add(paidRadioButton);
        radioPanel.add(unpaidRadioButton);

        panel.add(radioPanel, BorderLayout.CENTER);

        JButton updateButton = new JButton("Update Fee Status");
        updateButton.setPreferredSize(new Dimension(160, 40));
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (paidRadioButton.isSelected()) {
                    feeStatusLabel.setText("Current Fee Status: Paid");
                } else if (unpaidRadioButton.isSelected()) {
                    feeStatusLabel.setText("Current Fee Status: Unpaid");
                }
            }
        });

        JButton saveExitButton = new JButton("Save and Exit");
        saveExitButton.setPreferredSize(new Dimension(120, 40));
        saveExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.dispose();
            }
        });

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setPreferredSize(new Dimension(120, 40));
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayInitialScreen();
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setPreferredSize(new Dimension(500, 60));
        buttonPanel.add(updateButton);
        buttonPanel.add(saveExitButton);
        buttonPanel.add(cancelButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        currentPanel = panel;
        mainFrame.setContentPane(currentPanel);
        mainFrame.revalidate();
        mainFrame.repaint();
    }

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new FeeManager();
//            }
//        })
//    }
    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new Admin_dashboard().setVisible(true);
                new FeeManager();

            }
        });
	}
}
