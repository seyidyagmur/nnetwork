package seyid;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Set;

import javax.swing.*;  



public class Odev implements ActionListener{

	JFrame f;
	JTextField ja1,ja2,ja3,ja4;
	JButton jbt;
	DefaultListModel<String> lm;

	JRadioButton jxor,jor,jand;
public  Odev(){
	f=new JFrame();
	f.setSize(330,300);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLayout(new FlowLayout());
	JLabel jlab1= new JLabel("1. :");
	JLabel jlab2= new JLabel("2. :");
	ja1=new JTextField(5);
	 ja2=new JTextField (5);
	// ja3=new JTextField ();
	 //ja4=new JTextField ();
	 	jbt=new JButton("Hesapla");
		jbt.setActionCommand("hesapla");

	 	jbt.addActionListener(this);
	 	f.add(jlab1);
	 	f.add(ja1);
	 	f.add(jlab2);
	 	f.add(ja2);
	 	f.add(jbt);
	 	ButtonGroup bg=new ButtonGroup();
	 	jand=new JRadioButton("AND");
	 	jor=new JRadioButton("OR");
	 	jxor=new JRadioButton("XOR");
	 	bg.add(jand);
	 	bg.add(jor);
	 	bg.add(jxor);
	 	f.add(jand);
	 	f.add(jor);
	 	f.add(jxor);
		lm = new DefaultListModel<String>();

		JList<String> jlist = new JList<String>(lm);
		JScrollPane jscp = new JScrollPane(jlist);
		jscp.setPreferredSize(new Dimension(300, 200));
		f.add(jscp);
	 	f.setVisible(true);
}
double Y;
	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		new Odev();
 	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("hesapla")) {
			if(ja1.getText().length()>0 && ja2.getText().length()>0)	
			{
				int s1=Integer.parseInt(ja1.getText().toString());
				int s2=Integer.parseInt(ja2.getText().toString());
				System.out.println(s1 +" " +s2);
				
			if(jand.isSelected())
			{
				if(s1==0 && s2==0)
					Y=0;
				else if(s1==0 && s2==1)
					Y=0;
				else if (s1==1 && s2==0)
					Y=0;
				else if (s1==1 && s2==1)
					Y=1;
			
				
			}
			else if(jor.isSelected())
			{
				if(s1==0 && s2==0)
					Y=0;
				else if(s1==0 && s2==1)
					Y=1;
				else if (s1==1 && s2==0)
					Y=1;
				else if (s1==1 && s2==1)
					Y=1;
			
			}else if(jxor.isSelected())
			{
				if(s1==0 && s2==0)
					Y=0;
				else if(s1==0 && s2==1)
					Y=1;
				else if (s1==1 && s2==0)
					Y=1;
				else if (s1==1 && s2==1)
					Y=0;
			
				
			}
			
			

			double  w1 ,w2,w3,w4,w5,w6,w7,esik1,esik2;
			
			double g1, g2, h1, h2, c1,Hatac1, Hatah1, Hatah2 ;
			 double alfa;
		        double X1=s1,X2=s2;
		        double v1= -1.0 + (Math.random()*2); 

		        double v2= -1.0 + (Math.random()*2); 
		        double v3= -1.0 + (Math.random()*2); 
		        double v4=-1.0 + (Math.random()*2); 
		        double v5= -1.0 + (Math.random()*2); 
		        double v6= -1.0 + (Math.random()*2); 
		        double v7= -1.0 + (Math.random()*2); 
		        
		       
	            alfa=0.5;
	            
	            
	            w1 = v1; w2 = v2;
	            w3 =v3; w4 =v4 ;
	            w5 =v5;
	            w6 =v6 ; w7=v7;
	            esik1 = 0.0; esik2 = 0.0; 
 

	            	h2=0.0;
	            
	            int a, i;
	           // for ( a = 0; a <1000; a++)
	            //{
	            a=0;
	            double pay;

            	FileWriter fw =null;
            	BufferedWriter bw =null;
	            if(Y==1){
	            	try {
		    			File file = new File("cikti.txt");
		    			file.delete();
		    			if (!file.exists()) {
		    				file.createNewFile();
		    				

				Set perms = new HashSet();
				perms.add(PosixFilePermission.OWNER_READ);
				perms.add(PosixFilePermission.OWNER_WRITE);
				perms.add(PosixFilePermission.OWNER_EXECUTE);
				perms.add(PosixFilePermission.GROUP_READ);
				perms.add(PosixFilePermission.GROUP_EXECUTE);
				perms.add(PosixFilePermission.GROUP_WRITE);
				perms.add(PosixFilePermission.OTHERS_EXECUTE);
				perms.add(PosixFilePermission.OTHERS_READ);
				perms.add(PosixFilePermission.OTHERS_WRITE);
				
				Files.setPosixFilePermissions(file.toPath(), perms);
		    				  fw = new FileWriter(file.getAbsoluteFile());
		    				  bw = new BufferedWriter(fw);
		    			}
		            	} catch (IOException ee) {
		        			ee.printStackTrace();
		        		}
	            	pay=0.9700;
	            	while(h2<pay)
		            {a++;
		            		   int dd=0;
		            		   h1 = X1 * (w1) + X2 * (w2) - esik1;
		            		   /*if(h1[i]>0)
		            			   g1[i]=1;
		            		   else
		            			   g1[i]=0;*/
		                     h1 = 1 / (1 + (Math.exp(-h1)));//CIKISI KONTROL ET
	 	                    
		                    	  h2 =  X1 * (w4)+h1 * (w3) + w5*X2 - esik2;
		                       
		                        	h2 = 1 / (1 + (Math.exp(-h2)));
		                       
		                       
		                       
		                       
		                       
		                       Hatac1 = h2 * (1 - h2) * ((Y - h2));
	 	                       Hatah1 = h1 * (1 - h1) * ((Hatac1 * w3)+0);
	 	                       
		                       
		                       w1 = w1 + (alfa * Hatah1 * X1);
		                       w2 = w2 + (alfa * Hatah1 * X2);
		                       w3 = w3 + (alfa * Hatac1 * h1);
		                       w4 = w4 + (alfa * Hatac1 * X1);
		                       w5 = w5 + (alfa * Hatac1 * X2);
		                   
	 	                       esik1 = esik1 + (alfa * Hatac1);
		                       esik2 = esik2 + (alfa * Hatah1);
		                      
		                    /*   System.out.println("w1 :" + w1[i] + " w2 :" + w2[i] + "   w3 : " + w3[i]+ "   w4 : " + w4[i]+ "   w5 : " + w5[i] );
	 	                       System.out.println("qç1 :" + esik1[i] + " qh1 :" + esik2[i] + "  qh2 : " );
		                       System.out.println("Adım: "+i+" G1 :"+X1[i]+" G2 :"+X2[i]+" Sonuç : "+Y[i]);
		                      */ System.out.println("son="+h2);
		                       
		                    lm.addElement("ITERASYON " +a+" :"+h2);
		                	try {
								bw.write(h2+" "+w1+" "+w2+" "+w3+" "+w4+" "+w5+" "+Math.abs(Hatac1)+"\n");

							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
		            		 
		            }
	            	try {
						bw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

	            }else{
	            	System.out.println("MEARAB"+h2);
	            	pay=0.015;
	            	h2=5;
	            	try {
	    			File file = new File("cikti.txt");
	    			file.delete();

	    			if (!file.exists()) {
	    				file.createNewFile();
	    				

	    				Set perms = new HashSet();
	    				perms.add(PosixFilePermission.OWNER_READ);
	    				perms.add(PosixFilePermission.OWNER_WRITE);
	    				perms.add(PosixFilePermission.OWNER_EXECUTE);
	    				perms.add(PosixFilePermission.GROUP_READ);
	    				perms.add(PosixFilePermission.GROUP_EXECUTE);
	    				perms.add(PosixFilePermission.GROUP_WRITE);
	    				perms.add(PosixFilePermission.OTHERS_EXECUTE);
	    				perms.add(PosixFilePermission.OTHERS_READ);
	    				perms.add(PosixFilePermission.OTHERS_WRITE);
	    				
	    				Files.setPosixFilePermissions(file.toPath(), perms);
	    				
	    				  fw = new FileWriter(file.getAbsoluteFile());
	    				  bw = new BufferedWriter(fw);
	    			}
	            	} catch (IOException ee) {
	        			ee.printStackTrace();
	        		}
	            	while(h2>pay)
		            {a++;
		        
		          
		            		   int dd=0;
		            		   h1 = X1 * (w1) + X2 * (w2) - esik1;
		            		   /*if(h1[i]>0)
		            			   g1[i]=1;
		            		   else
		            			   g1[i]=0;*/
		                     h1 = 1 / (1 + (Math.exp(-h1)));//CIKISI KONTROL ET
	 	                    
		                    	  h2 =  X1 * (w4)+X2 * (w5) + w3*h1 - esik2;
		                       
		                        	h2 = 1 / (1 + (Math.exp(-h2)));
		                       
		                       
		                       
		                       
		                       
		                       Hatac1 = h2 * (1 - h2) * ((Y - h2));
	 	                       Hatah1 = h1 * (1 - h1) * ((Hatac1 * w3)+0);
	 	                       
		                       
		                       w1 = w1 + (alfa * Hatah1 * X1);
		                       w2 = w2 + (alfa * Hatah1 * X2);
		                       w3 = w3 + (alfa * Hatac1 * h1);
		                       w4 = w4 + (alfa * Hatac1 * X1);
		                       w5 = w5 + (alfa * Hatac1 * X2);
		                   
	 	                       esik1 = esik1 + (alfa * Hatac1);
		                       esik2 = esik2 + (alfa * Hatah1);
		                      
		                    /*   System.out.println("w1 :" + w1[i] + " w2 :" + w2[i] + "   w3 : " + w3[i]+ "   w4 : " + w4[i]+ "   w5 : " + w5[i] );
	 	                       System.out.println("qç1 :" + esik1[i] + " qh1 :" + esik2[i] + "  qh2 : " );
		                       System.out.println("Adım: "+i+" G1 :"+X1[i]+" G2 :"+X2[i]+" Sonuç : "+Y[i]);
		                      */ System.out.println("son="+h2);
		                       
		                    lm.addElement("ITERASYON " +a+" :"+h2);
		                    
				        	try {
								bw.write(h2+" "+w1+" "+w2+" "+w3+" "+w4+" "+w5+" "+Math.abs(Hatac1)+"\n");

							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}

		            		 
		            }
				




	            	}
 
			
			
		}
		}

}
}
