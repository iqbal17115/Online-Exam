package onlineexamproject;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener {
    
    Container con;
    JLabel label,label1;
    JRadioButton b1,b2,b3,b4;
    static int number=0,mark=0;
    JButton bt1,bt2,bt3;
    Font font;
    Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds( 100, 100, 900, 500);
        this.setTitle("Online Exam");
        con=this.getContentPane();
        
        font=new Font("Arial",Font.BOLD,25);
        
        label=new JLabel();
        label.setBounds(0, 0, 900, 500);
        con.add(label);
        
        label1=new JLabel();
        label1.setBounds(80, 50, 800, 30);
        label1.setFont(font);
        con.add(label1);
        
        b1=new JRadioButton();
        b1.setBounds(100, 90, 600, 70);
        label.add(b1);
        
        b2=new JRadioButton();
        b2.setBounds(100, 140, 600, 70);
        label.add(b2);
        
        b3=new JRadioButton();
        b3.setBounds(100, 190, 600, 70);
        label.add(b3);
        
        b4=new JRadioButton();
        b4.setBounds(100, 240, 600, 70);
        label.add(b4);
        
        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);
        b4.setFont(font);
        
        bt1=new JButton("Next");
        bt1.setBounds(100, 330, 120, 60);
        bt1.setFont(font);
        label.add(bt1);
        
        bt2=new JButton("Submit");
        bt2.setBounds(250, 330, 120, 60);
        bt2.setFont(font);
        label.add(bt2);
        bt3=new JButton("Result");
        bt3.setBounds(400, 0, 120, 50);
        bt3.setFont(font);
        label.add(bt3);
        
        bt3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
              JOptionPane.showMessageDialog(null, "Your Obtain mark is :"+mark);
              System.exit(0);
            }
            
        });
        
        bt1.addActionListener(this);
        bt2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                bt1.setEnabled(true);
                bt2.setEnabled(false);
                if(number == 1){
                    if(b1.isSelected()){
                        if(!b2.isSelected()){
                             if(!b3.isSelected()){
                             if(!b4.isSelected()){
                            mark++;
                            }
                          }
                        }
                    }
                }
                if(number == 2){
                    if(b1.isSelected()){
                        if(!b2.isSelected()){
                             if(!b3.isSelected()){
                             if(!b4.isSelected()){
                            mark++;
                            }
                          }
                        }
                    }
                }
                 if(number == 3){
                    if(!b1.isSelected()){
                        if(!b2.isSelected()){
                             if(b3.isSelected()){
                             if(!b4.isSelected()){
                            mark++;
                            }
                          }
                        }
                    }
                }
                 if(number == 4){
                    if(b1.isSelected()){
                        if(!b2.isSelected()){
                             if(!b3.isSelected()){
                             if(!b4.isSelected()){
                            mark++;
                            }
                          }
                        }
                    }
                }
                 if(number == 5){
                    if(!b1.isSelected()){
                        if(b2.isSelected()){
                             if(!b3.isSelected()){
                             if(!b4.isSelected()){
                            mark++;
                            }
                          }
                        }
                    }
                }
                 if(number == 6){
                    if(!b1.isSelected()){
                        if(!b2.isSelected()){
                             if(!b3.isSelected()){
                             if(b4.isSelected()){
                            mark++;
                            }
                          }
                        }
                    }
                }
                 if(number == 7){
                    if(!b1.isSelected()){
                        if(!b2.isSelected()){
                             if(b3.isSelected()){
                             if(!b4.isSelected()){
                            mark++;
                            }
                          }
                        }
                    }
                }
                 if(number == 8){
                    if(!b1.isSelected()){
                        if(b2.isSelected()){
                             if(!b3.isSelected()){
                             if(!b4.isSelected()){
                            mark++;
                            }
                          }
                        }
                    }
                }
                 if(number == 9){
                    if(!b1.isSelected()){
                        if(!b2.isSelected()){
                             if(!b3.isSelected()){
                             if(b4.isSelected()){
                            mark++;
                            }
                          }
                        }
                    }
                }
                 if(number == 10){
                    if(!b1.isSelected()){
                        if(!b2.isSelected()){
                             if(b3.isSelected()){
                             if(!b4.isSelected()){
                            mark++;
                            }
                          }
                        }
                    }
                }
            }
            
        });
        
    }
    public static void main(String[] args) {
        
        Main main=new Main();
        main.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
          b1.setSelected(false);
          b2.setSelected(false);
          b3.setSelected(false);
          b4.setSelected(false);
          bt1.setEnabled(false);
          bt2.setEnabled(true);
          number++;
         if(number == 1){
             label1.setText("Q1.	\n" +
"Who is known as father of Java Programming Language?");
             b1.setText("James Gosling");
             b2.setText("M. P Java");
             b3.setText("Charel Babbage");
             b4.setText("Blais Pascal");
             
         }
         if(number == 2){
             label1.setText("Q2.	\n" +
"What is byte code in Java?");
             b1.setText("Code generated by a Java compiler");
             b2.setText("Code generated by a Java Virtual Machine");
             b3.setText("Name of Java source code file");
             b4.setText("Block of code written inside a class");
         }
         if(number == 3){
             label1.setText("Q3.	\n" +
"Which of the following are not Java keywords ?");
             b1.setText("double");
             b2.setText("switch");
             b3.setText("then");
             b4.setText("instanceof");
         }
         if(number == 4){
             label1.setText("Q4.	\n" +
"Which of these have highest precedence?");
             b1.setText("()");
             b2.setText("++");
             b3.setText("*");
             b4.setText(">>");
         }
         if(number == 5){
             label1.setText("Q5.	\n" +
"Which of these is returned by operator '&' ?");
             b1.setText("Integer");
             b2.setText("Character");
             b3.setText("Boolean");
             b4.setText("Float");
         }
         if(number == 6){
             label1.setText("Q6.	\n" +
"Data type long literals are appended by _____");
             b1.setText("Uppercase L");
             b2.setText("Lowercase L");
             b3.setText("Long");
             b4.setText("Both A and B");
         }
         if(number == 7){
             label1.setText("Q7.	\n" +
"Java language was initially called as ________");
             b1.setText("Sumatra");
             b2.setText("J++");
             b3.setText("Oak");
             b4.setText("Pine");
         }
         if(number == 8){
             label1.setText("Q8.	\n" +
"Which one is a template for creating different objects ?");
             b1.setText("An Array");
             b2.setText("A class");
             b3.setText("Interface");
             b4.setText("Method");
         }
         if(number == 9){
             label1.setText("Q9.	\n" +
"Which of these is not a bitwise operator?");
             b1.setText("&' Operator");
             b2.setText("&=' Operator");
             b3.setText("|=' Operator");
             b4.setText("<=' Operator");
         }
         if(number == 10){
             label1.setText("Q10.	\n" +
"Modulus operator (%) can be applied to which of these?");
             b1.setText("Integers");
             b2.setText("Floating - point numbers");
             b3.setText("Both A and B");
             b4.setText("None of These");
         }
            if(number == 10){
                     JOptionPane.showMessageDialog(null, "There is no more question ");
                     
                 }
         
    }
    
   
}
