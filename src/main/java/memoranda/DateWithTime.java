package main.java.memoranda;

import main.java.memoranda.date.CalendarDate;

/**
 * DateWithTime.java Created on 04.26.2018. 
 * Package: main.java.memoranda. 
 * 
 * TASK 2-2 SMELL BETWEEN CLASSES
 * TASK 3-2 SMELL BETWEEN CLASSES
 * 
 * Smell: Primitive Obsession / Too many parameters.
 * 
 * This new class was built to address the smell of too many primitive parameters. 
 * It combines the CalendarDate with Time (minutes and hours).  EventsManager.java 
 * will build the object to call other methods with. 
 * 
 * @author Nick Okerberg
 */

public class DateWithTime {

	// Class Variables
	int _minutes;
	int _hours;
	CalendarDate _cd;
	
	/**
	 * Default Constructor. 
	 */
	public DateWithTime() {
		this._minutes = 0;
		this._hours = 0;
		this._cd = new CalendarDate();
	}
	
	/**
	 * Constructor with Args.
	 * @param cd The CalendarDate object.
	 * @param hours The hours.
	 * @param minutes The minutes.
	 */
	public DateWithTime(CalendarDate cd, int hours, int minutes) {
		this._minutes = minutes;
		this._hours = hours;
		this._cd = cd;
	}

	public int get_minutes() {
		return _minutes;
	}

	public void set_minutes(int _minutes) {
		this._minutes = _minutes;
	}

	public int get_hours() {
		return _hours;
	}

	public void set_hours(int _hours) {
		this._hours = _hours;
	}

	public CalendarDate get_cd() {
		return _cd;
	}

	public void set_cd(CalendarDate _cd) {
		this._cd = _cd;
	}

}
