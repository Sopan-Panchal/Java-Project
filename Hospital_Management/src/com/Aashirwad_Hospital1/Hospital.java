package com.Aashirwad_Hospital1;

public class Hospital {
	
	private String patientName;
	private int patientId;
	private String patientDieses;
	private String Dr_Reco;
	private String Specialist;
	private int WardNo;

	public Hospital(String patientName,int patientId,String patientDieses  ,String Dr_Reco,String Specialist,int WardNo) {
		this.patientName=patientName;
		this.patientId=patientId;
		this.patientDieses=patientDieses;
		this.Dr_Reco=Dr_Reco;
		this.Specialist=Specialist;
		this.WardNo=WardNo;

	}
	public void ChangePatientName(String patientName)
	{
		this.patientName=patientName;
		
	}
	public void ChangePatientId(int patientId)
	{
		this.patientId=patientId;;
		
	}
	public void ChangePatientDieses(String patientDieses)
	{
		this.patientDieses=patientDieses;	
	}
	public void ChangeDr_Reco(String Dr_Reco)
	{
		this.Dr_Reco=Dr_Reco;
		
	}
	public void ChangeSpecialist(String specialist)
	{
		this.Specialist=specialist;
		
	}
	public void ChangeWardNo(int WardNo)
	{
		this.WardNo=WardNo;
	}
	
	public void display()
	{
		System.out.println("PatientName:"+patientName);
		System.out.println("PatientId:"+patientId);
		System.out.println("PatientDieses:"+patientDieses);
		System.out.println("Dr_Recommonded:"+Dr_Reco);
		System.out.println("Specialist:"+Specialist);
		System.out.println("WardNo:"+WardNo);
		
	}
	
}