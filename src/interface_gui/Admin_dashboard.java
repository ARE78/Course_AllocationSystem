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
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class Admin_dashboard extends JFrame{
	private JButton view_records;
	private JButton add_records;
	private JButton update_records , update_feestatus;
	private JPopupMenu optionsMenu;
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
	
	private void dashboard() {
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(4,2));
		panel.setBorder(new EmptyBorder(10,10,10,10));
		view_records =new JButton("View records");
		view_records.setPreferredSize(new Dimension(100,100));
		//add_records.setMinimumSize(new Dimension(80, 40)); // Set minimum size
		//update_records.setMaximumSize(new Dimension(120, 60)); // Set maximum size
		add_records=new JButton ("Add Records");
		update_records = new JButton ("Update Records");
		update_feestatus=new JButton ("Update Fee Status");
		optionsMenu = new JPopupMenu();
		view_records();
		add_records();
		FeeManager();
		//JPanel panel = new JPanel();
        panel.add(view_records);
        panel.add(add_records);
        panel.add(update_records);
        panel.add(update_feestatus);
        add(panel);
        

        setLocationRelativeTo(null);
        setVisible(true);
	}
	//constructor
	public Admin_dashboard() {
		setTitle("Admin_dashboard");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dashboard();
		
	}
	
	public void view_records()
	{
		//J
		//dash_elements[0]= new JButton("View records");
		JMenuItem option1 = new JMenuItem("Student");
        JMenuItem option2 = new JMenuItem("Teacher");
        option1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int num;
            	
            	JFrame frame = new JFrame("Student id");
                JPanel panel = new JPanel();
                JLabel label = new JLabel();
                String info="Student id:";
                label.setText(info);

                String[] options = {"04072113008", "04072113009", "04072113007"};

                JComboBox<String> dropdown = new JComboBox<>(options);
                
                JButton nextbutton = new JButton("Next");
                JButton backbutton = new JButton("Back");
                //nextbutton.setPreferredSize(new Dimension(140,30));

                nextbutton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	
                        String selectedOption = (String) dropdown.getSelectedItem();
                        JFrame frame = new JFrame("Student");
                    	JPanel studentp =new JPanel();
                    	JLabel label ,label2 ,label3;
                    	label = new JLabel();
                    	label2 =new JLabel();
                    	label3 =new JLabel();
                    	String st_id ="Student id :\n" +selectedOption +'\n';
                    	String st_name="Student name : Areeba Naz." ;
                    	String st_dob="Student dob : 12/3/1999";
                    	label.setText(st_id);
                    	//JButton backbutton = new JButton("Back");
                    	studentp.add(label);
                    	label2.setText(st_name);
                    	studentp.add(label2);
                    	label3.setText(st_dob);
                    	studentp.add(label3);
                    	//studentp.add(backbutton);
                      
                    	frame.add(studentp);
                        frame.setSize(300, 200);
                        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        frame.setVisible(true);
                        //JOptionPane.showMessageDialog(frame, "Selected Option: " + selectedOption +"/n" +"Student name: Areeba Naz ");
                    }
                });
                backbutton.addActionListener(new ActionListener() {
                	@Override
                	public void actionPerformed(ActionEvent e) {
                		//setVisible(false);
                        dispose();
                	}
                	
                	
                });
                panel.add(label);

                panel.add(dropdown);
                panel.add(backbutton , BorderLayout.CENTER);
                panel.add(nextbutton , BorderLayout.CENTER);

                frame.add(panel);
                frame.setSize(300, 200);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
            }
        });
        option2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int num;
            	
            	JFrame frame = new JFrame("Teacher id");
                JPanel panel = new JPanel();
                JLabel label = new JLabel();
                String info="Teacher id:";
                label.setText(info);

                String[] options = {"04072113008", "04072113009", "04072113007"};

                JComboBox<String> dropdown = new JComboBox<>(options);
                
                JButton nextbutton = new JButton("Next");
                nextbutton.setPreferredSize(new Dimension(160,30));

                nextbutton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	
                        String selectedOption = (String) dropdown.getSelectedItem();
                        JFrame frame = new JFrame("Teacher");
                    	JPanel studentp =new JPanel();
                    	JLabel label ,label2 ,label3;
                    	label = new JLabel();
                    	label2 =new JLabel();
                    	label3 =new JLabel();
                    	String st_id ="Student id :\n" +selectedOption +'\n';
                    	String st_name="Student name : Areeba Naz." ;
                    	String st_dob="Student dob : 12/3/1999";
                    	label.setText(st_id);
                    	studentp.add(label);
                    	label2.setText(st_name);
                    	studentp.add(label2);
                    	label3.setText(st_dob);
                    	studentp.add(label3);
                      
                    	frame.add(studentp);
                        frame.setSize(300, 200);
                        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        frame.setVisible(true);
                        //JOptionPane.showMessageDialog(frame, "Selected Option: " + selectedOption +"/n" +"Student name: Areeba Naz ");
                    }
                });
                panel.add(label);

                panel.add(dropdown);
                panel.add(nextbutton , BorderLayout.CENTER);

                frame.add(panel);
                frame.setSize(300, 200);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
