/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package javaapplication;


//import static javaapplication.SwingArray.AgeSlider;
//import static javaapplication.SwingArray.jTextField9;
import java.util.ArrayList;
import java.util.Collections;
import static javaapplication.NewJFrame.AgeSlider;
import static javaapplication.NewJFrame.BalanceField;
import static javaapplication.NewJFrame.BranchBox;
import static javaapplication.NewJFrame.FirstNameField;
import static javaapplication.NewJFrame.IDField;
import static javaapplication.NewJFrame.MessageArea;
import static javaapplication.NewJFrame.PinField;
import static javaapplication.NewJFrame.PostCodeField;
import static javaapplication.NewJFrame.SecondNameField;
import static javaapplication.NewJFrame.jTextField1;
import javax.swing.JOptionPane;


/**
 *
 * @author yonas
 */
public class SwingArray {
    public static ArrayList<Integer> UserID = new ArrayList<>();
    public static ArrayList<String> UserFirstName = new ArrayList<>();
    public static ArrayList<String> UserSecondName = new ArrayList<>();
    public static ArrayList<Integer> UserPin = new ArrayList<>();
    public static ArrayList<Integer> UserAge = new ArrayList<>();
    public static ArrayList<String> UserPostCode = new ArrayList<>();
    public static ArrayList<String> UserBranch = new ArrayList<>();
    public static ArrayList<Double> UserBalance = new ArrayList<>();
    
    static int index;
    
    public static void addrecords(){
        UserID.add(0);
        UserPin.add(9909);
        UserFirstName.add("John");
        UserSecondName.add("Morphy");
        UserAge.add(21);
        UserPostCode.add("D02GE64");
        UserBranch.add("Dublin");
        UserBalance.add(2000.0);
        
        
        UserID.add(1);
        UserPin.add(6966);
        UserFirstName.add("Paul");
        UserSecondName.add("Jake");
        UserAge.add(28);
        UserPostCode.add("D02CK64");
        UserBranch.add("Cork");
        UserBalance.add(5000.0);
        
        
        
        
        
        UserID.add(2);
        UserPin.add(1111);
        UserFirstName.add("Ringo");
        UserSecondName.add("Jacob");
        UserAge.add(31);
        UserPostCode.add("C02CK64");
        UserBranch.add("Galway");
        UserBalance.add(1400.0);
        
        
        UserID.add(3);
        UserPin.add(2211);
        UserFirstName.add("Josha");
        UserSecondName.add("Topac");
        UserAge.add(41);
        UserPostCode.add("G03CK64");
        UserBranch.add("Galway");
        UserBalance.add(2400.0);
        
        
        UserID.add(4);
        UserPin.add(1331);
        UserFirstName.add("Yonas");
        UserSecondName.add("Larry");
        UserAge.add(21);
        UserPostCode.add("D02RH64");
        UserBranch.add("Dublin");
        UserBalance.add(200400.0);
        
        
    }//end addrecords
    
    public static void viewstaff(){
       NewJFrame.ViewPanel.setText(""); //clear the box
        NewJFrame.ViewPanel.append("ID\t"+"First Name\t"+"Second Name\t\t"+"Pin\t"+"Age\t"+"PostCode\t"+"Branch\t"+"Balance\n"); //set header
        for (int i=0; i<UserID.size(); i++){
           NewJFrame.ViewPanel.append(UserID.get(i).toString()+"\t"+
                    UserFirstName.get(i)+"\t"+UserSecondName.get(i)+"\t\t"+UserPin.get(i).toString()+
                 "\t"+UserAge.get(i).toString()+"\t"+UserPostCode.get(i)+"\t"+UserBranch.get(i)+
                   "\t"+UserBalance.get(i).toString()+"\n");
        }//end for     
    }//end viewstaff
    
