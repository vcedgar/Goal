package application;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Goal{
	private String name;
	private Date dateCreated;
	
	private int goalTime;
	private int realTime;
	private double percent;
	
	private int[] times;
	private double[] percents;
	
	public Goal(String name, int goalTime){
		this.name = name;
		this.goalTime = goalTime;
		dateCreated = new Date();
		
		times = new int[100];
		percents = new double[100];
	}
	
	public Goal(String s) throws ParseException{
		String[] save = s.split("\\s+");
		this.name = save[0];
		this.goalTime = Integer.parseInt(save[1]);
		this.dateCreated = DateFormat.getDateInstance().parse(save[4]);
		Date dateSaved = DateFormat.getDateInstance().parse(save[5]);
		if(dateSaved.equals(new Date())){
			this.realTime = Integer.parseInt(save[2]);
			this.realTime = Integer.parseInt(save[3]);
		}
		else{
			this.realTime = 0;
			this.realTime = 0;
		}
		int i = 7;
		this.times = new int[100];
		this.percents = new double[100];
		while(save[i] != "percents"){
			times[i] = Integer.parseInt(save[i]);
		}
	}
	
	public String save(){
		String s = name + " " + goalTime + " " + realTime + " " + percent + " " + DateFormat.getDateInstance().format(dateCreated);
		s += " " + DateFormat.getDateInstance().format(new Date()) + " times ";
		for(int i = 0; i < times.length; i++){
			s += times[i] + " ";
		}
		s+= "precents ";
		for(int i = 0; i < times.length; i++){
			s += times[i] + " ";
		}
		return s + "#####";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public int getGoalTime() {
		return goalTime;
	}

	public void setGoalTime(int goalTime) {
		this.goalTime = goalTime;
	}

	public int getRealTime() {
		return realTime;
	}

	public void setRealTime(int realTime) {
		this.realTime = realTime;
		this.percent = realTime/goalTime;
		int index = (int)TimeUnit.DAYS.convert((new Date()).getTime() - dateCreated.getTime(), TimeUnit.MILLISECONDS);
		if(index >= times.length){
			resize();
		}
		times[index] = realTime;
		percents[index] = percent;
	}

	@Override
	public String toString() {
		return name + "\t" + goalTime + "\t" + realTime + "\t" + percent;
	}

	public double getPercent() {
		return percent;
	}
	
	public int[] setTimes() {
		return times;
	}

	public double[] setPercents() {
		return percents;
	}

	public int[] getTimes() {
		return times;
	}

	public double[] getPercents() {
		return percents;
	}

	public void reset(){
		dateCreated = new Date();
		times = new int[100];
		percents = new double[100];
	}
	
	private void resize(){
		int[] iTmp = new int[times.length + 100];
		double[] dTmp = new double[percents.length +100];
		for(int i = 0; i < times.length; i ++){
			iTmp[i] = times[i];
			dTmp[i] = percents[i];
		}
		times = iTmp;
		percents = dTmp;
	}
}