//            	String userInput = JOptionPane.showInputDialog(null, "Student id:", "Input", JOptionPane.QUESTION_MESSAGE);
//            	num = Integer.parseInt(userInput);
//            	JFrame frame = new JFrame("Student");
//            	JPanel studentp =new JPanel();
//            	JLabel label ,label2;
//            	label = new JLabel();
//            	label2 =new JLabel();
//            	String st_id ="Student id :\n" +userInput +'\n';
//            	String st_name="Student name : Areeba Naz.\n Student dob : 13/2/1980" ;
//            	//+ '\n'
//            	//		+"Student admission date: 12/2/2021";
//            	//String st_name="areeba naz";
//            	label.setText(st_id);
//            	studentp.add(label);
//            	label.setText(st_name);
//            	studentp.add(label2);
//              
//            	frame.add(studentp);
//                frame.setSize(300, 200);
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.setVisible(true);
            }
        });
        optionsMenu.add(option1);
        optionsMenu.add(option2);
        view_records.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                optionsMenu.show(view_records, 0 ,view_records.getHeight());
            }
        });
		
	}
	
	public void add_records() {
		JPopupMenu options;
		options = new JPopupMenu();
		JMenuItem opt1 = new JMenuItem("Student");
        JMenuItem opt2 = new JMenuItem("Teacher");
        options.add(opt1);
        options.add(opt2);
        add_records.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                options.show(add_records, 0 ,add_records.getHeight());
            }
        });


		
	}
	
	public void FeeManager() {
	    update_feestatus.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	               // displaySemesterSelectionScreen();
	                displaySemesterSelectionScreen();
	            }
	    });
	}

    public void displaySemesterSelectionScreen() {
    	JFrame frame = new JFrame("Update Fee Status");
	        JPanel panel = new JPanel();
	        panel.setLayout(new BorderLayout());
	        JComboBox<String> semesterComboBox;

	        String[] semesters = {"Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8"};
	        semesterComboBox = new JComboBox<>(semesters);
	        semesterComboBox.setPreferredSize(new Dimension(100, 40));

	       // JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	       // centerPanel.add(new JLabel("Select Semester:"));
	        panel.add(semesterComboBox ,BorderLayout.CENTER);

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

	        //JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	        panel.setPreferredSize(new Dimension(100, 60));
	        panel.add(backButton);
	        panel.add(nextButton);
	        frame.add(panel,BorderLayout.CENTER);
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);

	        //panel.add( BorderLayout.CENTER);
	       // panel.add(buttonPanel, BorderLayout.SOUTH);

	       // currentPanel = panel;
	       // mainFrame.setContentPane(currentPanel);
	       // mainFrame.revalidate();
	       // mainFrame.repaint();
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

	//main callFeeManager
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Admin_dashboard().setVisible(true);
            }
        });
	}

}