    public static void clear(){
        IDField.setText(null);
        PinField.setText(null);
        FirstNameField.setText(null);
        SecondNameField.setText(null);
        AgeSlider.setValue(0);
        BalanceField.setText(null);
        PostCodeField.setText(null);
        BranchBox.setSelectedItem("Mayo");
    }
    
    public static void search(){
        boolean stafffound = false;
        for (int i=0;i < UserID.size();i++){
                if (NewJFrame.IDField.getText().matches(Integer.toString(UserID.get(i)))){
                    stafffound = true;
                    index = i;
                }//end if
            }//end for 
            if (stafffound == true){
                NewJFrame.IDField.setText(Integer.toString(UserID.get(index)));
                NewJFrame.jLabel16.setText(Integer.toString(UserAge.get(index)));
                NewJFrame.PinField.setText(Integer.toString(UserPin.get(index)));
                NewJFrame.FirstNameField.setText(UserFirstName.get(index));
                NewJFrame.SecondNameField.setText(UserSecondName.get(index));
                NewJFrame.AgeSlider.setValue(UserAge.get(index));
                NewJFrame.BalanceField.setText(Double.toString(UserBalance.get(index)));
                NewJFrame.PostCodeField.setText(UserPostCode.get(index));
                NewJFrame.BranchBox.setSelectedItem(UserBranch.get(index));
                JOptionPane.showMessageDialog(null,"User Found!");
            }//end if
            
            if (stafffound == false){
                JOptionPane.showMessageDialog(null,"User Not Found!");
                NewJFrame.IDField.setText(null);
                NewJFrame.FirstNameField.setText(null);
                NewJFrame.SecondNameField.setText(null);
                NewJFrame.PinField.setText(null);
                NewJFrame.PostCodeField.setText(null);
                NewJFrame.BalanceField.setText(null);

            }//end if
    }//end search
    
    
    public static void editUsers(){
        boolean Userfound = false;
        for (int i=0;i < UserID.size();i++){
                if (NewJFrame.IDField.getText().matches(Integer.toString(UserID.get(i)))){
                    Userfound = true;
                    index = i;
                }//end if
            }//end for
        if (Userfound == true){
                UserID.set(index, Integer.valueOf(NewJFrame.IDField.getText()));
                UserPin.set(index, Integer.valueOf(NewJFrame.PinField.getText()));
                UserFirstName.set(index, NewJFrame.FirstNameField.getText());
                UserSecondName.set(index, NewJFrame.SecondNameField.getText());
                UserAge.set(index,NewJFrame.AgeSlider.getValue());
                UserPostCode.set(index, NewJFrame.PostCodeField.getText());
                UserBalance.set(index, Double.valueOf(NewJFrame.BalanceField.getText()));
                JOptionPane.showMessageDialog(null,"User Updated!");
            }//end if
        if (Userfound == false){
                JOptionPane.showMessageDialog(null,"User Not Found!");
                NewJFrame.IDField.setText(null);
                NewJFrame.PinField.setText(null);
                NewJFrame.FirstNameField.setText(null);
                NewJFrame.SecondNameField.setText(null);
                NewJFrame.AgeSlider.setValue(0);
                NewJFrame.PostCodeField.setText(null);
                NewJFrame.BalanceField.setText(null);

            }//end if
    }//end editstaff


   
        
