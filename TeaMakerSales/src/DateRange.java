import java.util.Date;

public class DateRange {
	private Date startDate;
	private Date endDate;

	public DateRange(Date startDate, Date endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	boolean includes(Date date) {
		return date.equals(getStartDate()) || date.equals(getEndDate()) || (date.after(getStartDate()) && date.before(getEndDate()));
	}
}