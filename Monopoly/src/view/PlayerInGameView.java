package view;

import javax.swing.JOptionPane;

import model.Bank;
import model.LuckyCard;
import model.Property;
import model.PropertyTypes;
import model.Question;
import model.QuestionCard;
import model.Subjects;
import model.SysData;

public class PlayerInGameView {
	private int playerNum;
	private SquareView currentSquare;
	private int game;
	
	/**
	 * arriving to property square
	 * @param Property p
	 */
	public void propertySquare(Property p)
	{
	/*	if(currentMoney-p.getPropertyCost()>=0)
		{
		if(p.getPropertyOwner()==null)
		{
			
			 int n = JOptionPane.showConfirmDialog(
			            null,
			            "Would you like buy this property?",
			            "An Inane Question",
			            JOptionPane.YES_NO_OPTION);
			if(n == JOptionPane.YES_OPTION)
			{
				
				Question q = SysData.getInstance().propertyQuestion(p);
				
				if(answerResult(q))
				{
				//right
				
				double price=0;
				if(p.getType().equals(PropertyTypes.Low_cost))
				{
					price=currentMoney * 0.95;
					Bank.ChargeMoneyFromPlayer(this, price);
			
					p.setPropertyOwner(this);
					p.setLastPropertyCost(price);
					this.properties.add(p);
				}
				if(p.getType().equals(PropertyTypes.Average))
				{
					price=currentMoney * 0.85;
					Bank.ChargeMoneyFromPlayer(this, price);
				
					p.setPropertyOwner(this);
					p.setLastPropertyCost(price);
					this.properties.add(p);
				}
				if(p.getType().equals(PropertyTypes.Expensive))
				{
					price=currentMoney * 0.75;
					Bank.ChargeMoneyFromPlayer(this, price);
				
					p.setPropertyOwner(this);
					p.setLastPropertyCost(price);
					this.properties.add(p);
				}
				}
				else
				{
				//wrong
				Bank.ChargeMoneyFromPlayer(this, p.getPropertyCost());
				
				p.setPropertyOwner(this);
				p.setLastPropertyCost(p.getPropertyCost());
				this.properties.add(p);
				plusDisq();
				}
			}
		}
		else //��� ����
		{
			int n = JOptionPane.showConfirmDialog(
		            null,
		            "pay 15% last price - yes OR buy 150% last price - no",
		            "An Inane Question",
		            JOptionPane.YES_NO_OPTION);
			if(n == JOptionPane.YES_OPTION)
			{
				transwerMoneyFromPlayerToPlayer(p.getPropertyOwner(), p.getLastPropertyCost()*0.85);
			
			
			}
			else
			{
				buyPropertyFromPlayer(p, p.getPropertyOwner(), p.getLastPropertyCost()*1.5);
			}
		}
		}*/
	}
	public void luckyCardSquare(LuckyCard l)
	{
		/*
		boolean check1 = false;
		boolean check2 = false;
				
		//first que
		check1= answerResult(l.getQuestions()[0]); //����� ���� �� ���� �������
		
		//second que
		check2= answerResult(l.getQuestions()[1]); //����� ���� �� ���� ���
		
		if(check1 && check2)
		{
			Bank.GiveMoneyToPlayer(this, l.AmountForTwoQuestions());
			
		}
		if(!check1)
		{
			
			Bank.ChargeMoneyFromPlayer(this, 50000);
			this.plusDisq();
		}
		if(!check2)
		{
			Bank.ChargeMoneyFromPlayer(this, 25000);
		}
		*/
	}
	
	public void questionCardSquare(QuestionCard q)
	{
	/*	Subjects sub = null; //���� ������ ����
		double knas = 0;
		double price = 0;
		
		Question que = SysData.getInstance().CardQuestionQuestion(sub); //���� ��� ����� �����
	
		if(answerResult(que))
		{
			Bank.GiveMoneyToPlayer(this, price);
		}
		else
		{
			Bank.ChargeMoneyFromPlayer(this, knas);
			plusDisq();
		}*/
	}
	
	
	 
	

}
