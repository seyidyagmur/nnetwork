package seyid;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Set;

import javax.swing.*;  



public class Odev3 implements ActionListener{
	

	JFrame f;
	JTextField ja1,ja2,ja3;
	JButton jbt;
	DefaultListModel<String> lm;

 public  Odev3(){
	f=new JFrame();
	f.setSize(330,300);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLayout(new FlowLayout());
	JLabel jlab1= new JLabel("1. :");
	JLabel jlab2= new JLabel("2. :");
	JLabel jlab3= new JLabel("C. :");
	ja1=new JTextField(5);
	 ja2=new JTextField (5);
	 ja3=new JTextField (5);
 	 	jbt=new JButton("Hesapla");
		jbt.setActionCommand("hesapla");

	 	jbt.addActionListener(this);
	 	f.add(jlab1);
	 	f.add(ja1);
	 	f.add(jlab2);
	 	f.add(ja2);
	 	f.add(jlab3);
	 	f.add(ja3);
	 	f.add(jbt);
	 	ButtonGroup bg=new ButtonGroup();
	 
		lm = new DefaultListModel<String>();

		JList<String> jlist = new JList<String>(lm);
		JScrollPane jscp = new JScrollPane(jlist);
		jscp.setPreferredSize(new Dimension(300, 200));
		f.add(jscp);
	 	f.setVisible(true);
}

	
 
 
	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		new Odev3();
 			System.out.println("merhabsa");
 		            
	            
	            
	            
	           
	
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("hesapla")) {
			

			double w1 ,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11,esik1,esik2,esik3;
			
			double g1  , g2 , h1 , h2 ,h3 , c1 , Hatac1,Hatac2, Hatah1, Hatah2;
			 double alfa;
		        double  X1,X2,C,Y,ELDE;
		        		 
	            alfa=0.5;
		        double v1= -1.0 + (Math.random()*2); 

		        double v2= -1.0 + (Math.random()*2); 
		        double v3= -1.0 + (Math.random()*2); 
		        double v4=-1.0 + (Math.random()*2); 
		        double v5= -1.0 + (Math.random()*2); 
		        double v6= -1.0 + (Math.random()*2); 
		        double v7= -1.0 + (Math.random()*2); 
		        double v8= -1.0 + (Math.random()*2); 
		        double v9= -1.0 + (Math.random()*2); 
		        double v10= -1.0 + (Math.random()*2); 
		        double v11= -1.0 + (Math.random()*2); 
		        
	             
	            	    w1 = v1; w2 = v2;
	    	            w3 =v3; w4 =v4 ;
	    	            w5 =v5;
	    	            w6 =v6 ; w7=v7;
	    	            w8 =v8 ; w9=v9;
	    	            w10 =v10 ; w11=v11;
	    	            
	    	            esik1 = 0.0; esik2 = 0.0; esik3 = 0.0; 
	    	            	Y=0;
	    	            	ELDE=0;

	    	            	FileWriter fw =null;
	    	            	BufferedWriter bw =null;
	    	            	
	    				int s1=Integer.parseInt(ja1.getText().toString());
	    				int s2=Integer.parseInt(ja2.getText().toString());
	    				int s3=Integer.parseInt(ja3.getText().toString());
	    				if(s1==0 && s2==0 && s3==0)//Y=SUM,ELDE=CARRY
	    				{	Y=0;ELDE=0;
	    				}else if(s1==0 && s2==0 && s3==1)
	    				{	Y=1;ELDE=0;
	    				}else if (s1==0 && s2==1 && s3==0)
	    				{	Y=1;ELDE=0;
	    				}else if (s1==0 && s2==1 && s3==1)
	    				{	Y=0;ELDE=1;
	    				}else if (s1==1 && s2==0 && s3==0)
	    				{	Y=1;ELDE=0;
	    				}else if (s1==1 && s2==0 && s3==1)
	    				{	Y=0;ELDE=1;
	    				}else if (s1==1 && s2==1 && s3==0)
	    				{	Y=0;ELDE=1;
	    				}else if (s1==1 && s2==1 && s3==1)
	    				{	Y=1;ELDE=1;
	    				}
	    				X1=s1;
	    				X2=s2;
	    				C=s3;
	            int a, i;
	        	try {
	    			File file = new File("adder.txt");
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
	            for ( a = 0; a <2000; a++)
	            {
	             
	            		   int dd=0;
	            		   h1 = X1 * (w1) + X2 * (w2)+C*w3 - esik1;
	            		   /*if(h1[i]>0)
	            			   g1[i]=1;
	            		   else
	            			   g1[i]=0;*/
	                     h1 = 1 / (1 + (Math.exp(-h1)));//CIKISI KONTROL ET
 	                    
	                    	  h2 =  X1* (w6)+w7*X2+C*w8+h1 * (w4)  - esik2;
	                       
	                        	h2 = 1 / (1 + (Math.exp(-h2)));
	                       
	                       
	                       h3=X1*w11+X2*w10+C*w9+h1*w5-esik3;
	                       h3 = 1 / (1 + (Math.exp(-h3)));
	                       
	                       
	                       Hatac1 = h2 * (1 - h2) * ((Y - h2));
	                       Hatac2 = h3 * (1 - h3) * ((ELDE - h3));

	                       Hatah1 = h1 * (1 - h1) * ((Hatac1 * w4)+Hatac2*w5+0);
 	                       
	                       
	                       w1 = w1 + (alfa * Hatah1 * X1);
	                       w2 = w2 + (alfa * Hatah1 * X2);
	                       w3 = w3 + (alfa * Hatah1 * C);
 	                     
	                       w4 = w4 + (alfa * Hatac1 * h1);
	                       w5 = w5 + (alfa * Hatac2 * h1);
	                       w6 = w6 + (alfa * Hatac1 * X1);
	                       w7 = w7 + (alfa * Hatac1 * X2);
	                       w8 = w8 + (alfa * Hatac1 * C);
	                       w9 = w9 + (alfa * Hatac2 * C);	
	                       w10 = w10 + (alfa * Hatac2 * X2);
	                       w11 = w11 + (alfa * Hatac2 * X1);

	                   
 	                       esik1 = esik1 + (alfa * Hatac1);
	                       esik2 = esik2 + (alfa * Hatah1);
	                       esik3 = esik3 + (alfa * Hatac2);
	                       
 
	                       
	                     //  System.out.println("w1 :" + w1[i] + " w2 :" + w2[i] + "   w3 : " + w3[i]+ "   w4 : " + w4[i]+ "   w5 : " + w5[i] );
 	                       //System.out.println("qç1 :" + esik1[i] + " qh1 :" + esik2[i] + "  qh2 : " );
	                       //System.out.println("Adım: "+i+" G1 :"+X1[i]+" G2 :"+X2[i]+" Sonuç : "+Y[i]);
	                       System.out.println(a+".son="+Y+" && "+ELDE+" && "+h2+" && "+ h3);
	                       System.out.println(h2+" "+h3+" "+w1+" "+w2+" "+w3+" "+w4+" "+w5+" "+w6+" "+w7+" "+w8+" "+w9+" "+w10+" "+w11+" "+Math.abs(Hatac1)+" "+Math.abs(Hatac2)+"\n");
	        	
	                   	try {
			                      bw.write(h2+" "+h3+" "+w1+" "+w2+" "+w3+" "+w4+" "+w5+" "+w6+" "+w7+" "+w8+" "+w9+" "+w10+" "+w11+" "+Math.abs(Hatac1)+" "+Math.abs(Hatac2)+"\n");

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
	            	
	            	

			
		}
		
	}
 

}