        public static void AddUsers(){
        if (FirstNameField.getText().isEmpty() == true || SecondNameField.getText().isEmpty() == true ||
                PostCodeField.getText().isEmpty() == true || IDField.getText().isEmpty() == true 
                    || PinField.getText().isEmpty() == true || AgeSlider.getValue() == 0
                        || BalanceField.getText().isEmpty()) {
            
            clear();
            
            JOptionPane.showMessageDialog(null,"The Fields are empty!");
            
        }
        
        else {
       
            for (int i = 0; i < UserID.size(); i ++) {
                
                 if (UserID.contains(Integer.parseInt(IDField.getText()))) {
                
                    JOptionPane.showMessageDialog(null,"The ID existed already!");
                    
                    break;
                    
                }
            
                 else {
                
                    UserID.add(Integer.parseInt(IDField.getText()));
                    UserFirstName.add(FirstNameField.getText());
                    UserSecondName.add(SecondNameField.getText());
                    UserBalance.add(Double.parseDouble(BalanceField.getText()));
                    UserAge.add(AgeSlider.getValue());
                    UserBranch.add(BranchBox.getSelectedItem().toString());
                     UserPin.add(Integer.parseInt(PinField.getText()));
                     UserPostCode.add(PostCodeField.getText());
                        JOptionPane.showMessageDialog(null,"New User ADDED!");

                }//end else 

                break;//break for
                
            }//end for 
        
        }//end else 
        
    }
          public static void delete(){
        boolean Userfound = false;
        for (int i=0;i < UserID.size();i++){
                if (NewJFrame.IDField.getText().matches(Integer.toString(UserID.get(i)))){
                    Userfound = true;
                    index = i;
                }//end if
            }//end for 
            if (Userfound == true){
                NewJFrame.IDField.setText(null);
                UserID.remove(index);
                NewJFrame.FirstNameField.setText(null);
                UserFirstName.remove(index);
                NewJFrame.SecondNameField.setText(null);
                UserSecondName.remove(index);
                NewJFrame.PinField.setText(null);
                UserPin.remove(index);
                NewJFrame.AgeSlider.setValue(0);
                UserAge.remove(index);
                NewJFrame.BalanceField.setText(null);
                UserBalance.remove(index);
                NewJFrame.PostCodeField.setText(null);
                UserPostCode.remove(index);
             
                JOptionPane.showMessageDialog(null,"User Deleted!");
            }//end if
            
            if (Userfound == false){
                JOptionPane.showMessageDialog(null,"User Not Found!");
                NewJFrame.IDField.setText(null);
                NewJFrame.FirstNameField.setText(null);
                NewJFrame.SecondNameField.setText(null);
                NewJFrame.PinField.setText(null);

            }//end if
    } //end delete
        
   
        public static void SumitBtn() {
          if ((jTextField1.getText().isEmpty()|| MessageArea.getText().equals(""))){ 
            
                JOptionPane.showMessageDialog(null,"PLEASE FILL EMPTY BOX..");
                
            }
          
          else{
                JOptionPane.showMessageDialog(null,"THANK YOU FOR GET IN TOUCH WITH US!.");
          }
        }
    
 
public static void Statistics () {
            
            //HOW MANY ACCOUNTS ARE IN THE BANK
            
            NewJFrame.Amount.setText( UserID.size() + " Users in the bank");
            
            //HOW MUCH MONEY IS IN THE BANK 
            
            double AmountOfMoney = 0;
            
            for(int i = 0; i < UserBalance.size(); i ++ ) {
                
                AmountOfMoney += UserBalance.get(i);
                
            }
            
            NewJFrame.jTextField8.setText( AmountOfMoney + "€ in this bank");
            
            //HIGHEST AMOUNT OF MONEY IN THE BANK 
            
            double HighestAmount = Collections.max(UserBalance);
            
            NewJFrame.jTextField7.setText( HighestAmount + "€");
            
            //AVERAGE AMOUNT OF MONEY PER PERSON 
            
            double AvgAmountOfMoney = 0;
            
            for(int i = 0; i < UserBalance.size(); i ++ ) {
                
                AvgAmountOfMoney += UserBalance.get(i);
                
            }
            
            NewJFrame.jTextField6.setText( AvgAmountOfMoney / UserBalance.size()  + "€");
            
            //HIGHEST AMOUNT OF MONEY IN THE BANK
            
            double LowestAmount = Collections.min(UserBalance);
            
            NewJFrame.jTextField2.setText(Collections.min(UserFirstName) + LowestAmount + "€");
                
}  } //End SwingArray

