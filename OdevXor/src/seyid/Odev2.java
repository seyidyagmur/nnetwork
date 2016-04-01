package seyid;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;  



public class Odev2 {
 
 
	public  static void main(String[] args) {
		// TODO Auto-generated method stub
 			System.out.println("merhabsa");
 	
			double [] w1 =new double[4],w2=new double[4],w3=new double[4],w4=new double[4],
					w5=new double[4],w6=new double[4],w7=new double[4],esik1=new double[4],esik2=new double[4];
			
			double[] g1 = new double[4], g2 = new double[4], h1 = new double[4], h2 = new double[4], c1 = new double[4],
			         Hatac1 = new double[4], Hatah1 = new double[4], Hatah2 = new double[4];
			 double alfa;
		        double [] X1=new double[4],X2=new double[4],Y=new double[4];
		        X1[0] = 0; X2[0] =0; Y[0] = 0;
	            X1[1] = 0; X2[1] = 1; Y[1] = 0;
	            X1[2] = 1; X2[2] = 0; Y[2] = 0;
	            X1[3] = 1; X2[3] = 1; Y[3] = 1;
	            alfa=0.5;
	            
	            
	            w1[0] = 0.01; w2[0] = 0.02;
	            w3[0] =-0.02; w4[0] =0.02 ;
	            w5[0] =0.03;
	            w6[0] =0.3 ; w7[0]=0.0;
	            esik1[0] = 0.0; esik2[0] = 0.0; 

	            w1[1] = 0.01; w2[1] = 0.02;
	            w3[1] =-0.02; w4[1] =0.02 ;
	            w5[1] =0.03;
	            w6[1] =0.3 ; w7[1]=0.0;
	            esik1[1] = 0.0; esik2[1] = 0.0; 

	            w1[2] = 0.01; w2[2] = 0.02;
	            w3[2] =-0.02; w4[2] =0.02 ;
	            w5[2] =0.03;
	            w6[2] =0.3 ; w7[2]=0.0;
	            esik1[2] = 0.0; esik2[2] = 0.0; 

	            w1[3] = 0.01; w2[3] = 0.02;
	            w3[3] =-0.02; w4[3] =0.02 ;
	            w5[3] =0.03;
	            w6[3] =0.3 ; w7[3]=0.0;
	            esik1[3] = 0.0; esik2[3] = 0.0; 

 
	            
	            int a, i;
	            for ( a = 0; a <1000; a++)
	            {
	            
	            	   for ( i = 0; i < 4; i++)
	                   {
	            		   int dd=0;
	            		   h1[i] = X1[i] * (w1[i]) + X2[i] * (w2[i]) - esik1[i];
	            		   /*if(h1[i]>0)
	            			   g1[i]=1;
	            		   else
	            			   g1[i]=0;*/
	                     h1[i] = 1 / (1 + (Math.exp(-h1[i])));//CIKISI KONTROL ET
 	                    
	                    	  h2[i] =  X1[i] * (w4[i])+h1[i] * (w3[i]) + w5[i]*X2[i] - esik2[i];
	                       
	                        	h2[i] = 1 / (1 + (Math.exp(-h2[i])));
	                       
	                       
	                       
	                       
	                       
	                       Hatac1[i] = h2[i] * (1 - h2[i]) * ((Y[i] - h2[i]));
 	                       Hatah1[i] = h1[i] * (1 - h1[i]) * ((Hatac1[i] * w3[i])+0);
 	                       
	                       
	                       w1[i] = w1[i] + (alfa * Hatah1[i] * X1[i]);
	                       w2[i] = w2[i] + (alfa * Hatah1[i] * X2[i]);
	                       w3[i] = w3[i] + (alfa * Hatac1[i] * h1[i]);
	                       w4[i] = w4[i] + (alfa * Hatac1[i] * X1[i]);
	                       w5[i] = w5[i] + (alfa * Hatac1[i] * X2[i]);
	                   
 	                       esik1[i] = esik1[i] + (alfa * Hatac1[i]);
	                       esik2[i] = esik2[i] + (alfa * Hatah1[i]);
	                       
 
	                       
	                       System.out.println("w1 :" + w1[i] + " w2 :" + w2[i] + "   w3 : " + w3[i]+ "   w4 : " + w4[i]+ "   w5 : " + w5[i] );
 	                       System.out.println("qç1 :" + esik1[i] + " qh1 :" + esik2[i] + "  qh2 : " );
	                       System.out.println("Adım: "+i+" G1 :"+X1[i]+" G2 :"+X2[i]+" Sonuç : "+Y[i]);
	                       System.out.println("son="+h2[i]);
	                       
	                       
	                       
	                       
	            		   
	                   }
	            }
	            	
	            	
	            
	            
	            
	            
	           
	
	}
 

}
