package application;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Goal {
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

	public double getPercent() {
		return percent;
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
